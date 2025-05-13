package src.view;

import java.util.Scanner;

public class ActualizarAsignatura {
    public static void mostrar() {
        Scanner sc = new Scanner(System.in);
        System.out.println("=== Actualizar TituloProfesor ===");

        // Listar las instancias disponibles
        System.out.println("Listado de instancias:");
        int contador = 1;
        System.out.println(contador + ". Titulo");
        contador++;
        System.out.println(contador + ". Profesor");
        contador++;

        System.out.print("Selecciona una instancia para actualizar (0 para salir): ");
        int opcion = sc.nextInt();
        sc.nextLine();

        if (opcion > 0 && opcion <= 2) {
            System.out.println("=== Actualizando instancia seleccionada ===");
			String nuevoValor;
            // Mostrar y permitir la edición de los atributos
            System.out.print("Nombre (valor actual: valor_de_Nombre): ");
            nuevoValor = sc.nextLine();
            System.out.println("Nombre actualizado a: " + nuevoValor);
            System.out.print("Creditos (valor actual: valor_de_Creditos): ");
            nuevoValor = sc.nextLine();
            System.out.println("Creditos actualizado a: " + nuevoValor);
            System.out.print("Optativa (valor actual: valor_de_Optativa): ");
            nuevoValor = sc.nextLine();
            System.out.println("Optativa actualizado a: " + nuevoValor);

            System.out.println("Instancia actualizada correctamente.");
        } else {
            System.out.println("Saliendo...");
        }
    }
}
