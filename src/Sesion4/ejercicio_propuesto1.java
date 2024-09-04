package Sesion4;

import java.util.Scanner;

/**
 * Clase de ejemplo para el ejercicio propuesto 1.
 */
public class ejercicio_propuesto1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número entero del 1 al 5: ");
        int numero = scanner.nextInt();

        String palabra = "";

        switch (numero) {
            case 1:
                palabra = "uno";
                break;
            case 2:
                palabra = "dos";
                break;
            case 3:
                palabra = "tres";
                break;
            case 4:
                palabra = "cuatro";
                break;
            case 5:
                palabra = "cinco";
                break;
            default:
                System.out.println("Número fuera de rango. Por favor ingrese un número del 1 al 5.");
                return;
        }

        System.out.println("Número = " + numero);
        System.out.println("Palabra = \"" + palabra + "\"");
    }
}
