package mye030.DBMS_data_visualization.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import mye030.DBMS_data_visualization.entities.GDP_per_capita;

@Repository
public interface GDP_per_capitaDAO extends JpaRepository<GDP_per_capita, Integer>{
	public GDP_per_capita findById(int theISO_code);
}