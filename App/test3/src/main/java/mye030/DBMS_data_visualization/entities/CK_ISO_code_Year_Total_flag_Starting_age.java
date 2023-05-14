package mye030.DBMS_data_visualization.entities;

import javax.persistence.Entity;
import javax.persistence.*;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.stereotype.Component;


@Embeddable
public class CK_ISO_code_Year_Total_flag_Starting_age {
	
	private Integer year;
	private Integer ISO_code;
	private String total_flag;
	private String starting_age;
	
	
	public Integer getYear() {
		return year;
	}
	public Integer getISO_code() {
		return ISO_code;
	}
	public String getTotal_flag() {
		return total_flag;
	}
	public String getStarting_age() {
		return starting_age;
	}
	public void setYear(Integer year) {
		this.year = year;
	}
	public void setISO_code(Integer iSO_code) {
		ISO_code = iSO_code;
	}
	public void setTotal_flag(String total_flag) {
		this.total_flag = total_flag;
	}
	public void setStarting_age(String starting_age) {
		this.starting_age = starting_age;
	}
	
	
	
	
}