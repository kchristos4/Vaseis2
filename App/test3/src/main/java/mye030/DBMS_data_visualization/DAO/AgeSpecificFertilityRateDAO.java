package mye030.DBMS_data_visualization.DAO;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import mye030.DBMS_data_visualization.entities.AgeSpecificFertilityRate;
import mye030.DBMS_data_visualization.entities.AgeSpecificFertilityRatePK;

@Repository
public interface AgeSpecificFertilityRateDAO extends JpaRepository<AgeSpecificFertilityRate, AgeSpecificFertilityRatePK>{
	
	
}