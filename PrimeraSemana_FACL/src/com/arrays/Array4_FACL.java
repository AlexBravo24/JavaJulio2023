package com.arrays;

public class Array4_FACL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arreglo1[]= {1,2,3,4,5};
		int arreglo2[]=new int [5];
		int j=0;
		for(int i=4;i>=0;i--) {
			arreglo2[j]=arreglo1[i];
			j++;
		}
			System.out.println("El arreglo invertido es: ");
			
			for(int i:arreglo2) {
				System.out.println(i);
			}

	}


}
