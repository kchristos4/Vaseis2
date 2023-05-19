package mye030.DBMS_data_visualization.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import mye030.DBMS_data_visualization.dao.CountryDAO;
import mye030.DBMS_data_visualization.entities.Country;

@Service
public class CountryImpl implements CountryService{
	
	
	private CountryDAO CountryRepository;
	
	
	public CountryImpl() {
		
	}
	
	
	public CountryImpl(CountryDAO theCountryRepository) {
		this.CountryRepository = theCountryRepository;
	}
	
	@Override
	@Transactional
	public List<Country> findAll() {
		System.out.println(CountryRepository==null);
		List<Country> test = CountryRepository.findAll();
		//List<Country> test1 = new ArrayList<>();
		return test;
	}
	
	@Override
	@Transactional
	public Country findById(int theISO_code) {
		Country result = CountryRepository.findById(theISO_code);
				
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
	public void save(Country theCourse) {
		//CountryRepository.save(theCourse);
	}

	@Override
	@Transactional
	public void deleteById(int theISO_code) {
		//CountryRepository.deleteById(int theISO_code, int theYear);
	}
}