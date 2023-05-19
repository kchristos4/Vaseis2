package mye030.DBMS_data_visualization.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the countries database table.
 * 
 */
@Entity
@Table(name="countries")
@NamedQuery(name="Country.findAll", query="SELECT c FROM Country c")
public class Country implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int ISO_Code;

	private String area_Sqkm;

	private String capital;

	private String continent;

	private String currency_Code;

	private String currency_Name;

	private String developed_or_Developing;

	private String display_Name;

	private String fips;

	private String intermediate_Region_Code;

	private String intermediate_Region_Name;

	private String iso;

	private String iso3;

	private String land_Locked_Developing_Countries;

	private String least_Developed_Countries;

	private String official_Name;

	private String phone;

	private String population;

	private String region_Code;

	private String region_Name;

	private String small_Island_Developing_States;

	private String status;

	private String subregion_Code;

	private String subregion_Name;

	//bi-directional many-to-one association to AgeSpecificFertilityRate
	@OneToMany(mappedBy="country")
	private List<AgeSpecificFertilityRate> ageSpecificFertilityRates;

	//bi-directional many-to-one association to BirthDeathGrowthRate
	@OneToMany(mappedBy="country")
	private List<BirthDeathGrowthRate> birthDeathGrowthRates;

	//bi-directional one-to-one association to CountryNamesArea
	@OneToOne(mappedBy="country")
	private CountryNamesArea countryNamesArea;

	//bi-directional one-to-one association to DomesticCredit
	@OneToOne(mappedBy="countryBean")
	private DomesticCredit domesticCredit;

	//bi-directional one-to-one association to EstimatedGniFemale
	@OneToOne(mappedBy="countryBean")
	private EstimatedGniFemale estimatedGniFemale;

	//bi-directional one-to-one association to EstimatedGniMale
	@OneToOne(mappedBy="countryBean")
	private EstimatedGniMale estimatedGniMale;

	//bi-directional one-to-one association to GdpPerCapita
	@OneToOne(mappedBy="countryBean")
	private GdpPerCapita gdpPerCapita;

	//bi-directional one-to-one association to GdpTotal
	@OneToOne(mappedBy="countryBean")
	private GdpTotal gdpTotal;

	//bi-directional one-to-one association to GniPerCapita
	@OneToOne(mappedBy="countryBean")
	private GniPerCapita gniPerCapita;

	//bi-directional one-to-one association to GrossFixedCapitalFormation
	@OneToOne(mappedBy="countryBean")
	private GrossFixedCapitalFormation grossFixedCapitalFormation;

	//bi-directional one-to-one association to IncomeIndex
	@OneToOne(mappedBy="countryBean")
	private IncomeIndex incomeIndex;

	//bi-directional one-to-one association to LabourShareOfGdp
	@OneToOne(mappedBy="countryBean")
	private LabourShareOfGdp labourShareOfGdp;

	//bi-directional many-to-one association to MidyearPopulation
	@OneToMany(mappedBy="country")
	private List<MidyearPopulation> midyearPopulations;

	//bi-directional many-to-one association to MidyearPopulation5yrAgeSex
	@OneToMany(mappedBy="country")
	private List<MidyearPopulation5yrAgeSex> midyearPopulation5yrAgeSexs;

	//bi-directional many-to-one association to MidyearPopulationAgeSex
	@OneToMany(mappedBy="country")
	private List<MidyearPopulationAgeSex> midyearPopulationAgeSexs;

	//bi-directional many-to-one association to MortalityLifeExpectancy
	@OneToMany(mappedBy="country")
	private List<MortalityLifeExpectancy> mortalityLifeExpectancies;

	public Country() {
	}

	public int getISO_Code() {
		return this.ISO_Code;
	}

	public void setISO_Code(int ISO_Code) {
		this.ISO_Code = ISO_Code;
	}

	public String getArea_Sqkm() {
		return this.area_Sqkm;
	}

	public void setArea_Sqkm(String area_Sqkm) {
		this.area_Sqkm = area_Sqkm;
	}

	public String getCapital() {
		return this.capital;
	}

	public void setCapital(String capital) {
		this.capital = capital;
	}

	public String getContinent() {
		return this.continent;
	}

	public void setContinent(String continent) {
		this.continent = continent;
	}

	public String getCurrency_Code() {
		return this.currency_Code;
	}

	public void setCurrency_Code(String currency_Code) {
		this.currency_Code = currency_Code;
	}

	public String getCurrency_Name() {
		return this.currency_Name;
	}

	public void setCurrency_Name(String currency_Name) {
		this.currency_Name = currency_Name;
	}

	public String getDeveloped_or_Developing() {
		return this.developed_or_Developing;
	}

	public void setDeveloped_or_Developing(String developed_or_Developing) {
		this.developed_or_Developing = developed_or_Developing;
	}

	public String getDisplay_Name() {
		return this.display_Name;
	}

	public void setDisplay_Name(String display_Name) {
		this.display_Name = display_Name;
	}

	public String getFips() {
		return this.fips;
	}

	public void setFips(String fips) {
		this.fips = fips;
	}

	public String getIntermediate_Region_Code() {
		return this.intermediate_Region_Code;
	}

	public void setIntermediate_Region_Code(String intermediate_Region_Code) {
		this.intermediate_Region_Code = intermediate_Region_Code;
	}

	public String getIntermediate_Region_Name() {
		return this.intermediate_Region_Name;
	}

	public void setIntermediate_Region_Name(String intermediate_Region_Name) {
		this.intermediate_Region_Name = intermediate_Region_Name;
	}

	public String getIso() {
		return this.iso;
	}

	public void setIso(String iso) {
		this.iso = iso;
	}

	public String getIso3() {
		return this.iso3;
	}

	public void setIso3(String iso3) {
		this.iso3 = iso3;
	}

	public String getLand_Locked_Developing_Countries() {
		return this.land_Locked_Developing_Countries;
	}

	public void setLand_Locked_Developing_Countries(String land_Locked_Developing_Countries) {
		this.land_Locked_Developing_Countries = land_Locked_Developing_Countries;
	}

	public String getLeast_Developed_Countries() {
		return this.least_Developed_Countries;
	}

	public void setLeast_Developed_Countries(String least_Developed_Countries) {
		this.least_Developed_Countries = least_Developed_Countries;
	}

	public String getOfficial_Name() {
		return this.official_Name;
	}

	public void setOfficial_Name(String official_Name) {
		this.official_Name = official_Name;
	}

	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getPopulation() {
		return this.population;
	}

	public void setPopulation(String population) {
		this.population = population;
	}

	public String getRegion_Code() {
		return this.region_Code;
	}

	public void setRegion_Code(String region_Code) {
		this.region_Code = region_Code;
	}

	public String getRegion_Name() {
		return this.region_Name;
	}

	public void setRegion_Name(String region_Name) {
		this.region_Name = region_Name;
	}

	public String getSmall_Island_Developing_States() {
		return this.small_Island_Developing_States;
	}

	public void setSmall_Island_Developing_States(String small_Island_Developing_States) {
		this.small_Island_Developing_States = small_Island_Developing_States;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getSubregion_Code() {
		return this.subregion_Code;
	}

	public void setSubregion_Code(String subregion_Code) {
		this.subregion_Code = subregion_Code;
	}

	public String getSubregion_Name() {
		return this.subregion_Name;
	}

	public void setSubregion_Name(String subregion_Name) {
		this.subregion_Name = subregion_Name;
	}

	public List<AgeSpecificFertilityRate> getAgeSpecificFertilityRates() {
		return this.ageSpecificFertilityRates;
	}

	public void setAgeSpecificFertilityRates(List<AgeSpecificFertilityRate> ageSpecificFertilityRates) {
		this.ageSpecificFertilityRates = ageSpecificFertilityRates;
	}

	public AgeSpecificFertilityRate addAgeSpecificFertilityRate(AgeSpecificFertilityRate ageSpecificFertilityRate) {
		getAgeSpecificFertilityRates().add(ageSpecificFertilityRate);
		ageSpecificFertilityRate.setCountry(this);

		return ageSpecificFertilityRate;
	}

	public AgeSpecificFertilityRate removeAgeSpecificFertilityRate(AgeSpecificFertilityRate ageSpecificFertilityRate) {
		getAgeSpecificFertilityRates().remove(ageSpecificFertilityRate);
		ageSpecificFertilityRate.setCountry(null);

		return ageSpecificFertilityRate;
	}

	public List<BirthDeathGrowthRate> getBirthDeathGrowthRates() {
		return this.birthDeathGrowthRates;
	}

	public void setBirthDeathGrowthRates(List<BirthDeathGrowthRate> birthDeathGrowthRates) {
		this.birthDeathGrowthRates = birthDeathGrowthRates;
	}

	public BirthDeathGrowthRate addBirthDeathGrowthRate(BirthDeathGrowthRate birthDeathGrowthRate) {
		getBirthDeathGrowthRates().add(birthDeathGrowthRate);
		birthDeathGrowthRate.setCountry(this);

		return birthDeathGrowthRate;
	}

	public BirthDeathGrowthRate removeBirthDeathGrowthRate(BirthDeathGrowthRate birthDeathGrowthRate) {
		getBirthDeathGrowthRates().remove(birthDeathGrowthRate);
		birthDeathGrowthRate.setCountry(null);

		return birthDeathGrowthRate;
	}

	public CountryNamesArea getCountryNamesArea() {
		return this.countryNamesArea;
	}

	public void setCountryNamesArea(CountryNamesArea countryNamesArea) {
		this.countryNamesArea = countryNamesArea;
	}

	public DomesticCredit getDomesticCredit() {
		return this.domesticCredit;
	}

	public void setDomesticCredit(DomesticCredit domesticCredit) {
		this.domesticCredit = domesticCredit;
	}

	public EstimatedGniFemale getEstimatedGniFemale() {
		return this.estimatedGniFemale;
	}

	public void setEstimatedGniFemale(EstimatedGniFemale estimatedGniFemale) {
		this.estimatedGniFemale = estimatedGniFemale;
	}

	public EstimatedGniMale getEstimatedGniMale() {
		return this.estimatedGniMale;
	}

	public void setEstimatedGniMale(EstimatedGniMale estimatedGniMale) {
		this.estimatedGniMale = estimatedGniMale;
	}

	public GdpPerCapita getGdpPerCapita() {
		return this.gdpPerCapita;
	}

	public void setGdpPerCapita(GdpPerCapita gdpPerCapita) {
		this.gdpPerCapita = gdpPerCapita;
	}

	public GdpTotal getGdpTotal() {
		return this.gdpTotal;
	}

	public void setGdpTotal(GdpTotal gdpTotal) {
		this.gdpTotal = gdpTotal;
	}

	public GniPerCapita getGniPerCapita() {
		return this.gniPerCapita;
	}

	public void setGniPerCapita(GniPerCapita gniPerCapita) {
		this.gniPerCapita = gniPerCapita;
	}

	public GrossFixedCapitalFormation getGrossFixedCapitalFormation() {
		return this.grossFixedCapitalFormation;
	}

	public void setGrossFixedCapitalFormation(GrossFixedCapitalFormation grossFixedCapitalFormation) {
		this.grossFixedCapitalFormation = grossFixedCapitalFormation;
	}

	public IncomeIndex getIncomeIndex() {
		return this.incomeIndex;
	}

	public void setIncomeIndex(IncomeIndex incomeIndex) {
		this.incomeIndex = incomeIndex;
	}

	public LabourShareOfGdp getLabourShareOfGdp() {
		return this.labourShareOfGdp;
	}

	public void setLabourShareOfGdp(LabourShareOfGdp labourShareOfGdp) {
		this.labourShareOfGdp = labourShareOfGdp;
	}

	public List<MidyearPopulation> getMidyearPopulations() {
		return this.midyearPopulations;
	}

	public void setMidyearPopulations(List<MidyearPopulation> midyearPopulations) {
		this.midyearPopulations = midyearPopulations;
	}

	public MidyearPopulation addMidyearPopulation(MidyearPopulation midyearPopulation) {
		getMidyearPopulations().add(midyearPopulation);
		midyearPopulation.setCountry(this);

		return midyearPopulation;
	}

	public MidyearPopulation removeMidyearPopulation(MidyearPopulation midyearPopulation) {
		getMidyearPopulations().remove(midyearPopulation);
		midyearPopulation.setCountry(null);

		return midyearPopulation;
	}

	public List<MidyearPopulation5yrAgeSex> getMidyearPopulation5yrAgeSexs() {
		return this.midyearPopulation5yrAgeSexs;
	}

	public void setMidyearPopulation5yrAgeSexs(List<MidyearPopulation5yrAgeSex> midyearPopulation5yrAgeSexs) {
		this.midyearPopulation5yrAgeSexs = midyearPopulation5yrAgeSexs;
	}

	public MidyearPopulation5yrAgeSex addMidyearPopulation5yrAgeSex(MidyearPopulation5yrAgeSex midyearPopulation5yrAgeSex) {
		getMidyearPopulation5yrAgeSexs().add(midyearPopulation5yrAgeSex);
		midyearPopulation5yrAgeSex.setCountry(this);

		return midyearPopulation5yrAgeSex;
	}

	public MidyearPopulation5yrAgeSex removeMidyearPopulation5yrAgeSex(MidyearPopulation5yrAgeSex midyearPopulation5yrAgeSex) {
		getMidyearPopulation5yrAgeSexs().remove(midyearPopulation5yrAgeSex);
		midyearPopulation5yrAgeSex.setCountry(null);

		return midyearPopulation5yrAgeSex;
	}

	public List<MidyearPopulationAgeSex> getMidyearPopulationAgeSexs() {
		return this.midyearPopulationAgeSexs;
	}

	public void setMidyearPopulationAgeSexs(List<MidyearPopulationAgeSex> midyearPopulationAgeSexs) {
		this.midyearPopulationAgeSexs = midyearPopulationAgeSexs;
	}

	public MidyearPopulationAgeSex addMidyearPopulationAgeSex(MidyearPopulationAgeSex midyearPopulationAgeSex) {
		getMidyearPopulationAgeSexs().add(midyearPopulationAgeSex);
		midyearPopulationAgeSex.setCountry(this);

		return midyearPopulationAgeSex;
	}

	public MidyearPopulationAgeSex removeMidyearPopulationAgeSex(MidyearPopulationAgeSex midyearPopulationAgeSex) {
		getMidyearPopulationAgeSexs().remove(midyearPopulationAgeSex);
		midyearPopulationAgeSex.setCountry(null);

		return midyearPopulationAgeSex;
	}

	public List<MortalityLifeExpectancy> getMortalityLifeExpectancies() {
		return this.mortalityLifeExpectancies;
	}

	public void setMortalityLifeExpectancies(List<MortalityLifeExpectancy> mortalityLifeExpectancies) {
		this.mortalityLifeExpectancies = mortalityLifeExpectancies;
	}

	public MortalityLifeExpectancy addMortalityLifeExpectancy(MortalityLifeExpectancy mortalityLifeExpectancy) {
		getMortalityLifeExpectancies().add(mortalityLifeExpectancy);
		mortalityLifeExpectancy.setCountry(this);

		return mortalityLifeExpectancy;
	}

	public MortalityLifeExpectancy removeMortalityLifeExpectancy(MortalityLifeExpectancy mortalityLifeExpectancy) {
		getMortalityLifeExpectancies().remove(mortalityLifeExpectancy);
		mortalityLifeExpectancy.setCountry(null);

		return mortalityLifeExpectancy;
	}

}