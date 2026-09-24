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
