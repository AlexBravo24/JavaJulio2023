package com;

import java.util.Scanner;

public class Ejercicio01 { // Apertura del class

	public static void main(String[] args) { // Apertura del main
		
		int numero1;
		int numero2;
		
		Scanner entrada1 = new Scanner(System.in);
		
			System.out.println("Introduce el primer numero:");
		
			numero1 = entrada1.nextInt();
		
		Scanner entrada2 = new Scanner(System.in);
		
			System.out.println("Introduce el segundo numero:");
		
			numero2 = entrada2.nextInt();
			
		if (numero1>numero2) {
			System.out.println("El numero " + numero1 + " Es Mayor a " + numero2 + "");
		} else if (numero1<numero2) {
			System.out.println("El numero " + numero2 + " Es Mayor a " + numero1 + "");
		} else {
			System.out.println("Operacion no valida");
		}
		

	} // Cierre del Main

} // Cierre del Class
