package src.view;

import java.util.Scanner;

public class ContenidoNormalEvento {
    public static void mostrar() {
        Scanner sc = new Scanner(System.in);
        System.out.println("=== Página: Evento ===");
        System.out.println("Hola, evento de programacion");

        System.out.println("Contenido multimedia: Java");
        System.out.println("Contenido multimedia: Python");
        System.out.println("Contenido multimedia: C++");

        System.out.println("Presiona Enter para volver...");
        sc.nextLine();
    }
}
