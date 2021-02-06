#!/usr/bin/env python
#_*_ coding: utf8 _*_

try:
    while True:
        print("Hey Wuachin!!")
except NameError:
    print("Sentencia no definida")
except KeyboardInterrupt:
    print("Parada forzada")
finally:    # Opcional | Se ejecuta siempre haya o no un error
    print("Fin de ejecucion")

# raise crea un error:
try:
    int dato = input("Introduzca un numero par: ")
    if (dato%2 == 0):
        print("El numero es par")
    else:
        raise IOError
except IOError:
    print("ERROR: El numero es impar")