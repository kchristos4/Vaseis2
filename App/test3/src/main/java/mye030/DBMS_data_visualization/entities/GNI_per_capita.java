package mye030.DBMS_data_visualization.entities;

import javax.persistence.*;

import org.springframework.stereotype.Component;


@Entity
@Table(name="GNI_per_capita")
public class GNI_per_capita {
	
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
	
	@Column(name="year_1991")
	private String year_1991;
	
	@Column(name="year_1992")
	private String year_1992;
	
	@Column(name="year_1993")
	private String year_1993;
	
	@Column(name="year_1994")
	private String year_1994;
	
	@Column(name="year_1995")
	private String year_1995;
	
	@Column(name="year_1996")
	private String year_1996;
	
	@Column(name="year_1997")
	private String year_1997;
	
	@Column(name="year_1998")
	private String year_1998;
	
	@Column(name="year_1999")
	private String year_1999;
	
	@Column(name="year_2000")
	private String year_2000;
	
	@Column(name="year_2001")
	private String year_2001;
	
	@Column(name="year_2002")
	private String year_2002;
	
	@Column(name="year_2003")
	private String year_2003;
	
	@Column(name="year_2004")
	private String year_2004;
	
	@Column(name="year_2005")
	private String year_2005;
	
	@Column(name="year_2006")
	private String year_2006;
	
	@Column(name="year_2007")
	private String year_2007;
	
	@Column(name="year_2008")
	private String year_2008;
	
	@Column(name="year_2009")
	private String year_2009;
	
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






	public Integer getISO_Code() {
		return ISO_Code;
	}






	public String getCountry() {
		return country;
	}






	public String getYear_1990() {
		return year_1990;
	}






	public String getYear_1991() {
		return year_1991;
	}






	public String getYear_1992() {
		return year_1992;
	}






	public String getYear_1993() {
		return year_1993;
	}






	public String getYear_1994() {
		return year_1994;
	}






	public String getYear_1995() {
		return year_1995;
	}






	public String getYear_1996() {
		return year_1996;
	}






	public String getYear_1997() {
		return year_1997;
	}






	public String getYear_1998() {
		return year_1998;
	}






	public String getYear_1999() {
		return year_1999;
	}






	public String getYear_2000() {
		return year_2000;
	}






	public String getYear_2001() {
		return year_2001;
	}






	public String getYear_2002() {
		return year_2002;
	}






	public String getYear_2003() {
		return year_2003;
	}






	public String getYear_2004() {
		return year_2004;
	}






	public String getYear_2005() {
		return year_2005;
	}






	public String getYear_2006() {
		return year_2006;
	}






	public String getYear_2007() {
		return year_2007;
	}






	public String getYear_2008() {
		return year_2008;
	}






	public String getYear_2009() {
		return year_2009;
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






	public String getInfo() {
		return info;
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






	public void setYear_1991(String year_1991) {
		this.year_1991 = year_1991;
	}






	public void setYear_1992(String year_1992) {
		this.year_1992 = year_1992;
	}






	public void setYear_1993(String year_1993) {
		this.year_1993 = year_1993;
	}






	public void setYear_1994(String year_1994) {
		this.year_1994 = year_1994;
	}






	public void setYear_1995(String year_1995) {
		this.year_1995 = year_1995;
	}






	public void setYear_1996(String year_1996) {
		this.year_1996 = year_1996;
	}






	public void setYear_1997(String year_1997) {
		this.year_1997 = year_1997;
	}






	public void setYear_1998(String year_1998) {
		this.year_1998 = year_1998;
	}






	public void setYear_1999(String year_1999) {
		this.year_1999 = year_1999;
	}






	public void setYear_2000(String year_2000) {
		this.year_2000 = year_2000;
	}






	public void setYear_2001(String year_2001) {
		this.year_2001 = year_2001;
	}






	public void setYear_2002(String year_2002) {
		this.year_2002 = year_2002;
	}






	public void setYear_2003(String year_2003) {
		this.year_2003 = year_2003;
	}






	public void setYear_2004(String year_2004) {
		this.year_2004 = year_2004;
	}






	public void setYear_2005(String year_2005) {
		this.year_2005 = year_2005;
	}






	public void setYear_2006(String year_2006) {
		this.year_2006 = year_2006;
	}






	public void setYear_2007(String year_2007) {
		this.year_2007 = year_2007;
	}






	public void setYear_2008(String year_2008) {
		this.year_2008 = year_2008;
	}






	public void setYear_2009(String year_2009) {
		this.year_2009 = year_2009;
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






	public void setInfo(String info) {
		this.info = info;
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