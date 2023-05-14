package mye030.DBMS_data_visualization.entities;

import javax.persistence.*;

import org.springframework.stereotype.Component;


@Entity
@Table(name="midyear_population")
public class midyear_population {
	
	@EmbeddedId
	private CK_ISO_code_Year ISO_code_Year;
	
	@ManyToOne
	@JoinColumn(name = "ISO_code", referencedColumnName = "ISO_code", insertable = false, updatable = false)
	private countries c;
	
	@Column(name="country_code")
	private String country_code;
	@Column(name="country_name")
	private String country_name;
	
	@Column(name="midyear_population")
	private String midyear_population;

	
	@Override
	public String toString() {
		return "";
	}


	public CK_ISO_code_Year getISO_code_Year() {
		return ISO_code_Year;
	}


	public String getCountry_code() {
		return country_code;
	}


	public String getCountry_name() {
		return country_name;
	}


	public String getMidyear_population() {
		return midyear_population;
	}


	public void setISO_code_Year(CK_ISO_code_Year iSO_code_Year) {
		ISO_code_Year = iSO_code_Year;
	}


	public void setCountry_code(String country_code) {
		this.country_code = country_code;
	}


	public void setCountry_name(String country_name) {
		this.country_name = country_name;
	}


	public void setMidyear_population(String midyear_population) {
		this.midyear_population = midyear_population;
	}


	public countries getC() {
		return c;
	}


	public void setC(countries c) {
		this.c = c;
	}
}