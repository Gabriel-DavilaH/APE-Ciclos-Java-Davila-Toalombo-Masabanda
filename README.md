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
** Entrada<br>
-Ingresar el número N.<br>
Proceso<br>
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
Salida<br>
-Mostrar la serie de números pares.<br>
-Mostrar la cantidad de números pares.<br>
-Mostrar la suma de los números pares.<br>
-Mostrar el promedio de los números pares.<br>
-Si N <= 1, mostrar: "No hay números pares entre 2 y N".<br>

## Pseudocodigo 
```
import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese N: ");
        int N = sc.nextInt();
        // Validación - caso límite N = 1, 0, 2 y negativos
        if (N <= 1) {
            System.out.println("No hay numeros pares entre 2 y " + N);
            sc.close();
            return;
        }
        int contador = 0; // cuenta cuantos pares hay
        int acumulador = 0; // suma los pares
        System.out.println("\nSerie:");
        for (int i = 2; i <= N; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
                contador++;
                acumulador = acumulador + i;
            }
        }
        System.out.println("\n\nCantidad de pares: " + contador);
        System.out.println("Suma: " + acumulador);
        if (contador > 0) {
            double promedio = (double) acumulador / contador;
            System.out.println("Promedio: " + promedio);
        }
        sc.close();
    }
}
```
