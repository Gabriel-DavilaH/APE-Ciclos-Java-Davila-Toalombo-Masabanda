import java.util.Scanner;

public class ParqueaderoUni {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final int MAX = 100;
        int[] tipos = new int[MAX];
        int[] roles = new int[MAX];
        int[] horas = new int[MAX];
        int[] dias = new int[MAX];
        boolean[] boletoPerdido = new boolean[MAX];
        double[] valores = new double[MAX];
        int totalVehiculos = 0;

        int opcion;
        do {
            System.out.println(" PARQUEADERO UNIVERSITARIO");
            System.out.println("1. Registrar vehiculo");
            System.out.println("2. Mostrar vehiculos registrados");
            System.out.println("3. Mostrar estadisticas");
            System.out.println("4. Mostrar recaudacion");
            System.out.println("5. Salir");
            System.out.print("Elige opcion: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    if (totalVehiculos >= MAX) {
                        System.out.println("Parqueadero lleno");
                        break;
                    }

                    int tipo;
                    do {
                        System.out.println("\nTipo: 1.Moto($0.50/h) 2.Carro($1.00/h) 3.Bici($0.25/h)");
                        System.out.print("Tipo (1-3): ");
                        tipo = sc.nextInt();
                    } while (tipo < 1 || tipo > 3);

                    int rol;
                    do {
                        System.out.println("Rol: 1.Estudiante(-20%) 2.Docente(-30%) 3.Visitante");
                        System.out.print("Rol (1-3): ");
                        rol = sc.nextInt();
                    } while (rol < 1 || rol > 3);

                    int h;
                    do {
                        System.out.print("Numero de horas (1-24): ");
                        h = sc.nextInt();
                    } while (h < 1 || h > 24);

                    int dia;
                    do {
                        System.out.print("Dia semana 1=Lun...7=Dom: ");
                        dia = sc.nextInt();
                    } while (dia < 1 || dia > 7);

                    String resp;
                    boolean perdido = false;
                    while (true) {
                        System.out.print("Boleto perdido? (si/no): ");
                        resp = sc.next().toLowerCase();
                        if (resp.equals("si") || resp.equals("no")) {
                            perdido = resp.equals("si");
                            break;
                        }
                    }

                    double tarifaHora = 0;
                    switch (tipo) {
                        case 1: tarifaHora = 0.50; break;
                        case 2: tarifaHora = 1.00; break;
                        case 3: tarifaHora = 0.25; break;
                    }

                    double subtotal = tarifaHora * h;
                    if (rol == 1) subtotal = subtotal * 0.80;
                    else if (rol == 2) subtotal = subtotal * 0.70;
                    if (dia == 6 || dia == 7) subtotal = subtotal * 1.20;
                    if (perdido) subtotal = subtotal + 5.0;

                    tipos[totalVehiculos] = tipo;
                    roles[totalVehiculos] = rol;
                    horas[totalVehiculos] = h;
                    dias[totalVehiculos] = dia;
                    boletoPerdido[totalVehiculos] = perdido;
                    valores[totalVehiculos] = subtotal;
                    totalVehiculos++;

                    System.out.println("Valor a pagar: $" + subtotal);
                    break;

                case 2:
                    if (totalVehiculos == 0) {
                        System.out.println("No hay vehiculos");
                        break;
                    }
                    for (int i = 0; i < totalVehiculos; i++) {
                        String t = (tipos[i]==1?"Moto":tipos[i]==2?"Carro":"Bici");
                        String r = (roles[i]==1?"Est":roles[i]==2?"Doc":"Vis");
                        System.out.println((i+1)+". "+t+" | "+r+" | "+horas[i]+"h | Dia:"+dias[i]+" | $"+valores[i]);
                    }
                    break;

                case 3:
                    if (totalVehiculos == 0) {
                        System.out.println("Sin datos");
                        break;
                    }
                    int cMoto=0, cCarro=0, cBici=0;
                    int cEst=0, cDoc=0, cVis=0;
                    int totalHoras=0;
                    double totalRec=0;
                    double mayor=valores[0], menor=valores[0];

                    for (int i = 0; i < totalVehiculos; i++) {
                        if (tipos[i]==1) cMoto++; else if (tipos[i]==2) cCarro++; else cBici++;
                        if (roles[i]==1) cEst++; else if (roles[i]==2) cDoc++; else cVis++;
                        totalHoras += horas[i];
                        totalRec += valores[i];
                        if (valores[i] > mayor) mayor = valores[i];
                        if (valores[i] < menor) menor = valores[i];
                    }
                    System.out.println("Vehiculos: "+totalVehiculos);
                    System.out.println("Por tipo: Moto="+cMoto+" Carro="+cCarro+" Bici="+cBici);
                    System.out.println("Por rol: Est="+cEst+" Doc="+cDoc+" Vis="+cVis);
                    System.out.println("Total horas: "+totalHoras);
                    System.out.println("Promedio: "+(double)totalHoras/totalVehiculos);
                    System.out.println("Mayor: $"+mayor+" Menor: $"+menor);

                    for (int d = 1; d <= 7; d++) {
                        int contDia = 0;
                        for (int j = 0; j < totalVehiculos; j++) {
                            if (dias[j] == d) contDia++;
                        }
                        if (contDia > 0) System.out.println("Dia "+d+": "+contDia);
                    }
                    break;

                case 4:
                    double recaudacion = 0;
                    int idx = 0;
                    while (idx < totalVehiculos) {
                        recaudacion += valores[idx];
                        idx++;
                    }
                    System.out.println("Total recaudado: $"+recaudacion);
                    break;

                case 5:
                    System.out.println("Saliendo...");
                    break;
            }
        } while (opcion!= 5);
        sc.close();
    }
}