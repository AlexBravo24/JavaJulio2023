package com;

import java.util.Scanner;

public class Ejercicio2_ADMG {

	public static void main(String[] args) {
		
		//Realiza un programa que pida un número por teclado 
		// y nos indique si es par o impar
		

		        Scanner scanner = new Scanner(System.in);
		        
		        System.out.print("Ingrese un número: ");
		        int numero = scanner.nextInt();
		        
		        if (numero % 2 == 0) {
		            System.out.println("El número es par.");
		        } else {
		            System.out.println("El número es impar.");
		        }
		        
		        scanner.close();
		


	}

}
