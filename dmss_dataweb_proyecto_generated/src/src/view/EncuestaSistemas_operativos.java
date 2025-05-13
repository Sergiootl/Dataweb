package src.view;

import java.util.Scanner;

public class EncuestaSistemas_operativos {
    public static void mostrar() {
        Scanner sc = new Scanner(System.in);
        System.out.println("=== Encuesta: Sistemas operativos ===");
        System.out.println("¿Cuanto te ha gustado la app?");
        System.out.println("Responde las siguientes preguntas:");

        System.out.println("Pregunta: ¿Cómo calificarías la facilidad de uso del sistema que has utilizado?");
        System.out.println("Opciones:");
        System.out.println("- Muy facil de usar");
        System.out.println("- Facil de usar");
        System.out.println("- Moderadamente facil");
        System.out.println("- Dificil de usar");
        System.out.println("- Muy dificil de usar");
        System.out.print("Tu respuesta: ");
        sc.nextLine();
        System.out.println("Pregunta: ¿Qué características mejorarías en la plataforma para facilitar su uso?");
        System.out.print("Escribe tu respuesta: ");
        sc.nextLine();
        System.out.println("Pregunta: ¿En qué medida consideras que la interfaz gráfica del sistema es atractiva?");
        System.out.println("Opciones:");
        System.out.println("- Muy atractiva");
        System.out.println("- Atractiva");
        System.out.println("- Neutral");
        System.out.println("- Poco atractiva");
        System.out.println("- Nada atractiva");
        System.out.print("Tu respuesta: ");
        sc.nextLine();
        System.out.println("Pregunta: ¿Cuánto tiempo, aproximadamente, sueles pasar usando la aplicación/plataforma cada semana?");
        System.out.println("Opciones:");
        System.out.println("- Menos de 1 hora");
        System.out.println("- Entre 1 y 3 horas");
        System.out.println("- Entre 3 y 5 horas");
        System.out.println("- Más de 5 horas");
        System.out.print("Tu respuesta: ");
        sc.nextLine();
        System.out.println("Pregunta:  ¿Qué tan probable es que recomiendes este sistema a otras personas?");
        System.out.println("Opciones:");
        System.out.println("- Muy probable");
        System.out.println("- Probable");
        System.out.println("- Neutral");
        System.out.println("- Poco probable");
        System.out.println("- Nada probable");
        System.out.print("Tu respuesta: ");
        sc.nextLine();

        System.out.println("Gracias por completar la encuesta.");
    }
}
