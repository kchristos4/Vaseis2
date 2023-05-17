package mye030.DBMS_data_visualization.services;

import java.util.List;

import mye030.DBMS_data_visualization.entities.countries;

public interface countriesService{
	public List<countries> findAll();
	
	public countries findById(int theISO_code);
	
	public void save(countries theCourse);
	
	public void deleteById(int theISO_code);
}