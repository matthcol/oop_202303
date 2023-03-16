import numpy as np
import matplotlib.pyplot as plt

# instance = objet de la classe ndarray
data = np.random.normal(10,4, 100000)

# get class
print("class:",  type(data))

# some attributes
print(data.shape)
print(data.dtype)
print(data.flags)

# some methods
mean_data = data.mean()
print("mean:", mean_data)

std_data = data.std()
print("mean:", std_data)

data_2d = data.reshape((100,1000))
print(data_2d.shape)
print(data_2d.T.shape)
print(data_2d.mean())
print(data_2d.std())

# other instances of class ndarray
x = np.linspace(0, 2*np.pi, 100000)
y = np.sin(x)
print("class of x:", type(x))
print("class of y:", type(y))

plt.plot(x,y)
plt.show()