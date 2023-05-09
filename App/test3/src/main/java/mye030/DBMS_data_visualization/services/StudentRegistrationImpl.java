package mye030.DBMS_data_visualization.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import mye030.DBMS_data_visualization.DAO.StudentRegistrationDAO;
import mye030.DBMS_data_visualization.entities.StudentRegistration;

@Service
public class StudentRegistrationImpl implements StudentRegistrationService{
	@Autowired
	private StudentRegistrationDAO studentRegistrationRepository;
	
	public StudentRegistrationImpl() {
		
	}
	
	@Autowired
	public StudentRegistrationImpl(StudentRegistrationDAO theStudentRegistrationRepository) {
		studentRegistrationRepository = theStudentRegistrationRepository;
	}
	
	@Override
	@Transactional
	public List<StudentRegistration> findAll() {
		return studentRegistrationRepository.findAll();
	}
	
	@Override
	@Transactional
	public StudentRegistration findById(int theId) {
		StudentRegistration result = studentRegistrationRepository.findById(theId);
				
		if (result != null ) {
			return result;
		}
		else {
			// we didn't find the course
			throw new RuntimeException("Did not find StudentRegistration id - " + theId);
		}
	}
	
	@Override
	@Transactional
	public List<StudentRegistration> findAllByCourseid(int theId) {
		//create a list of student registrations that have courseid == theId
		List<StudentRegistration> result = studentRegistrationRepository.findAllByCourseid(theId);
				
		if (result != null ) {
			return result;
		}
		else {
			// we didn't find the student registrations
			throw new RuntimeException("Did not find any student registration associated with this course - " + theId);
		}
	}
	
	@Override
	@Transactional
	public void save(StudentRegistration theStudentRegistration) {
		studentRegistrationRepository.save(theStudentRegistration);
	}

	@Override
	@Transactional
	public void deleteById(int theId) {
		studentRegistrationRepository.deleteById(theId);
	}
}