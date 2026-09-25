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
