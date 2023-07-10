package com.ciclos;

import java.util.Scanner;

public class Ciclos2_MSG { 

	public static void main(String[] args) {
		
		int numero1;
		int x = 1;
		int veces;
		int total;
		
		Scanner entrada1 = new Scanner(System.in);
			System.out.println("Numero a Multiplar: ");
			numero1 = entrada1.nextInt();
			
		Scanner entrada2 = new Scanner(System.in);
			System.out.println("Numero de veces a Multiplar: ");
			veces = entrada2.nextInt();
			
		
		
		do {
			total = numero1 * x;
			System.out.println(numero1 + " x " + x +" = " + total);
			x++;
			
			
		} while (x >= 1 && x <= veces);

		
		
		
		
	} // Cierre de Main

} // Cierre de class
