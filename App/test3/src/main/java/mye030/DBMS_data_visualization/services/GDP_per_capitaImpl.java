package mye030.DBMS_data_visualization.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import mye030.DBMS_data_visualization.DAO.GDP_per_capitaDAO;
import mye030.DBMS_data_visualization.entities.GDP_per_capita;

@Service
public class GDP_per_capitaImpl implements GDP_per_capitaService{
	@Autowired
	private GDP_per_capitaDAO GDP_per_capitaRepository;
	
	public GDP_per_capitaImpl() {
		
	}
	
	@Autowired
	public GDP_per_capitaImpl(GDP_per_capitaDAO theGDP_per_capitaRepository) {
		GDP_per_capitaRepository = theGDP_per_capitaRepository;
	}
	
	@Override
	@Transactional
	public List<GDP_per_capita> findAll() {
		return GDP_per_capitaRepository.findAll();
	}
	
	@Override
	@Transactional
	public GDP_per_capita findById(int theISO_code) {
		GDP_per_capita result = GDP_per_capitaRepository.findById(theISO_code);
				
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
	public void save(GDP_per_capita theCourse) {
		//GDP_per_capitaRepository.save(theCourse);
	}

	@Override
	@Transactional
	public void deleteById(int theISO_code) {
		//GDP_per_capitaRepository.deleteById(int theISO_code, int theYear);
	}
}