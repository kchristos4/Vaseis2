package mye030.DBMS_data_visualization.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import mye030.DBMS_data_visualization.DAO.mortality_life_expectancyDAO;
import mye030.DBMS_data_visualization.entities.mortality_life_expectancy;

@Service
public class mortality_life_expectancyImpl implements mortality_life_expectancyService{
	@Autowired
	private mortality_life_expectancyDAO mortality_life_expectancyRepository;
	
	public mortality_life_expectancyImpl() {
		
	}
	
	@Autowired
	public mortality_life_expectancyImpl(mortality_life_expectancyDAO themortality_life_expectancyRepository) {
		mortality_life_expectancyRepository = themortality_life_expectancyRepository;
	}
	
	@Override
	@Transactional
	public List<mortality_life_expectancy> findAll() {
		return mortality_life_expectancyRepository.findAll();
	}
	
	@Override
	@Transactional
	public mortality_life_expectancy findById(int theISO_code, int theYear) {
		mortality_life_expectancy result = mortality_life_expectancyRepository.findById(theISO_code, theYear);
				
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
	public void save(mortality_life_expectancy theCourse) {
		//mortality_life_expectancyRepository.save(theCourse);
	}

	@Override
	@Transactional
	public void deleteById(int theISO_code, int theYear) {
		//mortality_life_expectancyRepository.deleteById(int theISO_code, int theYear);
	}
}