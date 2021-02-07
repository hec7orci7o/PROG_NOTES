#!/usr/bin/env python
#_*_ coding: utf8 _*_

from Wappalyzer import WebPage, Wappalyzer


def main():
    wap = Wappalyzer.latest()
    try:
        web = WebPage.new_from_url("https://example.com/")  # Escanea la web: "la web"
        tecnologias = wap.analyze(web)  # Es un dato tipo lista
        for tec in tecnologias:
            print(f"Tecnologia detectada: {tec}")
    except:
        print("Ocurrio un error")

if __name__ == '__main__':
    try:
        main()
    except KeyboardInterrupt:
        print("Saliendo.")
        exit()