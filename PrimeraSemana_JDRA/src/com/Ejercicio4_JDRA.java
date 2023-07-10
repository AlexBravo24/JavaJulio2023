package com;

import java.util.Scanner;

//import java.io.IOException;
public class Ejercicio4_JDRA {

	public static void main(String[] args) {
		
		// 4. Realiza un programa que lea una cadena por teclado y compruebe si es una letra mayúscula.
		
		String cadena;
		Scanner entrada= new Scanner(System.in);
		// Solicitud de datos al usuario
		    System.out.println("Este programa nos pide una cadena y comprueba si es una letra mayúscula.");
		    System.out.print("Introduce la cadena que desees: ");
		    cadena = entrada.nextLine();
		    
		// Realizamos Cálculos y mostramos en pantalla
		    if (cadena.length() != 1){
		      System.out.println("La cadena no es una letra mayúscula");
		   // }else if ((cadena > "A") && (cadena < "Z")) {
		    }else if ((cadena.compareTo("A") >= 0) && (cadena.compareTo("Z")<=0)) {
		       System.out.println("La cadena es una letra mayúscula.");
		    }else {
		        System.out.println("La cadena no es una letra mayúscula.");
		    }

	}

}
