
import java.util.Scanner;

public class Ejercicio6 {

    public static void main(String[] args) {

        // Creamos el Scanner para leer por teclado
        Scanner input = new Scanner(System.in);

        // Pedimos la nota
        System.out.println("Introduce una nota de 0 a 10: ");
        double nota = input.nextDouble();

        // Comprobamos si la nota es válida
        if (nota >= 0 && nota <= 10) {

            // Clasificamos la nota
            if (nota < 5) {

                System.out.println("Suspenso");

            } else if (nota < 7) {

                System.out.println("Aprobado");

            } else if (nota < 9) {

                System.out.println("Notable");

            } else {

                System.out.println("Sobresaliente");

            }

        } else {

            System.out.println("Nota no valida");

        }

    }
}