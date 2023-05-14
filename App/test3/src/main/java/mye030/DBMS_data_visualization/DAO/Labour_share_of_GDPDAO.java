package mye030.DBMS_data_visualization.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import mye030.DBMS_data_visualization.entities.Labour_share_of_GDP;

@Repository
public interface Labour_share_of_GDPDAO extends JpaRepository<Labour_share_of_GDP, Integer>{
	public Labour_share_of_GDP findById(int theISO_code);
}