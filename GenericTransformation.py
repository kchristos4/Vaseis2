import pandas as pd
import os,subprocess

subprocess.run("cls" if subprocess.os.name == "nt" else "clear", shell=True)

files = os.listdir(os.getcwd())
if not os.path.exists("modified"):
    os.mkdir("modified")
print(files)

tempFiles= []
#if a file is a folder remove it from the list
for file in files:
    if os.path.isdir(file):
        files.remove(file)

#get the correct csv files
for file in files:
    if (file.split('.')[1] == "csv") or (file.split('.')[1] == "xlsx"):
        print(file.split('.')[1])
        if not (file.split('.')[0][:8] == 'modified'):
            tempFiles.append(file)
files = tempFiles
files.remove('countries.csv')



columns_of_countries = [['ISO',2],['ISO3',3],['ISO_Code',0],['FIPS',2],['Display_Name',-1],['Official_Name',-1]]
#-1 -> N CHARACTERS STRING
# 0  -> N CHARACTERS ONLY INTS
# 2  -> 2 CHARACTERS
# 3  -> 3 CHARACTERS


def ModifyFile(fileToMatch,columnsToMatch):
    print(f"Modifying file named '{fileToMatch}' ...")
    if fileToMatch.split('.')[1] == "xlsx":
        #split into temp csv files
        excelFile = pd.read_excel(fileToMatch,sheet_name=None)
        for sheet_name,df in excelFile.items():
            csv_file_name = f"temp_{sheet_name}.csv"
            df = df.applymap(lambda x: pd.to_numeric(x, errors='ignore'))
            df.to_csv(csv_file_name,index=False)

        #get all temp csv files
        all_csv_files =  os.listdir(os.getcwd())
        temp_csv_files = []
        print(all_csv_files)
        for file in all_csv_files:
            print(file)
            if os.path.isdir(file):
                all_csv_files.remove(file)
            
            if (file.split('.')[0][:5] == 'temp_'):
                temp_csv_files.append(file)
        
        for i in temp_csv_files:
            ModifyFile(i,columnsToMatch)
        
        writer = pd.ExcelWriter('modified\modified_'+fileToMatch, engine='xlsxwriter')
        for file in temp_csv_files:
            
            df = pd.read_csv('modified/modified_'+file)
            df = df.applymap(lambda x: pd.to_numeric(x, errors='ignore'))
            sheetName = file.split('.')[0][6:]
            df.to_excel(writer,sheet_name=sheetName, index=False)
            os.remove('modified/modified_'+file)
            os.remove(file)
        writer.save()
        



        
    else:

        df1 = pd.read_csv(fileToMatch)
        columnsToMatch = [i for i in columnsToMatch if i in df1.columns]
        df_countries = pd.read_csv('countries.csv',encoding='latin-1')


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
            
        columnsToMatch = [[columnsToMatch[i],tempTypeList[i]] for i in range(len(columnsToMatch))]






        #find all dataframes created from matching Country columns with ourCSVfile columns
        all_dataframes = []
        for col in columnsToMatch:
            col_name = col[0]
            col_type = col[1]
            matching_columns_from_countries = [i for i in columns_of_countries if i[1]==col_type]
            dataframes_for_this_column_matching = []
            for c in matching_columns_from_countries:
                temp_df = pd.merge(df_countries[['ISO_Code', c[0]]], df1[[col_name]], left_on=c[0], right_on=col_name)
                temp_df = temp_df.drop([c[0]],axis=1).drop_duplicates()
                temp_df1 = pd.merge(df1,temp_df,on=col_name)
                dataframes_for_this_column_matching.append([temp_df1,[c[0],col_name]])
                
            all_dataframes.append(dataframes_for_this_column_matching)



        counter = 0
        if all_dataframes!=[]:
            counter = sum(len(i) for i in all_dataframes)
            if counter!=0:
                #find most effective matching and remove it from all_dataframes
                maxShape=-1
                most_effective_df = pd.DataFrame()
                ptr_to_all_dataframes = -1
                ptr_to_subList = -1
                i=-1
                for subList in all_dataframes:
                    i+=1
                    j=-1
                    for df in subList:
                        j+=1
                        if df[0].shape[0] > maxShape:
                            maxShape = df[0].shape[0]
                            most_effective_df = df[0]
                            merged_on = df[1][1]
                            ptr_to_all_dataframes = i
                            ptr_to_subList = j
                del all_dataframes[ptr_to_all_dataframes][ptr_to_subList]
                        


            counter-=1

        while counter>0:
            counter-=1

            #find next most effective matching and remove it from all_dataframes
            maxShape=-1
            second_most_effective_df = pd.DataFrame()
            ptr_to_all_dataframes = -1
            ptr_to_subList = -1
            i=-1
            for subList in all_dataframes:
                i+=1
                j=-1
                for df in subList:
                    j+=1
                    if df[0].shape[0] > maxShape:
                        maxShape = df[0].shape[0]
                        second_most_effective_df = df[0]
                        merged_on = df[1][1]
                        ptr_to_all_dataframes = i
                        ptr_to_subList = j
            del all_dataframes[ptr_to_all_dataframes][ptr_to_subList]

            #find all rows in second most effective that dont exist in most effective
            uniques_from_most_effective = most_effective_df[merged_on].unique()
            rows_in_second_missing_from_first = second_most_effective_df[~second_most_effective_df[merged_on].isin(uniques_from_most_effective)]

            #our new most effective is the previous mostEffective += second most effective (ex. 14072 + 738 = 14810 rows)
            most_effective_df = pd.concat([most_effective_df,second_most_effective_df])

            #create the modified csv
            
            modified_File_Name = 'modified\modified_'+fileToMatch
            most_effective_df.to_csv(modified_File_Name,index=False)





for i in range(len(files)):
    print(f" {i} : {files[i]}")

print()
filePosition = input(f"choose file number [0 - {len(files)-1}] ( -1 -> Modify all csv files in folder ) : ")

columnsToMatch = []
column = ''
while column != '-1':
    column = input(f"choose column to match (if -1 no more arguments will be given): ")
    if column!='-1':
        columnsToMatch.append(column)

if filePosition == '-1':
    for i in range(len(files)):
        ModifyFile(files[int(i)],columnsToMatch)
else:
    ModifyFile(files[int(filePosition)],columnsToMatch)

