package mye030.DBMS_data_visualization.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import mye030.DBMS_data_visualization.entities.GniPerCapita;

@Repository
public interface GniPerCapitaDAO extends JpaRepository<GniPerCapita, Integer>{
	
	
}