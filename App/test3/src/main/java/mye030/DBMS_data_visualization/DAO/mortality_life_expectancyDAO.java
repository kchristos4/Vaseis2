package mye030.DBMS_data_visualization.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import mye030.DBMS_data_visualization.entities.CK_ISO_code_Year;
import mye030.DBMS_data_visualization.entities.mortality_life_expectancy;

@Repository
public interface mortality_life_expectancyDAO extends JpaRepository<mortality_life_expectancy, CK_ISO_code_Year>{
	public mortality_life_expectancy findById(int theISO_code,int theYear);
}