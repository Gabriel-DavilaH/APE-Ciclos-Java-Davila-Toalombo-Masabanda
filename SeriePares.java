import java.util.Scanner;

public class SeriePares {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese N: ");
        int limite = entrada.nextInt();

        if (limite <= 1) {
            System.out.println("No existen numeros pares entre 2 y " + limite);
            entrada.close();
            return;
        }

        int totalPares = 0;
        int sumaTotal = 0;

        System.out.println("\nSerie:");
        for (int num = 2; num <= limite; num += 2) {
            System.out.print(num + " ");
            totalPares++;
            sumaTotal += num;
        }

        System.out.println("\n\nCantidad de pares: " + totalPares);
        System.out.println("Suma: " + sumaTotal);
        System.out.println("Promedio: " + ((double) sumaTotal / totalPares));

        entrada.close();
    }
}