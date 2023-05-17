package mye030.DBMS_data_visualization.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import mye030.DBMS_data_visualization.DAO.GNI_per_capitaDAO;
import mye030.DBMS_data_visualization.entities.GNI_per_capita;

@Service
public class GNI_per_capitaImpl implements GNI_per_capitaService{
	@Autowired
	private GNI_per_capitaDAO GNI_per_capitaRepository;
	
	public GNI_per_capitaImpl() {
		
	}
	
	@Autowired
	public GNI_per_capitaImpl(GNI_per_capitaDAO theGNI_per_capitaRepository) {
		GNI_per_capitaRepository = theGNI_per_capitaRepository;
	}
	
	@Override
	@Transactional
	public List<GNI_per_capita> findAll() {
		return GNI_per_capitaRepository.findAll();
	}
	
	@Override
	@Transactional
	public GNI_per_capita findById(int theISO_code) {
		GNI_per_capita result = GNI_per_capitaRepository.findById(theISO_code);
				
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
	public void save(GNI_per_capita theCourse) {
		//GNI_per_capitaRepository.save(theCourse);
	}

	@Override
	@Transactional
	public void deleteById(int theISO_code) {
		//GNI_per_capitaRepository.deleteById(int theISO_code, int theYear);
	}
}