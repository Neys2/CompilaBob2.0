cd C:\Users\selen\Escritorio\CompilaBob2.0\Compila-Bob
DEL Ensamblador.s
g++ cCode.cpp -o ExeCode
gcc -S cCode.cpp
ren cCode.S Ensamblador.s
title Ejecucion
cls
ExeCode.exe