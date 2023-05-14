package mye030.DBMS_data_visualization.entities;

import javax.persistence.*;

import org.springframework.stereotype.Component;


@Entity
@Table(name="birth_death_growth_rates")
public class birth_death_growth_rates {
	
	@EmbeddedId
	private CK_ISO_code_Year ISO_code_Year;
	
	@ManyToOne
	@JoinColumn(name = "ISO_code", referencedColumnName = "ISO_code", insertable = false, updatable = false)
	private countries c;
	
	@Column(name="country_code")
	private String country_code;
	@Column(name="country_name")
	private String country_name;
	
	
	
	@Column(name="crude_birth_rate")
	private Float crude_birth_rate;
	
	@Column(name="crude_death_rate")
	private Float crude_death_rate;
	
	@Column(name="rate_natural_increase")
	private Float rate_natural_increase;

	@Column(name="net_migration")
	private Float net_migration;
	
	@Column(name="growth_rate")
	private Float growth_rate;
	

	
	public CK_ISO_code_Year getISO_code_Year() {
		return ISO_code_Year;
	}

	public String getCountry_code() {
		return country_code;
	}

	public String getCountry_name() {
		return country_name;
	}

	public Float getCrude_birth_rate() {
		return crude_birth_rate;
	}

	public Float getCrude_death_rate() {
		return crude_death_rate;
	}

	public Float getNet_migration() {
		return net_migration;
	}

	public Float getGrowth_rate() {
		return growth_rate;
	}

	public Float getRate_natural_increase() {
		return rate_natural_increase;
	}

	public void setRate_natural_increase(Float rate_natural_increase) {
		this.rate_natural_increase = rate_natural_increase;
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

	public void setCrude_birth_rate(Float crude_birth_rate) {
		this.crude_birth_rate = crude_birth_rate;
	}

	public void setCrude_death_rate(Float crude_death_rate) {
		this.crude_death_rate = crude_death_rate;
	}

	public void setNet_migration(Float net_migration) {
		this.net_migration = net_migration;
	}

	public void setGrowth_rate(Float growth_rate) {
		this.growth_rate = growth_rate;
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