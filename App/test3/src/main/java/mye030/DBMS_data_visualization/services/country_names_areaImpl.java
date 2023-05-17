package mye030.DBMS_data_visualization.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import mye030.DBMS_data_visualization.DAO.country_names_areaDAO;
import mye030.DBMS_data_visualization.entities.country_names_area;

@Service
public class country_names_areaImpl implements country_names_areaService{
	@Autowired
	private country_names_areaDAO country_names_areaRepository;
	
	public country_names_areaImpl() {
		
	}
	
	@Autowired
	public country_names_areaImpl(country_names_areaDAO thecountry_names_areaRepository) {
		country_names_areaRepository = thecountry_names_areaRepository;
	}
	
	@Override
	@Transactional
	public List<country_names_area> findAll() {
		return country_names_areaRepository.findAll();
	}
	
	@Override
	@Transactional
	public country_names_area findById(int theISO_code) {
		country_names_area result = country_names_areaRepository.findById(theISO_code);
				
		if (result != null ) {
			return result;
		}
		else {
			// we didn't find the course
			throw new RuntimeException("Did not find age_specific_fertility_rate id - " + theISO_code);
		}
	}
	@Override
	@Transactional
	public void save(country_names_area theCourse) {
		//country_names_areaRepository.save(theCourse);
	}

	@Override
	@Transactional
	public void deleteById(int theISO_code) {
		//country_names_areaRepository.deleteById(int theISO_code, int theYear);
	}
}