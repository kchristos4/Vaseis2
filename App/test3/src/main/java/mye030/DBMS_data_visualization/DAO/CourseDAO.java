package mye030.DBMS_data_visualization.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import mye030.DBMS_data_visualization.entities.Course;

@Repository
public interface CourseDAO extends JpaRepository<Course, Integer>{
	public Course findById(int theId);
}