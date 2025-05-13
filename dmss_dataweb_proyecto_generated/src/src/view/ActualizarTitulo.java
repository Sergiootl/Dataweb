package src.view;

import java.util.Scanner;

public class ActualizarTitulo {
    public static void mostrar() {
        Scanner sc = new Scanner(System.in);
        System.out.println("=== Actualizar AsignaturaEstudianteProfesor ===");

        // Listar las instancias disponibles
        System.out.println("Listado de instancias:");
        int contador = 1;
        System.out.println(contador + ". Asignatura");
        contador++;
        System.out.println(contador + ". Estudiante");
        contador++;
        System.out.println(contador + ". Profesor");
        contador++;

        System.out.print("Selecciona una instancia para actualizar (0 para salir): ");
        int opcion = sc.nextInt();
        sc.nextLine();

        if (opcion > 0 && opcion <= 3) {
            System.out.println("=== Actualizando instancia seleccionada ===");
			String nuevoValor;
            // Mostrar y permitir la edición de los atributos
            System.out.print("Nombre (valor actual: valor_de_Nombre): ");
            nuevoValor = sc.nextLine();
            System.out.println("Nombre actualizado a: " + nuevoValor);
            System.out.print("Creditos totales (valor actual: valor_de_Creditos totales): ");
            nuevoValor = sc.nextLine();
            System.out.println("Creditos totales actualizado a: " + nuevoValor);

            System.out.println("Instancia actualizada correctamente.");
        } else {
            System.out.println("Saliendo...");
        }
    }
}
