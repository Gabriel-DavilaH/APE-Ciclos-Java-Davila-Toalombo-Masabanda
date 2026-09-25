
public class ErrorVoluntario {
    public static void main(String[] args) {
        // ERROR: punto y coma despues del for
        for (int i = 1; i <= 5; i++);
        {
            System.out.println("Esto se ejecuta solo una vez y con i=6");
            // System.out.println(i); -> ni siquiera compila, i no existe aqui
        }

        // CORREGIDO:
        System.out.println("\n-- CORREGIDO --");
        for (int i = 1; i <= 5; i++) {
            System.out.println("i = " + i);
        }
    }
}
