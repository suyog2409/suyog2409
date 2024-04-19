#Q2. Consider following dataset
#weather=['Sunny','Sunny','Overcast','Rainy','Rainy','Rainy','Overcast','Sunny','Sunny','Rainy','Sunn
#y','Overcast','Overcast','Rainy']
#temp=['Hot','Hot','Hot','Mild','Cool','Cool','Cool','Mild','Cool','Mild','Mild','Mild','Hot','Mild']
#play=['No','No','Yes','Yes','Yes','No','Yes','No','Yes','Yes','Yes','Yes','Yes','No'].
#Use Naïve Bayes algorithm to predict [0: Overcast, 2: Mild]tuple belongs to which class
#whether to play the sports or not.

# Assigning features and label variables
weather=['Sunny','Sunny','Overcast','Rainy','Rainy','Rainy','Overcast','Sunny','Sunny','Rainy','Sunny'
,'Overcast','Overcast','Rainy']
temp=['Hot','Hot','Hot','Mild','Cool','Cool','Cool','Mild','Cool','Mild','Mild','Mild','Hot','Mild']
play=['No','No','Yes','Yes','Yes','No','Yes','No','Yes','Yes','Yes','Yes','Yes','No']
# Import LabelEncoder
from sklearn import preprocessing
#creating labelEncoder
le = preprocessing.LabelEncoder()
# Converting string labels into numbers.
encoded_weather=le.fit_transform(weather)
print (encoded_weather)
# Converting string labels into numbers
temp_encoded=le.fit_transform(temp)
y=le.fit_transform(play)
print ("Temp:",temp_encoded)
print ("Play:",y)
#Combinig weather and temp into single listof tuples
X = list(zip(encoded_weather, temp_encoded))
#features=zip(wheather_encoded,temp_encoded)
#Import Gaussian Naive Bayes model
from sklearn.naive_bayes import GaussianNB
#Create a Gaussian Classifier
model = GaussianNB()
# Train the model using the training sets
model.fit(X,y)
predicted= model.predict([[0,2]]) # 0:Overcast, 2:Mild
print("Predicted Value:", predicted)

