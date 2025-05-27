package src.view;

import java.util.Scanner;

public class DetalleAsignatura {
    public static void mostrar(int id) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Pantalla de detalle de ");
        System.out.println("Redes sociales: - Twitter @aneca - Twitter @aenui - Web: http://www.unex.es");
        System.out.println("Campos:");
        System.out.println("1. Borrar ");
        System.out.println("2. Volver");
        System.out.print("Selecciona una opción [1-2]: ");
        int opcion = sc.nextInt();
        sc.nextLine();

		if(opcion == 1){
		 System.out.println("  borrada correctamente");
     	
		}
    }
}
