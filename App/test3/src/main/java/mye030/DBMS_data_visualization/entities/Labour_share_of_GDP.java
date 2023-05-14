package mye030.DBMS_data_visualization.entities;

import javax.persistence.*;

import org.springframework.stereotype.Component;


@Entity
@Table(name="Labour_share_of_GDP")
public class Labour_share_of_GDP {
	
	@Id
	@Column(name="ISO_code")
	private int ISO_code;
	
	@ManyToOne
	@JoinColumn(name = "ISO_code", referencedColumnName = "ISO_code", insertable = false, updatable = false)
	private countries c;
	
	@Column(name="country")
	private String country;
	
	
	
	@Column(name="year_2000")
	private String year_2000;

    @Column(name="year_2005")
	private String year_2005;
    @Column(name="year_2010")
	private String year_2010;
    @Column(name="year_2011")
	private String year_2011;
    @Column(name="year_2012")
	private String year_2012;
    @Column(name="year_2013")
	private String year_2013;
    @Column(name="year_2014")
	private String year_2014;
    @Column(name="year_2015")
	private String year_2015;
    @Column(name="year_2016")
	private String year_2016;
    @Column(name="year_2018")
	private String year_2018;    
	
	
	@Override
	public String toString() {
		return "";
	}


	public int getISO_code() {
		return ISO_code;
	}


	public String getCountry() {
		return country;
	}


	public String getYear_2000() {
		return year_2000;
	}


	public String getYear_2005() {
		return year_2005;
	}


	public String getYear_2010() {
		return year_2010;
	}


	public String getYear_2011() {
		return year_2011;
	}


	public String getYear_2012() {
		return year_2012;
	}


	public String getYear_2013() {
		return year_2013;
	}


	public String getYear_2014() {
		return year_2014;
	}


	public String getYear_2015() {
		return year_2015;
	}


	public String getYear_2016() {
		return year_2016;
	}


	public String getYear_2018() {
		return year_2018;
	}


	public void setISO_code(int iSO_code) {
		ISO_code = iSO_code;
	}


	public void setCountry(String country) {
		this.country = country;
	}


	public void setYear_2000(String year_2000) {
		this.year_2000 = year_2000;
	}


	public void setYear_2005(String year_2005) {
		this.year_2005 = year_2005;
	}


	public void setYear_2010(String year_2010) {
		this.year_2010 = year_2010;
	}


	public void setYear_2011(String year_2011) {
		this.year_2011 = year_2011;
	}


	public void setYear_2012(String year_2012) {
		this.year_2012 = year_2012;
	}


	public void setYear_2013(String year_2013) {
		this.year_2013 = year_2013;
	}


	public void setYear_2014(String year_2014) {
		this.year_2014 = year_2014;
	}


	public void setYear_2015(String year_2015) {
		this.year_2015 = year_2015;
	}


	public void setYear_2016(String year_2016) {
		this.year_2016 = year_2016;
	}


	public void setYear_2018(String year_2018) {
		this.year_2018 = year_2018;
	}


	public countries getC() {
		return c;
	}


	public void setC(countries c) {
		this.c = c;
	}
}