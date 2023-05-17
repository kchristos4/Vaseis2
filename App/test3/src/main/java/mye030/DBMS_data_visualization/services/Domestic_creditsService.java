package mye030.DBMS_data_visualization.services;

import java.util.List;

import mye030.DBMS_data_visualization.entities.Domestic_credits;

public interface Domestic_creditsService{
	public List<Domestic_credits> findAll();
	
	public Domestic_credits findById(int theISO_code);
	
	public void save(Domestic_credits theCourse);
	
	public void deleteById(int theISO_code);
}