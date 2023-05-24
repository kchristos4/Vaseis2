CREATE SCHEMA IF NOT EXISTS vaseis2;
ALTER SCHEMA `vaseis2`  DEFAULT CHARACTER SET latin1  DEFAULT COLLATE latin1_bin;
SET GLOBAL local_infile =1;

USE vaseis2;
drop table if exists age_specific_fertility_rates;
drop table if exists birth_death_growth_rates;
drop table if exists country_names_area;
drop table if exists midyear_population;
drop table if exists midyear_population_5yr_age_sex;
drop table if exists midyear_population_age_sex;
drop table if exists mortality_life_expectancy;
drop table if exists midyear_population_age_country_code;

drop table if exists domestic_credits;
drop table if exists Estimated_GNI_female;
drop table if exists Estimated_GNI_male;
drop table if exists GDP_per_capita;
drop table if exists GDP_total;
drop table if exists GNI_per_capita;
drop table if exists Gross_fixed_capital_formation;
drop table if exists Income_Index;
drop table if exists Labour_share_of_GDP;


drop table if exists countries;


CREATE TABLE IF NOT EXISTS countries (
    ISO VARCHAR(2),
    ISO3 VARCHAR(3),
    ISO_Code INT NOT NULL,
    FIPS VARCHAR(2),
    Display_Name VARCHAR(100),
    Official_Name VARCHAR(100),
    Capital VARCHAR(100),
    Continent VARCHAR(100),
    CurrencyCode VARCHAR(100),
    CurrencyName VARCHAR(100),
    Phone VARCHAR(100),
    Region_Code VARCHAR(100),
    Region_Name VARCHAR(100),
    Subregion_Code VARCHAR(100),
    Subregion_Name VARCHAR(100),
    Intermediate_Region_Code VARCHAR(100),
    Intermediate_Region_Name VARCHAR(100),
    Status VARCHAR(100),
    Developed_or_Developing VARCHAR(100),
    Small_Island_Developing_States VARCHAR(100),
    Land_Locked_Developing_Countries VARCHAR(100),
    Least_Developed_Countries VARCHAR(100),
    Area_SqKm VARCHAR(100),
    Population VARCHAR(100),
    PRIMARY KEY (ISO_Code)
);

CREATE TABLE IF NOT EXISTS age_specific_fertility_rates (
    country_code VARCHAR(100),
    country_name VARCHAR(100),
    year INT NOT NULL,
    fertility_rate_15_19 FLOAT,
    fertility_rate_20_24 FLOAT,
    fertility_rate_25_29 FLOAT,
    fertility_rate_30_34 FLOAT,
    fertility_rate_35_39 FLOAT,
    fertility_rate_40_44 FLOAT,
    fertility_rate_45_49 FLOAT,
    total_fertility_rate FLOAT,
    gross_reproduction_rate FLOAT,
    sex_ratio_at_birth FLOAT,
    ISO_Code INT,
    PRIMARY KEY (ISO_Code,year),
    FOREIGN KEY (ISO_Code) REFERENCES countries(ISO_Code)
);

CREATE TABLE IF NOT EXISTS birth_death_growth_rates (
    country_code VARCHAR(100),
    country_name VARCHAR(100),
    year INT NOT NULL,
    crude_birth_rate FLOAT,
    crude_death_rate FLOAT,
    net_migration FLOAT,
    rate_natural_increase FLOAT,
    growth_rate FLOAT,
    ISO_Code INT,
    PRIMARY KEY (ISO_Code,year),
    FOREIGN KEY (ISO_Code) REFERENCES countries(ISO_Code)
);

CREATE TABLE IF NOT EXISTS country_names_area (
    country_code VARCHAR(100),
    country_name VARCHAR(100),
    country_area INT NOT NULL,
    ISO_Code INT,
    PRIMARY KEY (ISO_Code),
    FOREIGN KEY (ISO_Code) REFERENCES countries(ISO_Code)
);

CREATE TABLE IF NOT EXISTS midyear_population (
    country_code VARCHAR(100),
    country_name VARCHAR(100),
    year INT NOT NULL,
    midyear_population VARCHAR(100),
    ISO_Code INT,
    PRIMARY KEY (ISO_Code,year),
    FOREIGN KEY (ISO_Code) REFERENCES countries(ISO_Code)
);

