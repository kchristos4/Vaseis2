package mye030.DBMS_data_visualization.entities;
import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the midyear_population database table.
 * 
 */
@Entity
@Table(name="midyear_population")
@NamedQuery(name="MidyearPopulation.findAll", query="SELECT m FROM MidyearPopulation m")
public class MidyearPopulation implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private MidyearPopulationPK id;

	@Column(name="country_code")
	private String countryCode;

	@Column(name="country_name")
	private String countryName;

	@Column(name="midyear_population")
	private String midyearPopulation;

	//bi-directional many-to-one association to Country
	@ManyToOne
	@JoinColumn(name="ISO_Code", insertable=false, updatable=false)
	private Country country;

	public MidyearPopulation() {
	}

	public MidyearPopulationPK getId() {
		return this.id;
	}

	public void setId(MidyearPopulationPK id) {
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

	public String getMidyearPopulation() {
		return this.midyearPopulation;
	}

	public void setMidyearPopulation(String midyearPopulation) {
		this.midyearPopulation = midyearPopulation;
	}

	public Country getCountry() {
		return this.country;
	}

	public void setCountry(Country country) {
		this.country = country;
	}

}