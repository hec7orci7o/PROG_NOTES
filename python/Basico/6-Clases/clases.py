#!/usr/bin/env python
#_*_ coding: utf8 _*_

int tonelada = 1000

# Las funciones de las clases siempre deben llevar argumentos
class coche(object):
    def __init__(self,puertas,pesoMedioPersona,plazasOcup,pesoCoche):
        self.puertas = puertas
        self.pesoMedioPersona = pesoMedioPersona
        self.plazasOcup = plazasOcup
        self.pesoCoche = pesoCoche
        # pass      Permite que una funcion no de error si esta vacia
    
    @classmethod    # Permite llamar a la funcion sin usar un objeto
    def numPuertas(cls):
        print(self.numPuertas)

    @staticmethod   # Permite usar la funcion en un clase sin mandarle argumentos
    def brumbrum():
        print("brum brum")

    @property       # Permite tratar la funcion como una variable
    def pesoMedioCoche(self):
        return self.pesoMedioPersona * self.plazasOcup + self.pesoCoche

def main():
    c = coche(4,80,3,2*tonelada)     # Creo un objeto tipo coche
    c.numPuertas()
    c.brumbrum()
    print(c.pesoMedioCoche)

if __name__ == "__main__":
    main()