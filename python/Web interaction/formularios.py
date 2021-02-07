#!/usr/bin/env python
#_*_ coding: utf8 _*_

import mechanize
import argparse
from bs4 import BeautifulSoup   # para formatear busquedas

parser = argparse.ArgumentParser()
parser.add_argument("-b","--buscar",help="opcion a buscar")
parser = parser.parse_args()

def main():
    if parser.buscar:
        bus = mechanize.Browser()       # creamos un objeto del navegador en la variable: "bus"
        bus.set_handle_robots(False)    # Evita el seguimiento de estos para evitar errores
        bus.set_handle_equiv(False)
        bus.addheaders = [('User-Agent','Brave')]   # Mechanize acepta tupla, usamos un tupla dentro de una lista.
        bus.open("https://www.google.com")          # Abrimos el sitio web
        
        bus.select_form(nr=0)       # nr=0 ya que al haber un unico text-control y ser esto una lista, va de 0-n entonces como es solo una es 0
        bus['q'] = parser.buscar    # La letra "q" era la que contenia la lista
        bus.submit()
        p = BeautifulSoup(bus.response().read(),'html5lib')
        for link in p.find_all('a'):
            u = link.get('href')
            u = u.replace('/url?q=','')
            print(u)
    else:
        print("Palabra a buscar")

if __name__ == '__main__':
    try:
        main()
    except KeyboardInterrupt:
        print("Saliendo.")
        exit()