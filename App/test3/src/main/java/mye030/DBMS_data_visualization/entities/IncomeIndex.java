package mye030.DBMS_data_visualization.entities;
import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the income_index database table.
 * 
 */
@Entity
@Table(name="income_index")
@NamedQuery(name="IncomeIndex.findAll", query="SELECT i FROM IncomeIndex i")
public class IncomeIndex implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int ISO_Code;

	@Column(name="country")
	private String country;

	@Column(name="year_1990")
	private String year1990;

	@Column(name="year_1991")
	private String year1991;

	@Column(name="year_1992")
	private String year1992;

	@Column(name="year_1993")
	private String year1993;

	@Column(name="year_1994")
	private String year1994;

	@Column(name="year_1995")
	private String year1995;

	@Column(name="year_1996")
	private String year1996;

	@Column(name="year_1997")
	private String year1997;

	@Column(name="year_1998")
	private String year1998;

	@Column(name="year_1999")
	private String year1999;

	@Column(name="year_2000")
	private String year2000;

	@Column(name="year_2001")
	private String year2001;

	@Column(name="year_2002")
	private String year2002;

	@Column(name="year_2003")
	private String year2003;

	@Column(name="year_2004")
	private String year2004;

	@Column(name="year_2005")
	private String year2005;

	@Column(name="year_2006")
	private String year2006;

	@Column(name="year_2007")
	private String year2007;

	@Column(name="year_2008")
	private String year2008;

	@Column(name="year_2009")
	private String year2009;

	@Column(name="year_2010")
	private String year2010;

	@Column(name="year_2011")
	private String year2011;

	@Column(name="year_2012")
	private String year2012;

	@Column(name="year_2013")
	private String year2013;

	@Column(name="year_2014")
	private String year2014;

	@Column(name="year_2015")
	private String year2015;

	@Column(name="year_2016")
	private String year2016;

	@Column(name="year_2017")
	private String year2017;

	@Column(name="year_2018")
	private String year2018;

	//bi-directional one-to-one association to Country
	@OneToOne
	@JoinColumn(name="ISO_Code")
	private Country countryBean;

	public IncomeIndex() {
	}

	public int getISO_Code() {
		return this.ISO_Code;
	}

	public void setISO_Code(int ISO_Code) {
		this.ISO_Code = ISO_Code;
	}

	public String getCountry() {
		return this.country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getYear1990() {
		return this.year1990;
	}

	public void setYear1990(String year1990) {
		this.year1990 = year1990;
	}

	public String getYear1991() {
		return this.year1991;
	}

	public void setYear1991(String year1991) {
		this.year1991 = year1991;
	}

	public String getYear1992() {
		return this.year1992;
	}

	public void setYear1992(String year1992) {
		this.year1992 = year1992;
	}

	public String getYear1993() {
		return this.year1993;
	}

	public void setYear1993(String year1993) {
		this.year1993 = year1993;
	}

	public String getYear1994() {
		return this.year1994;
	}

	public void setYear1994(String year1994) {
		this.year1994 = year1994;
	}

	public String getYear1995() {
		return this.year1995;
	}

	public void setYear1995(String year1995) {
		this.year1995 = year1995;
	}

	public String getYear1996() {
		return this.year1996;
	}

	public void setYear1996(String year1996) {
		this.year1996 = year1996;
	}

	public String getYear1997() {
		return this.year1997;
	}

	public void setYear1997(String year1997) {
		this.year1997 = year1997;
	}

	public String getYear1998() {
		return this.year1998;
	}

	public void setYear1998(String year1998) {
		this.year1998 = year1998;
	}

	public String getYear1999() {
		return this.year1999;
	}

	public void setYear1999(String year1999) {
		this.year1999 = year1999;
	}

	public String getYear2000() {
		return this.year2000;
	}

	public void setYear2000(String year2000) {
		this.year2000 = year2000;
	}

	public String getYear2001() {
		return this.year2001;
	}

	public void setYear2001(String year2001) {
		this.year2001 = year2001;
	}

	public String getYear2002() {
		return this.year2002;
	}

	public void setYear2002(String year2002) {
		this.year2002 = year2002;
	}

	public String getYear2003() {
		return this.year2003;
	}

	public void setYear2003(String year2003) {
		this.year2003 = year2003;
	}

	public String getYear2004() {
		return this.year2004;
	}

	public void setYear2004(String year2004) {
		this.year2004 = year2004;
	}

	public String getYear2005() {
		return this.year2005;
	}

	public void setYear2005(String year2005) {
		this.year2005 = year2005;
	}

	public String getYear2006() {
		return this.year2006;
	}

	public void setYear2006(String year2006) {
		this.year2006 = year2006;
	}

	public String getYear2007() {
		return this.year2007;
	}

	public void setYear2007(String year2007) {
		this.year2007 = year2007;
	}

	public String getYear2008() {
		return this.year2008;
	}

	public void setYear2008(String year2008) {
		this.year2008 = year2008;
	}

	public String getYear2009() {
		return this.year2009;
	}

	public void setYear2009(String year2009) {
		this.year2009 = year2009;
	}

	public String getYear2010() {
		return this.year2010;
	}

	public void setYear2010(String year2010) {
		this.year2010 = year2010;
	}

	public String getYear2011() {
		return this.year2011;
	}

	public void setYear2011(String year2011) {
		this.year2011 = year2011;
	}

	public String getYear2012() {
		return this.year2012;
	}

	public void setYear2012(String year2012) {
		this.year2012 = year2012;
	}

	public String getYear2013() {
		return this.year2013;
	}

	public void setYear2013(String year2013) {
		this.year2013 = year2013;
	}

	public String getYear2014() {
		return this.year2014;
	}

	public void setYear2014(String year2014) {
		this.year2014 = year2014;
	}

	public String getYear2015() {
		return this.year2015;
	}

	public void setYear2015(String year2015) {
		this.year2015 = year2015;
	}

	public String getYear2016() {
		return this.year2016;
	}

	public void setYear2016(String year2016) {
		this.year2016 = year2016;
	}

	public String getYear2017() {
		return this.year2017;
	}

	public void setYear2017(String year2017) {
		this.year2017 = year2017;
	}

	public String getYear2018() {
		return this.year2018;
	}

	public void setYear2018(String year2018) {
		this.year2018 = year2018;
	}

	public Country getCountryBean() {
		return this.countryBean;
	}

	public void setCountryBean(Country countryBean) {
		this.countryBean = countryBean;
	}

}