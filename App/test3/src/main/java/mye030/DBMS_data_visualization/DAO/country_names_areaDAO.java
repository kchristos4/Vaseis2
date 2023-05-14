package mye030.DBMS_data_visualization.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import mye030.DBMS_data_visualization.entities.country_names_area;

@Repository
public interface country_names_areaDAO extends JpaRepository<country_names_area, Integer>{
	public country_names_area findById(int theISO_code);
}