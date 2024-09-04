/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Sesion4;

/**
 *
 * @author Usuario
 */

import java.util.Scanner;
public class ejercicio_propuesto2 {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número entero del 1 al 10: ");
        int numero = scanner.nextInt();

        String romano = "";

        switch (numero) {
            case 1:
                romano = "I";
                break;
            case 2:
                romano = "II";
                break;
            case 3:
                romano = "III";
                break;
            case 4:
                romano = "IV";
                break;
            case 5:
                romano = "V";
                break;
            case 6:
                romano = "VI";
                break;
            case 7:
                romano = "VII";
                break;
            case 8:
                romano = "VIII";
                break;
            case 9:
                romano = "IX";
                break;
            case 10:
                romano = "X";
                break;
            default:
                System.out.println("Número fuera de rango. Por favor ingrese un número del 1 al 10.");
                return;
        }

        System.out.println("Número = " + numero);
        System.out.println("Romano = \"" + romano + "\"");
    } 
}
