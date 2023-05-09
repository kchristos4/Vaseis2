package mye030.DBMS_data_visualization.controller;

import java.util.*;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;

import mye030.DBMS_data_visualization.entities.Course;
import mye030.DBMS_data_visualization.entities.StudentRegistration;
import mye030.DBMS_data_visualization.services.*;

import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;


@Controller	
@RequestMapping("/courses")
@SessionAttributes("courses")
public class CourseController{
	
	@Autowired
	private CourseService courseService;
	
	@Autowired
	private StudentRegistrationService studentRegistrationService;
		
	public CourseController(CourseService theCourseService) {
		courseService = theCourseService;
	}
	
	@RequestMapping("/list")
	public String listCourses(Model theModel) {
		
		//create a new list containing all courses
		List<Course> theCourses = courseService.findAll();
		 //add the courses to the spring model
		theModel.addAttribute("courses", theCourses);
		
		return "courses/list-courses";
	}
	
	
	
	@RequestMapping("/showFormForAdd")
	public String showFormForAdd(Model theModel) {
		
		// create new course
		Course theCourse = new Course();
		//add the new course to the spring model
		theModel.addAttribute("course", theCourse);
		
		return "courses/course-form";
	}
	
	@RequestMapping("/showFormForUpdate")
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
	@RequestMapping("/save")
	public String saveCourse(@ModelAttribute("course") Course theCourse) {
		
		// save the course
		courseService.save(theCourse);
		
		// use a redirect to prevent duplicate submissions
		return "redirect:/courses/list";
	}
	@RequestMapping("/delete")
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
		
	}
}