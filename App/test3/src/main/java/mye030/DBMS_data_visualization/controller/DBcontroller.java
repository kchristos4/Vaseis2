package mye030.DBMS_data_visualization.controller;

import java.lang.reflect.*;
import java.util.*;




import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;


import mye030.DBMS_data_visualization.services.CountryImpl;
import mye030.DBMS_data_visualization.services.CountryService;
import mye030.DBMS_data_visualization.entities.*;

import org.slf4j.LoggerFactory;


@Controller	
public class DBcontroller{
	
	@Autowired
	private CountryService cService;
	
	//@Autowired
	//private StudentRegistrationService studentRegistrationService;
	@Autowired
	public DBcontroller(CountryImpl thisCService) {
		cService = thisCService;
	}
	
	public DBcontroller() {
		//cService = new countriesImpl();
	}
	
	public List<String> getCountries(){
		List<String> countriesList = new ArrayList<>();
		List<Country> countries = cService.findAllCountry();//cService.findAll();
		for (Country c : countries) {
			countriesList.add(c.getDisplay_Name());
		}
		
		return countriesList;
	}
	
	public List<String> getIndices(){
		List<String> indicesList = new ArrayList<>();
		indicesList.add("Fertility rate by age");
		indicesList.add("Total fertility rate");
		indicesList.add("Gross reproduction rate");
		indicesList.add("Sex ratio at birth");
		indicesList.add("Crude birth rate");
		indicesList.add("Crude death rate");
		indicesList.add("Net migration");
		indicesList.add("Rate natural increase");
		indicesList.add("Growth rate");
		indicesList.add("Domestic credits");
		indicesList.add("Estimated GNI female");
		indicesList.add("Estimated GNI male");
		indicesList.add("GDP per capita");
		indicesList.add("GDP total");
		indicesList.add("GNI per capita");
		indicesList.add("Gross fixed capital formation");
		indicesList.add("Income Index");
		indicesList.add("Labour share of GDP");
		indicesList.add("Midyear population");
		indicesList.add("Midyear population male");
		indicesList.add("Midyear population female");
		indicesList.add("Midyear population 5yr");
		indicesList.add("Midyear population male 5yr");
		indicesList.add("Midyear population female 5yr");
		indicesList.add("Population by age");
		indicesList.add("Infant mortality");
		indicesList.add("Infant mortality male");
		indicesList.add("Infant mortality female");
		indicesList.add("Life expectancy");
		indicesList.add("Life expectancy male");
		indicesList.add("Life expectancy female");
		indicesList.add("Mortality rate under5");
		indicesList.add("Mortality rate under5 male");
		indicesList.add("Mortality rate under5 female");
		indicesList.add("Mortality rate 1to4");
		indicesList.add("Mortality rate 1to4 male");
		indicesList.add("Mortality rate 1to4 female");
		return indicesList;
	}
	
