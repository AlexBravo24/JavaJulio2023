package com;

import java.util.Scanner;

public class Ejercicio2_ADMG {

	public static void main(String[] args) {
		
		//Realiza un programa que pida un n�mero por teclado 
		// y nos indique si es par o impar
		

		        Scanner scanner = new Scanner(System.in);
		        
		        System.out.print("Ingrese un n�mero: ");
		        int numero = scanner.nextInt();
		        
		        if (numero % 2 == 0) {
		            System.out.println("El n�mero es par.");
		        } else {
		            System.out.println("El n�mero es impar.");
		        }
		        
		        scanner.close();
		


	}

}
