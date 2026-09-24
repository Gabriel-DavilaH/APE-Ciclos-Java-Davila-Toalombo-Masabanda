## Pseudocodigo 
````
Proceso 

    Definir TARIFA_MOTO, TARIFA_AUTO, TARIFA_CAMIONETA Como Real
    Definir contMotos, contAutos, contCamionetas Como Entero
    Definir acumMotos, acumAutos, acumCamionetas Como Real
    Definir tipo, opcion, totalVehiculos Como Entero
    Definir horas, pago, totalRecaudado, promedioPagado Como Real

    TARIFA_MOTO <- 0.50
    TARIFA_AUTO <- 1.00
    TARIFA_CAMIONETA <- 1.50

    contMotos <- 0
    contAutos <- 0
    contCamionetas <- 0
    acumMotos <- 0
    acumAutos <- 0
    acumCamionetas <- 0

    Escribir "ESTACIONAMIENTO UNIVERSITARIO"

    Repetir

        Escribir "Tipo de vehiculo:"
        Escribir "1. Motocicleta"
        Escribir "2. Automovil"
        Escribir "3. Camioneta"
        Escribir "Seleccione:"
        Leer tipo

        Escribir "Horas estacionado:"
        Leer horas

        Si horas <= 0 Entonces
            Escribir "ERROR: Las horas deben ser mayores que cero."
        SiNo

            Si tipo < 1 O tipo > 3 Entonces
                Escribir "ERROR: Tipo no valido."
            SiNo

                Segun tipo Hacer

                    1:
                        pago <- horas * TARIFA_MOTO
                        Escribir "A pagar: $", pago
                        contMotos <- contMotos + 1
                        acumMotos <- acumMotos + pago

                    2:
                        pago <- horas * TARIFA_AUTO
                        Escribir "A pagar: $", pago
                        contAutos <- contAutos + 1
                        acumAutos <- acumAutos + pago

                    3:
                        pago <- horas * TARIFA_CAMIONETA
                        Escribir "A pagar: $", pago
                        contCamionetas <- contCamionetas + 1
                        acumCamionetas <- acumCamionetas + pago

                FinSegun

            FinSi

        FinSi

        Escribir "¿Registrar otro? 1=Si 0=No:"
        Leer opcion

    Hasta Que opcion <> 1

    totalVehiculos <- contMotos + contAutos + contCamionetas
    totalRecaudado <- acumMotos + acumAutos + acumCamionetas

    Si totalVehiculos > 0 Entonces
        promedioPagado <- totalRecaudado / totalVehiculos
    SiNo
        promedioPagado <- 0
    FinSi

    Escribir "===== REPORTE ====="
    Escribir "Motocicletas: ", contMotos
    Escribir "Automoviles: ", contAutos
    Escribir "Camionetas: ", contCamionetas
    Escribir "Total vehiculos: ", totalVehiculos
    Escribir "Total recaudado: $", totalRecaudado
    Escribir "Promedio pagado: $", promedioPagado
    Escribir "==================="

FinProceso
````
## Prueba de escritorio 

|    Paso | Tipo        | Horas |  Pago | Cont. Motos | Cont. Autos | Cont. Camionetas | Acum. Motos | Acum. Autos | Acum. Camionetas |
| ------: | ----------- | ----: | ----: | ----------: | ----------: | ---------------: | ----------: | ----------: | ---------------: |
| Inicial | —           |     — |     — |           0 |           0 |                0 |          $0 |          $0 |               $0 |
|       1 | Motocicleta |     2 | $1.00 |           1 |           0 |                0 |       $1.00 |          $0 |               $0 |
|       2 | Automóvil   |     3 | $3.00 |           1 |           1 |                0 |       $1.00 |       $3.00 |               $0 |
|       3 | Camioneta   |     4 | $6.00 |           1 |           1 |                1 |       $1.00 |       $3.00 |            $6.00 |
