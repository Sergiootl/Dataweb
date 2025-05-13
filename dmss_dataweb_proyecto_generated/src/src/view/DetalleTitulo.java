package src.view;

import java.util.Scanner;

public class DetalleTitulo {
    public static void mostrar(int id) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Pantalla de detalle de AsignaturaEstudianteProfesor");
        System.out.println("Redes sociales: - Twitter @aneca - Twitter @aenui - Web: http://www.unex.es");
        System.out.println("Campos:");
        System.out.println("- Nombre: valor_de_Nombre");
        System.out.println("- Creditos: valor_de_Creditos");
        System.out.println("- Optativa: valor_de_Optativa");
        System.out.println("- Nombre: valor_de_Nombre");
        System.out.println("- Apellidos: valor_de_Apellidos");
        System.out.println("- DNI: valor_de_DNI");
        System.out.println("- Nombre: valor_de_Nombre");
        System.out.println("- Apellidos: valor_de_Apellidos");
        System.out.println("- DNI: valor_de_DNI");
        System.out.println("- Departamento: valor_de_Departamento");
        System.out.println("1. Borrar AsignaturaEstudianteProfesor");
        System.out.println("2. Volver");
        System.out.print("Selecciona una opción [1-2]: ");
        int opcion = sc.nextInt();
        sc.nextLine();

		if(opcion == 1){
		 System.out.println(" AsignaturaEstudianteProfesor borrada correctamente");
     	
		}
    }
}
