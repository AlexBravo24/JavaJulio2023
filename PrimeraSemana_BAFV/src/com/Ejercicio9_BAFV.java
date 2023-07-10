package com;

import java.util.Scanner;

public class Ejercicio9_BAFV {
    public static void main(String[] args) {
    	/*
    	 9.Realiza un programa que pida el d�a de la semana (del 1 al 7) y escriba el d�a correspondiente. Si 
		   introducimos otro n�mero nos da un error.
    	  
    	 */
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese el n�mero del d�a de la semana (1-7): ");
        int dia = entrada.nextInt();

        String diaCorrespondiente;

        switch (dia) {
            case 1:
                diaCorrespondiente = "Lunes";
                break;
            case 2:
                diaCorrespondiente = "Martes";
                break;
            case 3:
                diaCorrespondiente = "Mi�rcoles";
                break;
            case 4:
                diaCorrespondiente = "Jueves";
                break;
            case 5:
                diaCorrespondiente = "Viernes";
                break;
            case 6:
                diaCorrespondiente = "S�bado";
                break;
            case 7:
                diaCorrespondiente = "Domingo";
                break;
            default:
                System.out.println("ERROR: n�mero incorrecto");
                return;
        }

        System.out.println("El d�a correspondiente al n�mero " + dia + " es: " + diaCorrespondiente);
    }
}

