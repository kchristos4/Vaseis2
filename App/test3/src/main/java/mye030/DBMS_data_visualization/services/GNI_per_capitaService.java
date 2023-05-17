package mye030.DBMS_data_visualization.services;

import java.util.List;

import mye030.DBMS_data_visualization.entities.GNI_per_capita;

public interface GNI_per_capitaService{
	public List<GNI_per_capita> findAll();
	
	public GNI_per_capita findById(int theISO_code);
	
	public void save(GNI_per_capita theCourse);
	
	public void deleteById(int theISO_code);
}