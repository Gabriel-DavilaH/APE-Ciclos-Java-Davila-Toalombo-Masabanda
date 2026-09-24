## Enunciado
Ejercicio 7. Control de ventas de cafetería

Construya un sistema con un menú para una cafetería universitaria que permita registrar ventas, mostrar estadísticas, mostrar la tabla de productos y salir del programa.

Los productos disponibles son:

Café — $1.00
Sándwich — $2.50
Jugo — $1.50
Empanada — $1.25

Al registrar una venta se deberá solicitar el producto y la cantidad.

El reporte deberá indicar:

Número de ventas.
Cantidad total de productos.
Total recaudado.
Promedio por venta.
Producto con mayor cantidad vendida.

Validar todos los datos ingresados.

Estructuras esperadas: do-while, switch, contadores, acumuladores y condicionales.
## Analisis
**<br>Entrada<br>**
Seleccionar una opción del menú.<br>
Ingresar el producto.<br>
Ingresar la cantidad de productos vendidos.<br>
**<br>Proceso<br>**
Mostrar el menú de la cafetería.<br>
Leer la opción seleccionada.<br>
Si se registra una venta, seleccionar el producto mediante switch.<br>
Obtener el precio correspondiente al producto.<br>
Validar que la cantidad sea válida.<br>
Calcular el valor de la venta.<br>
Aumentar el número de ventas.<br>
Acumular la cantidad total de productos.<br>
Acumular el total recaudado.<br>
Comparar las cantidades vendidas para determinar el producto con mayor cantidad.<br>
Calcular el promedio por venta.<br>
Repetir el menú hasta seleccionar la opción Salir.<br>
**<br>Salida<br>**
Mostrar la tabla de productos y sus precios.<br>
Mostrar el número de ventas.<br>
Mostrar la cantidad total de productos vendidos.<br>
Mostrar el total recaudado.<br>
Mostrar el promedio por venta.<br>
Mostrar el producto con mayor cantidad vendida.<br>
## Pseudocodigo 
````
Proceso Cafeteria

    Definir numVentas, cantidadTotal Como Entero
    Definir totalRecaudado Como Real
    Definir cantCafe, cantSandwich, cantJugo, cantEmpanada Como Entero
    Definir opcion, prod, cant, max Como Entero
    Definir precio, subtotal, promedio Como Real
    Definir masVendido Como Caracter

    numVentas <- 0
    cantidadTotal <- 0
    totalRecaudado <- 0

    cantCafe <- 0
    cantSandwich <- 0
    cantJugo <- 0
    cantEmpanada <- 0

    Repetir

        Escribir "CAFETERIA UNIVERSITARIA"
        Escribir "1. Registrar venta"
        Escribir "2. Mostrar estadisticas"
        Escribir "3. Mostrar tabla de productos"
        Escribir "4. Salir"
        Escribir "Elige opcion:"
        Leer opcion

        Segun opcion Hacer

            1:
                Escribir "Productos:"
                Escribir "1. Cafe $1.00"
                Escribir "2. Sandwich $2.50"
                Escribir "3. Jugo $1.50"
                Escribir "4. Empanada $1.25"

                Escribir "Producto (1-4):"
                Leer prod

                Escribir "Cantidad:"
                Leer cant

                Si cant <= 0 Entonces
                    Escribir "Error: Cantidad debe ser > 0"
                SiNo

                    precio <- 0

                    Segun prod Hacer
                        1:
                            precio <- 1.00
                            cantCafe <- cantCafe + cant

                        2:
                            precio <- 2.50
                            cantSandwich <- cantSandwich + cant

                        3:
                            precio <- 1.50
                            cantJugo <- cantJugo + cant

                        4:
                            precio <- 1.25
                            cantEmpanada <- cantEmpanada + cant

                        De Otro Modo:
                            Escribir "Error: Producto no valido"
                            precio <- -1
                    FinSegun

                    Si precio <> -1 Entonces
                        subtotal <- precio * cant
                        totalRecaudado <- totalRecaudado + subtotal
                        cantidadTotal <- cantidadTotal + cant
                        numVentas <- numVentas + 1

                        Escribir "Venta registrada: $", subtotal
                    FinSi

                FinSi

            2:
                Escribir "--- ESTADISTICAS ---"
                Escribir "Numero de ventas: ", numVentas
                Escribir "Cantidad total de productos: ", cantidadTotal
                Escribir "Total recaudado: $", totalRecaudado

                Si numVentas > 0 Entonces
                    promedio <- totalRecaudado / numVentas
                SiNo
                    promedio <- 0
                FinSi

                Escribir "Promedio por venta: $", promedio

                Si numVentas = 0 Entonces
                    Escribir "Producto mas vendido: Ninguno aun"
                SiNo

                    masVendido <- "Cafe"
                    max <- cantCafe

                    Si cantSandwich > max Entonces
                        max <- cantSandwich
                        masVendido <- "Sandwich"
                    FinSi

                    Si cantJugo > max Entonces
                        max <- cantJugo
                        masVendido <- "Jugo"
                    FinSi

                    Si cantEmpanada > max Entonces
                        max <- cantEmpanada
                        masVendido <- "Empanada"
                    FinSi

                    Escribir "Producto con mayor cantidad vendida: ", masVendido
                    Escribir "Unidades: ", max

                FinSi

            3:
                Escribir "--- TABLA DE PRODUCTOS ---"
                Escribir "1. Cafe      $1.00"
                Escribir "2. Sandwich  $2.50"
                Escribir "3. Jugo      $1.50"
                Escribir "4. Empanada  $1.25"

            4:
                Escribir "Saliendo..."

            De Otro Modo:
                Escribir "Error: Opcion no valida"

        FinSegun

    Hasta Que opcion = 4

FinProceso

````

## Prueba de escritorio 

|    Paso | Opción | Producto | Cant. | Precio | Subtotal | Ventas | Cant. total | Recaudado | Café | Sandwich | Jugo | Empanada |
| ------: | -----: | -------- | ----: | -----: | -------: | -----: | ----------: | --------: | ---: | -------: | ---: | -------: |
| Inicial |      — | —        |     — |      — |        — |      0 |           0 |     $0.00 |    0 |        0 |    0 |        0 |
|       1 |      1 | Café     |     3 |  $1.00 |    $3.00 |      1 |           3 |     $3.00 |    3 |        0 |    0 |        0 |
|       2 |      1 | Sandwich |     2 |  $2.50 |    $5.00 |      2 |           5 |     $8.00 |    3 |        2 |    0 |        0 |
|       3 |      1 | Jugo     |     4 |  $1.50 |    $6.00 |      3 |           9 |    $14.00 |    3 |        2 |    4 |        0 |
|       4 |      2 | —        |     — |      — |        — |      3 |           9 |    $14.00 |    3 |        2 |    4 |        0 |
|       5 |      4 | —        |     — |      — |        — |      3 |           9 |    $14.00 |    3 |        2 |    4 |        0 |

## Diagrama
<img width="1920" height="1080" alt="image" src="https://github.com/user-attachments/assets/c883f3b2-5342-4864-9a12-7b874cab2a0c" />
