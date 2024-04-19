#Q2. Write a Python program build Decision Tree Classifier for shows.csvfrom pandas and
#predict class label for show starring a 40 years old American comedian, with 10
#years of experience, and a comedy ranking of 7? Create a csv file as shown in
#https://www.w3schools.com/python/python_ml_decision_tree.asp

import pandas
from sklearn import tree
import pydotplus
from sklearn.tree import DecisionTreeClassifier
import matplotlib.pyplot as plt
import matplotlib.image as pltimg
df=pandas.read_csv("shows.csv")
d={'UK':0,'USA':1,'N':2}
df['Nationality']=df['Nationality'].map(d)
print(df)
d={'YES':1,'NO':0}
df['Go']=df['Go'].map(d)
features = ['Age','Experiance','Rank','Nationality']
x = df[features]
y = df['Go']
dtree=DecisionTreeClassifier()
dtree=dtree.fit(x,y)
data=tree.export_graphviz(dtree,out_file=None, feature_names=features)
graph=pydotplus.graph_from_dot_dta(data)
graph.write_png('mydicisionhtree.png')
img=pltimg.imread('mydicisionhtree.png')
imgplot=plt.imshow(img)
plt.show()

