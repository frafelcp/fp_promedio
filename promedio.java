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
        int s;//capturadora suma
        double p;//capturadora promedio
        String sw;//swithes

        do {
            //titulo
            System.out.println("CALCULADORA DE PROMEDIO DE EDADES");

            //linea
            System.out.println("----------------------------------------");

            //inicializar variables y funciones
            System.out.println("Ingrese cuantas edades a promediar");
            numEdades = leer.nextByte();
            
            s = suma(numEdades);//funacion suma

            promedio(s, numEdades);//funcion promedio

            //linea
            System.out.println("----------------------------------------");
            
            
            //preguntamos si desea continuar
            System.out.println("¿Desea continuar?");
            sw = leer.next();
            
        } while ("si".equals(sw));
    }
    
    private static int suma(int ne){
        //leer datos por teclado y consola
        Scanner leer = new Scanner(System.in);
        
        //definimos variables
        int suma;
        int edad;
        
        //inicializar contadores y acumuladores
        suma = 0;
        
        //linea
        System.out.println("----------------------------------------");
        
        //proceso
        System.out.println("Ingreso de edades");
        for (int i = 1; i <= ne; i++) {
            System.out.println("Ingrese una edad");
            edad = leer.nextInt();
            suma = suma + edad;
        }
        return suma;
    }

    private static void promedio(int su, int ne) {

        //definicion de variables
        double prom;

        //proceso        
        prom = su / ne;//promedio
        
        //linea
        System.out.println("----------------------------------------");

        //imprimir
        System.out.println("El promedio de edad es: " + prom);
    }
}
