package mye030.DBMS_data_visualization.services;

import java.util.List;

import mye030.DBMS_data_visualization.entities.birth_death_growth_rates;

public interface birth_death_growth_ratesService{
	public List<birth_death_growth_rates> findAll();
	
	public birth_death_growth_rates findById(int theISO_code,int theYear);
	
	public void save(birth_death_growth_rates theCourse);
	
	public void deleteById(int theISO_code, int theYear);
}