package mye030.DBMS_data_visualization.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import mye030.DBMS_data_visualization.entities.Domestic_credits;

@Repository
public interface Domestic_creditsDAO extends JpaRepository<Domestic_credits, Integer>{
	public Domestic_credits findById(int theISO_code);
}