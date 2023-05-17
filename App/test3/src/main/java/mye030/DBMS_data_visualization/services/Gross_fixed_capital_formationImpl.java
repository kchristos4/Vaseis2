package mye030.DBMS_data_visualization.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import mye030.DBMS_data_visualization.DAO.Gross_fixed_capital_formationDAO;
import mye030.DBMS_data_visualization.entities.Gross_fixed_capital_formation;

@Service
public class Gross_fixed_capital_formationImpl implements Gross_fixed_capital_formationService{
	@Autowired
	private Gross_fixed_capital_formationDAO Gross_fixed_capital_formationRepository;
	
	public Gross_fixed_capital_formationImpl() {
		
	}
	
	@Autowired
	public Gross_fixed_capital_formationImpl(Gross_fixed_capital_formationDAO theGross_fixed_capital_formationRepository) {
		Gross_fixed_capital_formationRepository = theGross_fixed_capital_formationRepository;
	}
	
	@Override
	@Transactional
	public List<Gross_fixed_capital_formation> findAll() {
		return Gross_fixed_capital_formationRepository.findAll();
	}
	
	@Override
	@Transactional
	public Gross_fixed_capital_formation findById(int theISO_code) {
		Gross_fixed_capital_formation result = Gross_fixed_capital_formationRepository.findById(theISO_code);
				
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
	public void save(Gross_fixed_capital_formation theCourse) {
		//Gross_fixed_capital_formationRepository.save(theCourse);
	}

	@Override
	@Transactional
	public void deleteById(int theISO_code) {
		//Gross_fixed_capital_formationRepository.deleteById(int theISO_code, int theYear);
	}
}