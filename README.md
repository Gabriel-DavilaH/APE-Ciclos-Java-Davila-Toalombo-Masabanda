Análisis del programa ControlCalificaciones
1. Nombre del programa:
ControlCalificaciones
2. Objetivo:
El programa permite registrar las calificaciones de un grupo de estudiantes, validar que los datos ingresados sean correctos y calcular información general como la suma, el promedio, la nota más alta, la nota más baja y la cantidad de estudiantes aprobados y reprobados.
3. Datos de entrada:
•	n: número de estudiantes. 
•	nota: calificación de cada estudiante, con valores entre 0 y 10. 
4. Variables principales:
Variable	Tipo	Función
n	int	Almacena el número de estudiantes
suma	double	Acumula todas las calificaciones
notaAlta	double	Guarda la calificación más alta
notaBaja	double	Guarda la calificación más baja
aprobados	int	Cuenta estudiantes con nota ≥ 7
reprobados	int	Cuenta estudiantes con nota < 7
notas	double[]	Almacena las calificaciones
promedio	double	Calcula el promedio general
nota	double	Guarda temporalmente cada calificación
5. Procesos utilizados:
•	Se solicita el número de estudiantes. 
•	Se utiliza un ciclo while para verificar que el número de estudiantes sea mayor que cero. 
•	Se crea un arreglo notas con tamaño n. 
•	Se utiliza un ciclo for para ingresar las calificaciones de todos los estudiantes. 
•	Se utiliza otro while para validar que cada nota esté entre 0 y 10. 
•	Se acumulan las notas mediante suma. 
•	Se cuentan los aprobados y reprobados mediante una estructura if-else. 
•	Se determina la nota mayor y menor mediante estructuras if. 
•	Finalmente, se calcula el promedio y se muestran los resultados. 
6. Estructuras de control:
•	while: valida el número de estudiantes y las calificaciones. 
•	for: permite procesar las calificaciones de todos los estudiantes. 
•	if-else: determina si un estudiante está aprobado o reprobado. 
•	if: determina la nota más alta y la más baja. 
7. Condiciones:
•	Número de estudiantes: n > 0 
•	Calificación válida: 0 <= nota <= 10 
•	Aprobado: nota >= 7 
•	Reprobado: nota < 7 
8. Salida:
El programa muestra:
•	Número de estudiantes. 
•	Suma de calificaciones. 
•	Promedio general. 
•	Cantidad de aprobados. 
•	Cantidad de reprobados. 
•	Nota más alta. 
•	Nota más baja.


````markdown
## 📝 Pseudocódigo

```text
Inicio

    Definir n, i, aprobados, reprobados Como Entero
    Definir suma, notaAlta, notaBaja, nota, promedio Como Real
    Definir notas Como Real

    n <- 0
    suma <- 0
    notaAlta <- 0
    notaBaja <- 10
    aprobados <- 0
    reprobados <- 0

    Escribir "Ingrese numero de estudiantes:"
    Leer n

    Mientras n <= 0 Hacer
        Escribir "Error, debe ser mayor que cero. Ingrese de nuevo:"
        Leer n
    FinMientras

    Dimension notas[n]

    Para i <- 1 Hasta n Hacer

        Escribir "Calificacion del estudiante ", i, " (0-10):"
        Leer nota

        Mientras nota < 0 O nota > 10 Hacer
            Escribir "Error, nota entre 0 y 10. Ingrese de nuevo:"
            Leer nota
        FinMientras

        notas[i] <- nota
        suma <- suma + nota

        Si nota >= 7 Entonces
            aprobados <- aprobados + 1
        SiNo
            reprobados <- reprobados + 1
        FinSi

        Si nota > notaAlta Entonces
            notaAlta <- nota
        FinSi

        Si nota < notaBaja Entonces
            notaBaja <- nota
        FinSi

    FinPara

    promedio <- suma / n

    Escribir ""
    Escribir "--- RESULTADOS ---"
    Escribir "Numero de estudiantes: ", n
    Escribir "Suma de calificaciones: ", suma
    Escribir "Promedio general: ", promedio
    Escribir "Cantidad de aprobados: ", aprobados
    Escribir "Cantidad de reprobados: ", reprobados
    Escribir "Nota mas alta: ", notaAlta
    Escribir "Nota mas baja: ", notaBaja

Fin
````

##  Prueba de escritorio

|       i | nota | suma | aprobados | reprobados | notaAlta | notaBaja | promedio |
| ------: | ---: | ---: | --------: | ---------: | -------: | -------: | -------: |
| Inicial |    — |    0 |         0 |          0 |        0 |       10 |        — |
|       1 |    8 |    8 |         1 |          0 |        8 |        8 |        — |
|       2 |    6 |   14 |         1 |          1 |        8 |        6 |        — |
|       3 |    9 |   23 |         2 |          1 |        9 |        6 |     7.67 |

## Diagrama 

<img width="808" height="355" alt="image" src="https://github.com/user-attachments/assets/d622d721-7011-4aa0-ae37-8223426b7b94" />


