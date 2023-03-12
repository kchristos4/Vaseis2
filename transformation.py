import pandas as pd
import os,subprocess

subprocess.run("cls" if subprocess.os.name == "nt" else "clear", shell=True)

df_countries = pd.read_csv('countries.csv',encoding='latin-1')
df_age_specific_fertility_rates = pd.read_csv('age_specific_fertility_rates.csv')

#keep a copy to check original table
df_copy = df_age_specific_fertility_rates


merged_df = pd.merge(df_countries[['ISO_Code', 'Display_Name']], df_age_specific_fertility_rates[['country_name', 'country_code']], left_on='Display_Name', right_on='country_name')
merged_df1 = pd.merge(df_countries[['ISO_Code', 'ISO']], df_age_specific_fertility_rates[['country_name', 'country_code']], left_on='ISO', right_on='country_code')

#merged on DisplayName/country_name , merged1 on country_code/ISO
merged_df = merged_df.drop(['Display_Name','country_code'],axis=1).drop_duplicates()
merged_df1 = merged_df1.drop(['country_name','country_code'],axis=1).drop_duplicates()

#14072 entries
df_age_specific_fertility_rates_on_Name = pd.merge(df_age_specific_fertility_rates,merged_df,on = 'country_name')
#10284 entries
df_age_specific_fertility_rates_on_ISO = pd.merge(df_age_specific_fertility_rates,merged_df1,left_on = 'country_code',right_on='ISO').drop('ISO',axis=1)

name_country_codes = df_age_specific_fertility_rates_on_Name['country_code'].unique()


#738 entries 
df_rows_in_ISO_missing_from_NAME = df_age_specific_fertility_rates_on_ISO[~df_age_specific_fertility_rates_on_ISO['country_code'].isin(name_country_codes)]

df_age_specific_fertility_rates = pd.concat([df_rows_in_ISO_missing_from_NAME,df_age_specific_fertility_rates_on_Name])


'''print(df_age_specific_fertility_rates)
'''




############################################################################
# #check missing countries
merged_df2 = pd.merge(df_age_specific_fertility_rates, df_copy, on='country_name', how='right',indicator=True)

missing_rows = merged_df2[merged_df2['_merge']== 'right_only']

print(missing_rows['country_name'].unique())
'''print(missing_rows)
print(df_countries['Display_Name'].unique())'''

fert_country_codes = df_age_specific_fertility_rates['country_code'].unique()
countries_country_codes = df_countries['ISO'].unique()
'''print(list(set(fert_country_codes)-set(countries_country_codes)))
'''############################################################################
