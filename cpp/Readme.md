# Build C applications
Without make, cmake or other build tools, you can use the following command lines

## Compilation avec msvc
### cmd prompt
cl /Feapp.exe /EHsc src\*.cpp

## Compilation avec g++
g++ src/*.cpp -o app

g++ src\*.cpp -o app.exe

## Clean
### g++
rm *.o app

delete *.o *.exe

### msvc
delete *.obj *.exe *.ilk