#Q2. Write a Python Programme to read the dataset (“Iris.csv”). dataset download from
#(https://archive.ics.uci.edu/ml/datasets/iris) and apply Apriori algorithm.

import io
import pandas as pd
from apyori import apriori
df = pd.read_csv('Iris.csv',header=None)
df=df.dropna()
print("Given dataset \n", df)
transactions = []
for i in range(0, len(df)):
transactions.append([str(df.values[i,j]) for j in range(0, len(df.columns))])
print("After concerting to transacations \n\n",transactions)
from apyori import apriori
rules = apriori(transactions, min_support = 0.06, min_confidence = 0.6, min_lift = 3, min_length =
3)
#Visualising
rules = list(rules)
print("Rules Generated are \n")
print(rules[0],"\n","\n")
print("***************************************************************\n\nRules in
formatted manner \n\n")
for i in range(0, len(rules)):
print(rules[i][0])