CREATE TABLE IF NOT EXISTS midyear_population_5yr_age_sex (
    country_code VARCHAR(100),
    country_name VARCHAR(100),
    year INT NOT NULL,
    total_flag VARCHAR(100),
    starting_age VARCHAR(100),
    age_group_indicator VARCHAR(100),
    ending_age VARCHAR(100),
    midyear_population VARCHAR(100),
    midyear_population_male VARCHAR(100),
    midyear_population_female VARCHAR(100),
    ISO_Code INT,
    PRIMARY KEY (ISO_Code,year,total_flag,starting_age),
    FOREIGN KEY (ISO_Code) REFERENCES countries(ISO_Code)
);

CREATE TABLE IF NOT EXISTS midyear_population_age_sex (
    country_code VARCHAR(100),
    country_name VARCHAR(100),
    year INT NOT NULL,
    sex VARCHAR(100),
    max_age VARCHAR(100),
    population_age_0 VARCHAR(100),
    population_age_1 VARCHAR(100),
    population_age_2 VARCHAR(100),
    population_age_3 VARCHAR(100),
    population_age_4 VARCHAR(100),
    population_age_5 VARCHAR(100),
    population_age_6 VARCHAR(100),
    population_age_7 VARCHAR(100),
    population_age_8 VARCHAR(100),
    population_age_9 VARCHAR(100),
    population_age_10 VARCHAR(100),
    population_age_11 VARCHAR(100),
    population_age_12 VARCHAR(100),
    population_age_13 VARCHAR(100),
    population_age_14 VARCHAR(100),
    population_age_15 VARCHAR(100),
    population_age_16 VARCHAR(100),
    population_age_17 VARCHAR(100),
    population_age_18 VARCHAR(100),
    population_age_19 VARCHAR(100),
    population_age_20 VARCHAR(100),
    population_age_21 VARCHAR(100),
    population_age_22 VARCHAR(100),
    population_age_23 VARCHAR(100),
    population_age_24 VARCHAR(100),
    population_age_25 VARCHAR(100),
    population_age_26 VARCHAR(100),
    population_age_27 VARCHAR(100),
    population_age_28 VARCHAR(100),
    population_age_29 VARCHAR(100),
    population_age_30 VARCHAR(100),
    population_age_31 VARCHAR(100),
    population_age_32 VARCHAR(100),
    population_age_33 VARCHAR(100),
    population_age_34 VARCHAR(100),
    population_age_35 VARCHAR(100),
    population_age_36 VARCHAR(100),
    population_age_37 VARCHAR(100),
    population_age_38 VARCHAR(100),
    population_age_39 VARCHAR(100),
    population_age_40 VARCHAR(100),
    population_age_41 VARCHAR(100),
    population_age_42 VARCHAR(100),
    population_age_43 VARCHAR(100),
    population_age_44 VARCHAR(100),
    population_age_45 VARCHAR(100),
    population_age_46 VARCHAR(100),
    population_age_47 VARCHAR(100),
    population_age_48 VARCHAR(100),
    population_age_49 VARCHAR(100),
    population_age_50 VARCHAR(100),
    population_age_51 VARCHAR(100),
    population_age_52 VARCHAR(100),
    population_age_53 VARCHAR(100),
    population_age_54 VARCHAR(100),
    population_age_55 VARCHAR(100),
    population_age_56 VARCHAR(100),
    population_age_57 VARCHAR(100),
    population_age_58 VARCHAR(100),
    population_age_59 VARCHAR(100),
    population_age_60 VARCHAR(100),
    population_age_61 VARCHAR(100),
    population_age_62 VARCHAR(100),
    population_age_63 VARCHAR(100),
    population_age_64 VARCHAR(100),
    population_age_65 VARCHAR(100),
    population_age_66 VARCHAR(100),
    population_age_67 VARCHAR(100),
    population_age_68 VARCHAR(100),
    population_age_69 VARCHAR(100),
    population_age_70 VARCHAR(100),
    population_age_71 VARCHAR(100),
    population_age_72 VARCHAR(100),
    population_age_73 VARCHAR(100),
    population_age_74 VARCHAR(100),
    population_age_75 VARCHAR(100),
    population_age_76 VARCHAR(100),
    population_age_77 VARCHAR(100),
    population_age_78 VARCHAR(100),
    population_age_79 VARCHAR(100),
    population_age_80 VARCHAR(100),
    population_age_81 VARCHAR(100),
    population_age_82 VARCHAR(100),
    population_age_83 VARCHAR(100),
    population_age_84 VARCHAR(100),
    population_age_85 VARCHAR(100),
    population_age_86 VARCHAR(100),
    population_age_87 VARCHAR(100),
    population_age_88 VARCHAR(100),
    population_age_89 VARCHAR(100),
    population_age_90 VARCHAR(100),
    population_age_91 VARCHAR(100),
    population_age_92 VARCHAR(100),
    population_age_93 VARCHAR(100),
    population_age_94 VARCHAR(100),
    population_age_95 VARCHAR(100),
    population_age_96 VARCHAR(100),
    population_age_97 VARCHAR(100),
    population_age_98 VARCHAR(100),
    population_age_99 VARCHAR(100),
    population_age_100 VARCHAR(100),
    ISO_Code INT,
    PRIMARY KEY (ISO_Code,year,sex),
    FOREIGN KEY (ISO_Code) REFERENCES countries(ISO_Code)
);

