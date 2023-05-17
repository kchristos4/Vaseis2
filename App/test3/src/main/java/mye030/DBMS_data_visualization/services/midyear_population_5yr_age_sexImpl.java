package mye030.DBMS_data_visualization.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import mye030.DBMS_data_visualization.DAO.midyear_population_5yr_age_sexDAO;
import mye030.DBMS_data_visualization.entities.midyear_population_5yr_age_sex;

@Service
public class midyear_population_5yr_age_sexImpl implements midyear_population_5yr_age_sexService{
	@Autowired
	private midyear_population_5yr_age_sexDAO midyear_population_5yr_age_sexRepository;
	
	public midyear_population_5yr_age_sexImpl() {
		
	}
	
	@Autowired
	public midyear_population_5yr_age_sexImpl(midyear_population_5yr_age_sexDAO themidyear_population_5yr_age_sexRepository) {
		midyear_population_5yr_age_sexRepository = themidyear_population_5yr_age_sexRepository;
	}
	
	@Override
	@Transactional
	public List<midyear_population_5yr_age_sex> findAll() {
		return midyear_population_5yr_age_sexRepository.findAll();
	}
	
	@Override
	@Transactional
	public midyear_population_5yr_age_sex findById(int theISO_code,int theYear,String theTotalFlag,String theStartingAge) {
		midyear_population_5yr_age_sex result = midyear_population_5yr_age_sexRepository.findById( theISO_code, theYear, theTotalFlag, theStartingAge);
				
		if (result != null ) {
			return result;
		}
		else {
			// we didn't find the course
			throw new RuntimeException("Did not find age_specific_fertility_rate id - " + theISO_code +","+ theYear);
		}
	}
	@Override
	@Transactional
	public void save(midyear_population_5yr_age_sex theCourse) {
		//midyear_population_5yr_age_sexRepository.save(theCourse);
	}

	@Override
	@Transactional
	public void deleteById(int theISO_code,int theYear,String theTotalFlag,String theStartingAge) {
		//midyear_population_5yr_age_sexRepository.deleteById(int theISO_code, int theYear);
	}
}