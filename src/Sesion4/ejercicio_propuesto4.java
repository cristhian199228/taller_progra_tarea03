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
public class ejercicio_propuesto4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número entero (1, 2, 3, 4, 6, 12): ");
        int numero = scanner.nextInt();

        String periodo = "";

        switch (numero) {
            case 1:
                periodo = "mensual";
                break;
            case 2:
                periodo = "bimestral";
                break;
            case 3:
                periodo = "trimestral";
                break;
            case 4:
                periodo = "cuatrimestral";
                break;
            case 6:
                periodo = "semestral";
                break;
            case 12:
                periodo = "anual";
                break;
            default:
                System.out.println("Número fuera de rango. Por favor ingrese uno de los números permitidos: 1, 2, 3, 4, 6, 12.");
                return;
        }

        System.out.println("Número = " + numero);
        System.out.println("Periodo = \"" + periodo + "\"");
    }
}

