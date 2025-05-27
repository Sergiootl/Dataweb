
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

            int contador = 0;

            // Verificar si la funcionalidad existe para este rol
             contador++;
                System.out.println(contador + ". Asignatura - DetallesInstancia");
            
            // Verificar si la funcionalidad existe para este rol
             contador++;
                System.out.println(contador + ". Asignatura - IndiceDetalle");
            
            // Verificar si la funcionalidad existe para este rol
             contador++;
                System.out.println(contador + ". Asignatura - IndiceExtendido");
            
            // Verificar si la funcionalidad existe para este rol
             contador++;
                System.out.println(contador + ". Asignatura - IndiceEntidad");
            
            // Verificar si la funcionalidad existe para este rol
             contador++;
                System.out.println(contador + ". Titulo - CRUD");
            
            // Verificar si la funcionalidad existe para este rol
             contador++;
                System.out.println(contador + ". Profesor - Normal");
            
            // Verificar si la funcionalidad existe para este rol
             contador++;
                System.out.println(contador + ". Titulo - Encuesta");
            
            // Verificar si la funcionalidad existe para este rol
             contador++;
                System.out.println(contador + ". Titulo - Cuestionario");
            

            System.out.print("Selecciona una opción [0-" + (contador) + "]: ");
            opcion = sc.nextInt();
			
			 
			if(opcion!=0){opcion++;}
            sc.nextLine();
			
			 if(opcion> 8){opcion++;}
			 
            switch (opcion) {
                case 2: // Ajustar índice para coincidir con el contador
                    DetalleAsignatura.mostrar(0);
                    break;
                case 3: // Ajustar índice para coincidir con el contador
                    IndiceDetalleAsignatura.mostrar();
                    break;
                case 4: // Ajustar índice para coincidir con el contador
                    IndiceExtendidoAsignatura.mostrar();
                    break;
                case 5: // Ajustar índice para coincidir con el contador
                    IndiceAsignatura.mostrar();
                    break;
                case 7: // Ajustar índice para coincidir con el contador
                    CRUDTitulo.mostrar();
                    break;
                case 8: // Ajustar índice para coincidir con el contador
                    ContenidoNormalEvento.mostrar();
                    break;
                case 9: // Ajustar índice para coincidir con el contador
                    EncuestaSistemas_operativos.mostrar();
                    break;
                case 10: // Ajustar índice para coincidir con el contador
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

