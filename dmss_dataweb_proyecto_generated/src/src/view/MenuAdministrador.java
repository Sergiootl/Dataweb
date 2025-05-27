
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

            int contador = 0;

            // Verificar si la funcionalidad existe para este rol
             contador++;
                System.out.println(contador + ". Asignatura - CrearInstancia");
            
            // Verificar si la funcionalidad existe para este rol
             contador++;
                System.out.println(contador + ". Asignatura - DetallesInstancia");
            
            // Verificar si la funcionalidad existe para este rol
             contador++;
                System.out.println(contador + ". Asignatura - ActualizacionInstancia");
            
            // Verificar si la funcionalidad existe para este rol
             contador++;
                System.out.println(contador + ". Asignatura - BorradoInstancia");
            
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
            
            // Verificar si la funcionalidad existe para este rol
             contador++;
                System.out.println(contador + ". Profesor - CrearInstancia");
            
            // Verificar si la funcionalidad existe para este rol
             contador++;
                System.out.println(contador + ". Profesor - ActualizacionInstancia");
            
            // Verificar si la funcionalidad existe para este rol
             contador++;
                System.out.println(contador + ". Profesor - BorradoInstancia");
            

            System.out.print("Selecciona una opción [0-" + (contador) + "]: ");
            opcion = sc.nextInt();
			
			 
			if(opcion!=0){opcion++;}
            sc.nextLine();
			
			 if(opcion> 8){opcion++;}
			 
            switch (opcion) {
                case 2: // Ajustar índice para coincidir con el contador
                    CrearAsignatura.mostrar();
                    break;
                case 3: // Ajustar índice para coincidir con el contador
                    DetalleAsignatura.mostrar(0);
                    break;
                case 4: // Ajustar índice para coincidir con el contador
                    ActualizarAsignatura.mostrar();
                    break;
                case 5: // Ajustar índice para coincidir con el contador
                    BorrarAsignatura.mostrar();
                    break;
                case 6: // Ajustar índice para coincidir con el contador
                    IndiceDetalleAsignatura.mostrar();
                    break;
                case 7: // Ajustar índice para coincidir con el contador
                    IndiceExtendidoAsignatura.mostrar();
                    break;
                case 8: // Ajustar índice para coincidir con el contador
                    IndiceAsignatura.mostrar();
                    break;
                case 10: // Ajustar índice para coincidir con el contador
                    CRUDTitulo.mostrar();
                    break;
                case 11: // Ajustar índice para coincidir con el contador
                    ContenidoNormalEvento.mostrar();
                    break;
                case 12: // Ajustar índice para coincidir con el contador
                    EncuestaSistemas_operativos.mostrar();
                    break;
                case 13: // Ajustar índice para coincidir con el contador
                    CuestionarioInformatica.mostrar();
                    break;
                case 14: // Ajustar índice para coincidir con el contador
                    CrearProfesor.mostrar();
                    break;
                case 15: // Ajustar índice para coincidir con el contador
                    ActualizarProfesor.mostrar();
                    break;
                case 16: // Ajustar índice para coincidir con el contador
                    BorrarProfesor.mostrar();
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

