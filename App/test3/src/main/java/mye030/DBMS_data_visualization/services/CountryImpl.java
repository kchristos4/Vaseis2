package mye030.DBMS_data_visualization.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import mye030.DBMS_data_visualization.dao.*;
import mye030.DBMS_data_visualization.entities.AgeSpecificFertilityRate;
import mye030.DBMS_data_visualization.entities.BirthDeathGrowthRate;
import mye030.DBMS_data_visualization.entities.Country;
import mye030.DBMS_data_visualization.entities.CountryNamesArea;
import mye030.DBMS_data_visualization.entities.DomesticCredit;
import mye030.DBMS_data_visualization.entities.EstimatedGniFemale;
import mye030.DBMS_data_visualization.entities.EstimatedGniMale;
import mye030.DBMS_data_visualization.entities.GdpPerCapita;
import mye030.DBMS_data_visualization.entities.GdpTotal;
import mye030.DBMS_data_visualization.entities.GniPerCapita;
import mye030.DBMS_data_visualization.entities.GrossFixedCapitalFormation;
import mye030.DBMS_data_visualization.entities.IncomeIndex;
import mye030.DBMS_data_visualization.entities.LabourShareOfGdp;
import mye030.DBMS_data_visualization.entities.MidyearPopulation;
import mye030.DBMS_data_visualization.entities.MidyearPopulation5yrAgeSex;
import mye030.DBMS_data_visualization.entities.MidyearPopulationAgeSex;
import mye030.DBMS_data_visualization.entities.MortalityLifeExpectancy;

@Service
public class CountryImpl implements CountryService{
	
	
	private CountryDAO CountryRepository;
	private AgeSpecificFertilityRateDAO AgeSpecificFertilityRateRepository;
	private BirthDeathGrowthRateDAO BirthDeathGrowthRateRepository;
	private CountryNamesAreaDAO CountryNamesAreaRepository;
	private DomesticCreditDAO DomesticCreditRepository;
	private EstimatedGniFemaleDAO EstimatedGniFemaleRepository;
	private EstimatedGniMaleDAO EstimatedGniMaleRepository;
	private GdpPerCapitaDAO GdpPerCapitaRepository;
	private GdpTotalDAO GdpTotalRepository;
	private GniPerCapitaDAO GniPerCapitaRepository;
	private GrossFixedCapitalFormationDAO GrossFixedCapitalFormationRepository;
	private IncomeIndexDAO IncomeIndexRepository;
	private LabourShareOfGdpDAO LabourShareOfGdpRepository;
	private MidyearPopulation5yrAgeSexDAO MidyearPopulation5yrAgeSexRepository;
	private MidyearPopulationAgeSexDAO MidyearPopulationAgeSexRepository;
	private MidyearPopulationDAO MidyearPopulationRepository;
	private MortalityLifeExpectancyDAO MortalityLifeExpectancyRepository;
	
	
	
	public CountryImpl() {
		
	}
	
	
	public CountryImpl(CountryDAO theCountryRepository) {
		this.CountryRepository = theCountryRepository;
	}
	


	@Override
	@Transactional
	public List<Country> findAllCountry() {
		return CountryRepository.findAll();
	}


	@Override
	@Transactional
	public List<AgeSpecificFertilityRate> findAllAgeSpecificFertilityRate() {
		return AgeSpecificFertilityRateRepository.findAll();
	}


	@Override
	@Transactional
	public List<BirthDeathGrowthRate> findAllBirthDeathGrowthRate() {
		return BirthDeathGrowthRateRepository.findAll();
	}


	@Override
	@Transactional
	public List<CountryNamesArea> findAllCountryNamesArea() {
		return CountryNamesAreaRepository.findAll();
	}


	@Override
	@Transactional
	public List<DomesticCredit> findAllDomesticCredit() {
		return DomesticCreditRepository.findAll();
	}


	@Override
	@Transactional
	public List<EstimatedGniFemale> findAllEstimatedGniFemale() {
		return EstimatedGniFemaleRepository.findAll();
	}


	@Override
	@Transactional
	public List<EstimatedGniMale> findAllEstimatedGniMale() {
		return EstimatedGniMaleRepository.findAll();
	}


	@Override
	@Transactional
	public List<GdpPerCapita> findAllGdpPerCapita() {
		return GdpPerCapitaRepository.findAll();
	}


	@Override
	@Transactional
	public List<GdpTotal> findAllGdpTotal() {
		return GdpTotalRepository.findAll();
	}


	@Override
	@Transactional
	public List<GniPerCapita> findAllGniPerCapita() {
		return GniPerCapitaRepository.findAll();
	}


	@Override
	@Transactional
	public List<GrossFixedCapitalFormation> findAllGrossFixedCapitalFormation() {
		return GrossFixedCapitalFormationRepository.findAll();
	}


	@Override
	@Transactional
	public List<IncomeIndex> findAllIncomeIndex() {
		return IncomeIndexRepository.findAll();
	}


	@Override
	@Transactional
	public List<LabourShareOfGdp> findAllLabourShareOfGdp() {
		return LabourShareOfGdpRepository.findAll();
	}


	@Override
	@Transactional
	public List<MidyearPopulation5yrAgeSex> findAllMidyearPopulation5yrAgeSex() {
		return MidyearPopulation5yrAgeSexRepository.findAll();
	}


	@Override
	@Transactional
	public List<MidyearPopulationAgeSex> findAllMidyearPopulationAgeSex() {
		return MidyearPopulationAgeSexRepository.findAll();
	}


	@Override
	@Transactional
	public List<MidyearPopulation> findAllMidyearPopulation() {
		return MidyearPopulationRepository.findAll();
	}


	@Override
	@Transactional
	public List<MortalityLifeExpectancy> findAllMortalityLifeExpectancy() {
		return MortalityLifeExpectancyRepository.findAll();
	}
}