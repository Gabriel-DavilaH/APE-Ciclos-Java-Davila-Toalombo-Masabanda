## Enunciado
Ejercicio 6. Triángulo y patrones

Solicitar al usuario un número entre 2 y 10.

Si el usuario ingresa un número, mostrar primero un triángulo creciente de asteriscos, luego un triángulo decreciente de asteriscos y finalmente un patrón de números.

Para el ejemplo con 5, se debe mostrar:
```
*
**
***
****
*****
```
Posteriormente:
```
*****
****
***
**
*
```
Finalmente:
```
1
12
123
1234
12345
```
El estudiante deberá explicar mediante una tabla de trazas cómo interactúan el ciclo exterior y el ciclo interior.

Estructura obligatoria: ciclos for anidados.

## Anunciado

## Pseudocodigo 

```
Proceso 

    Definir n, i, j Como Entero

    Repetir
        Escribir "Ingrese un numero entre 2 y 10: "
        Leer n

        Si n < 2 O n > 10 Entonces
            Escribir "Error: debe ser entre 2 y 10"
        FinSi

    Hasta Que n >= 2 Y n <= 10


    // 1. Triangulo creciente
    Escribir "Triangulo 1:"

    Para i <- 1 Hasta n Con Paso 1 Hacer

        Para j <- 1 Hasta i Con Paso 1 Hacer
            Escribir Sin Saltar "*"
        FinPara

        Escribir ""

    FinPara


    // 2. Triangulo decreciente
    Escribir "Posteriormente:"

    Para i <- n Hasta 1 Con Paso -1 Hacer

        Para j <- 1 Hasta i Con Paso 1 Hacer
            Escribir Sin Saltar "*"
        FinPara

        Escribir ""

    FinPara


    // 3. Patron numerico
    Escribir "Finalmente:"

    Para i <- 1 Hasta n Con Paso 1 Hacer

        Para j <- 1 Hasta i Con Paso 1 Hacer
            Escribir Sin Saltar j
        FinPara

        Escribir ""

    FinPara

FinProceso
```
## Prueba de escritorio 

|  i |   j | Condición `j <= i` | Salida |
| -: | --: | ------------------ | ------ |
|  1 |   1 | Verdadero          | `*`    |
|  2 | 1-2 | Verdadero          | `**`   |
|  3 | 1-3 | Verdadero          | `***`  |
|  4 | 1-4 | Verdadero          | `****` |

## Diagrama 
<img width="1600" height="900" alt="WhatsApp Image 2026-09-24 at 11 27 39 AM" src="https://github.com/user-attachments/assets/d2062e57-ee4b-44ca-b32c-60f2f5bf128e" />
