## Enunciado

Ejercicio 9. Estadísticas de una encuesta universitaria

Preguntar inicialmente cuántos estudiantes participarán en la encuesta. Para cada estudiante, solicitar la edad, el semestre y las horas de estudio por día.

Validar que la edad esté entre 16 y 80 años, el semestre entre 1 y 10, y las horas de estudio entre 0 y 24 horas.

Al finalizar, determinar el promedio de edad, el promedio de horas de estudio, el estudiante con mayor cantidad de horas de estudio, la cantidad de estudiantes que estudian menos de 2 horas y la cantidad de estudiantes que pertenecen a cada semestre.

Para obtener la cantidad de estudiantes por semestre se deberán utilizar ciclos anidados o una estrategia equivalente, explicada por el estudiante.

## Análisis
**Entrada<br>**
Cantidad de estudiantes que participarán.<br>
Edad de cada estudiante.<br>
Semestre de cada estudiante.<br>
Horas de estudio por día de cada estudiante.<br>

Validaciones:<br>

Edad: de 16 a 80.<br>
Semestre: de 1 a 10.<br>
Horas de estudio: de 0 a 24.<br>
**Proceso<br>**
Solicitar la cantidad de estudiantes.<br>
Repetir el proceso para cada estudiante.<br>
Solicitar y validar la edad.<br>
Solicitar y validar el semestre.<br>
Solicitar y validar las horas de estudio.<br>
Acumular las edades para calcular el promedio.<br>
Acumular las horas de estudio para calcular el promedio.<br>
Comparar las horas de estudio para determinar cuál estudiante tiene la mayor cantidad.<br>
Contar los estudiantes que estudian menos de 2 horas.<br>
Contabilizar la cantidad de estudiantes de cada semestre mediante ciclos anidados o una estrategia equivalente.<br>
Calcular el promedio de edad.<br>
Calcular el promedio de horas de estudio.<br>

**<br>Salida<br>**
Mostrar:<br>

Edad promedio de los estudiantes.<br>
Promedio de horas de estudio por día.<br>
Estudiante con mayor cantidad de horas de estudio.<br>
Cantidad de estudiantes que estudian menos de 2 horas.<br>
Cantidad de estudiantes de cada semestre, del 1 al 10.<br>
## Pseudocodigo 
````
Proceso EncuestaUniversitaria

    Definir numEstudiantes Como Entero
    Definir sumaEdades, sumaHoras Como Real
    Definir maxHoras, estudianteMaxHoras, menosDe2Horas Como Entero
    Definir promedioEdad, promedioHoras Como Real
    Definir edad, semestre, hEstudio Como Entero
    Definir i, s, j, contador Como Entero

    Repetir
        Escribir "¿Cuantos estudiantes participaran?"
        Leer numEstudiantes

        Si numEstudiantes <= 0 Entonces
            Escribir "Error: Debe ser mayor a 0"
        FinSi
    Hasta Que numEstudiantes > 0

    sumaEdades <- 0
    sumaHoras <- 0
    maxHoras <- -1
    estudianteMaxHoras <- 0
    menosDe2Horas <- 0

    Dimension edades[numEstudiantes]
    Dimension semestres[numEstudiantes]
    Dimension horas[numEstudiantes]

    Para i <- 0 Hasta numEstudiantes - 1 Hacer

        Escribir "--- Estudiante ", i + 1, " ---"

        Repetir
            Escribir "Edad (16-80):"
            Leer edad

            Si edad < 16 O edad > 80 Entonces
                Escribir "Error: Edad fuera de rango"
            FinSi
        Hasta Que edad >= 16 Y edad <= 80

        Repetir
            Escribir "Semestre (1-10):"
            Leer semestre

            Si semestre < 1 O semestre > 10 Entonces
                Escribir "Error: Semestre fuera de rango"
            FinSi
        Hasta Que semestre >= 1 Y semestre <= 10

        Repetir
            Escribir "Horas de estudio por dia (0-24):"
            Leer hEstudio

            Si hEstudio < 0 O hEstudio > 24 Entonces
                Escribir "Error: Horas fuera de rango"
            FinSi
        Hasta Que hEstudio >= 0 Y hEstudio <= 24

        edades[i] <- edad
        semestres[i] <- semestre
        horas[i] <- hEstudio

        sumaEdades <- sumaEdades + edad
        sumaHoras <- sumaHoras + hEstudio

        Si hEstudio < 2 Entonces
            menosDe2Horas <- menosDe2Horas + 1
        FinSi

        Si hEstudio > maxHoras Entonces
            maxHoras <- hEstudio
            estudianteMaxHoras <- i + 1
        FinSi

    FinPara

    promedioEdad <- sumaEdades / numEstudiantes
    promedioHoras <- sumaHoras / numEstudiantes

    Escribir "===== RESULTADOS ====="
    Escribir "Edad promedio: ", promedioEdad
    Escribir "Horas promedio de estudio: ", promedioHoras
    Escribir "Estudiante con mayor cantidad de horas: Estudiante #", estudianteMaxHoras, " con ", maxHoras, " horas"
    Escribir "Estudiantes que estudian menos de 2 horas: ", menosDe2Horas

    Escribir "Cantidad de estudiantes por semestre:"

    Para s <- 1 Hasta 10 Hacer

        contador <- 0

        Para j <- 0 Hasta numEstudiantes - 1 Hacer

            Si semestres[j] = s Entonces
                contador <- contador + 1
            FinSi

        FinPara

        Si contador > 0 Entonces
            Escribir "Semestre ", s, ": ", contador, " estudiante(s)"
        FinSi

    FinPara

FinProceso
````
## Prueba de escritorio 
| Estudiante | Edad | Semestre | Horas | `sumaEdades` | `sumaHoras` | `< 2 horas` | `maxHoras` | `estudianteMaxHoras` |
| ---------: | ---: | -------: | ----: | -----------: | ----------: | ----------: | ---------: | -------------------: |
|    Inicial |    — |        — |     — |            0 |           0 |           0 |         -1 |                    0 |
|          1 |   20 |        2 |     3 |           20 |           3 |           0 |          3 |                    1 |
|          2 |   22 |        2 |     1 |           42 |           4 |           1 |          3 |                    1 |
|          3 |   19 |        4 |     5 |           61 |           9 |           1 |          5 |                    3 |

## Diagrama 
<img width="1600" height="900" alt="WhatsApp Image 2026-09-25 at 9 31 09 AM" src="https://github.com/user-attachments/assets/ef900d99-4a0b-473d-adb4-7d55a40db748" />
