package mye030.DBMS_data_visualization.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import mye030.DBMS_data_visualization.entities.StudentRegistration;

import java.util.*;


public interface StudentRegistrationDAO extends JpaRepository<StudentRegistration, Integer>{
	public StudentRegistration findById(int theId);
	public List<StudentRegistration> findAllByCourseid(int theId);
}