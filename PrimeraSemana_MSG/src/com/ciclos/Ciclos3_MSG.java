package com.ciclos;

import java.util.Scanner;

public class Ciclos3_MSG {

	public static void main(String[] args) {
		
		String palabra;
		
		Scanner entrada1 = new Scanner(System.in);
			System.out.println("Ingresar Palabra: ");
			palabra = entrada1.nextLine();
		
			if (palabra.equalsIgnoreCase("palindromo")) {
				System.out.println("Coincide");
			}else {
				System.out.println("No coincide con la palbra palindromo");
			}
			
			

	} // Cierre Main

}  // Cierre Class
