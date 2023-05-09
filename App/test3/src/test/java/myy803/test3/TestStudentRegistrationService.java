package myy803.test3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;

import mye030.DBMS_data_visualization.entities.StudentRegistration;
import mye030.DBMS_data_visualization.services.StudentRegistrationService;

@SpringBootTest
@TestPropertySource(
  locations = "classpath:application.properties")
class TestStudentRegistrationService {

	@Autowired 
	StudentRegistrationService studentRegistrationService;
	
	@Test
	void testStudentRegistrationDAOJpaImplIsNotNull() {
		Assertions.assertNotNull(studentRegistrationService);
	}

	@Test
	void testFindByIdReturnsStudentRegistration() {
		StudentRegistration storedStudentRegistration = studentRegistrationService.findById(1);
		Assertions.assertNotNull(storedStudentRegistration);
		//test find by id and making a few assertions
		Assertions.assertEquals("nefeli", storedStudentRegistration.getName());
		Assertions.assertEquals("1997", storedStudentRegistration.getYear().toString());
		Assertions.assertEquals("7", storedStudentRegistration.getSemester().toString());
		//Assertions.assertEquals("4", storedStudentRegistration.getSemester().toString());
		Assertions.assertEquals("nef", storedStudentRegistration.getDescription());
		Assertions.assertEquals("7.0", Float.toString(storedStudentRegistration.getProjectgrade()));
		Assertions.assertEquals("9.6", Float.toString(storedStudentRegistration.getExamgrade()));
		Assertions.assertEquals("1", Integer.toString(storedStudentRegistration.getCourseid()));
	}
}