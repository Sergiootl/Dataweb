package src.view;

import java.util.Scanner;

public class BorrarAsignatura {
    public static void mostrar() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Pantalla de borrar TituloProfesor");
        System.out.println("Redes sociales: - Twitter @aneca - Twitter @aenui - Web: http://www.unex.es");
        System.out.println("1. Nombre o ID de entidad 01 (Borrar)");
        System.out.println("2. Nombre o ID de entidad 02 (Borrar)");
        System.out.println("0. Salir");
        System.out.print("Selecciona una opción -2: ");
        int opcion = sc.nextInt();
        sc.nextLine();
        if (opcion != 0) {
            System.out.println(">> TituloProfesor borrada!!");
        } else {
            System.out.println("Volviendo...");
        }
    }
}
