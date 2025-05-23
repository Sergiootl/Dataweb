package src.view;

import java.util.Scanner;

public class CRUDTitulo {
    public static void mostrar() {
        Scanner sc = new Scanner(System.in);
        int opcion = -1;
        while (opcion != 0) {
            System.out.println("=== CRUD Titulo ===");
            System.out.println("Redes sociales: - Twitter @aneca - Twitter @aenui - Web: http://www.unex.es");
            System.out.println("0. Salir");
            System.out.println("1. Listar Titulo");
            System.out.println("2. Crear Titulo");
            System.out.println("3. Borrar Titulo");
            System.out.print("Selecciona una opción [0-3]: ");
            opcion = sc.nextInt();
            sc.nextLine();
            switch(opcion) {
                case 1:
                    System.out.println("Listando Titulo");
                    break;
                case 2:
                    System.out.println("Creando nuevo Titulo");
                    break;
                case 3:
                    System.out.println("Borrando Titulo");
                    break;
                case 0:
                    System.out.println("Volviendo...");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        }
    }
}