CREATE TABLE IF NOT EXISTS mortality_life_expectancy (
    country_code VARCHAR(100),
    country_name VARCHAR(100),
    year INT NOT NULL,
    infant_mortality VARCHAR(100),
    infant_mortality_male VARCHAR(100),
    infant_mortality_female VARCHAR(100),
    life_expectancy VARCHAR(100),
    life_expectancy_male VARCHAR(100),
    life_expectancy_female VARCHAR(100),
    mortality_rate_under5 VARCHAR(100),
    mortality_rate_under5_male VARCHAR(100),
    mortality_rate_under5_female VARCHAR(100),
    mortality_rate_1to4 VARCHAR(100),
    mortality_rate_1to4_male VARCHAR(100),
    mortality_rate_1to4_female VARCHAR(100),
    ISO_Code INT,
    PRIMARY KEY (ISO_Code,year),
    FOREIGN KEY (ISO_Code) REFERENCES countries(ISO_Code)
);








CREATE TABLE IF NOT EXISTS Domestic_credits (
    country VARCHAR(100),
    year_1990 VARCHAR(100),
    year_1995 VARCHAR(100),
    year_2000 VARCHAR(100),
    year_2005 VARCHAR(100),
    year_2010 VARCHAR(100),
    year_2011 VARCHAR(100),
    year_2012 VARCHAR(100),
    year_2013 VARCHAR(100),
    year_2014 VARCHAR(100),
    year_2015 VARCHAR(100),
    year_2016 VARCHAR(100),
    year_2017 VARCHAR(100),
    year_2018 VARCHAR(100),
    ISO_Code INT,
    PRIMARY KEY (ISO_Code),
    FOREIGN KEY (ISO_Code) REFERENCES countries(ISO_Code)
);
CREATE TABLE IF NOT EXISTS Estimated_GNI_female (
    country VARCHAR(100),
    year_1995 VARCHAR(100),
    year_2000 VARCHAR(100),
    year_2005 VARCHAR(100),
    year_2010 VARCHAR(100),
    year_2011 VARCHAR(100),
    year_2012 VARCHAR(100),
    year_2013 VARCHAR(100),
    year_2014 VARCHAR(100),
    year_2015 VARCHAR(100),
    year_2016 VARCHAR(100),
    year_2017 VARCHAR(100),
    year_2018 VARCHAR(100),
    info VARCHAR(100),
    ISO_Code INT,
    PRIMARY KEY (ISO_Code),
    FOREIGN KEY (ISO_Code) REFERENCES countries(ISO_Code)
);
CREATE TABLE IF NOT EXISTS Estimated_GNI_male (
    country VARCHAR(100),
    year_1995 VARCHAR(100),
    year_2000 VARCHAR(100),
    year_2005 VARCHAR(100),
    year_2010 VARCHAR(100),
    year_2011 VARCHAR(100),
    year_2012 VARCHAR(100),
    year_2013 VARCHAR(100),
    year_2014 VARCHAR(100),
    year_2015 VARCHAR(100),
    year_2016 VARCHAR(100),
    year_2017 VARCHAR(100),
    year_2018 VARCHAR(100),
    info VARCHAR(100),
    ISO_Code INT,
    PRIMARY KEY (ISO_Code),
    FOREIGN KEY (ISO_Code) REFERENCES countries(ISO_Code)
);
CREATE TABLE IF NOT EXISTS GDP_per_capita (
    country VARCHAR(100),
    year_1990 VARCHAR(100),
    year_1995 VARCHAR(100),
    year_2000 VARCHAR(100),
    year_2005 VARCHAR(100),
    year_2010 VARCHAR(100),
    year_2011 VARCHAR(100),
    year_2012 VARCHAR(100),
    year_2013 VARCHAR(100),
    year_2014 VARCHAR(100),
    year_2015 VARCHAR(100),
    year_2016 VARCHAR(100),
    year_2017 VARCHAR(100),
    year_2018 VARCHAR(100),
    info VARCHAR(100),
    ISO_Code INT,
    PRIMARY KEY (ISO_Code),
    FOREIGN KEY (ISO_Code) REFERENCES countries(ISO_Code)
);
CREATE TABLE IF NOT EXISTS GDP_total (
    country VARCHAR(100),
    year_1990 VARCHAR(100),
    year_1995 VARCHAR(100),
    year_2000 VARCHAR(100),
    year_2005 VARCHAR(100),
    year_2010 VARCHAR(100),
    year_2011 VARCHAR(100),
    year_2012 VARCHAR(100),
    year_2013 VARCHAR(100),
    year_2014 VARCHAR(100),
    year_2015 VARCHAR(100),
    year_2016 VARCHAR(100),
    year_2017 VARCHAR(100),
    year_2018 VARCHAR(100),
    info VARCHAR(100),
    ISO_Code INT,
    PRIMARY KEY (ISO_Code),
    FOREIGN KEY (ISO_Code) REFERENCES countries(ISO_Code)
);
CREATE TABLE IF NOT EXISTS GNI_per_capita (
    country VARCHAR(100),
    year_1990 VARCHAR(100),
    year_1991 VARCHAR(100),
    year_1992 VARCHAR(100),
    year_1993 VARCHAR(100),
    year_1994 VARCHAR(100),
    year_1995 VARCHAR(100),
    year_1996 VARCHAR(100),
    year_1997 VARCHAR(100),
    year_1998 VARCHAR(100),
    year_1999 VARCHAR(100),
    year_2000 VARCHAR(100),
    year_2001 VARCHAR(100),
    year_2002 VARCHAR(100),
    year_2003 VARCHAR(100),
    year_2004 VARCHAR(100),
    year_2005 VARCHAR(100),
    year_2006 VARCHAR(100),
    year_2007 VARCHAR(100),
    year_2008 VARCHAR(100),
    year_2009 VARCHAR(100),
    year_2010 VARCHAR(100),
    year_2011 VARCHAR(100),
    year_2012 VARCHAR(100),
    year_2013 VARCHAR(100),
    year_2014 VARCHAR(100),
    year_2015 VARCHAR(100),
    year_2016 VARCHAR(100),
    year_2017 VARCHAR(100),
    year_2018 VARCHAR(100),
    info VARCHAR(100),
    ISO_Code INT,
    PRIMARY KEY (ISO_Code),
    FOREIGN KEY (ISO_Code) REFERENCES countries(ISO_Code)
);
CREATE TABLE IF NOT EXISTS Gross_fixed_capital_formation (
    country VARCHAR(100),
    year_1990 VARCHAR(100),
    year_1995 VARCHAR(100),
    year_2000 VARCHAR(100),
    year_2005 VARCHAR(100),
    year_2010 VARCHAR(100),
    year_2011 VARCHAR(100),
    year_2012 VARCHAR(100),
    year_2013 VARCHAR(100),
    year_2014 VARCHAR(100),
    year_2015 VARCHAR(100),
    year_2016 VARCHAR(100),
    year_2017 VARCHAR(100),
    year_2018 VARCHAR(100),
    ISO_Code INT,
    PRIMARY KEY (ISO_Code),
    FOREIGN KEY (ISO_Code) REFERENCES countries(ISO_Code)
);
CREATE TABLE IF NOT EXISTS Income_Index (
    country VARCHAR(100),
    year_1990 VARCHAR(100),
    year_1991 VARCHAR(100),
    year_1992 VARCHAR(100),
    year_1993 VARCHAR(100),
    year_1994 VARCHAR(100),
    year_1995 VARCHAR(100),
    year_1996 VARCHAR(100),
    year_1997 VARCHAR(100),
    year_1998 VARCHAR(100),
    year_1999 VARCHAR(100),
    year_2000 VARCHAR(100),
    year_2001 VARCHAR(100),
    year_2002 VARCHAR(100),
    year_2003 VARCHAR(100),
    year_2004 VARCHAR(100),
    year_2005 VARCHAR(100),
    year_2006 VARCHAR(100),
    year_2007 VARCHAR(100),
    year_2008 VARCHAR(100),
    year_2009 VARCHAR(100),
    year_2010 VARCHAR(100),
    year_2011 VARCHAR(100),
    year_2012 VARCHAR(100),
    year_2013 VARCHAR(100),
    year_2014 VARCHAR(100),
    year_2015 VARCHAR(100),
    year_2016 VARCHAR(100),
    year_2017 VARCHAR(100),
    year_2018 VARCHAR(100),
    ISO_Code INT,
    PRIMARY KEY (ISO_Code),
    FOREIGN KEY (ISO_Code) REFERENCES countries(ISO_Code)
);
CREATE TABLE IF NOT EXISTS Labour_share_of_GDP (
    country VARCHAR(100),
    year_2000 VARCHAR(100),
    year_2005 VARCHAR(100),
    year_2010 VARCHAR(100),
    year_2011 VARCHAR(100),
    year_2012 VARCHAR(100),
    year_2013 VARCHAR(100),
    year_2014 VARCHAR(100),
    year_2015 VARCHAR(100),
    year_2016 VARCHAR(100),
    year_2017 VARCHAR(100),
    year_2018 VARCHAR(100),
    ISO_Code INT,
    PRIMARY KEY (ISO_Code),
    FOREIGN KEY (ISO_Code) REFERENCES countries(ISO_Code)
);

