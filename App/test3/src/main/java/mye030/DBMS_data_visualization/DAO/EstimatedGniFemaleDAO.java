package mye030.DBMS_data_visualization.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import mye030.DBMS_data_visualization.entities.EstimatedGniFemale;

@Repository
public interface EstimatedGniFemaleDAO extends JpaRepository<EstimatedGniFemale, Integer>{
	
	
}