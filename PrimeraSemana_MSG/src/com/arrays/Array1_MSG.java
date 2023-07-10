package com.arrays;

import java.util.Scanner;

public class Array1_MSG {

	public static void main(String[] args) {


		/*
		 * Crea un array de 10 posiciones de números con valores pedidos por teclado. Muestra por consola el índice y el valor al que corresponde.
		 */
		
		
		Scanner entrada = new Scanner(System.in);
		int x;
		
		
		for (x=0; x<=9; x++) {
			
			System.out.println("Ingresa el numero: ");
			
			int numero;
			
			numero = entrada.nextInt();
			
			entrada.nextLine();
			
			
			
			if (x>=9) {
				
				for (x=0; x <=10; x++) {
					
					System.out.println("El indice: " + x + " Tiene como valor: " +numero);
				}
				}else {
					
				}
		}
		
		
		
			
				
				
			
				
			
				
		
		
		
		
		
	} // Cierre main

} // Cierre class
