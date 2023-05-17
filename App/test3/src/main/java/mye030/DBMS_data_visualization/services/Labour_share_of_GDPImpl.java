package mye030.DBMS_data_visualization.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import mye030.DBMS_data_visualization.DAO.Labour_share_of_GDPDAO;
import mye030.DBMS_data_visualization.entities.Labour_share_of_GDP;

@Service
public class Labour_share_of_GDPImpl implements Labour_share_of_GDPService{
	@Autowired
	private Labour_share_of_GDPDAO Labour_share_of_GDPRepository;
	
	public Labour_share_of_GDPImpl() {
		
	}
	
	@Autowired
	public Labour_share_of_GDPImpl(Labour_share_of_GDPDAO theLabour_share_of_GDPRepository) {
		Labour_share_of_GDPRepository = theLabour_share_of_GDPRepository;
	}
	
	@Override
	@Transactional
	public List<Labour_share_of_GDP> findAll() {
		return Labour_share_of_GDPRepository.findAll();
	}
	
	@Override
	@Transactional
	public Labour_share_of_GDP findById(int theISO_code) {
		Labour_share_of_GDP result = Labour_share_of_GDPRepository.findById(theISO_code);
				
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
	public void save(Labour_share_of_GDP theCourse) {
		//Labour_share_of_GDPRepository.save(theCourse);
	}

	@Override
	@Transactional
	public void deleteById(int theISO_code) {
		//Labour_share_of_GDPRepository.deleteById(int theISO_code, int theYear);
	}
}