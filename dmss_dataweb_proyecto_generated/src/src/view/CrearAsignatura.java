package src.view;

import java.util.Scanner;

public class CrearAsignatura {
    public static void mostrar() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Página de creación de ");
        System.out.println("Redes sociales: - Twitter @aneca - Twitter @aenui - Web: http://www.unex.es");
        System.out.println("Introduzca la información correspondiente:");
        System.out.println("1. Aceptar");
        System.out.println("2. Cancelar");
        System.out.print("Selecciona una opción [1-2]: ");
        int opcion = sc.nextInt();
        sc.nextLine();
        if (opcion == 1) {
            System.out.println("Entidad creada correctamente.");
        } else {
            System.out.println("Creación cancelada.");
        }
    }
}
