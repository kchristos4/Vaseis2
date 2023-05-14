package mye030.DBMS_data_visualization.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import mye030.DBMS_data_visualization.entities.Income_Index;

@Repository
public interface Income_IndexDAO extends JpaRepository<Income_Index, Integer>{
	public Income_Index findById(int theISO_code);
}