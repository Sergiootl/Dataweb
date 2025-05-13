package src.view;

import java.util.Scanner;

public class IndiceDetalleTitulo {

    public static void mostrar() {
        Scanner sc = new Scanner(System.in);
        System.out.println("=== Detalle de índice: Titulo ===");

        System.out.println("Aplicación: invalid");
        System.out.println("Listado de :");
        for (int j = 1; j <= 6; j++) {
            System.out.println(j + ".  0" + j);
        }

        System.out.print("Selecciona una instancia para ver detalles (0 para salir): ");
        int opcion = sc.nextInt();
        sc.nextLine();

        if (opcion > 0 && opcion <= 6) {
            System.out.println("=== Detalle de la instancia seleccionada ===");
            System.out.println("Nombre (String): valor_de_Nombre");
            System.out.println("Creditos totales (Integer): valor_de_Creditos totales");

            System.out.println("Id_Asignatura: Referencia a la entidad Asignatura");
            System.out.println("- Consultar detalles de Asignatura");
            System.out.println("Id_Estudiante: Referencia a la entidad Estudiante");
            System.out.println("- Consultar detalles de Estudiante");
            System.out.println("Id_Profesor: Referencia a la entidad Profesor");
            System.out.println("- Consultar detalles de Profesor");
        } else {
            System.out.println("Saliendo...");
        }


        System.out.println("Aplicación generada automáticamente - Todos los derechos reservados");
        System.out.println("Sergio Terrazas Lobato y Javier Costillo Palacios");
    }
}
