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
		indicesList.add("fertility_rate_by_age");
		indicesList.add("total_fertility_rate");
		indicesList.add("gross_reproduction_rate");
		indicesList.add("sex_ratio_at_birth");
		indicesList.add("crude_birth_rate");
		indicesList.add("crude_death_rate");
		indicesList.add("net_migration");
		indicesList.add("rate_natural_increase");
		indicesList.add("growth_rate");
		indicesList.add("Domestic credits");
		indicesList.add("Estimated GNI female");
		indicesList.add("Estimated GNI male");
		indicesList.add("GDP per capita");
		indicesList.add("GDP total");
		indicesList.add("GNI per capita");
		indicesList.add("Gross fixed capital formation");
		indicesList.add("Income Index");
		indicesList.add("Labour share of GDP");
		indicesList.add("midyear_population");
		indicesList.add("midyear_population_male");
		indicesList.add("midyear_population_female");
		indicesList.add("midyear_population_5yr");
		indicesList.add("midyear_population_male_5yr");
		indicesList.add("midyear_population_female_5yr");
		indicesList.add("population by age");
		indicesList.add("infant_mortality");
		indicesList.add("infant_mortality_male");
		indicesList.add("infant_mortality_female");
		indicesList.add("life_expectancy");
		indicesList.add("life_expectancy_male");
		indicesList.add("life_expectancy_female");
		indicesList.add("mortality_rate_under5");
		indicesList.add("mortality_rate_under5_male");
		indicesList.add("mortality_rate_under5_female");
		indicesList.add("mortality_rate_1to4");
		indicesList.add("mortality_rate_1to4_male");
		indicesList.add("mortality_rate_1to4_female");
		return indicesList;
	}
	public List<?> getAppropriateDataFromDB(String index,String entity, int Low, int High, List<Integer> ISOCodes) throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		if (entity.equals("AgeSpecificFertilityRate")){
			List<AgeSpecificFertilityRate> DBcontentsUnfiltered = cService.findAllAgeSpecificFertilityRate();
			List<Object> DBcontentsFilteredByYear = new ArrayList<Object>();			
			for (AgeSpecificFertilityRate item : DBcontentsUnfiltered) {
				int year = item.getId().getYear();
				int iso = item.getId().getISO_Code();
				if ((Low<=year)&&(year<= High)&&(ISOCodes.contains(iso))) {
					String thisCountry = item.getCountry().getDisplay_Name();
					int thisYear = item.getId().getYear();
					Method method = CountryService.class.getMethod(index);
			        float thisValue = (float) method.invoke(null);
					String thisColumn = index;
					
					Object row = Arrays.asList(thisCountry,thisYear,thisValue,thisColumn);
					
					DBcontentsFilteredByYear.add(row);				}
			}
			return DBcontentsFilteredByYear;
		}
		else if (entity.equals("BirthDeathGrowthRate")){
			List<BirthDeathGrowthRate> DBcontentsUnfiltered = cService.findAllBirthDeathGrowthRate();
			List<Object> DBcontentsFilteredByYear = new ArrayList<Object>();
			
			for (BirthDeathGrowthRate item : DBcontentsUnfiltered) {
				int year = item.getId().getYear();
				int iso = item.getId().getISO_Code();
				if ((Low<=year)&&(year<= High)&&(ISOCodes.contains(iso))) {
					
					String thisCountry = item.getCountry().getDisplay_Name();
					int thisYear = item.getId().getYear();
					Method method = CountryService.class.getMethod(index);
			        float thisValue = (float) method.invoke(null);
					String thisColumn = index;
					
					Object row = Arrays.asList(thisCountry,thisYear,thisValue,thisColumn);
					
					DBcontentsFilteredByYear.add(row);
				}
			}
			return DBcontentsFilteredByYear;	
		}
		else if (entity.equals("DomesticCredit")){
			List<DomesticCredit> DBcontentsUnfiltered = cService.findAllDomesticCredit();
			List<Object> DBcontentsFilteredByYear = new ArrayList<Object>();
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
						Method method = CountryService.class.getMethod("getYear"+Integer.toString(year));
				        float thisValue = (float) method.invoke(null);
						String thisColumn = index;
						
						Object row = Arrays.asList(thisCountry,thisYear,thisValue,thisColumn);
						
						DBcontentsFilteredByYear.add(row);					}
				}
			}
			
			return DBcontentsFilteredByYear;	
		}
		else if (entity.equals("EstimatedGniFemale")){
			List<EstimatedGniFemale> DBcontentsUnfiltered = cService.findAllEstimatedGniFemale();
			List<Object> DBcontentsFilteredByYear = new ArrayList<Object>();
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
						Method method = CountryService.class.getMethod("getYear"+Integer.toString(year));
				        float thisValue = (float) method.invoke(null);
						String thisColumn = index;
						
						Object row = Arrays.asList(thisCountry,thisYear,thisValue,thisColumn);
						
						DBcontentsFilteredByYear.add(row);					}
				}
			}
			
			return DBcontentsFilteredByYear;
		}
		else if (entity.equals("EstimatedGniMale")){
			List<EstimatedGniMale> DBcontentsUnfiltered = cService.findAllEstimatedGniMale();
			List<Object> DBcontentsFilteredByYear = new ArrayList<Object>();
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
						Method method = CountryService.class.getMethod("getYear"+Integer.toString(year));
				        float thisValue = (float) method.invoke(null);
						String thisColumn = index;
						
						Object row = Arrays.asList(thisCountry,thisYear,thisValue,thisColumn);
						
						DBcontentsFilteredByYear.add(row);					}
				}
			}
			
			return DBcontentsFilteredByYear;
		}
		else if (entity.equals("GdpPerCapita")){
			List<GdpPerCapita> DBcontentsUnfiltered = cService.findAllGdpPerCapita();
			List<Object> DBcontentsFilteredByYear = new ArrayList<Object>();
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
						Method method = CountryService.class.getMethod("getYear"+Integer.toString(year));
				        float thisValue = (float) method.invoke(null);
						String thisColumn = index;
						
						Object row = Arrays.asList(thisCountry,thisYear,thisValue,thisColumn);
						
						DBcontentsFilteredByYear.add(row);					}
				}
			}
			
			return DBcontentsFilteredByYear;
		}
		else if (entity.equals("GdpTotal")){
			List<GdpTotal> DBcontentsUnfiltered = cService.findAllGdpTotal();
			List<Object> DBcontentsFilteredByYear = new ArrayList<Object>();
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
						Method method = CountryService.class.getMethod("getYear"+Integer.toString(year));
				        float thisValue = (float) method.invoke(null);
						String thisColumn = index;
						
						Object row = Arrays.asList(thisCountry,thisYear,thisValue,thisColumn);
						
						DBcontentsFilteredByYear.add(row);					}
				}
			}
			
			return DBcontentsFilteredByYear;
		}
		else if (entity.equals("GniPerCapita")){
			List<GniPerCapita> DBcontentsUnfiltered = cService.findAllGniPerCapita();
			List<Object> DBcontentsFilteredByYear = new ArrayList<Object>();
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
						Method method = CountryService.class.getMethod("getYear"+Integer.toString(year));
				        float thisValue = (float) method.invoke(null);
						String thisColumn = index;
						
						Object row = Arrays.asList(thisCountry,thisYear,thisValue,thisColumn);
						
						DBcontentsFilteredByYear.add(row);					}
				}
			}
			
			return DBcontentsFilteredByYear;
		}
		else if (entity.equals("GrossFixedCapitalFormation")){
			List<GrossFixedCapitalFormation> DBcontentsUnfiltered = cService.findAllGrossFixedCapitalFormation();
			List<Object> DBcontentsFilteredByYear = new ArrayList<Object>();
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
						Method method = CountryService.class.getMethod("getYear"+Integer.toString(year));
				        float thisValue = (float) method.invoke(null);
						String thisColumn = index;
						
						Object row = Arrays.asList(thisCountry,thisYear,thisValue,thisColumn);
						
						DBcontentsFilteredByYear.add(row);					}
				}
			}
			
			return DBcontentsFilteredByYear;
		}
		else if (entity.equals("IncomeIndex")){
			List<IncomeIndex> DBcontentsUnfiltered = cService.findAllIncomeIndex();
			List<Object> DBcontentsFilteredByYear = new ArrayList<Object>();
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
						Method method = CountryService.class.getMethod("getYear"+Integer.toString(year));
				        float thisValue = (float) method.invoke(null);
						String thisColumn = index;
						
						Object row = Arrays.asList(thisCountry,thisYear,thisValue,thisColumn);
						
						DBcontentsFilteredByYear.add(row);					}
				}
			}
			
			return DBcontentsFilteredByYear;
		}
		else if (entity.equals("LabourShareOfGdp")){
			List<LabourShareOfGdp> DBcontentsUnfiltered = cService.findAllLabourShareOfGdp();
			List<Object> DBcontentsFilteredByYear = new ArrayList<Object>();
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
						Method method = CountryService.class.getMethod("getYear"+Integer.toString(year));
				        float thisValue = (float) method.invoke(null);
						String thisColumn = index;
						
						Object row = Arrays.asList(thisCountry,thisYear,thisValue,thisColumn);
						
						DBcontentsFilteredByYear.add(row);					}
				}
			}
			
			return DBcontentsFilteredByYear;
		}
		else if (entity.equals("MidyearPopulation")){
			List<MidyearPopulation> DBcontentsUnfiltered = cService.findAllMidyearPopulation();
			List<Object> DBcontentsFilteredByYear = new ArrayList<Object>();
			for (MidyearPopulation item : DBcontentsUnfiltered) {
				int year = item.getId().getYear();
				int iso = item.getId().getISO_Code();
				if ((Low<=year)&&(year<= High)&&(ISOCodes.contains(iso))) {
					String thisCountry = item.getCountry().getDisplay_Name();
					int thisYear = item.getId().getYear();
					Method method = CountryService.class.getMethod(index);
			        float thisValue = (float) method.invoke(null);
					String thisColumn = index;
					
					Object row = Arrays.asList(thisCountry,thisYear,thisValue,thisColumn);
					
					DBcontentsFilteredByYear.add(row);				}
			}
			return DBcontentsFilteredByYear;
		}
		else if (entity.equals("MidyearPopulation5yrAgeSex")){
			List<MidyearPopulation5yrAgeSex> DBcontentsUnfiltered = cService.findAllMidyearPopulation5yrAgeSex();
			List<Object> DBcontentsFilteredByYear = new ArrayList<Object>();
			
			for (MidyearPopulation5yrAgeSex item : DBcontentsUnfiltered) {
				int year = item.getId().getYear();
				int iso = item.getId().getISO_Code();
				if ((Low<=year)&&(year<= High)&&(ISOCodes.contains(iso))) {
					DBcontentsFilteredByYear.add(item);
				}
			}
			return DBcontentsFilteredByYear;
		}
		else if (entity.equals("MidyearPopulationAgeSex")){
			List<MidyearPopulationAgeSex> DBcontentsUnfiltered = cService.findAllMidyearPopulationAgeSex();
			List<Object> DBcontentsFilteredByYear = new ArrayList<Object>();
			
			for (MidyearPopulationAgeSex item : DBcontentsUnfiltered) {
				int year = item.getId().getYear();
				int iso = item.getId().getISO_Code();
				if ((Low<=year)&&(year<= High)&&(ISOCodes.contains(iso))) {
					String thisCountry = item.getCountry().getDisplay_Name();
					int thisYear = item.getId().getYear();
					Method method = CountryService.class.getMethod(index);
			        float thisValue = (float) method.invoke(null);
					String thisColumn = index;
					
					Object row = Arrays.asList(thisCountry,thisYear,thisValue,thisColumn);
					
					DBcontentsFilteredByYear.add(row);				}
			}
			return DBcontentsFilteredByYear;
		}
		else if (entity.equals("MortalityLifeExpectancy")){
			List<MortalityLifeExpectancy> DBcontentsUnfiltered = cService.findAllMortalityLifeExpectancy();
			List<Object> DBcontentsFilteredByYear = new ArrayList<Object>();
			
			for (MortalityLifeExpectancy item : DBcontentsUnfiltered) {
				int year = item.getId().getYear();
				int iso = item.getId().getISO_Code();
				if ((Low<=year)&&(year<= High)&&(ISOCodes.contains(iso))) {
					String thisCountry = item.getCountry().getDisplay_Name();
					int thisYear = item.getId().getYear();
					Method method = CountryService.class.getMethod(index);
			        float thisValue = (float) method.invoke(null);
					String thisColumn = index;
					
					Object row = Arrays.asList(thisCountry,thisYear,thisValue,thisColumn);
					
					DBcontentsFilteredByYear.add(row);				}
			}
			return DBcontentsFilteredByYear;
		}
		return ISOCodes;
		
	}
	
	public void createGraphs(List<String> selectedCountries, String Xindex, String Yindex, String Lo, String Up) throws NumberFormatException, NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException{
	
	HashMap<String, String> fileMatch = new HashMap<>();
	fileMatch.put("fertility_rate_by_age", "AgeSpecificFertilityRate");
	fileMatch.put("total_fertility_rate", "AgeSpecificFertilityRate");
	fileMatch.put("gross_reproduction_rate", "AgeSpecificFertilityRate");
	fileMatch.put("sex_ratio_at_birth", "AgeSpecificFertilityRate");
	fileMatch.put("crude_birth_rate", "BirthDeathGrowthRate");
	fileMatch.put("crude_death_rate", "BirthDeathGrowthRate");
	fileMatch.put("net_migration", "BirthDeathGrowthRate");
	fileMatch.put("rate_natural_increase", "BirthDeathGrowthRate");
	fileMatch.put("growth_rate", "BirthDeathGrowthRate");
	fileMatch.put("Domestic credits", "DomesticCredit");
	fileMatch.put("Estimated GNI female", "EstimatedGniFemale");
	fileMatch.put("Estimated GNI male", "EstimatedGniMale");
	fileMatch.put("GDP per capita", "GdpPerCapita");
	fileMatch.put("GDP total", "GdpTotal");
	fileMatch.put("GNI per capita", "GniPerCapita");
	fileMatch.put("Gross fixed capital formation", "GrossFixedCapitalFormation");
	fileMatch.put("Income Index", "IncomeIndex");
	fileMatch.put("Labour share of GDP", "LabourShareOfGdp");
	fileMatch.put("midyear_population", "MidyearPopulation");
	fileMatch.put("midyear_population_male", "MidyearPopulation");
	fileMatch.put("midyear_population_female", "MidyearPopulation");
	fileMatch.put("midyear_population_5yr", "MidyearPopulation5yrAgeSex");
	fileMatch.put("midyear_population_male_5yr", "MidyearPopulation5yrAgeSex");
	fileMatch.put("midyear_population_female_5yr", "MidyearPopulation5yrAgeSex");
	fileMatch.put("population by age", "MidyearPopulationAgeSex");
	fileMatch.put("infant_mortality", "MortalityLifeExpectancy");
	fileMatch.put("infant_mortality_male", "MortalityLifeExpectancy");
	fileMatch.put("infant_mortality_female", "MortalityLifeExpectancy");
	fileMatch.put("life_expectancy", "MortalityLifeExpectancy");
	fileMatch.put("life_expectancy_male", "MortalityLifeExpectancy");
	fileMatch.put("life_expectancy_female", "MortalityLifeExpectancy");
	fileMatch.put("mortality_rate_under5", "MortalityLifeExpectancy");
	fileMatch.put("mortality_rate_under5_male", "MortalityLifeExpectancy");
	fileMatch.put("mortality_rate_under5_female", "MortalityLifeExpectancy");
	fileMatch.put("mortality_rate_1to4", "MortalityLifeExpectancy");
	fileMatch.put("mortality_rate_1to4_male", "MortalityLifeExpectancy");
	fileMatch.put("mortality_rate_1to4_female", "MortalityLifeExpectancy");
	
	String entityX = fileMatch.get(Xindex);
	String entityY = fileMatch.get(Yindex);
	
	List<Country> allCountries = cService.findAllCountry();
	List<Integer> ISOCodes = new ArrayList<>();
	for (Country c: allCountries) {
		for (String s : selectedCountries) {
			if (c.getDisplay_Name().equals(s)) {
				ISOCodes.add(c.getISO_Code());
			}
		}
	}
	List<?> X = getAppropriateDataFromDB(Xindex, entityX, Integer.parseInt(Lo), Integer.parseInt(Up), ISOCodes);
	List<?> Y = getAppropriateDataFromDB(Yindex, entityY, Integer.parseInt(Lo), Integer.parseInt(Up), ISOCodes);
	
	
	
	
	
	
	
	/*
	
	public String listCourses(Model theModel) {
		
		//create a new list containing all courses
		List<Course> theCourses = courseService.findAll();
		 //add the courses to the spring model
		theModel.addAttribute("courses", theCourses);
		
		return "courses/list-courses";
	}
	
	
	
	public String showFormForAdd(Model theModel) {
		
		// create new course
		Course theCourse = new Course();
		//add the new course to the spring model
		theModel.addAttribute("course", theCourse);
		
		return "courses/course-form";
	}
	
	public String showFormForUpdate(@RequestParam("courseId") int theId,
									Model theModel) {
		
		
		// get the course from the service
		Course theCourse = courseService.findById(theId);
		
		courseService.save(theCourse);
		
		
		// set course as a model attribute to pre-populate the form
		theModel.addAttribute("course", theCourse);
		
		// send over to our form
		return "courses/course-form";			
	}
	public String saveCourse(@ModelAttribute("course") Course theCourse) {
		
		// save the course
		courseService.save(theCourse);
		
		// use a redirect to prevent duplicate submissions
		return "redirect:/courses/list";
	}
	public String delete(@RequestParam("courseId") int theId) {
		
		List<StudentRegistration> studRegs = studentRegistrationService.findAllByCourseid(theId);
		int size = studRegs.size();
		for (int i=0;i<size;i++) {
			studentRegistrationService.deleteById(studRegs.get(i).getId());
		}
		
		// delete the course
		
		courseService.deleteById(theId);
		
		// redirect to /courses/list
		return "redirect:/courses/list";
		
	}*/
	}
}