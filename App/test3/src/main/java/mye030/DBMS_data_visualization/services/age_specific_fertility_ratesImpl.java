package mye030.DBMS_data_visualization.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import mye030.DBMS_data_visualization.DAO.age_specific_fertility_ratesDAO;
import mye030.DBMS_data_visualization.entities.age_specific_fertility_rates;

@Service
public class age_specific_fertility_ratesImpl implements age_specific_fertility_ratesService{
	@Autowired
	private age_specific_fertility_ratesDAO age_specific_fertility_ratesRepository;
	
	public age_specific_fertility_ratesImpl() {
		
	}
	
	@Autowired
	public age_specific_fertility_ratesImpl(age_specific_fertility_ratesDAO theage_specific_fertility_ratesRepository) {
		age_specific_fertility_ratesRepository = theage_specific_fertility_ratesRepository;
	}
	
	@Override
	@Transactional
	public List<age_specific_fertility_rates> findAll() {
		return age_specific_fertility_ratesRepository.findAll();
	}
	
	@Override
	@Transactional
	public age_specific_fertility_rates findById(int theISO_code, int theYear) {
		age_specific_fertility_rates result = age_specific_fertility_ratesRepository.findById(theISO_code, theYear);
				
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
	public void save(age_specific_fertility_rates theCourse) {
		//age_specific_fertility_ratesRepository.save(theCourse);
	}

	@Override
	@Transactional
	public void deleteById(int theISO_code, int theYear) {
		//age_specific_fertility_ratesRepository.deleteById(int theISO_code, int theYear);
	}
}