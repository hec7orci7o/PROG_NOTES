#!/usr/bin/env python
#_*_ coding: utf8 _*_

# __LISTAS__
lista_1 = list()
lista_2 = []

# Add elements
lista_3 = [1,2,3,True,False,"HOLA"]     # Ddominio: 0-N

# Elemento de la lista
lista_3[<posicion>]

# Rercorer lista
for element in lista_3:
    print(element)

lista_3[<posicion>:]    # Desde posicion hasta el final
lista_3[:<posicion>]    # Desde el princpio hasta el final
lista_3[<pos1>:<pos2>]  # Desde una pos1 hasta una pos2 - 1

# __FUNCIONES__
len(lista_3)            # Num elementos en una lista
lista_3.append()        # Introduce un nuevo dato a la lista
lista_3.pop()           # Quita el ultimo elemento de una lista
del lista_3(<posicion>) # Elimina un dato de la lista situado en la posicion: <posicion>
lista = ''.join(lista3) # Une los elementos de una lista en un string