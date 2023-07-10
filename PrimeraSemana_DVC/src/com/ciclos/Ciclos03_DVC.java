package com.ciclos;

import java.util.Scanner;

public class Ciclos03_DVC {

	public static void main(String[] args) {


	        Scanner entrada = new Scanner(System.in);


	        System.out.print("Ingresa una cadena: ");
	        String cadena = entrada.nextLine();

            //Eliminar los espacios en blanco 
	        cadena = cadena.replaceAll("\\s+", "").toLowerCase();

	 
	        boolean esPalindromo = true;
	        int longitud = cadena.length();

	        for (int i = 0; i < longitud / 2; i++) {
	            if (cadena.charAt(i) != cadena.charAt(longitud - 1 - i)) {
	                esPalindromo = false;
	                break;
	            }
	        }


	        if (esPalindromo) {
	            System.out.println("La cadena es un palíndromo.");
	        } else {
	            System.out.println("La cadena no es un palíndromo.");
	        }
	    }

	}


