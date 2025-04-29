package src.view;

import java.util.Scanner;

public class MenuAdministrador {
    public static void mostrar() {
        Scanner sc = new Scanner(System.in);
        int opcion = -1;
        while (opcion != 0) {
            System.out.println("=== Pantalla principal del Rol Administrador ===");
            System.out.println("Redes sociales: - Twitter @aneca - Twitter @aenui - Web: http://www.unex.es");
            System.out.println("0. Salir");

            int contador = 1;
                System.out.println(contador + ". Asignatura");
                contador++;
                System.out.println(contador + ". Asignatura");
                contador++;
                System.out.println(contador + ". Asignatura");
                contador++;
                System.out.println(contador + ". Asignatura");
                contador++;
                System.out.println(contador + ". Titulo");
                contador++;
                System.out.println(contador + ". Titulo");
                contador++;
                System.out.println(contador + ". Titulo");
                contador++;
                System.out.println(contador + ". Home");
                contador++;
                System.out.println(contador + ". Titulo");
                contador++;
                System.out.println(contador + ". Evento");
                contador++;
                System.out.println(contador + ". 1");
                contador++;
                System.out.println(contador + ". 1");
                contador++;

			
            System.out.print("Selecciona una opción 0-"+(contador-1)+": ");
            opcion = sc.nextInt();
            sc.nextLine();

            switch(opcion) {
                case 2:
                    CrearAsignatura.mostrar();
                    break;
                case 3:
                    DetalleAsignatura.mostrar(0);
                    break;
                case 4:
                    break;
                case 5:
                    BorrarAsignatura.mostrar();
                    break;
                case 6:
                    break;
                case 7:
                    break;
                case 8:
                    IndiceTitulo.mostrar();
                    break;
                case 9:
                    break;
                case 10:
                    CRUDTitulo.mostrar();
                    break;
                case 11:
                    break;
                case 12:
                    break;
                case 13:
                    break;
                case 0:
                    System.out.println("Volviendo al menú principal...");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        }
    }
}
