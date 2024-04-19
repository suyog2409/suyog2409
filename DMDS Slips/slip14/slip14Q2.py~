#Q2. Write a Python Programme to apply Apriori algorithm on Groceries dataset. Dataset
#can be downloaded from
#(https://github.com/amankharwal/Websitedata/blob/master/Groceries
#_dataset.csv).
#Also display support and confidence for each rule.

import numpy as np
import pandas as pd
import apyori
from apyori import apriori
data = pd.read_csv('Groceries_dataset.csv')
data.head()
transactions = []
for i in range(0, 10):
transactions.append([str(data.values[i,j]) for j in range(0, 3)])
rules = apriori(transactions, min_support = 0.00030, min_confidence = 0.05, min_lift = 3,
max_length = 2, target = "rules")
association_results = list(rules)
print(association_results[0])
for item in association_results:
pair = item[0]
items = [x for x in pair]
print("Rule : ", items[0], " -> " + items[1])
print("Support : ", str(item[1]))
print("Confidence : ",str(item[2][0][2]))
print("Lift : ", str(item[2][0][3]))
print("=============================")

