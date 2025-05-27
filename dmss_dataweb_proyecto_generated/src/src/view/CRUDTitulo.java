package src.view;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CRUDTitulo {
    private static List<String> titulos = new ArrayList<>(); // Lista para almacenar instancias

    public static void mostrar() {
        Scanner sc = new Scanner(System.in);
        int opcion = -1;

        while (opcion != 0) {
            System.out.println("=== CRUD Titulo ===");
            System.out.println("Redes sociales: - Twitter @aneca - Twitter @aenui - Web: http://www.unex.es");
            System.out.println("0. Salir");
            System.out.println("1. Listar Titulo");
            System.out.println("2. Crear Titulo");
            System.out.println("3. Borrar Titulo");
            System.out.print("Selecciona una opción [0-3]: ");
            opcion = sc.nextInt();
            sc.nextLine(); // Consumir el salto de línea

            switch (opcion) {
                case 1:
                    listarTitulo();
                    break;
                case 2:
                    crearTitulo(sc);
                    break;
                case 3:
                    borrarTitulo(sc);
                    break;
                case 0:
                    System.out.println("Volviendo...");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        }
    }

    private static void listarTitulo() {
        System.out.println("=== Listado de Titulo ===");
        if (titulos.isEmpty()) {
            System.out.println("No hay titulo disponibles.");
        } else {
            for (int i = 0; i < titulos.size(); i++) {
                System.out.println((i + 1) + ". " + titulos.get(i));
            }
        }
    }

    private static void crearTitulo(Scanner sc) {
        System.out.print("Introduce el nombre del nuevo Titulo: ");
        String nuevoTitulo = sc.nextLine();
        titulos.add(nuevoTitulo);
        System.out.println("Titulo \"" + nuevoTitulo + "\" creado correctamente.");
    }

    private static void borrarTitulo(Scanner sc) {
        listarTitulo();
        if (!titulos.isEmpty()) {
            System.out.print("Selecciona el número del Titulo a borrar: ");
            int indice = sc.nextInt();
            sc.nextLine(); // Consumir el salto de línea
            if (indice > 0 && indice <= titulos.size()) {
                String tituloBorrado = titulos.remove(indice - 1);
                System.out.println("Titulo \"" + tituloBorrado + "\" borrado correctamente.");
            } else {
                System.out.println("Índice no válido.");
            }
        }
    }
}
