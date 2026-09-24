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
