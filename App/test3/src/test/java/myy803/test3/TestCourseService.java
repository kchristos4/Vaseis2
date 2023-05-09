package myy803.test3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;

import mye030.DBMS_data_visualization.entities.Course;
import mye030.DBMS_data_visualization.services.CourseService;

@SpringBootTest
@TestPropertySource(
  locations = "classpath:application.properties")
class TestCourseService {

	@Autowired 
	CourseService courseService;
	
	@Test
	void testCourseDAOJpaImplIsNotNull() {
		Assertions.assertNotNull(courseService);
	}

	@Test
	void testFindByIdReturnsCourse() {
		Course storedCourse = courseService.findById(1);
		Assertions.assertNotNull(storedCourse);
		//check if the first course is maths and check a few of it's fields
		Assertions.assertEquals("maths", storedCourse.getName());
		Assertions.assertEquals("2019", storedCourse.getYear().toString());
		//Assertions.assertEquals("7", storedCourse.getSemester().toString());
		Assertions.assertEquals("4", storedCourse.getSemester().toString());
		Assertions.assertEquals("maths lesson", storedCourse.getDescription());
	}
}