CREATE TABLE IF NOT EXISTS midyear_population_age_country_code (
    country_code VARCHAR(100),
    country_name VARCHAR(100),
    year INT NOT NULL,
    sex VARCHAR(100),
    max_age VARCHAR(100),
    population_age_0 VARCHAR(100),
    population_age_1 VARCHAR(100),
    population_age_2 VARCHAR(100),
    population_age_3 VARCHAR(100),
    population_age_4 VARCHAR(100),
    population_age_5 VARCHAR(100),
    population_age_6 VARCHAR(100),
    population_age_7 VARCHAR(100),
    population_age_8 VARCHAR(100),
    population_age_9 VARCHAR(100),
    population_age_10 VARCHAR(100),
    population_age_11 VARCHAR(100),
    population_age_12 VARCHAR(100),
    population_age_13 VARCHAR(100),
    population_age_14 VARCHAR(100),
    population_age_15 VARCHAR(100),
    population_age_16 VARCHAR(100),
    population_age_17 VARCHAR(100),
    population_age_18 VARCHAR(100),
    population_age_19 VARCHAR(100),
    population_age_20 VARCHAR(100),
    population_age_21 VARCHAR(100),
    population_age_22 VARCHAR(100),
    population_age_23 VARCHAR(100),
    population_age_24 VARCHAR(100),
    population_age_25 VARCHAR(100),
    population_age_26 VARCHAR(100),
    population_age_27 VARCHAR(100),
    population_age_28 VARCHAR(100),
    population_age_29 VARCHAR(100),
    population_age_30 VARCHAR(100),
    population_age_31 VARCHAR(100),
    population_age_32 VARCHAR(100),
    population_age_33 VARCHAR(100),
    population_age_34 VARCHAR(100),
    population_age_35 VARCHAR(100),
    population_age_36 VARCHAR(100),
    population_age_37 VARCHAR(100),
    population_age_38 VARCHAR(100),
    population_age_39 VARCHAR(100),
    population_age_40 VARCHAR(100),
    population_age_41 VARCHAR(100),
    population_age_42 VARCHAR(100),
    population_age_43 VARCHAR(100),
    population_age_44 VARCHAR(100),
    population_age_45 VARCHAR(100),
    population_age_46 VARCHAR(100),
    population_age_47 VARCHAR(100),
    population_age_48 VARCHAR(100),
    population_age_49 VARCHAR(100),
    population_age_50 VARCHAR(100),
    population_age_51 VARCHAR(100),
    population_age_52 VARCHAR(100),
    population_age_53 VARCHAR(100),
    population_age_54 VARCHAR(100),
    population_age_55 VARCHAR(100),
    population_age_56 VARCHAR(100),
    population_age_57 VARCHAR(100),
    population_age_58 VARCHAR(100),
    population_age_59 VARCHAR(100),
    population_age_60 VARCHAR(100),
    population_age_61 VARCHAR(100),
    population_age_62 VARCHAR(100),
    population_age_63 VARCHAR(100),
    population_age_64 VARCHAR(100),
    population_age_65 VARCHAR(100),
    population_age_66 VARCHAR(100),
    population_age_67 VARCHAR(100),
    population_age_68 VARCHAR(100),
    population_age_69 VARCHAR(100),
    population_age_70 VARCHAR(100),
    population_age_71 VARCHAR(100),
    population_age_72 VARCHAR(100),
    population_age_73 VARCHAR(100),
    population_age_74 VARCHAR(100),
    population_age_75 VARCHAR(100),
    population_age_76 VARCHAR(100),
    population_age_77 VARCHAR(100),
    population_age_78 VARCHAR(100),
    population_age_79 VARCHAR(100),
    population_age_80 VARCHAR(100),
    population_age_81 VARCHAR(100),
    population_age_82 VARCHAR(100),
    population_age_83 VARCHAR(100),
    population_age_84 VARCHAR(100),
    population_age_85 VARCHAR(100),
    population_age_86 VARCHAR(100),
    population_age_87 VARCHAR(100),
    population_age_88 VARCHAR(100),
    population_age_89 VARCHAR(100),
    population_age_90 VARCHAR(100),
    population_age_91 VARCHAR(100),
    population_age_92 VARCHAR(100),
    population_age_93 VARCHAR(100),
    population_age_94 VARCHAR(100),
    population_age_95 VARCHAR(100),
    population_age_96 VARCHAR(100),
    population_age_97 VARCHAR(100),
    population_age_98 VARCHAR(100),
    population_age_99 VARCHAR(100),
    population_age_100 VARCHAR(100),
    age VARCHAR(100),
    permutation_role VARCHAR(100),
    population VARCHAR(100),
    ISO_Code INT,
    PRIMARY KEY (ISO_Code,year,sex,age),
    FOREIGN KEY (ISO_Code) REFERENCES countries(ISO_Code)
);



















