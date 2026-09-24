## Enunciado
Realizar un programa que permita ingresar una tabla inicial, una tabla final y el multiplicador hasta el cual se desea calcular. El programa debe mostrar las tablas de multiplicar desde la tabla inicial hasta la tabla final. Si la tabla inicial es mayor que la tabla final, debe mostrar un mensaje de error.

## Analisis
Entrada<br>
-Ingresar la tabla inicial.<br>
-Ingresar la tabla final.<br>
-Ingresar hasta qué multiplicador se desea calcular.<br>
Proceso<br>
-Verificar si la tabla inicial es mayor que la tabla final.
-Si es mayor, generar un mensaje de error.
-Si es válida, recorrer las tablas desde la inicial hasta la final.
-Para cada tabla, recorrer los multiplicadores desde 1 hasta el valor ingresado.
-Multiplicar el número de la tabla por el multiplicador.
-Obtener el resultado de cada multiplicación.
##Salida
-Mostrar el número de cada tabla.
-Mostrar las multiplicaciones y sus resultados.
-Mostrar un mensaje de error si la tabla inicial es mayor que la tabla final.

## Pseudocodigo 
```
Proceso Ejercicio2


Escribir "Tabla inicial: "
Leer inicial

Escribir "Tabla final: "
Leer fin

Si inicial > fin Entonces
	Escribir "Error: la tabla inicial no puede ser mayor que la final."
SiNo
	
	Escribir "Hasta que multiplicador: "
	Leer hasta
	
	Para i <- inicial Hasta fin Con Paso 1 Hacer
		
		Escribir "TABLA DEL ", i
		
		Para j <- 1 Hasta hasta Con Paso 1 Hacer
			Escribir i, " x ", j, " = ", i * j
		FinPara
		
	FinPara
FinSi


FinProceso```
