package mye030.DBMS_data_visualization.services;

import java.util.List;

import mye030.DBMS_data_visualization.entities.midyear_population_age_sex;

public interface midyear_population_age_sexService{
	public List<midyear_population_age_sex> findAll();
	
	public midyear_population_age_sex findById(int theISO_code,int theYear,String theSex);
	
	public void save(midyear_population_age_sex theCourse);
	
	public void deleteById(int theISO_code, int theYear,String theSex);
}