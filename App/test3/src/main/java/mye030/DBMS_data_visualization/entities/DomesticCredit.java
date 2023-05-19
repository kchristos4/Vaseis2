package mye030.DBMS_data_visualization.entities;
import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the domestic_credits database table.
 * 
 */
@Entity
@Table(name="domestic_credits")
@NamedQuery(name="DomesticCredit.findAll", query="SELECT d FROM DomesticCredit d")
public class DomesticCredit implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int ISO_Code;

	@Column(name="country")
	private String country;

	@Column(name="year_1990")
	private String year1990;

	@Column(name="year_1995")
	private String year1995;

	@Column(name="year_2000")
	private String year2000;

	@Column(name="year_2005")
	private String year2005;

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

	public DomesticCredit() {
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

	public String getYear1995() {
		return this.year1995;
	}

	public void setYear1995(String year1995) {
		this.year1995 = year1995;
	}

	public String getYear2000() {
		return this.year2000;
	}

	public void setYear2000(String year2000) {
		this.year2000 = year2000;
	}

	public String getYear2005() {
		return this.year2005;
	}

	public void setYear2005(String year2005) {
		this.year2005 = year2005;
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