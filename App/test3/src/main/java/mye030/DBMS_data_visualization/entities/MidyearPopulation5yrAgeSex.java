package mye030.DBMS_data_visualization.entities;
import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the midyear_population_5yr_age_sex database table.
 * 
 */
@Entity
@Table(name="midyear_population_5yr_age_sex")
@NamedQuery(name="MidyearPopulation5yrAgeSex.findAll", query="SELECT m FROM MidyearPopulation5yrAgeSex m")
public class MidyearPopulation5yrAgeSex implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private MidyearPopulation5yrAgeSexPK id;

	@Column(name="age_group_indicator")
	private String ageGroupIndicator;

	@Column(name="country_code")
	private String countryCode;

	@Column(name="country_name")
	private String countryName;

	@Column(name="ending_age")
	private String endingAge;

	@Column(name="midyear_population")
	private String midyearPopulation;

	@Column(name="midyear_population_female")
	private String midyearPopulationFemale;

	@Column(name="midyear_population_male")
	private String midyearPopulationMale;

	//bi-directional many-to-one association to Country
	@ManyToOne
	@JoinColumn(name="ISO_Code", insertable=false, updatable=false)
	private Country country;

	public MidyearPopulation5yrAgeSex() {
	}

	public MidyearPopulation5yrAgeSexPK getId() {
		return this.id;
	}

	public void setId(MidyearPopulation5yrAgeSexPK id) {
		this.id = id;
	}

	public String getAgeGroupIndicator() {
		return this.ageGroupIndicator;
	}

	public void setAgeGroupIndicator(String ageGroupIndicator) {
		this.ageGroupIndicator = ageGroupIndicator;
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

	public String getEndingAge() {
		return this.endingAge;
	}

	public void setEndingAge(String endingAge) {
		this.endingAge = endingAge;
	}

	public String getMidyearPopulation() {
		return this.midyearPopulation;
	}

	public void setMidyearPopulation(String midyearPopulation) {
		this.midyearPopulation = midyearPopulation;
	}

	public String getMidyearPopulationFemale() {
		return this.midyearPopulationFemale;
	}

	public void setMidyearPopulationFemale(String midyearPopulationFemale) {
		this.midyearPopulationFemale = midyearPopulationFemale;
	}

	public String getMidyearPopulationMale() {
		return this.midyearPopulationMale;
	}

	public void setMidyearPopulationMale(String midyearPopulationMale) {
		this.midyearPopulationMale = midyearPopulationMale;
	}

	public Country getCountry() {
		return this.country;
	}

	public void setCountry(Country country) {
		this.country = country;
	}

}