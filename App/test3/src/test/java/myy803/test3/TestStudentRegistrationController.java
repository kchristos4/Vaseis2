package myy803.test3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.security.test.context.support.WithMockUser;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.context.WebApplicationContext;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectReader;

import mye030.DBMS_data_visualization.controller.StudentRegistrationController;
import mye030.DBMS_data_visualization.entities.StudentRegistration;
import mye030.DBMS_data_visualization.services.CourseService;
import mye030.DBMS_data_visualization.services.StudentRegistrationService;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

import java.util.List;
import java.util.Map;


@SpringBootTest
@TestPropertySource(
  locations = "classpath:application.properties")
@AutoConfigureMockMvc
class TestStudentRegistrationController {
	
	@Autowired
    private WebApplicationContext context;
	
	@Autowired
	private MockMvc mockMvc;
	
	@Autowired
	StudentRegistrationController studentRegistrationController;
	
	@Autowired
	StudentRegistrationService studentRegistrationService;
	
	@Autowired
	CourseService courseService;

	@BeforeEach
    public void setup() {
		mockMvc = MockMvcBuilders
          .webAppContextSetup(context)
          .build();
    }
	
	@Test
	void testStudentRegistrationControllerIsNotNull() {
		Assertions.assertNotNull(studentRegistrationController);
	}
	
	@Test
	void testMockMvcIsNotNull() {
		Assertions.assertNotNull(mockMvc);
	}
	
	
	@WithMockUser(value = "zarras")
	@Test 
	void testListStudentRegistrationsReturnsPage() throws Exception {
		mockMvc.perform(get("/studentRegistrations/list")).
		andExpect(status().isOk()).
		andExpect(view().name("studentRegistrations/list-studentRegistrations"));		
	}

	@WithMockUser(value = "zarras")
	@Test 
	void testSaveStudentRegistrationReturnsPage() throws Exception {
		//create new student registration
	    StudentRegistration studentRegistration = new StudentRegistration(19,"testStud", 2002, 9,"stud description",7,8,9,1);
	    	    
	    MultiValueMap<String, String> multiValueMap = new LinkedMultiValueMap<>();
	    multiValueMap.add("id", Integer.toString(studentRegistration.getId()));
	    multiValueMap.add("name", studentRegistration.getName());
	    multiValueMap.add("year", studentRegistration.getYear().toString());
	    multiValueMap.add("semester", studentRegistration.getSemester().toString());
	    multiValueMap.add("description", studentRegistration.getDescription());
	    multiValueMap.add("projectgrade", Float.toString(studentRegistration.getProjectgrade()));
	    multiValueMap.add("examgrade", Float.toString(studentRegistration.getExamgrade()));
	    multiValueMap.add("finalgrade", Float.toString(studentRegistration.getFinalgrade()));
	    multiValueMap.add("courseid", studentRegistration.getCourseid().toString());
	    
	    //save it
		mockMvc.perform(
				post("/studentRegistrations/save")
				//.contentType(MediaType.APPLICATION_FORM_URLENCODED)
			    .params(multiValueMap))
				.andExpect(status().isFound())
				.andExpect(view().name("redirect:/studentRegistrations/list"));	
	}
	
