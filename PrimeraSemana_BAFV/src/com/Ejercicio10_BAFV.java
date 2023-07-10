package com;

import java.util.Scanner;

public class Ejercicio10_BAFV {
    public static void main(String[] args) {
    	
    	/*
    	10.- Realiza un programa que pida un número entero entre uno y doce e imprima el número de días que tiene el 
			mes correspondiente.
    	 
    	 * */
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese un número entre 1 y 12: ");
        int mes = entrada.nextInt();

        int numDias;

        switch (mes) {
            case 1:
                numDias = 31;
                break;
            case 2:
                numDias = 28;
                break;
            case 3:
                numDias = 31;
                break;
            case 4:
                numDias = 30;
                break;
            case 5:
                numDias = 31;
                break;
            case 6:
                numDias = 30;
                break;
            case 7:
                numDias = 31;
                break;
            case 8:
                numDias = 31;
                break;
            case 9:
                numDias = 30;
                break;
            case 10:
                numDias = 31;
                break;
            case 11:
                numDias = 30;
                break;
            case 12:
                numDias = 31;
                break;
            default:
                System.out.println("ERROR: número incorrecto");
               return;
        }

        System.out.println("El mes correspondiente al número " + mes + " tiene " + numDias + " días.");
    }
}

