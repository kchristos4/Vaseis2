package mye030.DBMS_data_visualization.entities;
import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the mortality_life_expectancy database table.
 * 
 */
@Embeddable
public class MortalityLifeExpectancyPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(insertable=false, updatable=false)
	private int ISO_Code;

	private int year;

	public MortalityLifeExpectancyPK() {
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

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof MortalityLifeExpectancyPK)) {
			return false;
		}
		MortalityLifeExpectancyPK castOther = (MortalityLifeExpectancyPK)other;
		return 
			(this.ISO_Code == castOther.ISO_Code)
			&& (this.year == castOther.year);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.ISO_Code;
		hash = hash * prime + this.year;
		
		return hash;
	}
}