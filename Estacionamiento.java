import java.util.Scanner;

public class Estacionamiento {
    // Tarifas por hora - parametros del ejercicio
    static final double TARIFA_MOTO = 0.50;
    static final double TARIFA_AUTO = 1.00;
    static final double TARIFA_CAMIONETA = 1.50;

    static double calcularPago(int tipo, double horas) {
        switch (tipo) {
            case 1: return horas * TARIFA_MOTO;
            case 2: return horas * TARIFA_AUTO;
            case 3: return horas * TARIFA_CAMIONETA;
            default: return 0;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int contMotos = 0, contAutos = 0, contCamionetas = 0;
        double acumMotos = 0, acumAutos = 0, acumCamionetas = 0;
        int opcion = 1; // <-- AQUI ESTABA EL ERROR, TIENE QUE IR INICIALIZADO

        System.out.println("ESTACIONAMIENTO UNIVERSITARIO");

        do {
            System.out.println("\nTipo de vehiculo:");
            System.out.println("1. Motocicleta");
            System.out.println("2. Automovil");
            System.out.println("3. Camioneta");
            System.out.print("Seleccione: ");
            int tipo = sc.nextInt();

            System.out.print("Horas estacionado: ");
            double horas = sc.nextDouble();

            if (horas <= 0 || tipo < 1 || tipo > 3) {
                System.out.println("ERROR: Datos no validos. Horas > 0 y tipo 1-3");
            } else {
                double pago = calcularPago(tipo, horas);
                System.out.println("A pagar: $" + pago);

                switch (tipo) {
                    case 1: contMotos++; acumMotos += pago; break;
                    case 2: contAutos++; acumAutos += pago; break;
                    case 3: contCamionetas++; acumCamionetas += pago; break;
                }
            }

            System.out.print("\n¿Registrar otro? 1=Si 0=No: ");
            opcion = sc.nextInt();

        } while (opcion == 1);

        int totalVehiculos = contMotos + contAutos + contCamionetas;
        double totalRecaudado = acumMotos + acumAutos + acumCamionetas;
        double promedioPagado = totalVehiculos > 0 ? totalRecaudado / totalVehiculos : 0;

        System.out.println("\n===== REPORTE =====");
        System.out.println("Motocicletas: " + contMotos);
        System.out.println("Automoviles: " + contAutos);
        System.out.println("Camionetas: " + contCamionetas);
        System.out.println("Total vehiculos: " + totalVehiculos);
        System.out.println("Total recaudado: $" + totalRecaudado);
        System.out.println("Promedio pagado: $" + promedioPagado);
        System.out.println("===================");
        
        sc.close();
    }
}