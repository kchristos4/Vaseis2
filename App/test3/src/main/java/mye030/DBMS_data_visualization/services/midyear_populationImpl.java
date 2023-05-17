package mye030.DBMS_data_visualization.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import mye030.DBMS_data_visualization.DAO.midyear_populationDAO;
import mye030.DBMS_data_visualization.entities.midyear_population;

@Service
public class midyear_populationImpl implements midyear_populationService{
	@Autowired
	private midyear_populationDAO midyear_populationRepository;
	
	public midyear_populationImpl() {
		
	}
	
	@Autowired
	public midyear_populationImpl(midyear_populationDAO themidyear_populationRepository) {
		midyear_populationRepository = themidyear_populationRepository;
	}
	
	@Override
	@Transactional
	public List<midyear_population> findAll() {
		return midyear_populationRepository.findAll();
	}
	
	@Override
	@Transactional
	public midyear_population findById(int theISO_code, int theYear) {
		midyear_population result = midyear_populationRepository.findById(theISO_code, theYear);
				
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
	public void save(midyear_population theCourse) {
		//midyear_populationRepository.save(theCourse);
	}

	@Override
	@Transactional
	public void deleteById(int theISO_code, int theYear) {
		//midyear_populationRepository.deleteById(int theISO_code, int theYear);
	}
}