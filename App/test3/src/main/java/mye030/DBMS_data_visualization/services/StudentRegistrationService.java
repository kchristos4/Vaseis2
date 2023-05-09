package mye030.DBMS_data_visualization.services;

import java.util.List;

import mye030.DBMS_data_visualization.entities.StudentRegistration;

public interface StudentRegistrationService{
	public List<StudentRegistration> findAll();
	
	public StudentRegistration findById(int theId);
	
	public void save(StudentRegistration theStudentRegistration);
	
	public List<StudentRegistration> findAllByCourseid(int theId);
	
	public void deleteById(int theId);
}