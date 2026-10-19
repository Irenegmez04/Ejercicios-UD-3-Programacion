

import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {

        // Creamos el Scanner para leer por teclado
        Scanner input = new Scanner(System.in);

        // Pedimos la edad
        System.out.println("Introduce tu edad: ");
        int edad = input.nextInt();

        // Comprobamos si es mayor o menor de edad
        if (edad >= 18) {

            System.out.println("Eres mayor de edad");

        } else {

            System.out.println("Eres menor de edad");

        }

    }
}