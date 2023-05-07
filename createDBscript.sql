CREATE SCHEMA IF NOT EXISTS vaseis2;
ALTER SCHEMA `vaseis2`  DEFAULT CHARACTER SET latin1  DEFAULT COLLATE latin1_bin;
SET GLOBAL local_infile =1;

USE vaseis2;
drop table if exists age_specific_fertility_rates;
drop table if exists birth_death_growth_rates;
drop table if exists countries;
drop table if exists country_names_area;
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

LOAD DATA INFILE "C:/Users/PC-023/Documents/GitHub/Vaseis2/countries.csv"
INTO TABLE countries
FIELDS TERMINATED BY ','
ENCLOSED BY '"'
LINES TERMINATED BY '\n'
IGNORE 1 ROWS;




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

LOAD DATA INFILE "C:/Users/PC-023/Documents/GitHub/Vaseis2/modified/modified_age_specific_fertility_rates.csv"
INTO TABLE age_specific_fertility_rates
FIELDS TERMINATED BY ','
ENCLOSED BY '"'
LINES TERMINATED BY '\n'
IGNORE 1 ROWS;






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

LOAD DATA INFILE "C:/Users/PC-023/Documents/GitHub/Vaseis2/modified/modified_birth_death_growth_rates.csv"
INTO TABLE birth_death_growth_rates
FIELDS TERMINATED BY ','
ENCLOSED BY '"'
LINES TERMINATED BY '\n'
IGNORE 1 ROWS;




CREATE TABLE IF NOT EXISTS country_names_area (
    country_code VARCHAR(100),
    country_name VARCHAR(100),
    country_area INT NOT NULL,
    ISO_Code INT,
    PRIMARY KEY (ISO_Code),
    FOREIGN KEY (ISO_Code) REFERENCES countries(ISO_Code)
);

LOAD DATA INFILE "C:/Users/PC-023/Documents/GitHub/Vaseis2/modified/modified_country_names_area.csv"
INTO TABLE country_names_area
FIELDS TERMINATED BY ','
ENCLOSED BY '"'
LINES TERMINATED BY '\n'
IGNORE 1 ROWS;

