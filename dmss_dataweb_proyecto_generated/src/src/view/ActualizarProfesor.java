package src.view;

import java.util.Scanner;

public class ActualizarProfesor {
    public static void mostrar() {
        Scanner sc = new Scanner(System.in);
        System.out.println("=== Actualizar  ===");

        // Listar las instancias disponibles
        System.out.println("Listado de instancias:");
        int contador = 1;
        System.out.println(contador + ". Profesor");
        contador++;

        System.out.print("Selecciona una instancia para actualizar (0 para salir): ");
        int opcion = sc.nextInt();
        sc.nextLine();

        if (opcion > 0 && opcion <= 1) {
            System.out.println("=== Actualizando instancia seleccionada ===");
			String nuevoValor;
            // Mostrar y permitir la edición de los atributos
            System.out.print("Nombre (valor actual: valor_de_Nombre): ");
            nuevoValor = sc.nextLine();
            System.out.println("Nombre actualizado a: " + nuevoValor);
            System.out.print("Apellidos (valor actual: valor_de_Apellidos): ");
            nuevoValor = sc.nextLine();
            System.out.println("Apellidos actualizado a: " + nuevoValor);
            System.out.print("DNI (valor actual: valor_de_DNI): ");
            nuevoValor = sc.nextLine();
            System.out.println("DNI actualizado a: " + nuevoValor);
            System.out.print("Departamento (valor actual: valor_de_Departamento): ");
            nuevoValor = sc.nextLine();
            System.out.println("Departamento actualizado a: " + nuevoValor);

            System.out.println("Instancia actualizada correctamente.");
        } else {
            System.out.println("Saliendo...");
        }
    }
}
