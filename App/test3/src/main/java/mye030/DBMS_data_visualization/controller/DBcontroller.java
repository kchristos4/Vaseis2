package mye030.DBMS_data_visualization.controller;

import java.util.*;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;


import mye030.DBMS_data_visualization.services.CountryImpl;
import mye030.DBMS_data_visualization.services.CountryService;
import mye030.DBMS_data_visualization.entities.Country;

import org.slf4j.LoggerFactory;


@Controller	
public class DBcontroller{
	
	@Autowired
	private CountryService cService;
	
	//@Autowired
	//private StudentRegistrationService studentRegistrationService;
	@Autowired
	public DBcontroller(CountryImpl thisCService) {
		cService = thisCService;
	}
	
	public DBcontroller() {
		//cService = new countriesImpl();
	}
	
	public List<String> getCountries(){
		List<String> countriesList = new ArrayList<>();
		List<Country> countries = cService.findAll();//cService.findAll();
		for (Country c : countries) {
			countriesList.add(c.getDisplay_Name());
		}
		
		return countriesList;
	}
	
	public List<String> getIndices(){
		List<String> indicesList = new ArrayList<>();
		indicesList.add("fertility_rate_by_age");
		indicesList.add("total_fertility_rate");
		indicesList.add("gross_reproduction_rate");
		indicesList.add("sex_ratio_at_birth");
		indicesList.add("crude_birth_rate");
		indicesList.add("crude_death_rate");
		indicesList.add("net_migration");
		indicesList.add("rate_natural_increase");
		indicesList.add("growth_rate");
		indicesList.add("Domestic credits");
		indicesList.add("Estimated GNI female");
		indicesList.add("Estimated GNI male");
		indicesList.add("GDP per capita");
		indicesList.add("GDP total");
		indicesList.add("GNI per capita");
		indicesList.add("Gross fixed capital formation");
		indicesList.add("Income Index");
		indicesList.add("Labour share of GDP");
		indicesList.add("midyear_population");
		indicesList.add("midyear_population_male");
		indicesList.add("midyear_population_female");
		indicesList.add("population by age");
		indicesList.add("infant_mortality");
		indicesList.add("infant_mortality_male");
		indicesList.add("infant_mortality_female");
		indicesList.add("life_expectancy");
		indicesList.add("life_expectancy_male");
		indicesList.add("life_expectancy_female");
		indicesList.add("mortality_rate_under5");
		indicesList.add("mortality_rate_under5_male");
		indicesList.add("mortality_rate_under5_female");
		indicesList.add("mortality_rate_1to4");
		indicesList.add("mortality_rate_1to4_male");
		indicesList.add("mortality_rate_1to4_female");
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