-- LOAD FILES

LOAD DATA INFILE "C:/Users/PC-023/Documents/GitHub/Vaseis2/countries.csv"
INTO TABLE countries
FIELDS TERMINATED BY ','
ENCLOSED BY '"'
LINES TERMINATED BY '\n'
IGNORE 1 ROWS;


LOAD DATA INFILE "C:/Users/PC-023/Documents/GitHub/Vaseis2/modified/modified_age_specific_fertility_rates.csv"
INTO TABLE age_specific_fertility_rates
FIELDS TERMINATED BY ','
ENCLOSED BY '"'
LINES TERMINATED BY '\n'
IGNORE 1 ROWS;


LOAD DATA INFILE "C:/Users/PC-023/Documents/GitHub/Vaseis2/modified/modified_birth_death_growth_rates.csv"
INTO TABLE birth_death_growth_rates
FIELDS TERMINATED BY ','
ENCLOSED BY '"'
LINES TERMINATED BY '\n'
IGNORE 1 ROWS;


LOAD DATA INFILE "C:/Users/PC-023/Documents/GitHub/Vaseis2/modified/modified_country_names_area.csv"
INTO TABLE country_names_area
FIELDS TERMINATED BY ','
ENCLOSED BY '"'
LINES TERMINATED BY '\n'
IGNORE 1 ROWS;


