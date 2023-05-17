package mye030.DBMS_data_visualization.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import mye030.DBMS_data_visualization.DAO.countriesDAO;
import mye030.DBMS_data_visualization.entities.countries;

@Service
public class countriesImpl implements countriesService{
	@Autowired
	private countriesDAO countriesRepository;
	
	public countriesImpl() {
		
	}
	
	@Autowired
	public countriesImpl(countriesDAO thecountriesRepository) {
		countriesRepository = thecountriesRepository;
	}
	
	@Override
	@Transactional
	public List<countries> findAll() {
		return countriesRepository.findAll();
	}
	
	@Override
	@Transactional
	public countries findById(int theISO_code) {
		countries result = countriesRepository.findById(theISO_code);
				
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
	public void save(countries theCourse) {
		//countriesRepository.save(theCourse);
	}

	@Override
	@Transactional
	public void deleteById(int theISO_code) {
		//countriesRepository.deleteById(int theISO_code, int theYear);
	}
}