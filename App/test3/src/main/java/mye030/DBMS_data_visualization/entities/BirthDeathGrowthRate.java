package mye030.DBMS_data_visualization.entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the birth_death_growth_rates database table.
 * 
 */
@Entity
@Table(name="birth_death_growth_rates")
@NamedQuery(name="BirthDeathGrowthRate.findAll", query="SELECT b FROM BirthDeathGrowthRate b")
public class BirthDeathGrowthRate implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private BirthDeathGrowthRatePK id;

	@Column(name="country_code")
	private String countryCode;

	@Column(name="country_name")
	private String countryName;

	@Column(name="crude_birth_rate")
	private float crudeBirthRate;

	@Column(name="crude_death_rate")
	private float crudeDeathRate;

	@Column(name="growth_rate")
	private float growthRate;

	@Column(name="net_migration")
	private float netMigration;

	@Column(name="rate_natural_increase")
	private float rateNaturalIncrease;

	//bi-directional many-to-one association to Country
	@ManyToOne
	@JoinColumn(name="ISO_Code", insertable=false, updatable=false)
	private Country country;

	public BirthDeathGrowthRate() {
	}

	public BirthDeathGrowthRatePK getId() {
		return this.id;
	}

	public void setId(BirthDeathGrowthRatePK id) {
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

	public float getCrudeBirthRate() {
		return this.crudeBirthRate;
	}

	public void setCrudeBirthRate(float crudeBirthRate) {
		this.crudeBirthRate = crudeBirthRate;
	}

	public float getCrudeDeathRate() {
		return this.crudeDeathRate;
	}

	public void setCrudeDeathRate(float crudeDeathRate) {
		this.crudeDeathRate = crudeDeathRate;
	}

	public float getGrowthRate() {
		return this.growthRate;
	}

	public void setGrowthRate(float growthRate) {
		this.growthRate = growthRate;
	}

	public float getNetMigration() {
		return this.netMigration;
	}

	public void setNetMigration(float netMigration) {
		this.netMigration = netMigration;
	}

	public float getRateNaturalIncrease() {
		return this.rateNaturalIncrease;
	}

	public void setRateNaturalIncrease(float rateNaturalIncrease) {
		this.rateNaturalIncrease = rateNaturalIncrease;
	}

	public Country getCountry() {
		return this.country;
	}

	public void setCountry(Country country) {
		this.country = country;
	}

}