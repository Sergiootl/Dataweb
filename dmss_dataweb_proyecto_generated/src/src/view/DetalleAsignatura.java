package src.view;

import java.util.Scanner;

public class DetalleAsignatura {
    public static void mostrar(int id) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Pantalla de detalle de TituloProfesor");
        System.out.println("Redes sociales: - Twitter @aneca - Twitter @aenui - Web: http://www.unex.es");
        System.out.println("Campos:");
        System.out.println("- Nombre: valor_de_Nombre");
        System.out.println("- Creditos totales: valor_de_Creditos totales");
        System.out.println("- Nombre: valor_de_Nombre");
        System.out.println("- Apellidos: valor_de_Apellidos");
        System.out.println("- DNI: valor_de_DNI");
        System.out.println("- Departamento: valor_de_Departamento");
        System.out.println("1. Borrar TituloProfesor");
        System.out.println("2. Volver");
        System.out.print("Selecciona una opción -1: ");
        int opcion = sc.nextInt();
        sc.nextLine();
    }
}
