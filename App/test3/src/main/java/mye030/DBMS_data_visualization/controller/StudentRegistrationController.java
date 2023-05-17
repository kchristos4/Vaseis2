/*package mye030.DBMS_data_visualization.controller;

import java.text.*;
import java.util.*;
import java.lang.*;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.SessionAttributes;

import mye030.DBMS_data_visualization.entities.StudentRegistration;
import mye030.DBMS_data_visualization.services.*;

import org.apache.commons.math3.stat.descriptive.DescriptiveStatistics;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller	
@RequestMapping("/studentRegistrations")
@SessionAttributes("studentRegistrations")
public class StudentRegistrationController{
	
	@Autowired
	private StudentRegistrationService studentRegistrationService;
	@Autowired
	private CourseService courseService;
	
	
	

		
	public StudentRegistrationController(StudentRegistrationService theStudentRegistrationService) {
		studentRegistrationService = theStudentRegistrationService;
	}
	@RequestMapping("/list")
	public String listStudentRegistrations(Model theModel) {
		
		//make a list containing all student registrations
		List<StudentRegistration> theStudentRegistrations = studentRegistrationService.findAll();
		
		// add to the spring model
		theModel.addAttribute("studentRegistrations", theStudentRegistrations);
		
		return "studentRegistrations/list-studentRegistrations";
	}
	
	@RequestMapping("/listStudentsForACourse")
	public String listStudentsForACourse (@RequestParam("courseid") int theCourseID ,Model theModel) {
		
		//make a list with all student registrations with a particular course id
		List<StudentRegistration> theStudentRegistrations = studentRegistrationService.findAllByCourseid(theCourseID);
		
		// add to the spring model
		theModel.addAttribute("studentRegistrations", theStudentRegistrations);
		
		return "studentRegistrations/list-studentRegistrations";
	}
	
	@RequestMapping("/showFormForAdd")
	public String showFormForAdd(@RequestParam("courseid") int theId,
			Model theModel) {
		
		// create model attribute to bind form data
		StudentRegistration theStudentRegistration = new StudentRegistration();
		//set course id automatically to the chosen course
		theStudentRegistration.setCourseid(theId);
		
		theModel.addAttribute("studentRegistration", theStudentRegistration);
		
		return "studentRegistrations/studentRegistration-form";
	}
	
	@RequestMapping("/showOverall")
	public String ComputeOverall(@RequestParam("courseid") int theCourseID,Model theModel) {
		
		// create list with all students to a particular course
		List<StudentRegistration> theStudentRegistrations = studentRegistrationService.findAllByCourseid(theCourseID);
		//for every student registration get it's exam and project grade and calculate (and set) its final grade
		for(int i=0;i<theStudentRegistrations.size();i++) {
			float exam = theStudentRegistrations.get(i).getExamgrade();
			float project = theStudentRegistrations.get(i).getProjectgrade();
			double finalG = 0.3*project + 0.7*exam;
			DecimalFormat df = new DecimalFormat("#.##");
			finalG = finalG*100;
			finalG = Math.round(finalG);
			finalG = finalG/100;
			
			theStudentRegistrations.get(i).setFinalgrade((float) finalG);	
		}
		
		//add those student registrations to the model
		theModel.addAttribute("studentRegistrations", theStudentRegistrations);
		
		return "studentRegistrations/grade";
	}
	
	
	@RequestMapping("/showStats")
	public String ComputeStats(Model theModel) {
		
		// create a list containing all student registrations
		List<StudentRegistration> theStudentRegistrations = studentRegistrationService.findAll();
		//create 3 lists of descriptive statistics
		DescriptiveStatistics ExamGrades = new DescriptiveStatistics();
		DescriptiveStatistics ProjectGrades = new DescriptiveStatistics();
		DescriptiveStatistics FinalGrades = new DescriptiveStatistics();
		double[] exam = new double[theStudentRegistrations.size()];
		double[] project = new double[theStudentRegistrations.size()];
		double[] finalG = new double[theStudentRegistrations.size()];
		
		//for every student registration get Exam and Project grades and calculate Final grade
		for (int i =0;i<theStudentRegistrations.size();i++) {
			float tempE = theStudentRegistrations.get(i).getExamgrade();
			float tempP = theStudentRegistrations.get(i).getProjectgrade();
			double tempF = (0.3*tempP +0.7*tempE);
			theStudentRegistrations.get(i).setFinalgrade((float)tempF);
		}
		
		for(int i=0;i<theStudentRegistrations.size();i++) {
			
			exam[i] = theStudentRegistrations.get(i).getExamgrade();
			project[i] = theStudentRegistrations.get(i).getProjectgrade();
			finalG[i] = theStudentRegistrations.get(i).getFinalgrade();
			finalG[i] = finalG[i]*100;
			finalG[i] = Math.round(finalG[i]);
			finalG[i] = finalG[i]/100;
			
			theStudentRegistrations.get(i).setFinalgrade((float) finalG[i]);
			ExamGrades.addValue(exam[i]);
			ProjectGrades.addValue(project[i]);
			FinalGrades.addValue(finalG[i]);
		}
		//calculate stats for Exam grades
		double minE = ExamGrades.getMin();
		double maxE = ExamGrades.getMax();
		double meanE = ExamGrades.getMean();
		double stdDevE = ExamGrades.getStandardDeviation();
		double varianceE = ExamGrades.getVariance();
		double percentilesE = ExamGrades.getPercentile(97);
		double skewnessE = ExamGrades.getSkewness();
		double kurtosisE = ExamGrades.getKurtosis();
		double medianE = ExamGrades.getPercentile(50);
		List<Double> ExamStats = new ArrayList<Double>();
		//add those stats to an array list
		ExamStats.add(minE);
		ExamStats.add(maxE);
		ExamStats.add(meanE);
		ExamStats.add(stdDevE);
		ExamStats.add(varianceE);
		ExamStats.add(percentilesE);
		ExamStats.add(skewnessE);
		ExamStats.add(kurtosisE);
		ExamStats.add(medianE);
		
		//calculate stats for Project grades
		double minP = ProjectGrades.getMin();
		double maxP = ProjectGrades.getMax();
		double meanP = ProjectGrades.getMean();
		double stdDevP = ProjectGrades.getStandardDeviation();
		double varianceP = ProjectGrades.getVariance();
		double percentilesP = ProjectGrades.getPercentile(97);
		double skewnessP = ProjectGrades.getSkewness();
		double kurtosisP = ProjectGrades.getKurtosis();
		double medianP = ProjectGrades.getPercentile(50);
		List<Double> ProjectStats = new ArrayList<Double>();
		//add those stats to an array list
		ProjectStats.add(minP);
		ProjectStats.add(maxP);
		ProjectStats.add(meanP);
		ProjectStats.add(stdDevP);
		ProjectStats.add(varianceP);
		ProjectStats.add(percentilesP);
		ProjectStats.add(skewnessP);
		ProjectStats.add(kurtosisP);
		ProjectStats.add(medianP);
		
		//calculate stats for Final grades
		double minF = FinalGrades.getMin();
		double maxF = FinalGrades.getMax();
		double meanF = FinalGrades.getMean();
		double stdDevF = FinalGrades.getStandardDeviation();
		double varianceF = FinalGrades.getVariance();
		double percentilesF = FinalGrades.getPercentile(97);
		double skewnessF = FinalGrades.getSkewness();
		double kurtosisF = FinalGrades.getKurtosis();
		double medianF = FinalGrades.getPercentile(50);
		List<Double> FinalStats = new ArrayList<Double>();
		//add those stats to an array list
		FinalStats.add(minF);
		FinalStats.add(maxF);
		FinalStats.add(meanF);
		FinalStats.add(stdDevF);
		FinalStats.add(varianceF);
		FinalStats.add(percentilesF);
		FinalStats.add(skewnessF);
		FinalStats.add(kurtosisF);
		FinalStats.add(medianF);
		
		
		// add the previous 3 lists to one list called "Statistics"
		List<List<Double>> Statistics = new ArrayList<List<Double>>();
		Statistics.add(ExamStats);
		Statistics.add(ProjectStats);
		Statistics.add(FinalStats);
		List<String> GradeType = new ArrayList<>();
		/*GradeType.add("Exam Stats");
		GradeType.add("Project Stats");
		GradeType.add("Final Stats");
		theModel.addAttribute("studentRegistrations", theStudentRegistrations);
		theModel.addAttribute("Statistics",Statistics);
		//theModel.addAttribute("GradeType",GradeType);
		
		return "studentRegistrations/stats";
	}
	
	@RequestMapping("/showFormForUpdate")
	public String showFormForUpdate(@RequestParam("studentRegistrationId") int theId,
									Model theModel) {
		
		// get the student registration from the service
		StudentRegistration theStudentRegistration = studentRegistrationService.findById(theId);
		
		studentRegistrationService.save(theStudentRegistration);
		
		// set course as a model attribute to pre-populate the form
		theModel.addAttribute("studentRegistration", theStudentRegistration);
		
		// send over to our form
		return "studentRegistrations/studentRegistration-form";			
	}
	@RequestMapping("/save")
	public String saveStudentRegistration(@ModelAttribute("studentRegistration") StudentRegistration theStudentRegistration) {
		
		// save the student registration
		studentRegistrationService.save(theStudentRegistration);
		
		// use a redirect to prevent duplicate submissions
		return "redirect:/studentRegistrations/list";
	}
	@RequestMapping("/delete")
	public String delete(@RequestParam("studentRegistrationId") int theId) {
		
		// delete the student registration
		studentRegistrationService.deleteById(theId);
		
		// redirect to /studentRegistrations/list
		return "redirect:/studentRegistrations/list";
		
	}

}*/