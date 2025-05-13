package src.view;

import java.util.Scanner;

public class MainMenu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion = -1;
        while (opcion != 0) {
            System.out.println("=== Universidad de Extremadura Data Management ===");
            System.out.println("Redes sociales: - Twitter @aneca - Twitter @aenui - Web: http://www.unex.es");
            System.out.println("0. Salir");
            System.out.println(1 + ". Administrador");
            System.out.println(2 + ". Profesor");
            System.out.println(3 + ". Estudiante");
            System.out.println(4 + ". Personal de Administración y servicios");
            System.out.print("Selecciona una opción [0-4]: ");
            opcion = sc.nextInt();
            sc.nextLine();
            switch(opcion) {
                case 1:
                    MenuAdministrador.mostrar();
                    break;
                case 2:
                    MenuProfesor.mostrar();
                    break;
                case 3:
                    MenuEstudiante.mostrar();
                    break;
                case 4:
                    MenuPersonal_de_Administración_y_servicios.mostrar();
                    break;
                case 0:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        }
        sc.close();
    }
}
