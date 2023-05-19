package mye030.DBMS_data_visualization.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import mye030.DBMS_data_visualization.entities.MidyearPopulation5yrAgeSex;
import mye030.DBMS_data_visualization.entities.MidyearPopulation5yrAgeSexPK;

@Repository
public interface MidyearPopulation5yrAgeSexDAO extends JpaRepository<MidyearPopulation5yrAgeSex, MidyearPopulation5yrAgeSexPK>{
	
	
}