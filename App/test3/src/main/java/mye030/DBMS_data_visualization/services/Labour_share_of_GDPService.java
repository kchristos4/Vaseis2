package mye030.DBMS_data_visualization.services;

import java.util.List;

import mye030.DBMS_data_visualization.entities.Labour_share_of_GDP;

public interface Labour_share_of_GDPService{
	public List<Labour_share_of_GDP> findAll();
	
	public Labour_share_of_GDP findById(int theISO_code);
	
	public void save(Labour_share_of_GDP theCourse);
	
	public void deleteById(int theISO_code);
}