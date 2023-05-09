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

import mye030.DBMS_data_visualization.controller.CourseController;
import mye030.DBMS_data_visualization.entities.Course;
import mye030.DBMS_data_visualization.entities.StudentRegistration;
import mye030.DBMS_data_visualization.services.CourseService;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

import java.util.List;
import java.util.Map;


@SpringBootTest
@TestPropertySource(
  locations = "classpath:application.properties")
@AutoConfigureMockMvc
class TestCourseController {
	
	@Autowired
    private WebApplicationContext context;
	
	@Autowired
	private MockMvc mockMvc;
	
	@Autowired
	CourseController courseController;
	
	@Autowired
	CourseService courseService;

	@BeforeEach
    public void setup() {
		mockMvc = MockMvcBuilders
          .webAppContextSetup(context)
          .build();
    }
	
	@Test
	void testCourseControllerIsNotNull() {
		Assertions.assertNotNull(courseController);
	}
	
	@Test
	void testMockMvcIsNotNull() {
		Assertions.assertNotNull(mockMvc);
	}
	
	
	@WithMockUser(value = "zarras")
	@Test 
	void testListCoursesReturnsPage() throws Exception {
		mockMvc.perform(get("/courses/list")).
		andExpect(status().isOk()).
		andExpect(view().name("courses/list-courses"));		
	}

	@WithMockUser(value = "zarras")
	@Test 
	void testSaveCourseReturnsPage() throws Exception {
		
	    Course course = new Course(555,"test", 5555, 5,"test description");
	    
	    //populate course fields
	    MultiValueMap<String, String> multiValueMap = new LinkedMultiValueMap<>();
	    multiValueMap.add("id", Integer.toString(course.getId()));
	    multiValueMap.add("name", course.getName());
	    multiValueMap.add("year", course.getYear().toString());
	    multiValueMap.add("semester", course.getSemester().toString());
	    multiValueMap.add("description", course.getDescription());
	    
	    //perform /save for those fields
		mockMvc.perform(
				post("/courses/save")
				//.contentType(MediaType.APPLICATION_FORM_URLENCODED)
			    .params(multiValueMap))
				.andExpect(status().isFound())
				.andExpect(view().name("redirect:/courses/list"));	
	}
	
	@WithMockUser(value = "zarras")
	@Test 
	void testUpdateCourseReturnsPage() throws Exception {
		
		//find course from service
		Course c = courseService.findById(1);
		//change its fields
		MultiValueMap<String, String> multiValueMap = new LinkedMultiValueMap<>();
	    //multiValueMap.add("id", Integer.toString(c.getId()));
	    multiValueMap.add("name", c.getName());
	    multiValueMap.add("year", c.getYear().toString());
	    multiValueMap.add("semester", c.getSemester().toString());
	    multiValueMap.add("description", c.getDescription());
	    
	    //perform /showFormForUpdate for that particular course 
		mockMvc.perform(
				post("/courses/showFormForUpdate?courseId=1")
				//.contentType(MediaType.APPLICATION_FORM_URLENCODED)
			    .params(multiValueMap))
				.andExpect(status().isOk())
				.andExpect(view().name("courses/course-form"));
		
	}
	
	@WithMockUser(value = "zarras")
	@Test 
	void testDeleteCourseReturnsPage() throws Exception {
		
		//create new test course
		Course course = new Course(999,"test", 9999, 9,"test description");
	    //populate its fields
	    MultiValueMap<String, String> multiValueMap = new LinkedMultiValueMap<>();
	    multiValueMap.add("id", Integer.toString(course.getId()));
	    multiValueMap.add("name", course.getName());
	    multiValueMap.add("year", course.getYear().toString());
	    multiValueMap.add("semester", course.getSemester().toString());
	    multiValueMap.add("description", course.getDescription());
	    
	    //perform save
		mockMvc.perform(
				post("/courses/save")
				//.contentType(MediaType.APPLICATION_FORM_URLENCODED)
			    .params(multiValueMap))
				.andExpect(status().isFound())
				.andExpect(view().name("redirect:/courses/list"));	
		
		//get all courses , keep the largest course id
		String url = "/courses/delete?courseId=";
		List<Course> courses = courseService.findAll();
		int cID = 0;
		for (int i=0;i<courses.size();i++) {
			if (cID<courses.get(i).getId()) {
				cID=courses.get(i).getId();
			}
		}
		
		
		String str =url+ cID;
		
		//delete that course and expect to be redirected
		mockMvc.perform(
				post(str))
				.andExpect(view().name("redirect:/courses/list"));
			
	}
		
	
	
	
}
