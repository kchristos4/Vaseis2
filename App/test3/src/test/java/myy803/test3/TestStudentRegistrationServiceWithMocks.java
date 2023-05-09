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
import mye030.DBMS_data_visualization.entities.StudentRegistration;
import mye030.DBMS_data_visualization.services.StudentRegistrationImpl;
import mye030.DBMS_data_visualization.services.StudentRegistrationService;


//@SpringBootTest
//@TestPropertySource(
//  locations = "classpath:application.properties")
//@RunWith(SpringRunner.class)
@ExtendWith(SpringExtension.class)
class TestStudentRegistrationServiceWithMocks {

	@TestConfiguration
    static class StudentRegistrationServiceImplTestContextConfiguration {
 
        @Bean
        public StudentRegistrationService studentRegistrationService() {
            return new StudentRegistrationImpl();
        }
    }

	@Autowired 
	StudentRegistrationService studentRegistrationService;
	
	@MockBean
	StudentRegistrationDAO studentRegistrationDAO;
	
	@Test
	void testStudentRegistrationDAOJpaImplIsNotNull() {
		Assertions.assertNotNull(studentRegistrationService);
	}

	@Test
	void testFindByIdReturnsStudentRegistration() {
		Mockito.when(studentRegistrationDAO.findById(19)).thenReturn(new StudentRegistration(19,"testStud", 2002, 9,"stud description",7,8,9,1));
		StudentRegistration storedStudentRegistration = studentRegistrationService.findById(19);
		//create a new student registration with id=19 ,get it from the service and check its fields with assertions
		
		
		Assertions.assertNotNull(storedStudentRegistration);
		Assertions.assertEquals("testStud", storedStudentRegistration.getName(),"same name");
		Assertions.assertEquals("2002", storedStudentRegistration.getYear().toString(),"same year");
		Assertions.assertEquals("9", storedStudentRegistration.getSemester().toString(),"same semester");
		//Assertions.assertEquals("4", storedStudentRegistration.getSemester().toString(),"same semester");
		Assertions.assertEquals("stud description", storedStudentRegistration.getDescription(),"same desc");
		Assertions.assertEquals("7.0", Float.toString(storedStudentRegistration.getFinalgrade()));
		Assertions.assertEquals("8.0", Float.toString(storedStudentRegistration.getProjectgrade()));
		Assertions.assertEquals("9.0", Float.toString(storedStudentRegistration.getExamgrade()));
		Assertions.assertEquals("1", Integer.toString(storedStudentRegistration.getCourseid()));
	}
}