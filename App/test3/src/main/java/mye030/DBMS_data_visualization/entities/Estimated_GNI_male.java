package mye030.DBMS_data_visualization.entities;

import javax.persistence.*;

import org.springframework.stereotype.Component;


@Entity
@Table(name="estimated_GNI_male")
public class Estimated_GNI_male {
	
	@Id
	@Column(name="ISO_Code")
	private Integer ISO_Code;
	
	@ManyToOne
	@JoinColumn(name = "ISO_code", referencedColumnName = "ISO_code", insertable = false, updatable = false)
	private countries c;
	
	@Column(name="country")
	private String country;
	
	@Column(name="year_1990")
	private String year_1990;
	
	@Column(name="year_1995")
	private String year_1995;
	
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
	
	@Column(name="year_2017")
	private String year_2017;
	
	@Column(name="year_2018")
	private String year_2018;
	
	@Column(name="info")
	private String info;



	public String getInfo() {
		return info;
	}




	public void setInfo(String info) {
		this.info = info;
	}




	public Integer getISO_Code() {
		return ISO_Code;
	}




	public String getCountry() {
		return country;
	}




	public String getYear_1990() {
		return year_1990;
	}




	public String getYear_1995() {
		return year_1995;
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




	public String getYear_2017() {
		return year_2017;
	}




	public String getYear_2018() {
		return year_2018;
	}




	public void setISO_Code(Integer iSO_Code) {
		ISO_Code = iSO_Code;
	}




	public void setCountry(String country) {
		this.country = country;
	}




	public void setYear_1990(String year_1990) {
		this.year_1990 = year_1990;
	}




	public void setYear_1995(String year_1995) {
		this.year_1995 = year_1995;
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




	public void setYear_2017(String year_2017) {
		this.year_2017 = year_2017;
	}




	public void setYear_2018(String year_2018) {
		this.year_2018 = year_2018;
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