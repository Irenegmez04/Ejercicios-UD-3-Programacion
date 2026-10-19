
import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args) {

        // Creamos el Scanner para leer por teclado
        Scanner input = new Scanner(System.in);

        // Pedimos el año
        System.out.println("Introduce un año: ");
        int año = input.nextInt();

        // Comprobamos si el año es bisiesto
        if (año % 4 == 0 && año % 100 != 0 || año % 400 == 0) {

            System.out.println("El año es bisiesto");

        } else {

            System.out.println("El año no es bisiesto");

        }

    }
}