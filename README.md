## Enunciado
Ejercicio 4. Cajero automático básico

Construir un programa que muestre un menú de cajero automático con las siguientes opciones:

Consultar saldo
Depositar
Retirar
Mostrar movimientos
Salir

El usuario comenzará con un saldo de $100. El programa debe permanecer activo hasta que el usuario seleccione la opción Salir.

El programa debe validar que:

No se permitan depósitos negativos.
No se permitan retiros negativos.
No se pueda retirar más dinero del saldo disponible.
No se acepten opciones inexistentes.

Al finalizar, debe mostrar:

Depósitos realizados.
Retiros realizados.
Total depositado.
Total retirado.
Saldo final.

Estructuras esperadas: do-while, switch, contadores y acumuladores.

## Analisis
Entrada<br>
Seleccionar una opción del menú.<br>
Ingresar el valor del depósito cuando corresponda.<br>
Ingresar el valor del retiro cuando corresponda.<br>
Proceso<br>
Iniciar el saldo en $100.<br>
Mostrar el menú del cajero.<br>
Leer la opción seleccionada.<br>
Si es 1, consultar y mostrar el saldo.<br>
Si es 2, solicitar el depósito y verificar que no sea negativo.<br>
Si el depósito es válido, sumarlo al saldo y aumentar el contador de depósitos.<br>
Si es 3, solicitar el retiro.<br>
Verificar que el retiro no sea negativo y que no supere el saldo disponible.<br>
Si es válido, restarlo del saldo y aumentar el contador de retiros.<br>
Si es 4, mostrar los movimientos realizados.<br>
Si es 5, finalizar el programa.<br>
Si se ingresa otra opción, mostrar un mensaje de opción inválida.<br>
Repetir el menú mientras la opción sea diferente de 5.<br>
Salida<br>
Mostrar el saldo disponible.<br>
Mostrar los movimientos realizados.<br>
Mostrar la cantidad de depósitos.<br>
Mostrar la cantidad de retiros.<br>
Mostrar el total depositado.<br>
Mostrar el total retirado.<br>
Mostrar el saldo final.<br>

## Pseudocodigo
```
Proceso CajeroAcademico

    Definir saldo, acumDepositos, acumRetiros Como Real
    Definir contDepositos, contRetiros, opcion Como Entero
    Definir deposito, retiro Como Real

    saldo <- 100.0
    contDepositos <- 0
    contRetiros <- 0
    acumDepositos <- 0
    acumRetiros <- 0

    Repetir

        Escribir "========================"
        Escribir "    CAJERO ACADEMICO"
        Escribir "========================"
        Escribir "1. Consultar saldo"
        Escribir "2. Depositar"
        Escribir "3. Retirar"
        Escribir "4. Mostrar movimientos"
        Escribir "5. Salir"
        Escribir "========================"
        Escribir "Elige una opcion:"
        Leer opcion

        Segun opcion Hacer

            1:
                Escribir "Tu saldo actual es: $", saldo

            2:
                Escribir "Cuanto deseas depositar: $"
                Leer deposito

                Si deposito <= 0 Entonces
                    Escribir "Error: No se permiten depositos negativos o cero."
                SiNo
                    saldo <- saldo + deposito
                    contDepositos <- contDepositos + 1
                    acumDepositos <- acumDepositos + deposito
                    Escribir "Deposito exitoso. Nuevo saldo: $", saldo
                FinSi

            3:
                Escribir "Cuanto deseas retirar: $"
                Leer retiro

                Si retiro <= 0 Entonces
                    Escribir "Error: No se permiten retiros negativos o cero."
                SiNo
                    Si retiro > saldo Entonces
                        Escribir "Error: Fondos insuficientes. Tu saldo es: $", saldo
                    SiNo
                        saldo <- saldo - retiro
                        contRetiros <- contRetiros + 1
                        acumRetiros <- acumRetiros + retiro
                        Escribir "Retiro exitoso. Nuevo saldo: $", saldo
                    FinSi
                FinSi

            4:
                Escribir "--- MOVIMIENTOS ---"
                Escribir "Depositos realizados: ", contDepositos
                Escribir "Retiros realizados: ", contRetiros
                Escribir "Total depositado: $", acumDepositos
                Escribir "Total retirado: $", acumRetiros

            5:
                Escribir "Saliendo del cajero..."

            De Otro Modo:
                Escribir "Error: Opcion no valida. Elige del 1 al 5."

        FinSegun

    Hasta Que opcion = 5

    Escribir "====== RESUMEN FINAL ======"
    Escribir "Depositos realizados: ", contDepositos
    Escribir "Retiros realizados: ", contRetiros
    Escribir "Total depositado: $", acumDepositos
    Escribir "Total retirado: $", acumRetiros
    Escribir "Saldo final: $", saldo

FinProceso
```
## Prueba de escritorio 

|    Paso | Opción | Depósito | Retiro | Saldo | Cont. Dep. | Cont. Ret. | Acum. Dep. | Acum. Ret. |
| ------: | -----: | -------: | -----: | ----: | ---------: | ---------: | ---------: | ---------: |
| Inicial |      — |        — |      — |   100 |          0 |          0 |          0 |          0 |
|       1 |      1 |        — |      — |   100 |          0 |          0 |          0 |          0 |
|       2 |      2 |       50 |      — |   150 |          1 |          0 |         50 |          0 |
|       3 |      3 |        — |     30 |   120 |          1 |          1 |         50 |         30 |
|       4 |      4 |        — |      — |   120 |          1 |          1 |         50 |         30 |
|       5 |      5 |        — |      — |   120 |          1 |          1 |         50 |         30 |

## Diagrama 
<img width="1600" height="900" alt="WhatsApp Image 2026-09-24 at 11 12 00 AM" src="https://github.com/user-attachments/assets/d9f6812d-df4d-4986-91a8-0ac84ce206e3" />
