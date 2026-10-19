
import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {

        // Creamos el Scanner para leer por teclado
        Scanner input = new Scanner(System.in);

        // Pedimos los tres números
        System.out.println("Introduce el primer número: ");
        int numero1 = input.nextInt();

        System.out.println("Introduce el segundo número: ");
        int numero2 = input.nextInt();

        System.out.println("Introduce el tercer número: ");
        int numero3 = input.nextInt();

        // Comprobamos cuál es el mayor
        if (numero1 > numero2 && numero1 > numero3) {

            System.out.println("El mayor es " + numero1);

        } else if (numero2 > numero1 && numero2 > numero3) {

            System.out.println("El mayor es " + numero2);

        } else {

            System.out.println("El mayor es " + numero3);

        }

    }
}