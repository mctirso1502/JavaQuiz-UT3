import java.util.Scanner;

public class JavaQuiz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int aciertos = 0;
        System.out.println("---- Bienvenido al JavaQuiz-UT3 ----");

        // Pregunta 1 (Integrante A)
        System.out.println("1. ¿Cuál es el tamaño de un int en Java?\n a) 8 bits\n b) 16 bits\n c) 32 bits");
        if (scanner.nextLine().equalsIgnoreCase("c")) aciertos++;
    }
}
