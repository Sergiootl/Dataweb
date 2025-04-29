package src.view;

import java.util.Scanner;

public class IndiceTitulo {
    public static void mostrar() {
        Scanner sc = new Scanner(System.in);
        int opcion = -1;
        while (opcion != 0) {
            System.out.println("Pantalla índice de AsignaturaEstudianteProfesor");
            System.out.println("Redes sociales: - Twitter @aneca - Twitter @aenui - Web: http://www.unex.es");
            System.out.println("Listado de AsignaturaEstudianteProfesor:");
            System.out.println("0. Salir");
            System.out.println("1. Nombre o ID de AsignaturaEstudianteProfesor 01");
            System.out.println("2. Nombre o ID de AsignaturaEstudianteProfesor 02");
            System.out.println("3. Nombre o ID de AsignaturaEstudianteProfesor 03");
            System.out.println("4. Volver");
            System.out.print("Selecciona una opción  0-4 : ");
            opcion = sc.nextInt();
            sc.nextLine();
            if (opcion == 4 || opcion == 0) break;
        }
    }
}
