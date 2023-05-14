package mye030.DBMS_data_visualization.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import mye030.DBMS_data_visualization.entities.CK_ISO_code_Year;
import mye030.DBMS_data_visualization.entities.birth_death_growth_rates;

@Repository
public interface birth_death_growth_ratesDAO extends JpaRepository<birth_death_growth_rates, CK_ISO_code_Year>{
	public birth_death_growth_rates findById(int theISO_code,int theYear);
}