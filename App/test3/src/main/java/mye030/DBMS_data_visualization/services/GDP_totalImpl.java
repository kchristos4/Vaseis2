package mye030.DBMS_data_visualization.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import mye030.DBMS_data_visualization.DAO.GDP_totalDAO;
import mye030.DBMS_data_visualization.entities.GDP_total;

@Service
public class GDP_totalImpl implements GDP_totalService{
	@Autowired
	private GDP_totalDAO GDP_totalRepository;
	
	public GDP_totalImpl() {
		
	}
	
	@Autowired
	public GDP_totalImpl(GDP_totalDAO theGDP_totalRepository) {
		GDP_totalRepository = theGDP_totalRepository;
	}
	
	@Override
	@Transactional
	public List<GDP_total> findAll() {
		return GDP_totalRepository.findAll();
	}
	
	@Override
	@Transactional
	public GDP_total findById(int theISO_code) {
		GDP_total result = GDP_totalRepository.findById(theISO_code);
				
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
	public void save(GDP_total theCourse) {
		//GDP_totalRepository.save(theCourse);
	}

	@Override
	@Transactional
	public void deleteById(int theISO_code) {
		//GDP_totalRepository.deleteById(int theISO_code, int theYear);
	}
}