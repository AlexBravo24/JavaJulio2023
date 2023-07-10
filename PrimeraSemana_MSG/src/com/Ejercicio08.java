package com;

import java.util.Scanner;

public class Ejercicio08 { // Apertura Class

	public static void main(String[] args) { // Apertura Main
		
		int numero;
		
		Scanner entrada1 = new Scanner(System.in);
			System.out.println("Introduce el numero:");
			numero = entrada1.nextInt();
		
		
			if (numero == 1) {
				System.out.println("Seis");
			} else if (numero == 2){
				System.out.println("Cinco");
			} else if (numero == 3) {
				System.out.println("Cuatro");
			} else if (numero == 4){
				System.out.println("Tres");
			} else if (numero == 5){
				System.out.println("Dos");
			} else if (numero == 6){
				System.out.println("Uno");
			} else {
				System.out.println("ERROR: Numero incorrecto");
			}
 
	} // Cierre Main

} // Cierre Class
