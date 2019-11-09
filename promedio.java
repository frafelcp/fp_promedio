/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package promedio;

import java.util.Scanner;

/**
 *
 * @author Felix Castro
 */
public class promedio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //leer datos por teclado y consola
        Scanner leer = new Scanner(System.in);

        //definicion de variables
        int numEdades;
        double p;//capturadora
        String sw;//swithes

        do {
            //titulo
            System.out.println("CALCULADORA DE PROMEDIO DE EDADES");

            //linea
            System.out.println("----------------------------------------");

            //inicializar variables y funciones
            System.out.println("Ingrese cuantas edades a promediar");
            numEdades = leer.nextByte();

            p = promedio(numEdades);

            //linea
            System.out.println("----------------------------------------");

            //imprimir
            System.out.println("El promedio de edad es: " + p);

            //preguntamos si desea continuar
            System.out.println("¿Desea continuar?");
            sw = leer.next();

        } while ("si".equals(sw));
    }

    private static double promedio(int ne) {
        //leer datos por teclado y consola
        Scanner leer = new Scanner(System.in);

        //definicion de variables
        int suma;
        int edad;
        double prom;

        //inicializar variables
        suma = 0;

        //linea
        System.out.println("----------------------------------------");

        //proceso
        System.out.println("Ingreso de edades");
        for (int i = 1; i <= ne; i++) {
            System.out.println("Ingrese edad");
            edad = leer.nextInt();
            suma = suma + edad;
        }

        //promedio
        prom = suma / ne;

        //retornamos
        return prom;
    }
}
