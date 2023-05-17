package mye030.DBMS_data_visualization.services;

import java.util.List;

import mye030.DBMS_data_visualization.entities.Income_Index;

public interface Income_IndexService{
	public List<Income_Index> findAll();
	
	public Income_Index findById(int theISO_code);
	
	public void save(Income_Index theCourse);
	
	public void deleteById(int theISO_code);
}