package com.arrays;

import java.util.Scanner;

public class Matriz1_DAGT {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		String [] paises = new String [4];
		String [][] ciudades = new String[4][3];
		for (int i = 0; i < paises.length; i ++) {
			System.out.print("Introduce el nombre de un pais: ");		
			paises[i]= scanner.nextLine();			
		}
		
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 3 ;j++) {
					System.out.print("Introduce el nombre de una ciudad del pais " + paises[i] + ": ");
					ciudades[i][j] = scanner.nextLine();
			}
		}
		
		
		for (int i = 0; i < 4; i++) {
			
			System.out.print("Pais: " + paises[i] + " Ciudades: ");
			for (int j = 0; j < 3 ;j++) {
					System.out.print(ciudades[i][j]+ " ");
			}
			System.out.println();
		}
		
		
		
	}

}
