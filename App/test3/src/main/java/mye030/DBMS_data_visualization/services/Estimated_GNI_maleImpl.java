package mye030.DBMS_data_visualization.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import mye030.DBMS_data_visualization.DAO.Estimated_GNI_maleDAO;
import mye030.DBMS_data_visualization.entities.Estimated_GNI_male;

@Service
public class Estimated_GNI_maleImpl implements Estimated_GNI_maleService{
	@Autowired
	private Estimated_GNI_maleDAO Estimated_GNI_maleRepository;
	
	public Estimated_GNI_maleImpl() {
		
	}
	
	@Autowired
	public Estimated_GNI_maleImpl(Estimated_GNI_maleDAO theEstimated_GNI_maleRepository) {
		Estimated_GNI_maleRepository = theEstimated_GNI_maleRepository;
	}
	
	@Override
	@Transactional
	public List<Estimated_GNI_male> findAll() {
		return Estimated_GNI_maleRepository.findAll();
	}
	
	@Override
	@Transactional
	public Estimated_GNI_male findById(int theISO_code) {
		Estimated_GNI_male result = Estimated_GNI_maleRepository.findById(theISO_code);
				
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
	public void save(Estimated_GNI_male theCourse) {
		//Estimated_GNI_maleRepository.save(theCourse);
	}

	@Override
	@Transactional
	public void deleteById(int theISO_code) {
		//Estimated_GNI_maleRepository.deleteById(int theISO_code, int theYear);
	}
}