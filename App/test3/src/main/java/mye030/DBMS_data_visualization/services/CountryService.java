package mye030.DBMS_data_visualization.services;

import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import mye030.DBMS_data_visualization.entities.*;


public interface CountryService{
	public List<Country> findAllCountry();
	public List<AgeSpecificFertilityRate> findAllAgeSpecificFertilityRate();
	public List<BirthDeathGrowthRate> findAllBirthDeathGrowthRate();
	public List<CountryNamesArea> findAllCountryNamesArea();
	public List<DomesticCredit> findAllDomesticCredit();
	public List<EstimatedGniFemale> findAllEstimatedGniFemale();
	public List<EstimatedGniMale> findAllEstimatedGniMale();
	public List<GdpPerCapita> findAllGdpPerCapita();
	public List<GdpTotal> findAllGdpTotal();
	public List<GniPerCapita> findAllGniPerCapita();
	public List<GrossFixedCapitalFormation> findAllGrossFixedCapitalFormation();
	public List<IncomeIndex> findAllIncomeIndex();
	public List<LabourShareOfGdp> findAllLabourShareOfGdp();
	public List<MidyearPopulation5yrAgeSex> findAllMidyearPopulation5yrAgeSex();
	public List<MidyearPopulationAgeSex> findAllMidyearPopulationAgeSex();
	public List<MidyearPopulation> findAllMidyearPopulation();
	public List<MortalityLifeExpectancy> findAllMortalityLifeExpectancy();
}