package mye030.DBMS_data_visualization.services;

import java.util.List;

import mye030.DBMS_data_visualization.entities.country_names_area;

public interface country_names_areaService{
	public List<country_names_area> findAll();
	
	public country_names_area findById(int theISO_code);
	
	public void save(country_names_area theCourse);
	
	public void deleteById(int theISO_code);
}