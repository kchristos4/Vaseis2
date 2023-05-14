package mye030.DBMS_data_visualization.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import mye030.DBMS_data_visualization.entities.Gross_fixed_capital_formation;

@Repository
public interface Gross_fixed_capital_formationDAO extends JpaRepository<Gross_fixed_capital_formation, Integer>{
	public Gross_fixed_capital_formation findById(int theISO_code);
}