package mye030.DBMS_data_visualization.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import mye030.DBMS_data_visualization.entities.countries;

@Repository
public interface countriesDAO extends JpaRepository<countries, Integer>{
	public countries findById(int theISO_code);
}