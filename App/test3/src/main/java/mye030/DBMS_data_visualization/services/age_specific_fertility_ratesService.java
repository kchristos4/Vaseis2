package mye030.DBMS_data_visualization.services;

import java.util.List;

import mye030.DBMS_data_visualization.entities.age_specific_fertility_rates;

public interface age_specific_fertility_ratesService{
	public List<age_specific_fertility_rates> findAll();
	
	public age_specific_fertility_rates findById(int theISO_code,int theYear);
	
	public void save(age_specific_fertility_rates theCourse);
	
	public void deleteById(int theISO_code, int theYear);
}