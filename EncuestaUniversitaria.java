import java.util.Scanner;

public class EncuestaUniversitaria {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numEstudiantes;
        do {
            System.out.print("¿Cuantos estudiantes participaran? ");
            numEstudiantes = sc.nextInt();
            if (numEstudiantes <= 0) {
                System.out.println("Error: Debe ser mayor a 0");
            }
        } while (numEstudiantes <= 0);

        double sumaEdades = 0;
        double sumaHoras = 0;
        int maxHoras = -1;
        int estudianteMaxHoras = 0;
        int menosDe2Horas = 0;

        int[] edades = new int[numEstudiantes];
        int[] semestres = new int[numEstudiantes];
        int[] horas = new int[numEstudiantes];

        for (int i = 0; i < numEstudiantes; i++) {
            System.out.println("\n--- Estudiante " + (i + 1) + " ---");

            int edad;
            do {
                System.out.print("Edad (16-80): ");
                edad = sc.nextInt();
                if (edad < 16 || edad > 80) System.out.println("Error: Edad fuera de rango");
            } while (edad < 16 || edad > 80);

            int semestre;
            do {
                System.out.print("Semestre (1-10): ");
                semestre = sc.nextInt();
                if (semestre < 1 || semestre > 10) System.out.println("Error: Semestre fuera de rango");
            } while (semestre < 1 || semestre > 10);

            int hEstudio;
            do {
                System.out.print("Horas de estudio por dia (0-24): ");
                hEstudio = sc.nextInt();
                if (hEstudio < 0 || hEstudio > 24) System.out.println("Error: Horas fuera de rango");
            } while (hEstudio < 0 || hEstudio > 24);

            edades[i] = edad;
            semestres[i] = semestre;
            horas[i] = hEstudio;

            sumaEdades += edad;
            sumaHoras += hEstudio;

            if (hEstudio < 2) {
                menosDe2Horas++;
            }

            if (hEstudio > maxHoras) {
                maxHoras = hEstudio;
                estudianteMaxHoras = i + 1;
            }
        }

        double promedioEdad = sumaEdades / numEstudiantes;
        double promedioHoras = sumaHoras / numEstudiantes;

        System.out.println("\n===== RESULTADOS =====");
        System.out.println("Edad promedio: " + promedioEdad);
        System.out.println("Horas promedio de estudio: " + promedioHoras);
        System.out.println("Estudiante con mayor cantidad de horas: Estudiante #" + estudianteMaxHoras + " con " + maxHoras + " horas");
        System.out.println("Estudiantes que estudian menos de 2 horas: " + menosDe2Horas);

        System.out.println("\nCantidad de estudiantes por semestre:");
        // Requisito: ciclos anidados
        for (int s = 1; s <= 10; s++) {
            int contador = 0;
            for (int j = 0; j < numEstudiantes; j++) {
                if (semestres[j] == s) {
                    contador++;
                }
            }
            if (contador > 0) {
                System.out.println("Semestre " + s + ": " + contador + " estudiante(s)");
            }
        }

        sc.close();
    }
}