## Enunciado

Ejercicio 8. Detector y depurador de errores

Analizar un código en Java que contiene un error relacionado con un ciclo while. Identificar el problema, explicar por qué ocurre, corregirlo y comprobar su funcionamiento mediante una tabla de trazas y una ejecución correcta del programa.

Además, crear voluntariamente otro ejemplo de un error relacionado con ciclos, corregirlo y demostrar su solución.

Finalmente, documentar en el archivo README.md los siguientes aspectos:

ERROR ENCONTRADO
CAUSA
SOLUCIÓN
RESULTADO
## Pseudocodigo 
````
Proceso DetectorErrores

    Definir numero Como Entero

    numero <- 1

    Mientras numero <= 10 Hacer

        Escribir numero

    FinMientras

FinProceso
````
## Análisis
ERROR ENCONTRADO: Bucle infinito - el programa no termina nunca e imprime 1 infinitamente.

CAUSA: La variable `numero` nunca cambia de valor dentro del while. La condicion `numero <= 10` siempre es verdadera porque numero siempre es 1. Falta el incremento.

SOLUCIÓN: Agregar `numero++;` dentro del cuerpo del while para que la variable de control avance y eventualmente la condicion sea falsa.

RESULTADO: El programa ahora imprime los numeros del 1 al 10 y termina correctamente.
