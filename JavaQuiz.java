import java.util.Scanner;

public class JavaQuiz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int aciertos = 0;
        System.out.println("---- Bienvenido al JavaQuiz-UT3 ----");

        // Pregunta 1 (Integrante A)
        System.out.println("1. ¿Cuál es el tamaño de un int en Java?\n a) 8 bits\n b) 16 bits\n c) 32 bits");
        if (scanner.nextLine().equalsIgnoreCase("c")) {
            aciertos++;
        }

        // Pregunta 2 (Integrante A)
        System.out.println("2. ¿Qué palabra clave se usa para heredar una clase?\n a) implements\n b) extends\n c) inherits");
        if (scanner.nextLine().equalsIgnoreCase("b")) {
            aciertos++;
        }

        // Pregunta 3 (Integrante A)
        System.out.println("3. ¿Cuál es el valor por defecto de un boolean?\n a) true\n b) false\n c) null");
        if (scanner.nextLine().equalsIgnoreCase("b")) {
            aciertos++;
        }

        // Pregunta 4 (Integrante B)
        System.out.println("4. ¿Qué método es el punto de entrada de un programa Java?\n a) start()\n b) main()\n c) init()");
        if (scanner.nextLine().equalsIgnoreCase("b")) aciertos++;

        // Pregunta 5 (Integrante B)
        System.out.println("5. ¿String es un tipo primitivo?\n a) Sí\n b) No");
        if (scanner.nextLine().equalsIgnoreCase("b")) aciertos++;

        // Pregunta 6 (Integrante B)
        System.out.println("6. ¿Qué paquete se importa automáticamente en Java?\n a) java.util\n b) java.io\n c) java.lang");
        if (scanner.nextLine().equalsIgnoreCase("c")) aciertos++;

        System.out.println("Has acertado " + aciertos + " preguntas.");
        scanner.close();
    }
}