	public List<List<String>> getAppropriateDataFromDB(String index,String entity, int Low, int High, List<Integer> ISOCodes) throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		List<List<String>> DBcontentsFiltered = new ArrayList<>();
		System.out.println(entity);
		if (entity.equals("AgeSpecificFertilityRate")){
			//TODO NA DW AFTO
			if (index.equals("FertilityRateByAge")) {
				List<AgeSpecificFertilityRate> DBcontentsUnfiltered = cService.findAllAgeSpecificFertilityRate();
				
				for (AgeSpecificFertilityRate item : DBcontentsUnfiltered) {
					int year = item.getId().getYear();
					int iso = item.getId().getISO_Code();
					if ((Low<=year)&&(year<= High)&&(ISOCodes.contains(iso))) {
						String thisCountry = item.getCountry().getDisplay_Name();
						int thisYear = item.getId().getYear();
						List<String> ranges = Arrays.asList("1519","2024","2529","3034","3539","4044","4549");
						for (int i =0;i<ranges.size();i++) {
							Method method = item.getClass().getMethod("getFertilityRate"+ranges.get(i));
							float thisValue = (float) method.invoke(item);
							String thisColumn = index;
							
							List<String> row = Arrays.asList(thisCountry,String.valueOf(thisYear),String.valueOf(thisValue),thisColumn+ranges.get(i));
							
							DBcontentsFiltered.add(row);
						}		
					}
				}
			}
			else {
				List<AgeSpecificFertilityRate> DBcontentsUnfiltered = cService.findAllAgeSpecificFertilityRate();
	
				for (AgeSpecificFertilityRate item : DBcontentsUnfiltered) {
					int year = item.getId().getYear();
					int iso = item.getId().getISO_Code();
					if ((Low<=year)&&(year<= High)&&(ISOCodes.contains(iso))) {
						String thisCountry = item.getCountry().getDisplay_Name();
						int thisYear = item.getId().getYear();
						Method method = item.getClass().getMethod("get"+index);
				        float thisValue = (float) method.invoke(item);
						String thisColumn = index;
						
						List<String> row = Arrays.asList(thisCountry,String.valueOf(thisYear),String.valueOf(thisValue),thisColumn);					
						DBcontentsFiltered.add(row);
					}
				}
			}
			return DBcontentsFiltered;
		}
		else if (entity.equals("BirthDeathGrowthRate")){
			List<BirthDeathGrowthRate> DBcontentsUnfiltered = cService.findAllBirthDeathGrowthRate();
			
			for (BirthDeathGrowthRate item : DBcontentsUnfiltered) {
				int year = item.getId().getYear();
				int iso = item.getId().getISO_Code();
				if ((Low<=year)&&(year<= High)&&(ISOCodes.contains(iso))) {
					
					String thisCountry = item.getCountry().getDisplay_Name();
					int thisYear = item.getId().getYear();
					Method method = item.getClass().getMethod("get"+index);
			        float thisValue = (float) method.invoke(item);
					String thisColumn = index;
					
					List<String> row = Arrays.asList(thisCountry,String.valueOf(thisYear),String.valueOf(thisValue),thisColumn);					
					DBcontentsFiltered.add(row);
				}
			}
			return DBcontentsFiltered;	
		}
		else if (entity.equals("DomesticCredit")){
			List<DomesticCredit> DBcontentsUnfiltered = cService.findAllDomesticCredit();
			List<Integer> myList = new ArrayList<>();
			myList.add(1990);
			myList.add(1995);
			myList.add(2000);
			myList.add(2005);
			myList.add(2010);
			myList.add(2011);
			myList.add(2012);
			myList.add(2013);
			myList.add(2014);
			myList.add(2015);
			myList.add(2016);
			myList.add(2017);
			myList.add(2018);
			
			for (DomesticCredit item : DBcontentsUnfiltered) {
				int iso = item.getISO_Code();
				for (int year : myList) {
					if ((Low<=year)&&(year<= High)&&(ISOCodes.contains(iso))) {
						
						String thisCountry = item.getCountry();
						int thisYear = year;
						Method method = item.getClass().getMethod("getYear"+Integer.toString(year));
						String thisValue = (String) method.invoke(item);
						String thisColumn = index;
						
						
						List<String> row = Arrays.asList(thisCountry,String.valueOf(thisYear),String.valueOf(thisValue),thisColumn);					
						if (!(thisValue.equals(".."))) {
							DBcontentsFiltered.add(row);
				        }
					}
				}
			}
			
			return DBcontentsFiltered;	
		}
		else if (entity.equals("EstimatedGniFemale")){
			List<EstimatedGniFemale> DBcontentsUnfiltered = cService.findAllEstimatedGniFemale();
			List<Integer> myList = new ArrayList<>();
			myList.add(1995);
			myList.add(2000);
			myList.add(2005);
			myList.add(2010);
			myList.add(2011);
			myList.add(2012);
			myList.add(2013);
			myList.add(2014);
			myList.add(2015);
			myList.add(2016);
			myList.add(2017);
			myList.add(2018);
			
			for (EstimatedGniFemale item : DBcontentsUnfiltered) {
				int iso = item.getISO_Code();
				for (int year : myList) {
					if ((Low<=year)&&(year<= High)&&(ISOCodes.contains(iso))) {
						
						String thisCountry = item.getCountry();
						int thisYear = year;
						Method method = item.getClass().getMethod("getYear"+Integer.toString(year));
						String thisValue = (String) method.invoke(item);
						String thisColumn = index;
						
						List<String> row = Arrays.asList(thisCountry,String.valueOf(thisYear),String.valueOf(thisValue),thisColumn);					
						if (!(thisValue.equals(".."))) {
							DBcontentsFiltered.add(row);
				        }
					}
				}
			}
			
			return DBcontentsFiltered;
		}
		else if (entity.equals("EstimatedGniMale")){
			List<EstimatedGniMale> DBcontentsUnfiltered = cService.findAllEstimatedGniMale();
			List<Integer> myList = new ArrayList<>();
			myList.add(1995);
			myList.add(2000);
			myList.add(2005);
			myList.add(2010);
			myList.add(2011);
			myList.add(2012);
			myList.add(2013);
			myList.add(2014);
			myList.add(2015);
			myList.add(2016);
			myList.add(2017);
			myList.add(2018);
			
			for (EstimatedGniMale item : DBcontentsUnfiltered) {
				int iso = item.getISO_Code();
				for (int year : myList) {
					if ((Low<=year)&&(year<= High)&&(ISOCodes.contains(iso))) {
						
						String thisCountry = item.getCountry();
						int thisYear = year;
						Method method = item.getClass().getMethod("getYear"+Integer.toString(year));
						String thisValue = (String) method.invoke(item);
						String thisColumn = index;
						
						List<String> row = Arrays.asList(thisCountry,String.valueOf(thisYear),String.valueOf(thisValue),thisColumn);					
						if (!(thisValue.equals(".."))) {
							DBcontentsFiltered.add(row);
				        }
					}
				}
			}
			
			return DBcontentsFiltered;
		}
		else if (entity.equals("GdpPerCapita")){
			List<GdpPerCapita> DBcontentsUnfiltered = cService.findAllGdpPerCapita();
			List<Integer> myList = new ArrayList<>();
			myList.add(1990);
			myList.add(1995);
			myList.add(2000);
			myList.add(2005);
			myList.add(2010);
			myList.add(2011);
			myList.add(2012);
			myList.add(2013);
			myList.add(2014);
			myList.add(2015);
			myList.add(2016);
			myList.add(2017);
			myList.add(2018);
			
			for (GdpPerCapita item : DBcontentsUnfiltered) {
				int iso = item.getISO_Code();
				for (int year : myList) {
					if ((Low<=year)&&(year<= High)&&(ISOCodes.contains(iso))) {
						
						String thisCountry = item.getCountry();
						int thisYear = year;
						Method method = item.getClass().getMethod("getYear"+Integer.toString(year));
						String thisValue = (String) method.invoke(item);
						String thisColumn = index;
						
						List<String> row = Arrays.asList(thisCountry,String.valueOf(thisYear),String.valueOf(thisValue),thisColumn);					
						if (!(thisValue.equals(".."))) {
							DBcontentsFiltered.add(row);
				        }
					}
				}
			}
			
			return DBcontentsFiltered;
		}
		else if (entity.equals("GdpTotal")){
			List<GdpTotal> DBcontentsUnfiltered = cService.findAllGdpTotal();
			List<Integer> myList = new ArrayList<>();
			myList.add(1990);
			myList.add(1995);
			myList.add(2000);
			myList.add(2005);
			myList.add(2010);
			myList.add(2011);
			myList.add(2012);
			myList.add(2013);
			myList.add(2014);
			myList.add(2015);
			myList.add(2016);
			myList.add(2017);
			myList.add(2018);
			
			for (GdpTotal item : DBcontentsUnfiltered) {
				int iso = item.getISO_Code();
				for (int year : myList) {
					if ((Low<=year)&&(year<= High)&&(ISOCodes.contains(iso))) {
						
						String thisCountry = item.getCountry();
						int thisYear = year;
						Method method = item.getClass().getMethod("getYear"+Integer.toString(year));
						String thisValue = (String) method.invoke(item);
						String thisColumn = index;
						
						List<String> row = Arrays.asList(thisCountry,String.valueOf(thisYear),String.valueOf(thisValue),thisColumn);					
						if (!(thisValue.equals(".."))) {
							DBcontentsFiltered.add(row);
				        }
					}
				}
			}
			
			return DBcontentsFiltered;
		}
		else if (entity.equals("GniPerCapita")){
			List<GniPerCapita> DBcontentsUnfiltered = cService.findAllGniPerCapita();
			List<Integer> myList = new ArrayList<>();
			myList.add(1990);
			myList.add(1991);
			myList.add(1992);
			myList.add(1993);
			myList.add(1994);
			myList.add(1995);
			myList.add(1996);
			myList.add(1997);
			myList.add(1998);
			myList.add(1999);
			myList.add(2000);
			myList.add(2001);
			myList.add(2002);
			myList.add(2003);
			myList.add(2004);
			myList.add(2005);
			myList.add(2006);
			myList.add(2007);
			myList.add(2008);
			myList.add(2009);
			myList.add(2010);
			myList.add(2011);
			myList.add(2012);
			myList.add(2013);
			myList.add(2014);
			myList.add(2015);
			myList.add(2016);
			myList.add(2017);
			myList.add(2018);
			
			for (GniPerCapita item : DBcontentsUnfiltered) {
				int iso = item.getISO_Code();
				for (int year : myList) {
					if ((Low<=year)&&(year<= High)&&(ISOCodes.contains(iso))) {
						
						String thisCountry = item.getCountry();
						int thisYear = year;
						Method method = item.getClass().getMethod("getYear"+Integer.toString(year));
						String thisValue = (String) method.invoke(item);
						String thisColumn = index;
						
						List<String> row = Arrays.asList(thisCountry,String.valueOf(thisYear),String.valueOf(thisValue),thisColumn);					
						if (!(thisValue.equals(".."))) {
							DBcontentsFiltered.add(row);
				        }
					}
				}
			}
			
			return DBcontentsFiltered;
		}
		else if (entity.equals("GrossFixedCapitalFormation")){
			List<GrossFixedCapitalFormation> DBcontentsUnfiltered = cService.findAllGrossFixedCapitalFormation();
			List<Integer> myList = new ArrayList<>();
			myList.add(1990);
			myList.add(1995);
			myList.add(2000);
			myList.add(2005);
			myList.add(2010);
			myList.add(2011);
			myList.add(2012);
			myList.add(2013);
			myList.add(2014);
			myList.add(2015);
			myList.add(2016);
			myList.add(2017);
			myList.add(2018);
			
			for (GrossFixedCapitalFormation item : DBcontentsUnfiltered) {
				int iso = item.getISO_Code();
				for (int year : myList) {
					if ((Low<=year)&&(year<= High)&&(ISOCodes.contains(iso))) {
						
						String thisCountry = item.getCountry();
						int thisYear = year;
						Method method = item.getClass().getMethod("getYear"+Integer.toString(year));
						String thisValue = (String) method.invoke(item);
						String thisColumn = index;
						
						List<String> row = Arrays.asList(thisCountry,String.valueOf(thisYear),String.valueOf(thisValue),thisColumn);					
						if (!(thisValue.equals(".."))) {
							DBcontentsFiltered.add(row);
				        }
					}
				}
			}
			
			return DBcontentsFiltered;
		}
		else if (entity.equals("IncomeIndex")){
			List<IncomeIndex> DBcontentsUnfiltered = cService.findAllIncomeIndex();
			List<Integer> myList = new ArrayList<>();
			myList.add(1990);
			myList.add(1991);
			myList.add(1992);
			myList.add(1993);
			myList.add(1994);
			myList.add(1995);
			myList.add(1996);
			myList.add(1997);
			myList.add(1998);
			myList.add(1999);
			myList.add(2000);
			myList.add(2001);
			myList.add(2002);
			myList.add(2003);
			myList.add(2004);
			myList.add(2005);
			myList.add(2006);
			myList.add(2007);
			myList.add(2008);
			myList.add(2009);
			myList.add(2010);
			myList.add(2011);
			myList.add(2012);
			myList.add(2013);
			myList.add(2014);
			myList.add(2015);
			myList.add(2016);
			myList.add(2017);
			myList.add(2018);
			
			for (IncomeIndex item : DBcontentsUnfiltered) {
				int iso = item.getISO_Code();
				for (int year : myList) {
					if ((Low<=year)&&(year<= High)&&(ISOCodes.contains(iso))) {
						
						String thisCountry = item.getCountry();
						int thisYear = year;
						Method method = item.getClass().getMethod("getYear"+Integer.toString(year));
						String thisValue = (String) method.invoke(item);
						String thisColumn = index;
						
						List<String> row = Arrays.asList(thisCountry,String.valueOf(thisYear),String.valueOf(thisValue),thisColumn);					
						if (!(thisValue.equals(".."))) {
							DBcontentsFiltered.add(row);
				        }
					}
				}
			}
			
			return DBcontentsFiltered;
		}
		else if (entity.equals("LabourShareOfGdp")){
			List<LabourShareOfGdp> DBcontentsUnfiltered = cService.findAllLabourShareOfGdp();
			List<Integer> myList = new ArrayList<>();
			myList.add(2000);
			myList.add(2005);
			myList.add(2010);
			myList.add(2011);
			myList.add(2012);
			myList.add(2013);
			myList.add(2014);
			myList.add(2015);
			myList.add(2016);
			myList.add(2017);
			myList.add(2018);
			
			for (LabourShareOfGdp item : DBcontentsUnfiltered) {
				int iso = item.getISO_Code();
				for (int year : myList) {
					if ((Low<=year)&&(year<= High)&&(ISOCodes.contains(iso))) {
						
						String thisCountry = item.getCountry();
						int thisYear = year;
						Method method = item.getClass().getMethod("getYear"+Integer.toString(year));
				        String thisValue = (String) method.invoke(item);
						String thisColumn = index;
						
						List<String> row = Arrays.asList(thisCountry,String.valueOf(thisYear),String.valueOf(thisValue),thisColumn);					
						if (!(thisValue.equals(".."))) {
							DBcontentsFiltered.add(row);
				        }
					}
				}
			}
			
			return DBcontentsFiltered;
		}
		else if (entity.equals("MidyearPopulation")){
			List<MidyearPopulation> DBcontentsUnfiltered = cService.findAllMidyearPopulation();
			for (MidyearPopulation item : DBcontentsUnfiltered) {
				int year = item.getId().getYear();
				int iso = item.getId().getISO_Code();
				if ((Low<=year)&&(year<= High)&&(ISOCodes.contains(iso))) {
					String thisCountry = item.getCountry().getDisplay_Name();
					int thisYear = item.getId().getYear();
					Method method = item.getClass().getMethod("get"+index);
					String thisValue = (String) method.invoke(item);
					String thisColumn = index;
					
					List<String> row = Arrays.asList(thisCountry,String.valueOf(thisYear),String.valueOf(thisValue),thisColumn);					
					DBcontentsFiltered.add(row);				}
			}
			return DBcontentsFiltered;
		}
		else if (entity.equals("MidyearPopulation5yrAgeSex")){
			List<MidyearPopulation5yrAgeSex> DBcontentsUnfiltered = cService.findAllMidyearPopulation5yrAgeSex();
			
			for (MidyearPopulation5yrAgeSex item : DBcontentsUnfiltered) {
				int year = item.getId().getYear();
				int iso = item.getId().getISO_Code();
				if ((Low<=year)&&(year<= High)&&(ISOCodes.contains(iso))) {
					String thisCountry = item.getCountry().getDisplay_Name();
					int thisYear = item.getId().getYear();
					Method method = item.getClass().getMethod("get"+index);
					String thisValue = (String) method.invoke(item);
					String thisColumn = index;
					
					List<String> row = Arrays.asList(thisCountry,String.valueOf(thisYear),String.valueOf(thisValue),thisColumn);					
					DBcontentsFiltered.add(row);
				}
			}
			return DBcontentsFiltered;
		}
		else if (entity.equals("MidyearPopulationAgeSex")){
			//TODO NA DW AFTO
			List<MidyearPopulationAgeSex> DBcontentsUnfiltered = cService.findAllMidyearPopulationAgeSex();
			if(index.equals("PopulationByAge")) {
				for (int i:ISOCodes) {
					List<MidyearPopulationAgeCountryCode> DBcontentsUnfiltered1 = cService.findAllByIsoCodeMidyearPopulationAgeCountryCode(i);
					for (MidyearPopulationAgeCountryCode item : DBcontentsUnfiltered1) {
						int year = item.getId().getYear();
						int iso = item.getId().getISO_Code();
						if ((Low<=year)&&(year<= High)&&(ISOCodes.contains(iso))) {
							String thisCountry = item.getCountry().getDisplay_Name();
							int thisYear = item.getId().getYear();
							Method method = item.getClass().getMethod("getPopulationAge"+Integer.toString(i));
							String thisValue = (String) method.invoke(item);
							String thisColumn = index;
							
							List<String> row = Arrays.asList(thisCountry,String.valueOf(thisYear),String.valueOf(thisValue),"Age"+Integer.toString(i));					
							
							DBcontentsFiltered.add(row);
						}
					}
				}
			}
			
			
			for (MidyearPopulationAgeSex item : DBcontentsUnfiltered) {
				int year = item.getId().getYear();
				int iso = item.getId().getISO_Code();
				if ((Low<=year)&&(year<= High)&&(ISOCodes.contains(iso))) {
					String thisCountry = item.getCountry().getDisplay_Name();
					int thisYear = item.getId().getYear();
					for (int i =0;i<=100;i++) {
						Method method = item.getClass().getMethod("getPopulationAge"+Integer.toString(i));
						String thisValue = (String) method.invoke(item);
						String thisColumn = index;
						
						List<String> row = Arrays.asList(thisCountry,String.valueOf(thisYear),String.valueOf(thisValue),"Age"+Integer.toString(i));
						
						DBcontentsFiltered.add(row);
					}
				}
			}
			
			
			return DBcontentsFiltered;
		}
		else if (entity.equals("MortalityLifeExpectancy")){
			List<MortalityLifeExpectancy> DBcontentsUnfiltered = cService.findAllMortalityLifeExpectancy();
			
			for (MortalityLifeExpectancy item : DBcontentsUnfiltered) {
				int year = item.getId().getYear();
				int iso = item.getId().getISO_Code();
				if ((Low<=year)&&(year<= High)&&(ISOCodes.contains(iso))) {
					String thisCountry = item.getCountry().getDisplay_Name();
					int thisYear = item.getId().getYear();
					Method method = item.getClass().getMethod("get"+index);
					String thisValue = (String) method.invoke(item);
					String thisColumn = index;
					
					List<String> row = Arrays.asList(thisCountry,String.valueOf(thisYear),String.valueOf(thisValue),thisColumn);					
					
					DBcontentsFiltered.add(row);				}
			}
			return DBcontentsFiltered;
		}
		return DBcontentsFiltered;
		
	}
	
	public List<List<List<String>>> createGraphs(List<String> selectedCountries, String Xindex, String Yindex, String Lo, String Up) throws NumberFormatException, NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException{
	
	HashMap<String, String> fileMatch = new HashMap<>();
	fileMatch.put("Fertility rate by age", "AgeSpecificFertilityRate");
	fileMatch.put("Total fertility rate", "AgeSpecificFertilityRate");
	fileMatch.put("Gross reproduction rate", "AgeSpecificFertilityRate");
	fileMatch.put("Sex ratio at birth", "AgeSpecificFertilityRate");
	fileMatch.put("Crude birth rate", "BirthDeathGrowthRate");
	fileMatch.put("Crude death rate", "BirthDeathGrowthRate");
	fileMatch.put("Net migration", "BirthDeathGrowthRate");
	fileMatch.put("Rate natural increase", "BirthDeathGrowthRate");
	fileMatch.put("Growth rate", "BirthDeathGrowthRate");
	fileMatch.put("Domestic credits", "DomesticCredit");
	fileMatch.put("Estimated GNI female", "EstimatedGniFemale");
	fileMatch.put("Estimated GNI male", "EstimatedGniMale");
	fileMatch.put("GDP per capita", "GdpPerCapita");
	fileMatch.put("GDP total", "GdpTotal");
	fileMatch.put("GNI per capita", "GniPerCapita");
	fileMatch.put("Gross fixed capital formation", "GrossFixedCapitalFormation");
	fileMatch.put("Income Index", "IncomeIndex");
	fileMatch.put("Labour share of GDP", "LabourShareOfGdp");
	fileMatch.put("Midyear population", "MidyearPopulation");
	fileMatch.put("Midyear population male", "MidyearPopulationAgeSex");
	fileMatch.put("Midyear population female", "MidyearPopulationAgeSex");
	fileMatch.put("Midyear population 5yr", "MidyearPopulation5yrAgeSex");
	fileMatch.put("Midyear population male 5yr", "MidyearPopulation5yrAgeSex");
	fileMatch.put("Midyear population female 5yr", "MidyearPopulation5yrAgeSex");
	fileMatch.put("Population by age", "MidyearPopulationAgeSex");
	fileMatch.put("Infant mortality", "MortalityLifeExpectancy");
	fileMatch.put("Infant mortality male", "MortalityLifeExpectancy");
	fileMatch.put("Infant mortality female", "MortalityLifeExpectancy");
	fileMatch.put("Life expectancy", "MortalityLifeExpectancy");
	fileMatch.put("Life expectancy male", "MortalityLifeExpectancy");
	fileMatch.put("Life expectancy female", "MortalityLifeExpectancy");
	fileMatch.put("Mortality rate under5", "MortalityLifeExpectancy");
	fileMatch.put("Mortality rate under5 male", "MortalityLifeExpectancy");
	fileMatch.put("Mortality rate under5 female", "MortalityLifeExpectancy");
	fileMatch.put("Mortality rate 1to4", "MortalityLifeExpectancy");
	fileMatch.put("Mortality rate 1to4 male", "MortalityLifeExpectancy");
	fileMatch.put("Mortality rate 1to4 female", "MortalityLifeExpectancy");
	
	
	
	HashMap<String, String> functionMatch = new HashMap<>();

	functionMatch.put("Fertility rate by age", "FertilityRateByAge");
	functionMatch.put("Total fertility rate", "TotalFertilityRate");
	functionMatch.put("Gross reproduction rate", "GrossReproductionRate");
	functionMatch.put("Sex ratio at birth", "SexRatioAtBirth");
	functionMatch.put("Crude birth rate", "CrudeBirthRate");
	functionMatch.put("Crude death rate", "CrudeDeathRate");
	functionMatch.put("Net migration", "NetMigration");
	functionMatch.put("Rate natural increase", "RateNaturalIncrease");
	functionMatch.put("Growth rate", "GrowthRate");
	functionMatch.put("Domestic credits", "Domestic credits");
	functionMatch.put("Estimated GNI female", "Estimated GNI female");
	functionMatch.put("Estimated GNI male", "Estimated GNI male");
	functionMatch.put("GDP per capita", "GDP per capita");
	functionMatch.put("GDP total", "GDP total");
	functionMatch.put("GNI per capita", "GNI per capita");
	functionMatch.put("Gross fixed capital formation", "Gross fixed capital formation");
	functionMatch.put("Income Index", "Income Index");
	functionMatch.put("Labour share of GDP", "Labour share of GDP");
	functionMatch.put("Midyear population", "MidyearPopulation");
	functionMatch.put("Midyear population male", "MidyearPopulationMale");
	functionMatch.put("Midyear population female", "MidyearPopulationFemale");
	functionMatch.put("Midyear population 5yr", "MidyearPopulation");
	functionMatch.put("Midyear population male 5yr", "MidyearPopulationMale");
	functionMatch.put("Midyear population female 5yr", "MidyearPopulationFemale");
	functionMatch.put("Population by age", "PopulationByAge");
	functionMatch.put("Infant mortality", "InfantMortality");
	functionMatch.put("Infant mortality male", "InfantMortalityMale");
	functionMatch.put("Infant mortality female", "InfantMortalityFemale");
	functionMatch.put("Life expectancy", "LifeExpectancy");
	functionMatch.put("Life expectancy male", "LifeExpectancyMale");
	functionMatch.put("Life expectancy female", "LifeExpectancyFemale");
	functionMatch.put("Mortality rate under5", "MortalityRateUnder5");
	functionMatch.put("Mortality rate under5 male", "MortalityRateUnder5Male");
	functionMatch.put("Mortality rate under5 female", "MortalityRateUnder5Female");
	functionMatch.put("Mortality rate 1to4", "MortalityRate1to4");
	functionMatch.put("Mortality rate 1to4 male", "MortalityRate1to4Male");
	functionMatch.put("Mortality rate 1to4 female", "MortalityRate1to4Female");

	
	
	
	
	String entityX = fileMatch.get(Xindex);
	String entityY = fileMatch.get(Yindex);
	
	if (Lo.equals("")) {
		Lo = "1980";
	}
	if (Up.equals("")) {
		Up = "2050";
	}
		
	
	List<Country> allCountries = cService.findAllCountry();
	List<Integer> ISOCodes = new ArrayList<>();
	for (Country c: allCountries) {
		for (String s : selectedCountries) {
			if (c.getDisplay_Name().equals(s)) {
				ISOCodes.add(c.getISO_Code());
			}
		}
	}
	List<List<String>> X = getAppropriateDataFromDB(functionMatch.get(Xindex), entityX, Integer.parseInt(Lo), Integer.parseInt(Up), ISOCodes);
	List<List<String>> Y = getAppropriateDataFromDB(functionMatch.get(Yindex), entityY, Integer.parseInt(Lo), Integer.parseInt(Up), ISOCodes);
	
	List<List<List<String>>> Data = new ArrayList<>();
	Data.add(X);
	Data.add(Y);
	return Data;
	}
}