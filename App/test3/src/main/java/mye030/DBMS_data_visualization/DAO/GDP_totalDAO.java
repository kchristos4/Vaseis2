package mye030.DBMS_data_visualization.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import mye030.DBMS_data_visualization.entities.GDP_total;

@Repository
public interface GDP_totalDAO extends JpaRepository<GDP_total, Integer>{
	public GDP_total findById(int theISO_code);
}