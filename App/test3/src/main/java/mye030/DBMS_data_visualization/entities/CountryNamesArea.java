package mye030.DBMS_data_visualization.entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the country_names_area database table.
 * 
 */
@Entity
@Table(name="country_names_area")
@NamedQuery(name="CountryNamesArea.findAll", query="SELECT c FROM CountryNamesArea c")
public class CountryNamesArea implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int ISO_Code;

	@Column(name="country_area")
	private int countryArea;

	@Column(name="country_code")
	private String countryCode;

	@Column(name="country_name")
	private String countryName;

	//bi-directional one-to-one association to Country
	@OneToOne
	@JoinColumn(name="ISO_Code")
	private Country country;

	public CountryNamesArea() {
	}

	public int getISO_Code() {
		return this.ISO_Code;
	}

	public void setISO_Code(int ISO_Code) {
		this.ISO_Code = ISO_Code;
	}

	public int getCountryArea() {
		return this.countryArea;
	}

	public void setCountryArea(int countryArea) {
		this.countryArea = countryArea;
	}

	public String getCountryCode() {
		return this.countryCode;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	public String getCountryName() {
		return this.countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	public Country getCountry() {
		return this.country;
	}

	public void setCountry(Country country) {
		this.country = country;
	}

}