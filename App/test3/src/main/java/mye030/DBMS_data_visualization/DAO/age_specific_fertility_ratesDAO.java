package mye030.DBMS_data_visualization.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import mye030.DBMS_data_visualization.entities.CK_ISO_code_Year;
import mye030.DBMS_data_visualization.entities.age_specific_fertility_rates;

@Repository
public interface age_specific_fertility_ratesDAO extends JpaRepository<age_specific_fertility_rates, CK_ISO_code_Year>{
	public age_specific_fertility_rates findById(int theISO_code,int theYear);
}