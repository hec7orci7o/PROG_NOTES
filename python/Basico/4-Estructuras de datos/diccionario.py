#!/usr/bin/env python
#_*_ coding: utf8 _*_

# __DICCIONARIO__
diccionario_1 = dict()
diccionario_2 = {}

# Elements
diccionario_1 = dict(name1="hector",nota1="7",name2="javi",nota2="8")
diccionario_2 = {name1="hector",nota1="7",name2="javi",nota2="8"}       # Dominio: 0-N

# __FUNCIONES__

print(diccionario)  # Imprime el diccionario
# items
a = diccionario_1.items()       # Hace tuplas de un diccionario
# copy
copia = diccionario_2.copy()    # Copia el contenido de un diccionario en la variable "copia"
# keys
keys = diccionario_1.keys()
# values
keys = diccionario_1.values()

# Rercorer diccionario
for key in diccionario_1.keys():
    print(f"key={key}, value={diccionario_1[n]}")