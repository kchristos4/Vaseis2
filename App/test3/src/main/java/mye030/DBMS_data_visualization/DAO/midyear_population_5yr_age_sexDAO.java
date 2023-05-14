package mye030.DBMS_data_visualization.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import mye030.DBMS_data_visualization.entities.CK_ISO_code_Year_Total_flag_Starting_age;
import mye030.DBMS_data_visualization.entities.midyear_population_5yr_age_sex;

@Repository
public interface midyear_population_5yr_age_sexDAO extends JpaRepository<midyear_population_5yr_age_sex, CK_ISO_code_Year_Total_flag_Starting_age>{
	public midyear_population_5yr_age_sex findById(int theISO_code,int theYear,String theTotal_flag, String theStarting_age);
}