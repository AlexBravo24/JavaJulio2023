package com.arrays;

import java.util.Scanner;

public class Arrays2_DAGT {

	public static void main(String[] args) {
		
		Scanner scanner= new Scanner(System.in);
		int [] array = new int [100];
		int suma = 0;
		
		for (int i = 0; i < 100; i++ ) {
			array[i]=i+1;
			suma += array[i];			
		}
		
		double media = (double)suma /100;
		System.out.println("La suma total es: " + suma);
		System.out.println("La media es de: "+ media);
		

	}

}
