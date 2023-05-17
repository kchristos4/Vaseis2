package mye030.DBMS_data_visualization.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import mye030.DBMS_data_visualization.DAO.Domestic_creditsDAO;
import mye030.DBMS_data_visualization.entities.Domestic_credits;

@Service
public class Domestic_creditsImpl implements Domestic_creditsService{
	@Autowired
	private Domestic_creditsDAO Domestic_creditsRepository;
	
	public Domestic_creditsImpl() {
		
	}
	
	@Autowired
	public Domestic_creditsImpl(Domestic_creditsDAO theDomestic_creditsRepository) {
		Domestic_creditsRepository = theDomestic_creditsRepository;
	}
	
	@Override
	@Transactional
	public List<Domestic_credits> findAll() {
		return Domestic_creditsRepository.findAll();
	}
	
	@Override
	@Transactional
	public Domestic_credits findById(int theISO_code) {
		Domestic_credits result = Domestic_creditsRepository.findById(theISO_code);
				
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
	public void save(Domestic_credits theCourse) {
		//Domestic_creditsRepository.save(theCourse);
	}

	@Override
	@Transactional
	public void deleteById(int theISO_code) {
		//Domestic_creditsRepository.deleteById(int theISO_code, int theYear);
	}
}