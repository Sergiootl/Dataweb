package src.view;

import java.util.Scanner;

public class CuestionarioInformatica {

    public static void mostrar() {
        Scanner sc = new Scanner(System.in);
        int correctas = 0;
        int total = 10; // Total number of questions

        System.out.println("=== Cuestionario: Informatica ===");
        System.out.println("Responde las siguientes preguntas:");

        // Pregunta 1
        System.out.println("Pregunta 1: ¿Qué es un sistema operativo?");
        System.out.print("Escribe tu respuesta: ");
        String respuesta1 = sc.nextLine();

        if (respuesta1.equals("org.eclipse.emf.ecore.impl.DynamicEObjectImpl@b026faa (eClass: org.eclipse.emf.ecore.impl.EClassImpl@3232a034 (name: Respuesta) (instanceClassName: null) (abstract: false, interface: false))")) {
            System.out.println("Respuesta correcta.");
            correctas++;
        } else {
            System.out.println("Respuesta incorrecta. La respuesta correcta es org.eclipse.emf.ecore.impl.DynamicEObjectImpl@b026faa (eClass: org.eclipse.emf.ecore.impl.EClassImpl@3232a034 (name: Respuesta) (instanceClassName: null) (abstract: false, interface: false)).");
        }

        // Pregunta 2
        System.out.println("Pregunta 2: ¿Qué es un protocolo de red?");
        System.out.print("Escribe tu respuesta: ");
        String respuesta2 = sc.nextLine();

        if (respuesta2.equals("org.eclipse.emf.ecore.impl.DynamicEObjectImpl@8a91d0e (eClass: org.eclipse.emf.ecore.impl.EClassImpl@3232a034 (name: Respuesta) (instanceClassName: null) (abstract: false, interface: false))")) {
            System.out.println("Respuesta correcta.");
            correctas++;
        } else {
            System.out.println("Respuesta incorrecta. La respuesta correcta es org.eclipse.emf.ecore.impl.DynamicEObjectImpl@8a91d0e (eClass: org.eclipse.emf.ecore.impl.EClassImpl@3232a034 (name: Respuesta) (instanceClassName: null) (abstract: false, interface: false)).");
        }

        // Pregunta 3
        System.out.println("Pregunta 3: ¿Qué es la encapsulación en programación orientada a objetos?");
        System.out.print("Escribe tu respuesta: ");
        String respuesta3 = sc.nextLine();

        if (respuesta3.equals("org.eclipse.emf.ecore.impl.DynamicEObjectImpl@1722c741 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@3232a034 (name: Respuesta) (instanceClassName: null) (abstract: false, interface: false))")) {
            System.out.println("Respuesta correcta.");
            correctas++;
        } else {
            System.out.println("Respuesta incorrecta. La respuesta correcta es org.eclipse.emf.ecore.impl.DynamicEObjectImpl@1722c741 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@3232a034 (name: Respuesta) (instanceClassName: null) (abstract: false, interface: false)).");
        }

        // Pregunta 4
        System.out.println("Pregunta 4: ¿Qué es una dirección IP?");
        System.out.println("Opciones:");
        System.out.println("- a) Una unidad de medida de velocidad en internet");
        System.out.println("- b) Una etiqueta numérica que identifica un dispositivo en una red");
        System.out.print("Tu respuesta: ");
        String respuesta4 = sc.nextLine();

        if (respuesta4.equals("b) Una etiqueta numérica que identifica un dispositivo en una red")) {
            System.out.println("Respuesta correcta.");
            correctas++;
        } else {
            System.out.println("Respuesta incorrecta. La respuesta correcta es b) Una etiqueta numérica que identifica un dispositivo en una red.");
        }

        // Pregunta 5
        System.out.println("Pregunta 5: ¿Qué es un servidor web?");
        System.out.print("Escribe tu respuesta: ");
        String respuesta5 = sc.nextLine();

        if (respuesta5.equals("org.eclipse.emf.ecore.impl.DynamicEObjectImpl@59c4141b (eClass: org.eclipse.emf.ecore.impl.EClassImpl@3232a034 (name: Respuesta) (instanceClassName: null) (abstract: false, interface: false))")) {
            System.out.println("Respuesta correcta.");
            correctas++;
        } else {
            System.out.println("Respuesta incorrecta. La respuesta correcta es org.eclipse.emf.ecore.impl.DynamicEObjectImpl@59c4141b (eClass: org.eclipse.emf.ecore.impl.EClassImpl@3232a034 (name: Respuesta) (instanceClassName: null) (abstract: false, interface: false)).");
        }

        // Pregunta 6
        System.out.println("Pregunta 6: ¿Qué es una variable en programación?");
        System.out.print("Escribe tu respuesta: ");
        String respuesta6 = sc.nextLine();

        if (respuesta6.equals("org.eclipse.emf.ecore.impl.DynamicEObjectImpl@585dd8ad (eClass: org.eclipse.emf.ecore.impl.EClassImpl@3232a034 (name: Respuesta) (instanceClassName: null) (abstract: false, interface: false))")) {
            System.out.println("Respuesta correcta.");
            correctas++;
        } else {
            System.out.println("Respuesta incorrecta. La respuesta correcta es org.eclipse.emf.ecore.impl.DynamicEObjectImpl@585dd8ad (eClass: org.eclipse.emf.ecore.impl.EClassImpl@3232a034 (name: Respuesta) (instanceClassName: null) (abstract: false, interface: false)).");
        }

        // Pregunta 7
        System.out.println("Pregunta 7: ¿Cuál es la diferencia entre TCP y UDP?");
        System.out.println("Opciones:");
        System.out.println("- a) TCP es más rápido que UDP");
        System.out.println("- b) UDP garantiza la entrega de los datos, mientras que TCP no");
        System.out.println("- c) TCP es orientado a la conexión y UDP no lo es");
        System.out.print("Tu respuesta: ");
        String respuesta7 = sc.nextLine();

        if (respuesta7.equals("c) TCP es orientado a la conexión y UDP no lo es")) {
            System.out.println("Respuesta correcta.");
            correctas++;
        } else {
            System.out.println("Respuesta incorrecta. La respuesta correcta es c) TCP es orientado a la conexión y UDP no lo es.");
        }

        // Pregunta 8
        System.out.println("Pregunta 8: ¿Qué es el ciclo de vida de un proceso en un sistema operativo?");
        System.out.print("Escribe tu respuesta: ");
        String respuesta8 = sc.nextLine();

        if (respuesta8.equals("org.eclipse.emf.ecore.impl.DynamicEObjectImpl@352eeff0 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@3232a034 (name: Respuesta) (instanceClassName: null) (abstract: false, interface: false))")) {
            System.out.println("Respuesta correcta.");
            correctas++;
        } else {
            System.out.println("Respuesta incorrecta. La respuesta correcta es org.eclipse.emf.ecore.impl.DynamicEObjectImpl@352eeff0 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@3232a034 (name: Respuesta) (instanceClassName: null) (abstract: false, interface: false)).");
        }

        // Pregunta 9
        System.out.println("Pregunta 9: El protocolo HTTP es utilizado para transferir datos de manera segura entre el cliente y el servidor.");
        System.out.println("Opciones: Verdadero / Falso");
        System.out.print("Tu respuesta: ");
        String respuesta9 = sc.nextLine();

        if (respuesta9.equalsIgnoreCase("Falso")) {
            System.out.println("Respuesta correcta.");
            correctas++;
        } else {
            System.out.println("Respuesta incorrecta. La respuesta correcta es Falso.");
        }

        // Pregunta 10
        System.out.println("Pregunta 10: La encapsulación en programación orientada a objetos permite ocultar los detalles de implementación y mostrar solo las interfaces necesarias.");
        System.out.println("Opciones: Verdadero / Falso");
        System.out.print("Tu respuesta: ");
        String respuesta10 = sc.nextLine();

        if (respuesta10.equalsIgnoreCase(" Verdadero")) {
            System.out.println("Respuesta correcta.");
            correctas++;
        } else {
            System.out.println("Respuesta incorrecta. La respuesta correcta es  Verdadero.");
        }


        // Mostrar resultados
        System.out.println("Gracias por completar el cuestionario.");
        System.out.println("Resultados: " + correctas + " correctas de " + total + " preguntas.");
        double calificacion = (double) correctas / total * 100;
        System.out.println("Calificación: " + calificacion + "%");
    }
}
