package mye030.DBMS_data_visualization.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import mye030.DBMS_data_visualization.entities.GNI_per_capita;

@Repository
public interface GNI_per_capitaDAO extends JpaRepository<GNI_per_capita, Integer>{
	public GNI_per_capita findById(int theISO_code);
}