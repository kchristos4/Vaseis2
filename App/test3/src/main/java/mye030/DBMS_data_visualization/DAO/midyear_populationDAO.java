package mye030.DBMS_data_visualization.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import mye030.DBMS_data_visualization.entities.CK_ISO_code_Year;
import mye030.DBMS_data_visualization.entities.midyear_population;

@Repository
public interface midyear_populationDAO extends JpaRepository<midyear_population, CK_ISO_code_Year>{
	public midyear_population findById(int theISO_code,int theYear);
}