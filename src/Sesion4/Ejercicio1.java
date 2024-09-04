/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Sesion4;

import java.util.Scanner; // Importar la clase Scanner para leer la entrada del usuario

/**
 *
 * @author Usuario
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        // Crear un objeto Scanner para capturar la entrada del usuario desde la consola
        Scanner lectura = new Scanner(System.in);

        // Solicitar al usuario que ingrese un número del 1 al 7
        System.out.print("Ingrese un número (1-7) para determinar el día de la semana: ");
        int numero = lectura.nextInt(); // Leer el número ingresado por el usuario

        // Declarar una variable para almacenar el nombre del día de la semana
        String diaSemana = "";

        // Utilizar la estructura de control switch para determinar el día de la semana
        switch (numero) {
            case 1:
                diaSemana = "Lunes"; // Asignar "Lunes" si el usuario ingresó 1
                break;
            case 2:
                diaSemana = "Martes"; // Asignar "Martes" si el usuario ingresó 2
                break;
            case 3:
                diaSemana = "Miércoles"; // Asignar "Miércoles" si el usuario ingresó 3
                break;
            case 4:
                diaSemana = "Jueves"; // Asignar "Jueves" si el usuario ingresó 4
                break;
            case 5:
                diaSemana = "Viernes"; // Asignar "Viernes" si el usuario ingresó 5
                break;
            case 6:
                diaSemana = "Sábado"; // Asignar "Sábado" si el usuario ingresó 6
                break;
            case 7:
                diaSemana = "Domingo"; // Asignar "Domingo" si el usuario ingresó 7
                break;
            default:
                // Mostrar un mensaje de error si el número ingresado no está en el rango de 1 a 7
                diaSemana = "Número inválido. Debe ser un número entre 1 y 7.";
                break;
        }

        // Imprimir el resultado en la consola, mostrando el día de la semana o el mensaje de error
        System.out.println("Día de la semana: " + diaSemana);
    }
}