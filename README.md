## Enunciado
Ejercicio 10. Sistema integrador de parqueadero

Construya una aplicación completa utilizando:


    PARQUEADERO UNIVERSITARIO
1. Registrar vehículo
2. Mostrar vehículos registrados
3. Mostrar estadísticas
4. Mostrar recaudación
5. Salir


Por cada vehículo registrar:

tipo de vehículo;
rol: estudiante, docente o visitante;
número de horas;
día de la semana;
boleto perdido: sí/no.

El programa deberá aplicar diferentes tarifas definidas por el equipo.

El reporte final deberá mostrar:

vehículos registrados;
cantidad por tipo;
cantidad por rol;
total de horas;
promedio de permanencia;
total recaudado;
mayor valor pagado;
menor valor pagado.

Debe integrar obligatoriamente:

for + while + do-while + switch + ciclos anidados + contadores + acumuladores + validaciones + casos límite.
## Pseudocodigo 
````
Proceso ParqueaderoUni

    Definir MAX, totalVehiculos Como Entero
    Definir opcion, tipo, rol, h, dia Como Entero
    Definir i, j, d, contDia, idx Como Entero
    Definir tarifaHora, subtotal Como Real
    Definir recaudacion Como Real
    Definir resp Como Caracter
    Definir perdido Como Logico

    MAX <- 100
    totalVehiculos <- 0

    Dimension tipos[MAX]
    Dimension roles[MAX]
    Dimension horas[MAX]
    Dimension dias[MAX]
    Dimension boletoPerdido[MAX]
    Dimension valores[MAX]

    Repetir

        Escribir "PARQUEADERO UNIVERSITARIO"
        Escribir "1. Registrar vehiculo"
        Escribir "2. Mostrar vehiculos registrados"
        Escribir "3. Mostrar estadisticas"
        Escribir "4. Mostrar recaudacion"
        Escribir "5. Salir"
        Escribir "Elige opcion:"
        Leer opcion

        Segun opcion Hacer

            1:
                Si totalVehiculos >= MAX Entonces
                    Escribir "Parqueadero lleno"
                SiNo

                    Repetir
                        Escribir "Tipo: 1.Moto 2.Carro 3.Bici"
                        Leer tipo
                    Hasta Que tipo >= 1 Y tipo <= 3

                    Repetir
                        Escribir "Rol: 1.Estudiante 2.Docente 3.Visitante"
                        Leer rol
                    Hasta Que rol >= 1 Y rol <= 3

                    Repetir
                        Escribir "Numero de horas (1-24):"
                        Leer h
                    Hasta Que h >= 1 Y h <= 24

                    Repetir
                        Escribir "Dia semana 1=Lun...7=Dom:"
                        Leer dia
                    Hasta Que dia >= 1 Y dia <= 7

                    perdido <- Falso

                    Repetir
                        Escribir "Boleto perdido? (si/no):"
                        Leer resp

                        Si resp = "si" Entonces
                            perdido <- Verdadero
                        FinSi

                    Hasta Que resp = "si" O resp = "no"

                    Segun tipo Hacer
                        1:
                            tarifaHora <- 0.50
                        2:
                            tarifaHora <- 1.00
                        3:
                            tarifaHora <- 0.25
                    FinSegun

                    subtotal <- tarifaHora * h

                    Si rol = 1 Entonces
                        subtotal <- subtotal * 0.80
                    SiNo
                        Si rol = 2 Entonces
                            subtotal <- subtotal * 0.70
                        FinSi
                    FinSi

                    Si dia = 6 O dia = 7 Entonces
                        subtotal <- subtotal * 1.20
                    FinSi

                    Si perdido Entonces
                        subtotal <- subtotal + 5.0
                    FinSi

                    tipos[totalVehiculos] <- tipo
                    roles[totalVehiculos] <- rol
                    horas[totalVehiculos] <- h
                    dias[totalVehiculos] <- dia
                    boletoPerdido[totalVehiculos] <- perdido
                    valores[totalVehiculos] <- subtotal

                    totalVehiculos <- totalVehiculos + 1

                    Escribir "Valor a pagar: $", subtotal

                FinSi

            2:
                Si totalVehiculos = 0 Entonces
                    Escribir "No hay vehiculos"
                SiNo

                    Para i <- 0 Hasta totalVehiculos - 1 Hacer
                        Escribir i + 1, ". Tipo: ", tipos[i],
                                " | Rol: ", roles[i],
                                " | ", horas[i], "h",
                                " | Dia: ", dias[i],
                                " | $", valores[i]
                    FinPara

                FinSi

            3:
                Si totalVehiculos = 0 Entonces
                    Escribir "Sin datos"
                SiNo

                    cMoto <- 0
                    cCarro <- 0
                    cBici <- 0
                    cEst <- 0
                    cDoc <- 0
                    cVis <- 0
                    totalHoras <- 0
                    totalRec <- 0

                    mayor <- valores[0]
                    menor <- valores[0]

                    Para i <- 0 Hasta totalVehiculos - 1 Hacer

                        Si tipos[i] = 1 Entonces
                            cMoto <- cMoto + 1
                        SiNo
                            Si tipos[i] = 2 Entonces
                                cCarro <- cCarro + 1
                            SiNo
                                cBici <- cBici + 1
                            FinSi
                        FinSi

                        Si roles[i] = 1 Entonces
                            cEst <- cEst + 1
                        SiNo
                            Si roles[i] = 2 Entonces
                                cDoc <- cDoc + 1
                            SiNo
                                cVis <- cVis + 1
                            FinSi
                        FinSi

                        totalHoras <- totalHoras + horas[i]
                        totalRec <- totalRec + valores[i]

                        Si valores[i] > mayor Entonces
                            mayor <- valores[i]
                        FinSi

                        Si valores[i] < menor Entonces
                            menor <- valores[i]
                        FinSi

                    FinPara

                    Escribir "Vehiculos: ", totalVehiculos
                    Escribir "Por tipo: Moto=", cMoto,
                            " Carro=", cCarro,
                            " Bici=", cBici
                    Escribir "Por rol: Est=", cEst,
                            " Doc=", cDoc,
                            " Vis=", cVis
                    Escribir "Total horas: ", totalHoras
                    Escribir "Promedio: ", totalHoras / totalVehiculos
                    Escribir "Mayor: $", mayor
                    Escribir "Menor: $", menor

                    Para d <- 1 Hasta 7 Hacer

                        contDia <- 0

                        Para j <- 0 Hasta totalVehiculos - 1 Hacer
                            Si dias[j] = d Entonces
                                contDia <- contDia + 1
                            FinSi
                        FinPara

                        Si contDia > 0 Entonces
                            Escribir "Dia ", d, ": ", contDia
                        FinSi

                    FinPara

                FinSi

            4:
                recaudacion <- 0
                idx <- 0

                Mientras idx < totalVehiculos Hacer
                    recaudacion <- recaudacion + valores[idx]
                    idx <- idx + 1
                FinMientras

                Escribir "Total recaudado: $", recaudacion

            5:
                Escribir "Saliendo..."

        FinSegun

    Hasta Que opcion = 5

FinProceso
````
## Prueba de escritorio 
| Vehículo | Tipo  | Rol        | Horas | Día         | Boleto perdido |
| -------- | ----- | ---------- | ----: | ----------- | -------------- |
| 1        | Moto  | Estudiante |     2 | Lunes (1)   | No             |
| 2        | Carro | Docente    |     3 | Sábado (6)  | No             |
| 3        | Bici  | Visitante  |     4 | Domingo (7) | Sí             |
