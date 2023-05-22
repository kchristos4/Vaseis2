package mye030.DBMS_data_visualization.DAO;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import mye030.DBMS_data_visualization.entities.Country;

@Repository
public interface CountryDAO extends JpaRepository<Country, Integer>{
	public Country findById(int theISO_code);
	public List<Country> findAll();
	
}