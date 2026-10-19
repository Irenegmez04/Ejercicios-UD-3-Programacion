
import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {

        // Creamos el Scanner para leer por teclado
        Scanner input = new Scanner(System.in);

        // Pedimos los dos números
        System.out.println("Introduce el primer número: ");
        int numero1 = input.nextInt();

        System.out.println("Introduce el segundo número: ");
        int numero2 = input.nextInt();

        // Comprobamos cuál es el mayor
        if (numero1 > numero2) {

            System.out.println("El mayor es " + numero1);

        } else if (numero2 > numero1) {

            System.out.println("El mayor es " + numero2);

        } else {

            System.out.println("Son iguales");

        }

    }
}