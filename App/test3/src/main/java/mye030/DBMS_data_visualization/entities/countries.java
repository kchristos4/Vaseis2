package mye030.DBMS_data_visualization.entities;

import javax.persistence.Entity;
import javax.persistence.*;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.stereotype.Component;


@Entity
@Table(name="countries")
public class countries {
	
	@Column(name="ISO")
	private String ISO;
	@Column(name="ISO3")
	private String ISO3;
	@Id
	@Column(name="ISO_Code")
	private Integer ISO_Code;
	
	
	
	
	@Column(name="FIPS")
	private String FIPS;
	
	@Column(name="Display_Name")
	private String Display_Name;
	
	@Column(name="Official_Name")
	private String Official_Name;
	
	@Column(name="Capital")
	private String Capital;
	@Column(name="Continent")
	private String Continent;
	
	@Column(name="CurrencyCode")
	private String CurrencyCode;
	
	@Column(name="CurrencyName")
	private String CurrencyName;
	
	@Column(name="Phone")
	private String Phone;
	@Column(name="Region_Code")
	private String Region_Code;
	
	@Column(name="Region_Name")
	private String Region_Name;
	
	@Column(name="Subregion_Code")
	private String Subregion_Code;
	
	@Column(name="Subregion_Name")
	private String Subregion_Name;
	@Column(name="Intermediate_Region_Code")
	private String Intermediate_Region_Code;
	
	@Column(name="Intermediate_Region_Name")
	private String Intermediate_Region_Name;
	
	@Column(name="Status")
	private String Status;
	
	@Column(name="Developed_or_Developing")
	private String Developed_or_Developing;
	
	@Column(name="Small_Island_Developing_States")
	private String Small_Island_Developing_States;
	
	@Column(name="Land_Locked_Developing_Countries")
	private String Land_Locked_Developing_Countries;
	
	@Column(name="Least_Developed_Countries")
	private String Least_Developed_Countries;
	
	@Column(name="Area_SqKm")
	private String Area_SqKm;
	
	@Column(name="Population")
	private String Population;

	

	public String getISO() {
		return ISO;
	}

	public String getISO3() {
		return ISO3;
	}

	public Integer getISO_Code() {
		return ISO_Code;
	}

	public String getFIPS() {
		return FIPS;
	}

	public String getDisplay_Name() {
		return Display_Name;
	}

	public String getOfficial_Name() {
		return Official_Name;
	}

	public String getCapital() {
		return Capital;
	}

	public String getContinent() {
		return Continent;
	}

	public String getCurrencyCode() {
		return CurrencyCode;
	}

	public String getCurrencyName() {
		return CurrencyName;
	}

	public String getPhone() {
		return Phone;
	}

	public String getRegion_Code() {
		return Region_Code;
	}

	public String getRegion_Name() {
		return Region_Name;
	}

	public String getSubregion_Code() {
		return Subregion_Code;
	}

	public String getSubregion_Name() {
		return Subregion_Name;
	}

	public String getIntermediate_Region_Code() {
		return Intermediate_Region_Code;
	}

	public String getIntermediate_Region_Name() {
		return Intermediate_Region_Name;
	}

	public String getStatus() {
		return Status;
	}

	public String getDeveloped_or_Developing() {
		return Developed_or_Developing;
	}

	public String getSmall_Island_Developing_States() {
		return Small_Island_Developing_States;
	}

	public String getLand_Locked_Developing_Countries() {
		return Land_Locked_Developing_Countries;
	}

	public String getLeast_Developed_Countries() {
		return Least_Developed_Countries;
	}

	public String getArea_SqKm() {
		return Area_SqKm;
	}

	public String getPopulation() {
		return Population;
	}

	public void setISO(String iSO) {
		ISO = iSO;
	}

	public void setISO3(String iSO3) {
		ISO3 = iSO3;
	}

	public void setISO_Code(Integer iSO_Code) {
		ISO_Code = iSO_Code;
	}

	public void setFIPS(String fIPS) {
		FIPS = fIPS;
	}

	public void setDisplay_Name(String display_Name) {
		Display_Name = display_Name;
	}

	public void setOfficial_Name(String official_Name) {
		Official_Name = official_Name;
	}

	public void setCapital(String capital) {
		Capital = capital;
	}

	public void setContinent(String continent) {
		Continent = continent;
	}

	public void setCurrencyCode(String currencyCode) {
		CurrencyCode = currencyCode;
	}

	public void setCurrencyName(String currencyName) {
		CurrencyName = currencyName;
	}

	public void setPhone(String phone) {
		Phone = phone;
	}

	public void setRegion_Code(String region_Code) {
		Region_Code = region_Code;
	}

	public void setRegion_Name(String region_Name) {
		Region_Name = region_Name;
	}

	public void setSubregion_Code(String subregion_Code) {
		Subregion_Code = subregion_Code;
	}

	public void setSubregion_Name(String subregion_Name) {
		Subregion_Name = subregion_Name;
	}

	public void setIntermediate_Region_Code(String intermediate_Region_Code) {
		Intermediate_Region_Code = intermediate_Region_Code;
	}

	public void setIntermediate_Region_Name(String intermediate_Region_Name) {
		Intermediate_Region_Name = intermediate_Region_Name;
	}

	public void setStatus(String status) {
		Status = status;
	}

	public void setDeveloped_or_Developing(String developed_or_Developing) {
		Developed_or_Developing = developed_or_Developing;
	}

	public void setSmall_Island_Developing_States(String small_Island_Developing_States) {
		Small_Island_Developing_States = small_Island_Developing_States;
	}

	public void setLand_Locked_Developing_Countries(String land_Locked_Developing_Countries) {
		Land_Locked_Developing_Countries = land_Locked_Developing_Countries;
	}

	public void setLeast_Developed_Countries(String least_Developed_Countries) {
		Least_Developed_Countries = least_Developed_Countries;
	}

	public void setArea_SqKm(String area_SqKm) {
		Area_SqKm = area_SqKm;
	}

	public void setPopulation(String population) {
		Population = population;
	}

	@Override
	public String toString() {
		return "";
	}
}