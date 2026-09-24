import java.util.Scanner;

public class TrianguloPatrones {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n;
        do {
            System.out.print("Ingrese un numero entre 2 y 10: ");
            n = sc.nextInt();
            if (n < 2 || n > 10) {
                System.out.println("Error: debe ser entre 2 y 10");
            }
        } while (n < 2 || n > 10);

        // 1. Triangulo creciente
        System.out.println("\nTriangulo 1:");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // 2. Triangulo decreciente
        System.out.println("\nPosteriormente:");
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // 3. Patron numerico
        System.out.println("\nFinalmente:");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
        
        sc.close();
    }
}