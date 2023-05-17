package mye030.DBMS_data_visualization.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import mye030.DBMS_data_visualization.DAO.birth_death_growth_ratesDAO;
import mye030.DBMS_data_visualization.entities.birth_death_growth_rates;

@Service
public class birth_death_growth_ratesImpl implements birth_death_growth_ratesService{
	@Autowired
	private birth_death_growth_ratesDAO birth_death_growth_ratesRepository;
	
	public birth_death_growth_ratesImpl() {
		
	}
	
	@Autowired
	public birth_death_growth_ratesImpl(birth_death_growth_ratesDAO thebirth_death_growth_ratesRepository) {
		birth_death_growth_ratesRepository = thebirth_death_growth_ratesRepository;
	}
	
	@Override
	@Transactional
	public List<birth_death_growth_rates> findAll() {
		return birth_death_growth_ratesRepository.findAll();
	}
	
	@Override
	@Transactional
	public birth_death_growth_rates findById(int theISO_code, int theYear) {
		birth_death_growth_rates result = birth_death_growth_ratesRepository.findById(theISO_code, theYear);
				
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
	public void save(birth_death_growth_rates theCourse) {
		//birth_death_growth_ratesRepository.save(theCourse);
	}

	@Override
	@Transactional
	public void deleteById(int theISO_code, int theYear) {
		//birth_death_growth_ratesRepository.deleteById(int theISO_code, int theYear);
	}
}