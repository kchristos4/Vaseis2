package mye030.DBMS_data_visualization.entities;

import javax.persistence.*;

import org.springframework.stereotype.Component;


@Entity
@Table(name="country_names_area")
public class country_names_area {
	
	@Id
	@Column(name="ISO_Code")
	private Integer ISO_Code;
	
	@Column(name="country_code")
	private String country_code;
	
	@Column(name="country_name")
	private String country_name;
	
	@Column(name="country_area")
	private Integer country_area;
	
	@ManyToOne
	@JoinColumn(name = "ISO_code", referencedColumnName = "ISO_code", insertable = false, updatable = false)
	private countries c;
	


	public Integer getISO_Code() {
		return ISO_Code;
	}

	public String getCountry_code() {
		return country_code;
	}

	public String getCountry_name() {
		return country_name;
	}

	public Integer getCountry_area() {
		return country_area;
	}

	public void setISO_Code(Integer iSO_Code) {
		ISO_Code = iSO_Code;
	}

	public void setCountry_code(String country_code) {
		this.country_code = country_code;
	}

	public void setCountry_name(String country_name) {
		this.country_name = country_name;
	}

	public void setCountry_area(Integer country_area) {
		this.country_area = country_area;
	}

	@Override
	public String toString() {
		return "";
	}

	public countries getC() {
		return c;
	}

	public void setC(countries c) {
		this.c = c;
	}
}