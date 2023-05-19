package mye030.DBMS_data_visualization.entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the age_specific_fertility_rates database table.
 * 
 */
@Entity
@Table(name="age_specific_fertility_rates")
@NamedQuery(name="AgeSpecificFertilityRate.findAll", query="SELECT a FROM AgeSpecificFertilityRate a")
public class AgeSpecificFertilityRate implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private AgeSpecificFertilityRatePK id;

	@Column(name="country_code")
	private String countryCode;

	@Column(name="country_name")
	private String countryName;

	@Column(name="fertility_rate_15_19")
	private float fertilityRate1519;

	@Column(name="fertility_rate_20_24")
	private float fertilityRate2024;

	@Column(name="fertility_rate_25_29")
	private float fertilityRate2529;

	@Column(name="fertility_rate_30_34")
	private float fertilityRate3034;

	@Column(name="fertility_rate_35_39")
	private float fertilityRate3539;

	@Column(name="fertility_rate_40_44")
	private float fertilityRate4044;

	@Column(name="fertility_rate_45_49")
	private float fertilityRate4549;

	@Column(name="gross_reproduction_rate")
	private float grossReproductionRate;

	@Column(name="sex_ratio_at_birth")
	private float sexRatioAtBirth;

	@Column(name="total_fertility_rate")
	private float totalFertilityRate;

	//bi-directional many-to-one association to Country
	@ManyToOne
	@JoinColumn(name="ISO_Code", insertable=false, updatable=false)
	private Country country;

	public AgeSpecificFertilityRate() {
	}

	public AgeSpecificFertilityRatePK getId() {
		return this.id;
	}

	public void setId(AgeSpecificFertilityRatePK id) {
		this.id = id;
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

	public float getFertilityRate1519() {
		return this.fertilityRate1519;
	}

	public void setFertilityRate1519(float fertilityRate1519) {
		this.fertilityRate1519 = fertilityRate1519;
	}

	public float getFertilityRate2024() {
		return this.fertilityRate2024;
	}

	public void setFertilityRate2024(float fertilityRate2024) {
		this.fertilityRate2024 = fertilityRate2024;
	}

	public float getFertilityRate2529() {
		return this.fertilityRate2529;
	}

	public void setFertilityRate2529(float fertilityRate2529) {
		this.fertilityRate2529 = fertilityRate2529;
	}

	public float getFertilityRate3034() {
		return this.fertilityRate3034;
	}

	public void setFertilityRate3034(float fertilityRate3034) {
		this.fertilityRate3034 = fertilityRate3034;
	}

	public float getFertilityRate3539() {
		return this.fertilityRate3539;
	}

	public void setFertilityRate3539(float fertilityRate3539) {
		this.fertilityRate3539 = fertilityRate3539;
	}

	public float getFertilityRate4044() {
		return this.fertilityRate4044;
	}

	public void setFertilityRate4044(float fertilityRate4044) {
		this.fertilityRate4044 = fertilityRate4044;
	}

	public float getFertilityRate4549() {
		return this.fertilityRate4549;
	}

	public void setFertilityRate4549(float fertilityRate4549) {
		this.fertilityRate4549 = fertilityRate4549;
	}

	public float getGrossReproductionRate() {
		return this.grossReproductionRate;
	}

	public void setGrossReproductionRate(float grossReproductionRate) {
		this.grossReproductionRate = grossReproductionRate;
	}

	public float getSexRatioAtBirth() {
		return this.sexRatioAtBirth;
	}

	public void setSexRatioAtBirth(float sexRatioAtBirth) {
		this.sexRatioAtBirth = sexRatioAtBirth;
	}

	public float getTotalFertilityRate() {
		return this.totalFertilityRate;
	}

	public void setTotalFertilityRate(float totalFertilityRate) {
		this.totalFertilityRate = totalFertilityRate;
	}

	public Country getCountry() {
		return this.country;
	}

	public void setCountry(Country country) {
		this.country = country;
	}

}