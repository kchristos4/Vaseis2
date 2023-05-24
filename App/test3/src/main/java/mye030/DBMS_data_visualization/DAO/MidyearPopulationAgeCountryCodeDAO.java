package mye030.DBMS_data_visualization.DAO;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import mye030.DBMS_data_visualization.entities.MidyearPopulationAgeCountryCode;
import mye030.DBMS_data_visualization.entities.MidyearPopulationAgeCountryCodePK;

@Repository
public interface MidyearPopulationAgeCountryCodeDAO extends JpaRepository<MidyearPopulationAgeCountryCode, MidyearPopulationAgeCountryCodePK>{
	
	List<MidyearPopulationAgeCountryCode> findAllById_ISOCode(int isoCode);
	
}