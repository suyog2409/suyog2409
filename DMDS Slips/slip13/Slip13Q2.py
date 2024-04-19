#Q2.Write a Python program to read “StudentsPerformance.csv” file. Solvefollowing:
#- To display the shape of dataset.
#- To display the top rows of the dataset with their columns.Note: Download
#dataset from following link :
#(https://www.kaggle.com/spscientist/students-performance-inexams?
#select=StudentsPerformance.csv)

import pandas as pd
df=pd.read_csv('StudentsPerformance.csv')
print("Dataset: ")
print(df)
print("Shape of dataset: ")
print(df.shape)
print("\nTop rows of the dataset: ")
print(df.head())

