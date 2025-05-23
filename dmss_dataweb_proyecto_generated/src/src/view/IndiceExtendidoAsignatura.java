package src.view;

import java.util.Scanner;

public class IndiceExtendidoAsignatura {

    public static void mostrar() {
        Scanner sc = new Scanner(System.in);
        System.out.println("=== Índice extendido: Asignatura ===");

        System.out.println("Aplicación: invalid");
        
        System.out.println("Filtrar por Género:");
        System.out.println("1. Todos");
        System.out.println("2. Ficción");
        System.out.println("3. No Ficción");
        System.out.print("Selecciona una opción de filtro: ");
        int filtro = sc.nextInt();
        sc.nextLine();

        System.out.println("Listado de Asignatura:");
        for (int j = 1; j <= 6; j++) {
            System.out.println(j + ". Asignatura 0" + j + " (Acceso a los detalles)");
        }

        System.out.println("Paginación: 1 2 3 4");

        System.out.println("Síguenos en: https://www.twitter.com");
        System.out.println("Síguenos en: https://www.web.com");

        System.out.println("Aplicación generada automáticamente - Todos los derechos reservados");
        System.out.println("Sergio Terrazas Lobato y Javier Costillo Palacios");
    }
}
