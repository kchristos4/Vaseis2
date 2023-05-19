package mye030.DBMS_data_visualization.entities;
import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the midyear_population_5yr_age_sex database table.
 * 
 */
@Embeddable
public class MidyearPopulation5yrAgeSexPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(insertable=false, updatable=false)
	private int ISO_Code;

	private int year;

	@Column(name="total_flag")
	private String totalFlag;

	@Column(name="starting_age")
	private String startingAge;

	public MidyearPopulation5yrAgeSexPK() {
	}
	public int getISO_Code() {
		return this.ISO_Code;
	}
	public void setISO_Code(int ISO_Code) {
		this.ISO_Code = ISO_Code;
	}
	public int getYear() {
		return this.year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public String getTotalFlag() {
		return this.totalFlag;
	}
	public void setTotalFlag(String totalFlag) {
		this.totalFlag = totalFlag;
	}
	public String getStartingAge() {
		return this.startingAge;
	}
	public void setStartingAge(String startingAge) {
		this.startingAge = startingAge;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof MidyearPopulation5yrAgeSexPK)) {
			return false;
		}
		MidyearPopulation5yrAgeSexPK castOther = (MidyearPopulation5yrAgeSexPK)other;
		return 
			(this.ISO_Code == castOther.ISO_Code)
			&& (this.year == castOther.year)
			&& this.totalFlag.equals(castOther.totalFlag)
			&& this.startingAge.equals(castOther.startingAge);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.ISO_Code;
		hash = hash * prime + this.year;
		hash = hash * prime + this.totalFlag.hashCode();
		hash = hash * prime + this.startingAge.hashCode();
		
		return hash;
	}
}