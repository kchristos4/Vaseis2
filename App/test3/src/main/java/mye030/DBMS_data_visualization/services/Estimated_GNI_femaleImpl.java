package mye030.DBMS_data_visualization.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import mye030.DBMS_data_visualization.DAO.Estimated_GNI_femaleDAO;
import mye030.DBMS_data_visualization.entities.Estimated_GNI_female;

@Service
public class Estimated_GNI_femaleImpl implements Estimated_GNI_femaleService{
	@Autowired
	private Estimated_GNI_femaleDAO Estimated_GNI_femaleRepository;
	
	public Estimated_GNI_femaleImpl() {
		
	}
	
	@Autowired
	public Estimated_GNI_femaleImpl(Estimated_GNI_femaleDAO theEstimated_GNI_femaleRepository) {
		Estimated_GNI_femaleRepository = theEstimated_GNI_femaleRepository;
	}
	
	@Override
	@Transactional
	public List<Estimated_GNI_female> findAll() {
		return Estimated_GNI_femaleRepository.findAll();
	}
	
	@Override
	@Transactional
	public Estimated_GNI_female findById(int theISO_code) {
		Estimated_GNI_female result = Estimated_GNI_femaleRepository.findById(theISO_code);
				
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
	public void save(Estimated_GNI_female theCourse) {
		//Estimated_GNI_femaleRepository.save(theCourse);
	}

	@Override
	@Transactional
	public void deleteById(int theISO_code) {
		//Estimated_GNI_femaleRepository.deleteById(int theISO_code, int theYear);
	}
}