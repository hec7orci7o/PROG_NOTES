#!/usr/bin/env python
#_*_ coding: utf8 _*_

import requests # pip install request
import argparse # pip install argparse
from os import path

parser = argparse.ArgumentParser()
parser.add_argument('-f', '--file', help="Indica el archivo que se quiere subir")
parser = parser.parse_args()

def main():
    if parser.file:
        if path.exists(parser.file):    # Comprueba que exista la ruta del ficheroa subir
            archivo = open(parser.file, 'rb')   # Abre el fichero como binario
            headers = {'User-Agent':'Brave'}    # Cabecera donde se subirá
            peticion = requests.post(url="https://curso--python-0-prueba-pentest1.000webhostapp.com/",files={'uploaded_file':archivo}, headers=headers)
            if parser.file in peticion.text:
                # print(peticion.text) # Imprime la respuesta optenida con la direccion del archivo subido
                print("Archivo subido.")
            else:
                print("Fallo al subir el archivo.")
        else:
            print("No existe el archivo.")
    else:
        print("Se necesita un fichero.")

if __name__ == '__main__':
    try:
        main()
    except KeyboardInterrupt:
        print("Saliendo.")
        exit()