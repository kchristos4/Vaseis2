package mye030.DBMS_data_visualization.services;

import java.util.List;

import mye030.DBMS_data_visualization.entities.mortality_life_expectancy;

public interface mortality_life_expectancyService{
	public List<mortality_life_expectancy> findAll();
	
	public mortality_life_expectancy findById(int theISO_code,int theYear);
	
	public void save(mortality_life_expectancy theCourse);
	
	public void deleteById(int theISO_code, int theYear);
}