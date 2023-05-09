package myy803.test3;


import javax.transaction.Transactional;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;

import mye030.DBMS_data_visualization.DAO.*;
import mye030.DBMS_data_visualization.entities.Course;

@SpringBootTest
@TestPropertySource(
  locations = "classpath:application.properties")
class TestCourseDAOJpa {
	@Autowired 
	CourseDAO courseDAO;
	
	@Test
	void testCourseDAOJpaImplIsNotNull() {
		Assertions.assertNotNull(courseDAO);
	}

	@Test
	void testFindByIdReturnsCourse() {
		Course storedCourse = courseDAO.findById(1);
		//check if the first course is maths and check a few of it's fields
		Assertions.assertNotNull(storedCourse);
		Assertions.assertEquals("maths", storedCourse.getName());
		Assertions.assertEquals("2019", storedCourse.getYear().toString());
		Assertions.assertEquals("7", storedCourse.getSemester().toString());
		//Assertions.assertEquals("4", storedCourse.getSemester().toString());
		Assertions.assertEquals("maths lesson", storedCourse.getDescription());
	}
}