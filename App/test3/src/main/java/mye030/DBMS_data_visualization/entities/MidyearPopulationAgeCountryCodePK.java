package mye030.DBMS_data_visualization.entities;
import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the midyear_population_age_sex database table.
 * 
 */
@Embeddable
public class MidyearPopulationAgeCountryCodePK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(insertable=false, updatable=false)
	private int ISOCode;

	private int year;

	private String sex;
	
	private String age;

	public MidyearPopulationAgeCountryCodePK() {
	}
	public int getISO_Code() {
		return this.ISOCode;
	}
	public void setISO_Code(int ISOCode) {
		this.ISOCode = ISOCode;
	}
	public int getYear() {
		return this.year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public String getSex() {
		return this.sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	
	public String getAge() {
		return this.sex;
	}
	public void setAge(String age) {
		this.age = age;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof MidyearPopulationAgeSexPK)) {
			return false;
		}
		MidyearPopulationAgeCountryCodePK castOther = (MidyearPopulationAgeCountryCodePK)other;
		return 
			(this.ISOCode == castOther.ISOCode)
			&& (this.year == castOther.year)
			&& this.sex.equals(castOther.sex)
			&& this.age.equals(castOther.age);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.ISOCode;
		hash = hash * prime + this.year;
		hash = hash * prime + this.sex.hashCode();
		hash = hash * prime + this.age.hashCode();
		
		return hash;
	}
}