package mye030.DBMS_data_visualization.services;

import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import mye030.DBMS_data_visualization.entities.Country;


public interface CountryService{
	public List<Country> findAll();
	
	public Country findById(int theISO_code);
	
	public void save(Country theCourse);
	
	public void deleteById(int theISO_code);
}