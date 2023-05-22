package mye030.DBMS_data_visualization.DAO;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import mye030.DBMS_data_visualization.entities.LabourShareOfGdp;

@Repository
public interface LabourShareOfGdpDAO extends JpaRepository<LabourShareOfGdp, Integer>{
	
	
}