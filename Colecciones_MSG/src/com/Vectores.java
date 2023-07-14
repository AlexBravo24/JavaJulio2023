package com;

import java.util.Scanner;

public class Vectores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int vector [] = new int [5];
		
//		vector [0] = 8;
//		vector [1] = 23;
//		vector [2] = 11;
//		vector [3] = 57;
//		vector [4] = 10;
		
		Scanner teclado = new Scanner (System.in);
		
		for (int i = 0; i < vector.length; i++) {
			System.out.println("Ingresa el valor para el indice " + i);
			vector[i] = teclado.nextInt();
		}
		
		
		
		for (int i = 0; i < vector.length; i++) {
			System.out.println("El indice " + i + " Tiene el valor de: " + vector[i]);
		}

	}

}