LOAD DATA INFILE "C:/Users/PC-023/Documents/GitHub/Vaseis2/modified/modified_midyear_population.csv"
INTO TABLE midyear_population
FIELDS TERMINATED BY ','
ENCLOSED BY '"'
LINES TERMINATED BY '\n'
IGNORE 1 ROWS;


LOAD DATA INFILE "C:/Users/PC-023/Documents/GitHub/Vaseis2/modified/modified_midyear_population_5yr_age_sex.csv"
INTO TABLE midyear_population_5yr_age_sex
FIELDS TERMINATED BY ','
ENCLOSED BY '"'
LINES TERMINATED BY '\n'
IGNORE 1 ROWS;


LOAD DATA INFILE "C:/Users/PC-023/Documents/GitHub/Vaseis2/modified/modified_midyear_population_age_sex.csv"
INTO TABLE midyear_population_age_sex
FIELDS TERMINATED BY ','
ENCLOSED BY '"'
LINES TERMINATED BY '\n'
IGNORE 1 ROWS;

LOAD DATA INFILE "C:/Users/PC-023/Documents/GitHub/Vaseis2/modified/modified_midyear_population_age_country_code.csv"
INTO TABLE midyear_population_age_country_code
FIELDS TERMINATED BY ','
ENCLOSED BY '"'
LINES TERMINATED BY '\n'
IGNORE 1 ROWS;


