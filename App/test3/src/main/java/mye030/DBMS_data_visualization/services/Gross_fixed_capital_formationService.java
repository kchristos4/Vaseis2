package mye030.DBMS_data_visualization.services;

import java.util.List;

import mye030.DBMS_data_visualization.entities.Gross_fixed_capital_formation;

public interface Gross_fixed_capital_formationService{
	public List<Gross_fixed_capital_formation> findAll();
	
	public Gross_fixed_capital_formation findById(int theISO_code);
	
	public void save(Gross_fixed_capital_formation theCourse);
	
	public void deleteById(int theISO_code);
}