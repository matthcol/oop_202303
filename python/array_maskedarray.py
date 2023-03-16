import numpy as np
import pandas as pd

dfMeteo: pd.DataFrame = pd.read_csv('04-station-meteo-toulouse-ile-empalot.csv', sep=";")
temperatures: np.ndarray = dfMeteo['temperature'].values
temperaturesOk: np.ma.MaskedArray = np.ma.masked_less(temperatures, -48)

# toutes les méthodes de calcul sont redéfinies
print("Raw data minimum:", temperatures.min())
print("Minimum (with mask):", temperaturesOk.min())

# principe LSP: un MaskedArray est un ndarray, est un object
print("ma is as MaskedArray ?", isinstance(temperaturesOk, np.ma.MaskedArray))
print("ma is as ndarray ?", isinstance(temperaturesOk, np.ndarray))
print("ma is as object ?", isinstance(temperaturesOk, object))
print("array is as MaskedArray ?", isinstance(temperatures, np.ma.MaskedArray))