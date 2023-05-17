package mye030.DBMS_data_visualization.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import mye030.DBMS_data_visualization.DAO.Income_IndexDAO;
import mye030.DBMS_data_visualization.entities.Income_Index;

@Service
public class Income_IndexImpl implements Income_IndexService{
	@Autowired
	private Income_IndexDAO Income_IndexRepository;
	
	public Income_IndexImpl() {
		
	}
	
	@Autowired
	public Income_IndexImpl(Income_IndexDAO theIncome_IndexRepository) {
		Income_IndexRepository = theIncome_IndexRepository;
	}
	
	@Override
	@Transactional
	public List<Income_Index> findAll() {
		return Income_IndexRepository.findAll();
	}
	
	@Override
	@Transactional
	public Income_Index findById(int theISO_code) {
		Income_Index result = Income_IndexRepository.findById(theISO_code);
				
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
	public void save(Income_Index theCourse) {
		//Income_IndexRepository.save(theCourse);
	}

	@Override
	@Transactional
	public void deleteById(int theISO_code) {
		//Income_IndexRepository.deleteById(int theISO_code, int theYear);
	}
}