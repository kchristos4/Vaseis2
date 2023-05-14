package mye030.DBMS_data_visualization.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import mye030.DBMS_data_visualization.entities.CK_ISO_code_Year_Sex;
import mye030.DBMS_data_visualization.entities.midyear_population_age_sex;

@Repository
public interface midyear_population_age_sexDAO extends JpaRepository<midyear_population_age_sex, CK_ISO_code_Year_Sex>{
	public midyear_population_age_sex findById(int theISO_code,int theYear,String theSex);
}