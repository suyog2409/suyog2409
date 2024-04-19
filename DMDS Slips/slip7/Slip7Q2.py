#Q2. Consider the following observations/data. And apply simple linear regression and find out
#estimated coefficients b1 and b1 Also analyse theperformance of the model
#(Use sklearn package)
#x = np.array([1,2,3,4,5,6,7,8])
#y = np.array([7,14,15,18,19,21,26,23])

import numpy as np
from sklearn.linear_model import LinearRegression
from sklearn.metrics import mean_squared_error, r2_score
# Step 2: Prepare the data
x = np.array([1, 2, 3, 4, 5, 6, 7, 8]).reshape(-1, 1) # Reshape to a 2D array
y = np.array([7, 14, 15, 18, 19, 21, 26, 23])
# Step 3: Create and fit the linear regression model
model = LinearRegression()
model.fit(x, y)
# Step 4: Analyze the estimated coefficients and model performance
b0 = model.intercept_ # Intercept (b0)
b1 = model.coef_[0]
# Coefficient (b1)
# Model performance metrics
y_pred = model.predict(x)
mse = mean_squared_error(y, y_pred)
r2 = r2_score(y, y_pred)
# Print the results
print(f"Estimated Coefficient (b0): {b0}")
print(f"Estimated Coefficient (b1): {b1}")
print(f"Mean Squared Error (MSE): {mse}")
print(f"R-squared (R2): {r2}")

