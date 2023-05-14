package mye030.DBMS_data_visualization.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import mye030.DBMS_data_visualization.entities.Estimated_GNI_male;

@Repository
public interface Estimated_GNI_maleDAO extends JpaRepository<Estimated_GNI_male, Integer>{
	public Estimated_GNI_male findById(int theISO_code);
}