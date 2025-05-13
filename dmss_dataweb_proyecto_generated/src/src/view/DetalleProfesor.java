package src.view;

import java.util.Scanner;

public class DetalleProfesor {
    public static void mostrar(int id) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Pantalla de detalle de Asignatura");
        System.out.println("Redes sociales: - Twitter @aneca - Twitter @aenui - Web: http://www.unex.es");
        System.out.println("Campos:");
        System.out.println("- Nombre: valor_de_Nombre");
        System.out.println("- Creditos: valor_de_Creditos");
        System.out.println("- Optativa: valor_de_Optativa");
        System.out.println("1. Borrar Asignatura");
        System.out.println("2. Volver");
        System.out.print("Selecciona una opción [1-2]: ");
        int opcion = sc.nextInt();
        sc.nextLine();

		if(opcion == 1){
		 System.out.println(" Asignatura borrada correctamente");
     	
		}
    }
}
