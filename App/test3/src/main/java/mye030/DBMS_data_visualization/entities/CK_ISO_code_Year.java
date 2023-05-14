package mye030.DBMS_data_visualization.entities;

import javax.persistence.Entity;
import javax.persistence.*;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.stereotype.Component;


@Embeddable
public class CK_ISO_code_Year {
	
	private Integer year;
	private Integer ISO_code;
	
	
	
	public Integer getYear() {
		return year;
	}
	public Integer getISO_code() {
		return ISO_code;
	}
	public void setYear(Integer year) {
		this.year = year;
	}
	public void setISO_code(Integer iSO_code) {
		ISO_code = iSO_code;
	}
}