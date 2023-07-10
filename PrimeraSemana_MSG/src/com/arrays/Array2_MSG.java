package com.arrays;

public class Array2_MSG {

	public static void main(String[] args) {
		
		
		int suma = 0;
		double media = 0;
		
		
		int [] arreglo = new int [100];
		
		for  (int i=0; i<100; i ++) {
			arreglo[i] = i+1;
			suma+= arreglo[i];
			media=suma/(i+1);
			
		}
		
		System.out.println("La suma es: " +suma);
		System.out.println("La media es:" +media);
	
	
	
	} // Cierre main

} // Cierre class
