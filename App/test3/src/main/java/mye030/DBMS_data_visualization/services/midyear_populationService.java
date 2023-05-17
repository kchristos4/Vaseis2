package mye030.DBMS_data_visualization.services;

import java.util.List;

import mye030.DBMS_data_visualization.entities.midyear_population;

public interface midyear_populationService{
	public List<midyear_population> findAll();
	
	public midyear_population findById(int theISO_code,int theYear);
	
	public void save(midyear_population theCourse);
	
	public void deleteById(int theISO_code, int theYear);
}