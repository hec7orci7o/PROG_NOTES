#!/usr/bin/env python
#_*_ coding: utf8 _*_

# __TEST__
nombre = "Pepe"
edad   = 15
pais   = "Somalia"

# __ESCRITURA_FICHEROS__
archivo = open("test.txt","w")
archivo.write(nombre + "\n")
archivo.write(edad + "\n")
archivo.write(pais + "\n")
archivo.close()

# __ADD_FICHEROS__
archivo = open("test.txt","a")
...
archivo.close()

# __LECTURA_FICHEROS__
archivo = open("test.txt","r")
lista = archivo.read().split("\n")
for n in lista:
    print(n)
archivo.close()