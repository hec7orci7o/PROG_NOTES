#!/usr/bin/env python
#_*_ coding: utf8 _*_

import paquete.calculos as calc
#from paquete import calculos as calc

PRI_OP = 1
ULT_OP = 5

def menu():
	print("__CALCULADORA-BASICA__")
	print("1-Suma")
	print("2-Resta")
	print("3-Multiplicacion")
	print("4-Division")
	print("5-Potencia")
	print("0-EXIT")
	return int(input("Ingrese la opcion: "))

def main():
	while True:
		try:
			opcion = menu()
			if PRI_OP <= opcion <= ULT_OP:
				A = int(input("Valor A: "))
				B = int(input("Valor B: "))
			
			if opcion == 0:
				print("Hasta pronto.")
				exit()
			elif opcion == 1:     # A + B
				result = calc.suma(A, B)
				print(f"{A} + {B} = {result}")
			elif opcion == 2:   # A - B
				result = calc.resta(A, B)
				print(f"{A} - {B} = {result}")
			elif opcion == 3:   # A * B
				result = calc.multiplicacion(A, B)
				print(f"{A} * {B} = {result}")
			elif opcion == 4:   # A / B
				result = calc.division(A, B)
				print(f"{A} / {B} = {result}")
			elif opcion == 5:   # A ^ B
				result = calc.potencia(A, B)
				print(f"{A} ^ {B} = {result}")
			else:
				raise IOError
		except IOError:
			print("Operacion no valida.")
			exit()
			
if __name__ == '__main__':
	try:
		main()
	except KeyboardInterrupt:
		print("\nOcurrio algo imprevisto...")
		exit()