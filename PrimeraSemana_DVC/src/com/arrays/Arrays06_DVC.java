package com.arrays;

import java.util.Scanner;

public class Arrays06_DVC {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		String [][] paci = new String [4] [3];
		String pais,ciudad;
		
		for (int i = 0; i < 4; i++) {
			System.out.println("Ingresa un pais: ");
			pais = entrada.nextLine();
			paci[i][0] = pais; 
			for (int j = 0; j < 3; j++) {
				System.out.println("Ingresa una ciudad de dicho pais: ");
				ciudad = entrada.nextLine();
				paci[i][j]= ciudad;
			}
		}
		for (int i = 0; i < 4; i++) {
			System.out.println("pais: " + (i+1) );
			for (int j = 0; j < 3; j++) {
				System.out.print("- " + paci[i][j]);
			}
		}
		
	}

}
