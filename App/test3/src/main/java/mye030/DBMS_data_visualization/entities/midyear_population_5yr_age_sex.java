package mye030.DBMS_data_visualization.entities;

import javax.persistence.*;

import org.springframework.stereotype.Component;


@Entity
@Table(name="midyear_population_5yr_age_sex")
public class midyear_population_5yr_age_sex {
	
	@EmbeddedId
	private CK_ISO_code_Year_Total_flag_Starting_age ISO_code_Year_Total_flag_Starting_age;
	@Column(name="country_code")
	private String country_code;
	@Column(name="country_name")
	private String country_name;
	
	@ManyToOne
	@JoinColumn(name = "ISO_code", referencedColumnName = "ISO_code", insertable = false, updatable = false)
	private countries c;
	
	@Column(name="age_group_indicator")
	private String age_group_indicator;

    @Column(name="ending_age")
	private String ending_age;

    @Column(name="midyear_population")
	private String midyear_population;

    @Column(name="midyear_population_male")
	private String midyear_population_male;

    @Column(name="midyear_population_female")
	private String midyear_population_female;

	@Override
	public String toString() {
		return "";
	}


	public String getCountry_code() {
		return country_code;
	}

	public String getCountry_name() {
		return country_name;
	}

	public String getAge_group_indicator() {
		return age_group_indicator;
	}

	public String getEnding_age() {
		return ending_age;
	}

	public String getMidyear_population() {
		return midyear_population;
	}

	public String getMidyear_population_male() {
		return midyear_population_male;
	}

	public String getMidyear_population_female() {
		return midyear_population_female;
	}

	public void setCountry_code(String country_code) {
		this.country_code = country_code;
	}

	public void setCountry_name(String country_name) {
		this.country_name = country_name;
	}

	public void setAge_group_indicator(String age_group_indicator) {
		this.age_group_indicator = age_group_indicator;
	}

	public void setEnding_age(String ending_age) {
		this.ending_age = ending_age;
	}

	public void setMidyear_population(String midyear_population) {
		this.midyear_population = midyear_population;
	}

	public void setMidyear_population_male(String midyear_population_male) {
		this.midyear_population_male = midyear_population_male;
	}

	public void setMidyear_population_female(String midyear_population_female) {
		this.midyear_population_female = midyear_population_female;
	}


	public CK_ISO_code_Year_Total_flag_Starting_age getISO_code_Year_Total_flag_Starting_age() {
		return ISO_code_Year_Total_flag_Starting_age;
	}


	public countries getC() {
		return c;
	}


	public void setISO_code_Year_Total_flag_Starting_age(
			CK_ISO_code_Year_Total_flag_Starting_age iSO_code_Year_Total_flag_Starting_age) {
		ISO_code_Year_Total_flag_Starting_age = iSO_code_Year_Total_flag_Starting_age;
	}


	public void setC(countries c) {
		this.c = c;
	}
}