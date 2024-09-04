/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Sesion4;
import java.util.Scanner;
/**
 *
 * @author Usuario
 */
public class ejercicio_propuesto3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número entero del 1 al 6: ");
        int numero = scanner.nextInt();

        String ingles = "";

        switch (numero) {
            case 1:
                ingles = "one";
                break;
            case 2:
                ingles = "two";
                break;
            case 3:
                ingles = "three";
                break;
            case 4:
                ingles = "four";
                break;
            case 5:
                ingles = "five";
                break;
            case 6:
                ingles = "six";
                break;
            default:
                System.out.println("Número fuera de rango. Por favor ingrese un número del 1 al 6.");
                return;
        }

        System.out.println("Número = " + numero);
        System.out.println("Inglés = \"" + ingles + "\"");
    }
}
