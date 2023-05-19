package mye030.DBMS_data_visualization.entities;
import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the mortality_life_expectancy database table.
 * 
 */
@Entity
@Table(name="mortality_life_expectancy")
@NamedQuery(name="MortalityLifeExpectancy.findAll", query="SELECT m FROM MortalityLifeExpectancy m")
public class MortalityLifeExpectancy implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private MortalityLifeExpectancyPK id;

	@Column(name="country_code")
	private String countryCode;

	@Column(name="country_name")
	private String countryName;

	@Column(name="infant_mortality")
	private String infantMortality;

	@Column(name="infant_mortality_female")
	private String infantMortalityFemale;

	@Column(name="infant_mortality_male")
	private String infantMortalityMale;

	@Column(name="life_expectancy")
	private String lifeExpectancy;

	@Column(name="life_expectancy_female")
	private String lifeExpectancyFemale;

	@Column(name="life_expectancy_male")
	private String lifeExpectancyMale;

	@Column(name="mortality_rate_1to4")
	private String mortalityRate1to4;

	@Column(name="mortality_rate_1to4_female")
	private String mortalityRate1to4Female;

	@Column(name="mortality_rate_1to4_male")
	private String mortalityRate1to4Male;

	@Column(name="mortality_rate_under5")
	private String mortalityRateUnder5;

	@Column(name="mortality_rate_under5_female")
	private String mortalityRateUnder5Female;

	@Column(name="mortality_rate_under5_male")
	private String mortalityRateUnder5Male;

	//bi-directional many-to-one association to Country
	@ManyToOne
	@JoinColumn(name="ISO_Code", insertable=false, updatable=false)
	private Country country;

	public MortalityLifeExpectancy() {
	}

	public MortalityLifeExpectancyPK getId() {
		return this.id;
	}

	public void setId(MortalityLifeExpectancyPK id) {
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

	public String getInfantMortality() {
		return this.infantMortality;
	}

	public void setInfantMortality(String infantMortality) {
		this.infantMortality = infantMortality;
	}

	public String getInfantMortalityFemale() {
		return this.infantMortalityFemale;
	}

	public void setInfantMortalityFemale(String infantMortalityFemale) {
		this.infantMortalityFemale = infantMortalityFemale;
	}

	public String getInfantMortalityMale() {
		return this.infantMortalityMale;
	}

	public void setInfantMortalityMale(String infantMortalityMale) {
		this.infantMortalityMale = infantMortalityMale;
	}

	public String getLifeExpectancy() {
		return this.lifeExpectancy;
	}

	public void setLifeExpectancy(String lifeExpectancy) {
		this.lifeExpectancy = lifeExpectancy;
	}

	public String getLifeExpectancyFemale() {
		return this.lifeExpectancyFemale;
	}

	public void setLifeExpectancyFemale(String lifeExpectancyFemale) {
		this.lifeExpectancyFemale = lifeExpectancyFemale;
	}

	public String getLifeExpectancyMale() {
		return this.lifeExpectancyMale;
	}

	public void setLifeExpectancyMale(String lifeExpectancyMale) {
		this.lifeExpectancyMale = lifeExpectancyMale;
	}

	public String getMortalityRate1to4() {
		return this.mortalityRate1to4;
	}

	public void setMortalityRate1to4(String mortalityRate1to4) {
		this.mortalityRate1to4 = mortalityRate1to4;
	}

	public String getMortalityRate1to4Female() {
		return this.mortalityRate1to4Female;
	}

	public void setMortalityRate1to4Female(String mortalityRate1to4Female) {
		this.mortalityRate1to4Female = mortalityRate1to4Female;
	}

	public String getMortalityRate1to4Male() {
		return this.mortalityRate1to4Male;
	}

	public void setMortalityRate1to4Male(String mortalityRate1to4Male) {
		this.mortalityRate1to4Male = mortalityRate1to4Male;
	}

	public String getMortalityRateUnder5() {
		return this.mortalityRateUnder5;
	}

	public void setMortalityRateUnder5(String mortalityRateUnder5) {
		this.mortalityRateUnder5 = mortalityRateUnder5;
	}

	public String getMortalityRateUnder5Female() {
		return this.mortalityRateUnder5Female;
	}

	public void setMortalityRateUnder5Female(String mortalityRateUnder5Female) {
		this.mortalityRateUnder5Female = mortalityRateUnder5Female;
	}

	public String getMortalityRateUnder5Male() {
		return this.mortalityRateUnder5Male;
	}

	public void setMortalityRateUnder5Male(String mortalityRateUnder5Male) {
		this.mortalityRateUnder5Male = mortalityRateUnder5Male;
	}

	public Country getCountry() {
		return this.country;
	}

	public void setCountry(Country country) {
		this.country = country;
	}

}