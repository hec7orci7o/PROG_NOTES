#!/usr/bin/env python
#_*_ coding: utf8 _*_

# Caracteristicas:
# - Inmutables

# __TUPLAs__
tupla_1 = tuple()
tupla_2 = ()

# Elements
tupla_3 = (1,2,3,True,False,"HOLA")     # Ddominio: 0-N

# Rercorer tupla
for element in tupla_3:
    print(element)

tupla_3[<posicion>:]    # Desde posicion hasta el final
tupla_3[:<posicion>]    # Desde el princpio hasta el final
tupla_3[<pos1>:<pos2>]  # Desde una pos1 hasta una pos2 - 1