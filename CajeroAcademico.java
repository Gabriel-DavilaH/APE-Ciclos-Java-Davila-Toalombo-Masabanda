import java.util.Scanner;

public class CajeroAcademico {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double saldo = 100.0;
        int contDepositos = 0;
        int contRetiros = 0;
        double acumDepositos = 0;
        double acumRetiros = 0;
        
        int opcion;

        do {
            System.out.println("\n========================");
            System.out.println("    CAJERO ACADEMICO");
            System.out.println("========================");
            System.out.println("1. Consultar saldo");
            System.out.println("2. Depositar");
            System.out.println("3. Retirar");
            System.out.println("4. Mostrar movimientos");
            System.out.println("5. Salir");
            System.out.println("========================");
            System.out.print("Elige una opcion: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Tu saldo actual es: $" + saldo);
                    break;

                case 2:
                    System.out.print("Cuanto deseas depositar: $");
                    double deposito = sc.nextDouble();
                    if (deposito <= 0) {
                        System.out.println("Error: No se permiten depositos negativos o cero.");
                    } else {
                        saldo += deposito;
                        contDepositos++;
                        acumDepositos += deposito;
                        System.out.println("Deposito exitoso. Nuevo saldo: $" + saldo);
                    }
                    break;

                case 3:
                    System.out.print("Cuanto deseas retirar: $");
                    double retiro = sc.nextDouble();
                    if (retiro <= 0) {
                        System.out.println("Error: No se permiten retiros negativos o cero.");
                    } else if (retiro > saldo) {
                        System.out.println("Error: Fondos insuficientes. Tu saldo es: $" + saldo);
                    } else {
                        saldo -= retiro;
                        contRetiros++;
                        acumRetiros += retiro;
                        System.out.println("Retiro exitoso. Nuevo saldo: $" + saldo);
                    }
                    break;

                case 4:
                    System.out.println("\n--- MOVIMIENTOS ---");
                    System.out.println("Depositos realizados: " + contDepositos);
                    System.out.println("Retiros realizados: " + contRetiros);
                    System.out.println("Total depositado: $" + acumDepositos);
                    System.out.println("Total retirado: $" + acumRetiros);
                    break;

                case 5:
                    System.out.println("\nSaliendo del cajero...");
                    break;

                default:
                    System.out.println("Error: Opcion no valida. Elige del 1 al 5.");
                    break;
            }

        } while (opcion != 5);

        // Resumen final que pide el ejercicio
        System.out.println("\n====== RESUMEN FINAL ======");
        System.out.println("Depositos realizados: " + contDepositos);
        System.out.println("Retiros realizados: " + contRetiros);
        System.out.println("Total depositado: $" + acumDepositos);
        System.out.println("Total retirado: $" + acumRetiros);
        System.out.println("Saldo final: $" + saldo);

        sc.close();
    }
}