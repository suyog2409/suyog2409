#Q2.Consider the student data set It can be downloaded from:
#https://drive.google.com/open?id=1oakZCv7g3mlmCSdv9J8kdSaqO 5_6dIOw .
#Write a programme in python to apply simple linear regression and find out mean
#absolute error, mean squared error and root mean squared error.

import numpy as np
import pandas as pd
from sklearn.model_selection import train_test_split
from sklearn.linear_model import LinearRegression
from sklearn.metrics import mean_absolute_error, mean_squared_error
# Load your dataset
# Replace 'your_dataset.csv' with the path to your dataset
data = pd.read_csv('/home/hp/Desktop/Demo/student_scores.csv')
# Assuming you have two columns: 'X' and 'Y', where 'X' is the independent variable, and 'Y' is the
dependent variable.
X = np.array(data['Hours']).reshape(-1, 1)
y = np.array(data['Scores'])
# Split the data into training and testing sets
X_train, X_test, y_train, y_test = train_test_split(X, y, test_size=0.2, random_state=1)
# Fit a linear regression model
reg = LinearRegression()
reg=reg.fit(X_train,y_train)
# Make predictions on the test set
y_pred = reg.predict(X_test)
# Calculate Mean Absolute Error (MAE)
mae = mean_absolute_error(y_test, y_pred)
# Calculate Mean Squared Error (MSE)
mse = mean_squared_error(y_test, y_pred)
# Calculate Root Mean Squared Error (RMSE)
rmse = np.sqrt(mse)
# Print the results
print(f"Mean Absolute Error (MAE): {mae:.2f}")
print(f"Mean Squared Error (MSE): {mse:.2f}")
print(f"Root Mean Squared Error (RMSE): {rmse:.2f}")

