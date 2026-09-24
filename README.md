## Enunciado
Realizar un programa que permita ingresar una tabla inicial, una tabla final y el multiplicador hasta el cual se desea calcular. El programa debe mostrar las tablas de multiplicar desde la tabla inicial hasta la tabla final. Si la tabla inicial es mayor que la tabla final, debe mostrar un mensaje de error.

## Analisis
Entrada<br>
-Ingresar la tabla inicial.<br>
-Ingresar la tabla final.<br>
-Ingresar hasta qué multiplicador se desea calcular.<br>
Proceso<br>
-Verificar si la tabla inicial es mayor que la tabla final.<br>
-Si es mayor, generar un mensaje de error.<br>
-Si es válida, recorrer las tablas desde la inicial hasta la final.<br>
-Para cada tabla, recorrer los multiplicadores desde 1 hasta el valor ingresado.<br>
-Multiplicar el número de la tabla por el multiplicador.<br>
-Obtener el resultado de cada multiplicación.<br>
Salida<br>
-Mostrar el número de cada tabla.<br>
-Mostrar las multiplicaciones y sus resultados.<br>
-Mostrar un mensaje de error si la tabla inicial es mayor que la tabla final.<br>

## Pseudocodigo 
```
Proceso Ejercicio2
Escribir "Tabla inicial: "
Leer inicial
Escribir "Tabla final: "
Leer fila
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
FinProceso
````
## Prueba de escritorio 

|  i |  j | i × j | Resultado |
| -: | -: | ----: | --------: |
|  2 |  1 | 2 × 1 |         2 |
|  2 |  2 | 2 × 2 |         4 |
|  2 |  3 | 2 × 3 |         6 |
|  2 |  4 | 2 × 4 |         8 |
|  2 |  5 | 2 × 5 |        10 |
|  3 |  1 | 3 × 1 |         3 |
|  3 |  2 | 3 × 2 |         6 |
|  3 |  3 | 3 × 3 |         9 |
|  3 |  4 | 3 × 4 |        12 |
|  3 |  5 | 3 × 5 |        15 |
|  4 |  1 | 4 × 1 |         4 |
|  4 |  2 | 4 × 2 |         8 |
|  4 |  3 | 4 × 3 |        12 |
|  4 |  4 | 4 × 4 |        16 |
|  4 |  5 | 4 × 5 |        20 |

## Diagrama
<img width="1600" height="900" alt="WhatsApp Image 2026-09-24 at 9 14 44 AM" src="https://github.com/user-attachments/assets/7198608d-e9be-45bd-900a-b0494028d85a" />
