package src.view;

import java.util.Scanner;

public class BorrarProfesor {
    public static void mostrar() {
        Scanner sc = new Scanner(System.in);
        int opcion = -1;

        while (opcion != 0) {
            System.out.println("Pantalla de borrar ");
            System.out.println("Redes sociales: - Twitter @aneca - Twitter @aenui - Web: http://www.unex.es");
            System.out.println("0. Salir");

            // Mostrar lista de atributos con índices
            int contador = 1;
            System.out.println(contador + ". Nombre o ID de Nombre (Borrar)");
            contador++;
            System.out.println(contador + ". Nombre o ID de Apellidos (Borrar)");
            contador++;
            System.out.println(contador + ". Nombre o ID de DNI (Borrar)");
            contador++;
            System.out.println(contador + ". Nombre o ID de Departamento (Borrar)");
            contador++;

            System.out.print("Selecciona una opción [0-" + (contador - 1) + "]: ");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    System.out.println(">> Nombre borrada!!");
                    break;
                case 2:
                    System.out.println(">> Apellidos borrada!!");
                    break;
                case 3:
                    System.out.println(">> DNI borrada!!");
                    break;
                case 4:
                    System.out.println(">> Departamento borrada!!");
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
