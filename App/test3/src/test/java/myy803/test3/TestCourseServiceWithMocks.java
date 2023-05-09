package myy803.test3;

import org.junit.jupiter.api.Assertions;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.Bean;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.junit4.SpringRunner;

import mye030.DBMS_data_visualization.DAO.*;
import mye030.DBMS_data_visualization.entities.Course;
import mye030.DBMS_data_visualization.services.CourseService;
import mye030.DBMS_data_visualization.services.CourseServiceImpl;


//@SpringBootTest
//@TestPropertySource(
//  locations = "classpath:application.properties")
//@RunWith(SpringRunner.class)
@ExtendWith(SpringExtension.class)
class TestCourseServiceWithMocks {

	@TestConfiguration
    static class CourseServiceImplTestContextConfiguration {
 
        @Bean
        public CourseService courseService() {
            return new CourseServiceImpl();
        }
    }

	@Autowired 
	CourseService courseService;
	
	@MockBean
	CourseDAO courseDAO;
	
	@Test
	void testCourseDAOJpaImplIsNotNull() {
		Assertions.assertNotNull(courseService);
	}

	@Test
	void testFindByIdReturnsCourse() {
		//test creating new course,saving it to a 'course' type item and making a few assertions
		Mockito.when(courseDAO.findById(19)).thenReturn(new Course(19,"lang", 1997,3, "langDesc"));
		Course storedCourse = courseService.findById(19);
		Assertions.assertNotNull(storedCourse);
		Assertions.assertEquals("lang", storedCourse.getName(),"same name");
		Assertions.assertEquals("1997", storedCourse.getYear().toString(),"same year");
		Assertions.assertEquals("3", storedCourse.getSemester().toString(),"same semester");
		//Assertions.assertEquals("4", storedCourse.getSemester().toString(),"same semester");
		Assertions.assertEquals("langDesc", storedCourse.getDescription(),"same desc");
	}
}