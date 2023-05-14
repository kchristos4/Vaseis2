package mye030.DBMS_data_visualization.entities;

import javax.persistence.Entity;
import javax.persistence.*;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.stereotype.Component;


@Embeddable
public class CK_ISO_code_Year_Sex {
	
	private Integer year;
	@ManyToOne
	@JoinColumn(name = "ISO_code")
	private Integer ISO_code;
	private String sex;

	
	
	public Integer getYear() {
		return year;
	}
	public Integer getISO_code() {
		return ISO_code;
	}
	public String getTotal_flag() {
		return sex;
	}
	public void setYear(Integer year) {
		this.year = year;
	}
	public void setISO_code(Integer iSO_code) {
		ISO_code = iSO_code;
	}

	public void setStarting_age(String sex) {
		this.sex = sex;
	}
	
	
	
	
}