package mye030.DBMS_data_visualization.services;

import java.util.List;

import mye030.DBMS_data_visualization.entities.Estimated_GNI_female;

public interface Estimated_GNI_femaleService{
	public List<Estimated_GNI_female> findAll();
	
	public Estimated_GNI_female findById(int theISO_code);
	
	public void save(Estimated_GNI_female theCourse);
	
	public void deleteById(int theISO_code);
}