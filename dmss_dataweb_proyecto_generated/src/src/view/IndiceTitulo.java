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
            int contador = 1;
            System.out.println(contador + ". Nombre o ID de Nombre (Acceso a los detalles)");
            contador++;
            System.out.println(contador + ". Nombre o ID de Creditos (Acceso a los detalles)");
            contador++;
            System.out.println(contador + ". Nombre o ID de Optativa (Acceso a los detalles)");
            contador++;
            System.out.println(contador + ". Nombre o ID de Nombre (Acceso a los detalles)");
            contador++;
            System.out.println(contador + ". Nombre o ID de Apellidos (Acceso a los detalles)");
            contador++;
            System.out.println(contador + ". Nombre o ID de DNI (Acceso a los detalles)");
            contador++;
            System.out.println(contador + ". Nombre o ID de Nombre (Acceso a los detalles)");
            contador++;
            System.out.println(contador + ". Nombre o ID de Apellidos (Acceso a los detalles)");
            contador++;
            System.out.println(contador + ". Nombre o ID de DNI (Acceso a los detalles)");
            contador++;
            System.out.println(contador + ". Nombre o ID de Departamento (Acceso a los detalles)");
            contador++;
            System.out.print("Selecciona una opción [0-" + (contador - 1) + "]: ");
            opcion = sc.nextInt();
            sc.nextLine();
            if (opcion == 0) break;
        }
    }
}
