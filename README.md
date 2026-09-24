## Enunciado
Ejercicio 5. Estacionamiento universitario

Desarrollar un programa para registrar los vehículos que utilizan un estacionamiento.

Por cada vehículo se debe solicitar:

Tipo de vehículo:
Motocicleta
Automóvil
Camioneta
Horas estacionado.

Las tarifas por hora son:

Motocicleta: $0.50
Automóvil: $1.00
Camioneta: $1.50

El programa debe permitir registrar varios vehículos hasta que el usuario decida terminar.

Al finalizar, debe mostrar un reporte con:

Motocicletas.
Automóviles.
Camionetas.
Total de vehículos.
Total recaudado.
Promedio pagado.

Se debe validar que las horas sean mayores que cero.

Estructuras esperadas: do-while, switch, contadores y acumuladores.

## Analisis
**<br>Entrada<br>**
Ingresar el tipo de vehículo.<br>
Ingresar las horas estacionado.<br>
Ingresar la opción para decidir si se desea registrar otro vehículo.<br>
**<br>Proceso<br>**
Iniciar los contadores de motocicletas, automóviles y camionetas en 0.<br>
Iniciar el acumulador del total recaudado en 0.<br>
Registrar el tipo de vehículo.<br>
Registrar las horas estacionado.<br>
Validar que las horas sean mayores que 0.<br>
Según el tipo de vehículo, seleccionar su tarifa mediante switch.<br>
Calcular el valor a pagar:<br>
horas × tarifa.<br>
Aumentar el contador correspondiente al tipo de vehículo.<br>
Aumentar el total de vehículos.<br>
Acumular el valor pagado en el total recaudado.<br>
Repetir el proceso mientras el usuario desee registrar más vehículos.<br>
Calcular el promedio pagado:<br>
total recaudado ÷ total de vehículos.<br>
**<br>Salida<br>**
Mostrar la cantidad de motocicletas.<br>
Mostrar la cantidad de automóviles.<br>
Mostrar la cantidad de camionetas.<br>
Mostrar el total de vehículos.<br>
Mostrar el total recaudado.<br>
Mostrar el promedio pagado.<br>
## Pseudocodigo 
````
Proceso Estacionamiento

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

    opcion <- 1

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

        Si horas <= 0 O tipo < 1 O tipo > 3 Entonces
            Escribir "ERROR: Datos no validos. Horas > 0 y tipo 1-3"
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

|    Paso | Tipo | Horas |  Pago | Motos | Autos | Camionetas | Acum. Motos | Acum. Autos | Acum. Camionetas |
| ------: | ---- | ----: | ----: | ----: | ----: | ---------: | ----------: | ----------: | ---------------: |
| Inicial | —    |     — |     — |     0 |     0 |          0 |          $0 |          $0 |               $0 |
|       1 | 1    |     2 | $1.00 |     1 |     0 |          0 |       $1.00 |          $0 |               $0 |
|       2 | 2    |     3 | $3.00 |     1 |     1 |          0 |       $1.00 |       $3.00 |               $0 |
|       3 | 3    |     4 | $6.00 |     1 |     1 |          1 |       $1.00 |       $3.00 |            $6.00 |

## Diagrama
<img width="1600" height="900" alt="WhatsApp Image 2026-09-24 at 11 20 47 AM" src="https://github.com/user-attachments/assets/57581c32-4ebc-4916-aff3-c136a8f7f44c" />
