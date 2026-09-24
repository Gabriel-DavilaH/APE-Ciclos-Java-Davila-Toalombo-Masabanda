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
