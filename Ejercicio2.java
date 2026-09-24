import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Tabla inicial: ");
        int inicial = sc.nextInt();
        
        System.out.print("Tabla final: ");
        int fin = sc.nextInt();

        if (inicial > fin) {
            System.out.println("Error: la tabla inicial no puede ser mayor que la final.");
            sc.close();
            return;
        }

        System.out.print("Hasta que multiplicador: ");
        int hasta = sc.nextInt();

        for (int i = inicial; i <= fin; i++) {
            System.out.println("\nTABLA DEL " + i);
            for (int j = 1; j <= hasta; j++) {
                System.out.println(i + " x " + j + " = " + (i * j));
            }
        }
        sc.close();
    }
}