	@WithMockUser(value = "zarras")
	@Test 
	void testUpdateStudentRegistrationReturnsPage() throws Exception {
		
		//find the first already existing student registration 
		StudentRegistration studentRegistration = studentRegistrationService.findById(1);
		MultiValueMap<String, String> multiValueMap = new LinkedMultiValueMap<>();
		multiValueMap.add("id", Integer.toString(studentRegistration.getId()));
	    multiValueMap.add("name", studentRegistration.getName());
	    multiValueMap.add("year", studentRegistration.getYear().toString());
	    multiValueMap.add("semester", studentRegistration.getSemester().toString());
	    multiValueMap.add("description", studentRegistration.getDescription());
	    multiValueMap.add("projectgrade", Float.toString(studentRegistration.getProjectgrade()));
	    multiValueMap.add("examgrade", Float.toString(studentRegistration.getExamgrade()));
	    multiValueMap.add("finalgrade", Float.toString(studentRegistration.getFinalgrade()));
	    multiValueMap.add("courseid", studentRegistration.getCourseid().toString());
	    
	    //get its id 
	    String url = "/studentRegistrations/showFormForUpdate?studentRegistrationId=";
		int srID = studentRegistrationService.findById(1).getId();
		String str =url+ srID;
	    
		//update it
		mockMvc.perform(
				post(str)
				//.contentType(MediaType.APPLICATION_FORM_URLENCODED)
			    .params(multiValueMap))
				.andExpect(status().isOk())
				.andExpect(view().name("studentRegistrations/studentRegistration-form"));
		
	}
	
	@WithMockUser(value = "zarras")
	@Test 
	void testDeleteStudentRegistrationReturnsPage() throws Exception {
		
		//create new student registration
		StudentRegistration studentRegistration = new StudentRegistration(999,"testStud", 2002, 9,"stud description",7,8,9,1);
	    //populate its fields
	    MultiValueMap<String, String> multiValueMap = new LinkedMultiValueMap<>();
	    multiValueMap.add("id", Integer.toString(studentRegistration.getId()));
	    multiValueMap.add("name", studentRegistration.getName());
	    multiValueMap.add("year", studentRegistration.getYear().toString());
	    multiValueMap.add("semester", studentRegistration.getSemester().toString());
	    multiValueMap.add("description", studentRegistration.getDescription());
	    multiValueMap.add("projectgrade", Float.toString(studentRegistration.getProjectgrade()));
	    multiValueMap.add("examgrade", Float.toString(studentRegistration.getExamgrade()));
	    multiValueMap.add("finalgrade", Float.toString(studentRegistration.getFinalgrade()));
	    multiValueMap.add("courseid", studentRegistration.getCourseid().toString());
	    
	    //save it
		mockMvc.perform(
				post("/studentRegistrations/save")
				//.contentType(MediaType.APPLICATION_FORM_URLENCODED)
			    .params(multiValueMap))
				.andExpect(status().isFound())
				.andExpect(view().name("redirect:/studentRegistrations/list"));	
		
		String url = "/studentRegistrations/delete?studentRegistrationId=";
		//get a list of all student registrations
		List<StudentRegistration> studRegs = studentRegistrationService.findAll();
		int srID = 0;
		//keep the largest id ( the most recent course since AutoIncrement is set to TRUE
		for (int i=0;i<studRegs.size();i++) {
			if (srID<studRegs.get(i).getId()) {
				srID=studRegs.get(i).getId();
			}
		}
		
		//delete that course
		String str =url+ srID;
		mockMvc.perform(
				post(str))
				.andExpect(view().name("redirect:/studentRegistrations/list"));
			
	}
	void testCalculateStatisticsReturnsPage() throws Exception {
			
		    
			mockMvc.perform(
					post("/studentRegistrations/showStats"))
					.andExpect(status().isFound())
					.andExpect(view().name("redirect:/studentRegistrations/stats"));	
			
			
				
	}
	void testShowAllStudentRegistrationsReturnsPage() throws Exception {
		
	    
		mockMvc.perform(
				post("/studentRegistrations/list"))
				.andExpect(status().isFound())
				.andExpect(view().name("redirect:/studentRegistrations/list-studentRegistrations"));	
		
		
			
	}
	void testCalculateGradesForAParticularCourseReturnsPage() throws Exception {
		String url = "/studentRegistrations/showOverall?courseId=";
		int srID = courseService.findAll().get(0).getId();
		//test calculating grades for the first course
		String str =url+ srID;
		
		mockMvc.perform(
				post(str))
				.andExpect(status().isFound())
				.andExpect(view().name("redirect:/studentRegistrations/grade"));	
		
		
			
	}
}
		

