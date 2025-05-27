package src.view;

import java.util.Scanner;

public class IndiceAsignatura {
    public static void mostrar() {
        Scanner sc = new Scanner(System.in);
        int opcion = -1;
        while (opcion != 0) {
            System.out.println("Pantalla índice de ");
            System.out.println("Redes sociales: - Twitter @aneca - Twitter @aenui - Web: http://www.unex.es");
            System.out.println("Listado de :");
            System.out.println("0. Salir");
            int contador = 1;
            System.out.print("Selecciona una opción [0-" + (contador - 1) + "]: ");
            opcion = sc.nextInt();
            sc.nextLine();
            if (opcion == 0) break;
        }
    }
}
