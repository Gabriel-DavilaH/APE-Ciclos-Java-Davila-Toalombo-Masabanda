## Enunciado

Ejercicio 3. Serie y suma de números pares

Solicite un número entero positivo N. El programa deberá mostrar todos los números pares desde 2 hasta N.

Además, debe mostrar la cantidad de números pares, la suma y el promedio.

Debe utilizar:

Contador.
Acumulador.
Validación.
Estructura for.

Casos límite: N = 1, N = 2 y valores negativos.
## Analisis
 **<br>Entrada<br>**
-Ingresar el número N.<br>
**<br>Proceso<br>**
-Verificar si N es menor o igual a 1.<br>
-Si N <= 1, mostrar que no hay números pares.<br>
-Si N > 1, iniciar el contador en 0.<br>
-Iniciar el acumulador en 0.<br>
-Recorrer los números desde 2 hasta N.<br>
-Verificar si cada número es divisible para 2.<br>
-Si es par, mostrarlo.<br>
-Aumentar el contador en 1.<br>
-Sumar el número al acumulador.<br>
-Calcular el promedio dividiendo la suma para la cantidad de números pares.<br>
-Mostrar la cantidad, la suma y el promedio.<br>
**<br>Salida<br>**
-Mostrar la serie de números pares.<br>
-Mostrar la cantidad de números pares.<br>
-Mostrar la suma de los números pares.<br>
-Mostrar el promedio de los números pares.<br>
-Si N <= 1, mostrar: "No hay números pares entre 2 y N".<br>

## Pseudocodigo 
```
Proceso Ejercicio3

    Definir N, contador, acumulador, i Como Entero
    Definir promedio Como Real

    Escribir "Ingrese N: "
    Leer N

    // Validación
    Si N <= 1 Entonces
        Escribir "No hay numeros pares entre 2 y ", N
    SiNo
        contador <- 0
        acumulador <- 0

        Escribir "Serie:"

        Para i <- 2 Hasta N Con Paso 1 Hacer
            Si i MOD 2 = 0 Entonces
                Escribir Sin Saltar i, " "
                contador <- contador + 1
                acumulador <- acumulador + i
            FinSi
        FinPara

        Escribir ""
        Escribir "Cantidad de pares: ", contador
        Escribir "Suma: ", acumulador

        Si contador > 0 Entonces
            promedio <- acumulador / contador
            Escribir "Promedio: ", promedio
        FinSi
    FinSi

FinProceso
```

## Prueba de escritorio 

|       i | i % 2 == 0 | contador | acumulador |
| ------: | :--------: | -------: | ---------: |
| Inicial |      —     |        0 |          0 |
|       2 |     Sí     |        1 |          2 |
|       3 |     No     |        1 |          2 |
|       4 |     Sí     |        2 |          6 |
|       5 |     No     |        2 |          6 |
|       6 |     Sí     |        3 |         12 |
|       7 |     No     |        3 |         12 |
|       8 |     Sí     |        4 |         20 |
|       9 |     No     |        4 |         20 |
|      10 |     Sí     |        5 |         30 |

## Diagrama
<img width="1600" height="900" alt="WhatsApp Image 2026-09-24 at 9 38 20 AM" src="https://github.com/user-attachments/assets/05edf06d-71e0-47b0-99a3-e853a394f1e3" />
