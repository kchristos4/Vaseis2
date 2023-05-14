package mye030.DBMS_data_visualization.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import mye030.DBMS_data_visualization.entities.Estimated_GNI_female;

@Repository
public interface Estimated_GNI_femaleDAO extends JpaRepository<Estimated_GNI_female, Integer>{
	public Estimated_GNI_female findById(int theISO_code);
}