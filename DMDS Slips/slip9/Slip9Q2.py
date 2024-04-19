#Q2. Write a Python program to build an SVM model to Cancer dataset. The dataset is
#available in the scikit-learn library. Check the accuracyof model with precision and
#recall.

#Import scikit-learn dataset library
from sklearn import datasets
#Load dataset
cancer = datasets.load_breast_cancer()
# print the names of the 13 features
print("Features: ", cancer.feature_names)
# print the label type of cancer('malignant' 'benign')
print("Labels: ", cancer.target_names)
print("Display data(feature)shape")
print(cancer.data.shape)
print("Display the cancer data features (top 5 records")
print(cancer.data[0:5])
print("Display cancer labels (0:malignant, 1:benign")
print(cancer.target)
# Import train_test_split function
from sklearn.model_selection import train_test_split
# Split dataset into training set and test set
X_train, X_test, y_train, y_test = train_test_split(cancer.data, cancer.target,
test_size=0.3,random_state=109) # 70% training and 30% test
#Import svm model
from sklearn import svm
#Create a svm Classifier
clf = svm.SVC(kernel='linear') # Linear Kernel
#Train the model using the training sets
clf.fit(X_train, y_train)
#Predict the response for test dataset
y_pred = clf.predict(X_test)
#Import scikit-learn metrics module for accuracy calculation
from sklearn import metrics
print("################################################################# \n y-test
val",y_test)
print("################################################################# \n y-
predicted val",y_pred)
# Model Accuracy: how often is the classifier correct?
print("Accuracy:",metrics.accuracy_score(y_test, y_pred))

