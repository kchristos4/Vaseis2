package mye030.DBMS_data_visualization.services;

import java.util.List;

import mye030.DBMS_data_visualization.entities.GDP_total;

public interface GDP_totalService{
	public List<GDP_total> findAll();
	
	public GDP_total findById(int theISO_code);
	
	public void save(GDP_total theCourse);
	
	public void deleteById(int theISO_code);
}