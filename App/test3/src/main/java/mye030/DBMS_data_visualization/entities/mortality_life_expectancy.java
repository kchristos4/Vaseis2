package mye030.DBMS_data_visualization.entities;

import javax.persistence.*;

import org.springframework.stereotype.Component;


@Entity
@Table(name="mortality_life_expectancy")
public class mortality_life_expectancy {
	
	@EmbeddedId
	private CK_ISO_code_Year ISO_code_Year;
	
	@ManyToOne
	@JoinColumn(name = "ISO_code", referencedColumnName = "ISO_code", insertable = false, updatable = false)
	private countries c;
	
	@Column(name="country_code")
	private String country_code;
	@Column(name="country_name")
	private String country_name;
	
	
	@Column(name="infant_mortality")
	private String infant_mortality;

    @Column(name="infant_mortality_male")
	private String infant_mortality_male;

    @Column(name="infant_mortality_female")
	private String infant_mortality_female;

    @Column(name="life_expectancy")
	private String life_expectancy;

    @Column(name="life_expectancy_male")
	private String life_expectancy_male;

    @Column(name="life_expectancy_female")
	private String life_expectancy_female;

    @Column(name="mortality_rate_under5")
	private String mortality_rate_under5;

    @Column(name="mortality_rate_under5_male")
	private String mortality_rate_under5_male;

    @Column(name="mortality_rate_under5_female")
	private String mortality_rate_under5_female;

    @Column(name="mortality_rate_1to4")
	private String mortality_rate_1to4;

    @Column(name="mortality_rate_1to4_male")
	private String mortality_rate_1to4_male;

    @Column(name="mortality_rate_1to4_female")
	private String mortality_rate_1to4_female;

	
	


	
	
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







	public String getInfant_mortality() {
		return infant_mortality;
	}







	public String getInfant_mortality_male() {
		return infant_mortality_male;
	}







	public String getInfant_mortality_female() {
		return infant_mortality_female;
	}







	public String getLife_expectancy() {
		return life_expectancy;
	}







	public String getLife_expectancy_male() {
		return life_expectancy_male;
	}







	public String getLife_expectancy_female() {
		return life_expectancy_female;
	}







	public String getMortality_rate_under5() {
		return mortality_rate_under5;
	}







	public String getMortality_rate_under5_male() {
		return mortality_rate_under5_male;
	}







	public String getMortality_rate_under5_female() {
		return mortality_rate_under5_female;
	}







	public String getMortality_rate_1to4() {
		return mortality_rate_1to4;
	}







	public String getMortality_rate_1to4_male() {
		return mortality_rate_1to4_male;
	}







	public String getMortality_rate_1to4_female() {
		return mortality_rate_1to4_female;
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







	public void setInfant_mortality(String infant_mortality) {
		this.infant_mortality = infant_mortality;
	}







	public void setInfant_mortality_male(String infant_mortality_male) {
		this.infant_mortality_male = infant_mortality_male;
	}







	public void setInfant_mortality_female(String infant_mortality_female) {
		this.infant_mortality_female = infant_mortality_female;
	}







	public void setLife_expectancy(String life_expectancy) {
		this.life_expectancy = life_expectancy;
	}







	public void setLife_expectancy_male(String life_expectancy_male) {
		this.life_expectancy_male = life_expectancy_male;
	}







	public void setLife_expectancy_female(String life_expectancy_female) {
		this.life_expectancy_female = life_expectancy_female;
	}







	public void setMortality_rate_under5(String mortality_rate_under5) {
		this.mortality_rate_under5 = mortality_rate_under5;
	}







	public void setMortality_rate_under5_male(String mortality_rate_under5_male) {
		this.mortality_rate_under5_male = mortality_rate_under5_male;
	}







	public void setMortality_rate_under5_female(String mortality_rate_under5_female) {
		this.mortality_rate_under5_female = mortality_rate_under5_female;
	}







	public void setMortality_rate_1to4(String mortality_rate_1to4) {
		this.mortality_rate_1to4 = mortality_rate_1to4;
	}







	public void setMortality_rate_1to4_male(String mortality_rate_1to4_male) {
		this.mortality_rate_1to4_male = mortality_rate_1to4_male;
	}







	public void setMortality_rate_1to4_female(String mortality_rate_1to4_female) {
		this.mortality_rate_1to4_female = mortality_rate_1to4_female;
	}







	public countries getC() {
		return c;
	}







	public void setC(countries c) {
		this.c = c;
	}
}