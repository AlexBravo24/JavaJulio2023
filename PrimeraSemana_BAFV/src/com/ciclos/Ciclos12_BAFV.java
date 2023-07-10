package com.ciclos;

import java.util.Scanner;

public class Ciclos12_BAFV {
    public static void main(String[] args) {
    	
    	/*
    	 12.Se ingresan un conjunto de n edades de personas por teclado. El programa finalizara 
			cuando el promedio de las edades sea superior a 25
			
    	 * */
        Scanner entrada = new Scanner(System.in);

        int suma = 0;
        int totalEdades = 0;

        do {
        	System.out.print("Ingrese una edad: ");
            int edad = entrada.nextInt();

            if (edad < 1) {
            	System.out.println("no hay edades negativas");
                
            }else {

            suma += edad;
            totalEdades++;

            double promedio = (double) suma / totalEdades;

            if (promedio > 25) {
               System.out.print("promedio alcanzado");
                break;
            }
            }
        }while (true);
    }
}
