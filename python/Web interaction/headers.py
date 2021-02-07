#!/usr/bin/env python
#_*_ coding: utf8 _*_

import requests # pip install request
import argparse # pip install argparse

# parser es un objeto de la clase: "argparse"
parser = argparse.ArgumentParser(description="Detector de cabeceras")    # description es la descripcion para nuestro objeto
parser.add_argument('-t','--target',help="Objetivo")                     # -t, --target son flags/argumento del objeto: "parser",
                                                                         # serán visibles mediante: "-h" o "--help"
parser = parser.parse_args()    # Deja los argumentos/flags disponibles al usuario

def main():
    if parser.target:
        try:
            url = requests.get(url=parser.target)
            cabeceras = dict(url.headers)   # url.headers guarda la info de la web de forma similar a un diccionario
            for elemento in cabeceras:
                print(elemento + " : " + cabeceras[elemento])
        except:
            print("No se estableció la conexion")
    else:
        print("No hay un objetivo")

if __name__ == '__main__':
    try:
        main()
    except KeyboardInterrupt:
        print("Saliendo.")
        exit()