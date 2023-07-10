package com.arrays;

public class Array4_MSG {

	public static void main(String[] args) {
			
			int valores[] = {1,2,3,4,5};
			int valores2[]=  new int [5];
			int x=0;
			
			for (int i=4; i>=0; i--) {
				valores2[x] = valores[i];
				x++;
			}
		
			System.out.println("El arreglo invertido es: ");
			
			for (int i:valores2) {
				System.out.println(i);
			}
	} // Cierre main

} // Cierre class
