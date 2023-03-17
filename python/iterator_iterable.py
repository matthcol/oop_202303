from pathlib import Path
import itertools 

cities = [ "Toulouse", "Pau", "Paris", "Bordeaux", "Madrid", "Narbonne" ]

for city in cities:
    print(city)

for i, city in enumerate(cities, start=1):
    print(i, "-", city)

it = iter(cities) # <list_iterator at 0x1c8c8ff87f0>
city = next(it) # Toulouse ... Narbonne puis exception StopIteration 

it2 = iter(it) # un iterator est iterable en se renvoyant lui même
assert it is it2

g = (city.upper() for city in cities)
# <generator object <genexpr> at 0x0000016A1F9F0270>
# un generator est un iterator iterable
print(next(g))  # next value (iterator)
print(next(g))
print(list(g))  # consomme le reste du generator => list

z = zip(cities, (city.upper() for city in cities), iter(cities))
# z is a lazy zip object
l = list(z) # on revrse dans une liste
print(l)

def infinite_iterator(l: list):
    i = 0
    n = len(l)
    if n == 0:
        return
    while True:
        yield l[i]
        i = (i+1) % n

for i, city in zip(range(2*len(cities)), infinite_iterator(cities)):
    print(i, city)

it = infinite_iterator(cities)


print("\nCode écrit pendant le stage:")
dirCode = Path().absolute().parent
for sourceCode in itertools.chain( 
    dirCode.rglob('*.py'),
    dirCode.rglob('*.cpp'),
    dirCode.rglob('*.h'),
    dirCode.rglob('*.java')
):
    print(sourceCode)

extensions = ['py', 'cpp', 'h', 'java']
dirCode