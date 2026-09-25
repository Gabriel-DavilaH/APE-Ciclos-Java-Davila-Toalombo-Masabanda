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

## Código Corregido 

````
public class DetectorErrores {
    public static void main(String[] args) {
        int numero = 1;
        while (numero <= 10) {
            System.out.println(numero);
            numero++; // <-- CORRECCION
        }
        System.out.println("Fin del programa");
    }
}
````
## Prueba de escritorio 
| Iteración | `numero` inicial | Condición `numero <= 10` | Salida | `numero++` | `numero` final |
| --------: | ---------------: | :----------------------: | -----: | ---------: | -------------: |
|         1 |                1 |         Verdadero        |      1 |         +1 |              2 |
|         2 |                2 |         Verdadero        |      2 |         +1 |              3 |
|         3 |                3 |         Verdadero        |      3 |         +1 |              4 |
|         4 |                4 |         Verdadero        |      4 |         +1 |              5 |
|         5 |                5 |         Verdadero        |      5 |         +1 |              6 |
|         6 |                6 |         Verdadero        |      6 |         +1 |              7 |
|         7 |                7 |         Verdadero        |      7 |         +1 |              8 |
|         8 |                8 |         Verdadero        |      8 |         +1 |              9 |
|         9 |                9 |         Verdadero        |      9 |         +1 |             10 |
|        10 |               10 |         Verdadero        |     10 |         +1 |             11 |
|     Final |               11 |           Falso          |      — |          — |             11 |

## Ejemplo Voluntario con Error de ciclo
````
// EJEMPLO CON ERROR VOLUNTARIO
public class ErrorVoluntario {
    public static void main(String[] args) {
        // ERROR: punto y coma despues del for
        for (int i = 1; i <= 5; i++);
        {
            System.out.println("Esto se ejecuta solo una vez y con i=6");
            // System.out.println(i); -> ni siquiera compila, i no existe aqui
        }

        // CORREGIDO:
        System.out.println("\n-- CORREGIDO --");
        for (int i = 1; i <= 5; i++) {
            System.out.println("i = " + i);
        }
    }
}
````
