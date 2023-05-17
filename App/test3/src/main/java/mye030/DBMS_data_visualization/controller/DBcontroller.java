package mye030.DBMS_data_visualization.controller;

import java.util.*;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;


import mye030.DBMS_data_visualization.services.countriesImpl;
import mye030.DBMS_data_visualization.services.countriesService;
import mye030.DBMS_data_visualization.entities.countries;

import org.slf4j.LoggerFactory;


@Controller	
public class DBcontroller{
	
	@Autowired
	private countriesService cService;
	
	//@Autowired
	//private StudentRegistrationService studentRegistrationService;
		
	public DBcontroller(countriesImpl thisCService) {
		cService = thisCService;
	}
	public DBcontroller() {
		//cService = new countriesImpl();
	}
	
	public List<String> getCountries(){
		List<String> countriesList = new ArrayList<>();
		List<countries> countries = new ArrayList<>();//cService.findAll();
		for (countries c : countries) {
			countriesList.add(c.getDisplay_Name());
		}
		
		return countriesList;
	}
	
	public List<String> getIndices(){
		List<String> indicesList = new ArrayList<>();
		return indicesList;
	}
	
	
	public void createGraphs(List<String> selectedCountries,String Xindex,String Yindex,String Lo,String Up){
	}
	/*
	
	public String listCourses(Model theModel) {
		
		//create a new list containing all courses
		List<Course> theCourses = courseService.findAll();
		 //add the courses to the spring model
		theModel.addAttribute("courses", theCourses);
		
		return "courses/list-courses";
	}
	
	
	
	public String showFormForAdd(Model theModel) {
		
		// create new course
		Course theCourse = new Course();
		//add the new course to the spring model
		theModel.addAttribute("course", theCourse);
		
		return "courses/course-form";
	}
	
	public String showFormForUpdate(@RequestParam("courseId") int theId,
									Model theModel) {
		
		
		// get the course from the service
		Course theCourse = courseService.findById(theId);
		
		courseService.save(theCourse);
		
		
		// set course as a model attribute to pre-populate the form
		theModel.addAttribute("course", theCourse);
		
		// send over to our form
		return "courses/course-form";			
	}
	public String saveCourse(@ModelAttribute("course") Course theCourse) {
		
		// save the course
		courseService.save(theCourse);
		
		// use a redirect to prevent duplicate submissions
		return "redirect:/courses/list";
	}
	public String delete(@RequestParam("courseId") int theId) {
		
		List<StudentRegistration> studRegs = studentRegistrationService.findAllByCourseid(theId);
		int size = studRegs.size();
		for (int i=0;i<size;i++) {
			studentRegistrationService.deleteById(studRegs.get(i).getId());
		}
		
		// delete the course
		
		courseService.deleteById(theId);
		
		// redirect to /courses/list
		return "redirect:/courses/list";
		
	}*/
}