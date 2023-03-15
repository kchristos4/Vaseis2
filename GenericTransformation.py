import pandas as pd
import os,subprocess

subprocess.run("cls" if subprocess.os.name == "nt" else "clear", shell=True)

files = os.listdir(os.getcwd())
print(files)
tempFiles= []
for file in files:
    if file.split('.')[1] == "csv":
        if not (file.split('.')[0][:8] == 'modified'):
            tempFiles.append(file)
files = tempFiles
files.remove('countries.csv')
for f in files:
    print(f)


columns_of_countries = [['ISO',2],['ISO3',3],['ISO_Code',0],['FIPS',2],['Display_Name',-1],['Official_Name',-1]]
#-1 -> N CHARACTERS STRING
# 0  -> N CHARACTERS ONLY INTS
# 2  -> 2 CHARACTERS
# 3  -> 3 CHARACTERS

for i in range(len(files)):
    print(f" {i} : {files[i]}")
fileToMatch = files[int(input(f"choose file number (0 - {len(files)-1}) : "))]
print(fileToMatch)

columnsToMatch = []
column = ''
while column != '-1':
    column = input(f"choose column to match (if -1 no more arguments will be given): ")
    if column!='-1':
        columnsToMatch.append(column)

df1 = pd.read_csv(fileToMatch)
df_countries = pd.read_csv('countries.csv',encoding='latin-1')


#keep a copy to check original table
df_copy = df1
tempTypeList = []
for col in columnsToMatch:
    columnLengths = [len(i) for i in df1[col]]
    minLength = min(columnLengths)
    maxLength = max(columnLengths)
    diff = maxLength-minLength
    if diff == 0:
        if maxLength == 2:
            tempTypeList.append(2)
        elif maxLength ==3:
            tempTypeList.append(3)
    else:
        if df1[col].dropna().iloc[1].isalpha() :
            tempTypeList.append(-1) #string
        elif not (df1[col].dropna().iloc[1].isalpha()):
            tempTypeList.append(0)  #integer
    
print(tempTypeList)
columnsToMatch = [[columnsToMatch[i],tempTypeList[i]] for i in range(len(columnsToMatch))]
print(columnsToMatch)
'''

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


print(df_age_specific_fertility_rates)


df_age_specific_fertility_rates.to_csv('modified_age_specific_fertility_rates.csv',index=False)




############################################################################
# #check missing countries
merged_df2 = pd.merge(df_age_specific_fertility_rates, df_copy, on='country_name', how='right',indicator=True)

missing_rows = merged_df2[merged_df2['_merge']== 'right_only']

print(missing_rows['country_name'].unique())
#print(missing_rows)
#print(df_countries['Display_Name'].unique())

fert_country_codes = df_age_specific_fertility_rates['country_code'].unique()
countries_country_codes = df_countries['ISO'].unique()
#print(list(set(fert_country_codes)-set(countries_country_codes)))
############################################################################
'''