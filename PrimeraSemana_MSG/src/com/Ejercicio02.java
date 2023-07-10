package com;

import java.util.Scanner;

public class Ejercicio02 { //Apertura del Class

	public static void main(String[] args) { //Apertura del Main
		
		int numero;
		
		Scanner entrada1 = new Scanner(System.in);
			System.out.println("Introduce el numero:");
			numero = entrada1.nextInt();
		
		if (numero % 2 == 0) {
			System.out.println("El " + numero + " Es par");
		} else {
			System.out.println("El " + numero + " Es Impar");
		}
		

	} //Cierre del Main

} //Cierre del Class