LOAD DATA INFILE "C:/Users/PC-023/Documents/GitHub/Vaseis2/modified/modified_mortality_life_expectancy.csv"
INTO TABLE mortality_life_expectancy
FIELDS TERMINATED BY ','
ENCLOSED BY '"'
LINES TERMINATED BY '\n'
IGNORE 1 ROWS;





LOAD DATA INFILE "C:/Users/PC-023/Documents/GitHub/Vaseis2/modified/modified_Domestic credits.csv"
INTO TABLE Domestic_credits
FIELDS TERMINATED BY ','
ENCLOSED BY '"'
LINES TERMINATED BY '\n'
IGNORE 1 ROWS;

LOAD DATA INFILE "C:/Users/PC-023/Documents/GitHub/Vaseis2/modified/modified_Estimated GNI female.csv"
INTO TABLE Estimated_GNI_female
FIELDS TERMINATED BY ','
ENCLOSED BY '"'
LINES TERMINATED BY '\n'
IGNORE 1 ROWS;


LOAD DATA INFILE "C:/Users/PC-023/Documents/GitHub/Vaseis2/modified/modified_Estimated GNI male.csv"
INTO TABLE Estimated_GNI_male
FIELDS TERMINATED BY ','
ENCLOSED BY '"'
LINES TERMINATED BY '\n'
IGNORE 1 ROWS;


LOAD DATA INFILE "C:/Users/PC-023/Documents/GitHub/Vaseis2/modified/modified_GDP per capita.csv"
INTO TABLE GDP_per_capita
FIELDS TERMINATED BY ','
ENCLOSED BY '"'
LINES TERMINATED BY '\n'
IGNORE 1 ROWS;


LOAD DATA INFILE "C:/Users/PC-023/Documents/GitHub/Vaseis2/modified/modified_GDP total.csv"
INTO TABLE GDP_total
FIELDS TERMINATED BY ','
ENCLOSED BY '"'
LINES TERMINATED BY '\n'
IGNORE 1 ROWS;


LOAD DATA INFILE "C:/Users/PC-023/Documents/GitHub/Vaseis2/modified/modified_GNI per capita.csv"
INTO TABLE GNI_per_capita
FIELDS TERMINATED BY ','
ENCLOSED BY '"'
LINES TERMINATED BY '\n'
IGNORE 1 ROWS;


LOAD DATA INFILE "C:/Users/PC-023/Documents/GitHub/Vaseis2/modified/modified_Gross fixed capital formation.csv"
INTO TABLE Gross_fixed_capital_formation
FIELDS TERMINATED BY ','
ENCLOSED BY '"'
LINES TERMINATED BY '\n'
IGNORE 1 ROWS;


LOAD DATA INFILE "C:/Users/PC-023/Documents/GitHub/Vaseis2/modified/modified_Income Index.csv"
INTO TABLE Income_Index
FIELDS TERMINATED BY ','
ENCLOSED BY '"'
LINES TERMINATED BY '\n'
IGNORE 1 ROWS;


LOAD DATA INFILE "C:/Users/PC-023/Documents/GitHub/Vaseis2/modified/modified_Labour share of GDP.csv"
INTO TABLE Labour_share_of_GDP
FIELDS TERMINATED BY ','
ENCLOSED BY '"'
LINES TERMINATED BY '\n'
IGNORE 1 ROWS;

