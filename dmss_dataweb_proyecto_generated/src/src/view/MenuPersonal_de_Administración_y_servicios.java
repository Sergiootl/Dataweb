package src.view;

import java.util.Scanner;

public class MenuPersonal_de_Administración_y_servicios {
    public static void mostrar() {
        Scanner sc = new Scanner(System.in);
        int opcion = -1;
        while (opcion != 0) {
            System.out.println("=== Pantalla principal del Rol Personal de Administración y servicios ===");
            System.out.println("Redes sociales: - Twitter @aneca - Twitter @aenui - Web: http://www.unex.es");
            System.out.println("0. Salir");
            int contador = 1;
            System.out.println(contador + ". Asignatura - DetallesInstancia");
            contador++;
            System.out.println(contador + ". Asignatura - IndiceDetalle");
            contador++;
            System.out.println(contador + ". Asignatura - IndiceExtendido");
            contador++;
            System.out.println(contador + ". Asignatura - IndiceEntidad");
            contador++;
            System.out.println(contador + ". Titulo - Index");
            contador++;
            System.out.println(contador + ". Titulo - CRUD");
            contador++;
            System.out.println(contador + ". Profesor - Normal");
            contador++;
            System.out.println(contador + ". Titulo - Encuesta");
            contador++;
            System.out.println(contador + ". Titulo - Cuestionario");
            contador++;
            System.out.print("Selecciona una opción [0-" + (contador - 1) + "]: ");
            opcion = sc.nextInt();
            sc.nextLine();
            switch(opcion) {
                case 1:
                    DetalleAsignatura.mostrar(0);
 
                    break;
                case 2:
 
    IndiceDetalleAsignatura.mostrar();
                    break;
                case 3:
 
    IndiceExtendidoAsignatura.mostrar();
                    break;
                case 4:
                    IndiceAsignatura.mostrar();
 
                    break;
                case 5:
 
                    break;
                case 6:
                    CRUDTitulo.mostrar();
 
                    break;
                case 7:
 
    ContenidoNormalEvento.mostrar();
                    break;
                case 8:
                    EncuestaSistemas_operativos.mostrar();
 
                    break;
                case 9:
                    CuestionarioInformatica.mostrar();
 
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
