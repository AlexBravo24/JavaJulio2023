package com.arrays;

import java.util.Scanner;

public class Arrays01_DVC {

	public static void main(String[] args) {
		//
		
		Scanner entrada = new Scanner(System.in);
		int x = 0;
		int []num = new int [10];
		System.out.println("Introduce 10 números ");
		while (x <=9) {
//			System.out.println("Introduce un número para la posición ");
			num [x]= entrada.nextInt();
			x++;
		}
		for (int i = 0; i < 9; i++) {
			System.out.println("la posicón " + i+ " tiene guardado el valor " + num [i]);
		}
	
		
		
	}

}
