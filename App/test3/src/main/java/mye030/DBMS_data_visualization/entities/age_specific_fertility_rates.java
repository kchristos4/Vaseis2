package mye030.DBMS_data_visualization.entities;

import javax.persistence.Entity;
import javax.persistence.*;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.stereotype.Component;


@Entity
@Table(name="age_specific_fertility_rates")
public class age_specific_fertility_rates {
	
	@EmbeddedId
	private CK_ISO_code_Year ISO_code_Year;
	
	@ManyToOne
	@JoinColumn(name = "ISO_code", referencedColumnName = "ISO_code", insertable = false, updatable = false)
	private countries c;
	
	@Column(name="country_code")
	private String country_code;
	@Column(name="country_name")
	private String country_name;
	
	
	
	@Column(name="fertility_rate_15_19")
	private Float fertility_rate_15_19;
	
	@Column(name="fertility_rate_20_24")
	private Float fertility_rate_20_24;
	
	@Column(name="fertility_rate_25_29")
	private Float fertility_rate_25_29;
	
	@Column(name="fertility_rate_30_34")
	private Float fertility_rate_30_34;
	
	@Column(name="fertility_rate_35_39")
	private Float fertility_rate_35_39;
	
	@Column(name="fertility_rate_40_44")
	private Float fertility_rate_40_44;
	
	@Column(name="fertility_rate_45_49")
	private Float fertility_rate_45_49;
	
	@Column(name="total_fertility_rate")
	private Float total_fertility_rate;
	
	@Column(name="gross_reproduction_rate")
	private Float gross_reproduction_rate;
	
	@Column(name="sex_ratio_at_birth")
	private Float sex_ratio_at_birth;
	

	
	
	
	public String getCountry_code() {
		return country_code;
	}

	public void setCountry_code(String country_code) {
		this.country_code = country_code;
	}

	public String getCountry_name() {
		return country_name;
	}

	public void setCountry_name(String country_name) {
		this.country_name = country_name;
	}

	public Float getFertility_rate_15_19() {
		return fertility_rate_15_19;
	}

	public void setFertility_rate_15_19(Float fertility_rate_15_19) {
		this.fertility_rate_15_19 = fertility_rate_15_19;
	}

	public Float getFertility_rate_20_24() {
		return fertility_rate_20_24;
	}

	public void setFertility_rate_20_24(Float fertility_rate_20_24) {
		this.fertility_rate_20_24 = fertility_rate_20_24;
	}

	public Float getFertility_rate_25_29() {
		return fertility_rate_25_29;
	}

	public void setFertility_rate_25_29(Float fertility_rate_25_29) {
		this.fertility_rate_25_29 = fertility_rate_25_29;
	}

	public Float getFertility_rate_30_34() {
		return fertility_rate_30_34;
	}

	public void setFertility_rate_30_34(Float fertility_rate_30_34) {
		this.fertility_rate_30_34 = fertility_rate_30_34;
	}

	public Float getFertility_rate_35_39() {
		return fertility_rate_35_39;
	}

	public void setFertility_rate_35_39(Float fertility_rate_35_39) {
		this.fertility_rate_35_39 = fertility_rate_35_39;
	}

	public Float getFertility_rate_40_44() {
		return fertility_rate_40_44;
	}

	public void setFertility_rate_40_44(Float fertility_rate_40_44) {
		this.fertility_rate_40_44 = fertility_rate_40_44;
	}

	public Float getFertility_rate_45_49() {
		return fertility_rate_45_49;
	}

	public void setFertility_rate_45_49(Float fertility_rate_45_49) {
		this.fertility_rate_45_49 = fertility_rate_45_49;
	}

	public Float getTotal_fertility_rate() {
		return total_fertility_rate;
	}

	public void setTotal_fertility_rate(Float total_fertility_rate) {
		this.total_fertility_rate = total_fertility_rate;
	}

	public Float getGross_reproduction_rate() {
		return gross_reproduction_rate;
	}

	public void setGross_reproduction_rate(Float gross_reproduction_rate) {
		this.gross_reproduction_rate = gross_reproduction_rate;
	}

	public Float getSex_ratio_at_birth() {
		return sex_ratio_at_birth;
	}

	public void setSex_ratio_at_birth(Float sex_ratio_at_birth) {
		this.sex_ratio_at_birth = sex_ratio_at_birth;
	}


	
	
	@Override
	public String toString() {
		return "";
	}

	public CK_ISO_code_Year getISO_code_Year() {
		return ISO_code_Year;
	}

	public countries getC() {
		return c;
	}

	public void setISO_code_Year(CK_ISO_code_Year iSO_code_Year) {
		ISO_code_Year = iSO_code_Year;
	}

	public void setC(countries c) {
		this.c = c;
	}
}