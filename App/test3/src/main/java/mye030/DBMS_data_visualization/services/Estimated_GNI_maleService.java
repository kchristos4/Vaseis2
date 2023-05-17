package mye030.DBMS_data_visualization.services;

import java.util.List;

import mye030.DBMS_data_visualization.entities.Estimated_GNI_male;

public interface Estimated_GNI_maleService{
	public List<Estimated_GNI_male> findAll();
	
	public Estimated_GNI_male findById(int theISO_code);
	
	public void save(Estimated_GNI_male theCourse);
	
	public void deleteById(int theISO_code);
}