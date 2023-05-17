package mye030.DBMS_data_visualization.services;

import java.util.List;

import mye030.DBMS_data_visualization.entities.GDP_per_capita;

public interface GDP_per_capitaService{
	public List<GDP_per_capita> findAll();
	
	public GDP_per_capita findById(int theISO_code);
	
	public void save(GDP_per_capita theCourse);
	
	public void deleteById(int theISO_code);
}