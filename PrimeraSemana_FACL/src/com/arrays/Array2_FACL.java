package com.arrays;

import java.util.Scanner;

public class Array2_FACL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int suma=0;
		double media=0;

		
		int [] arreglo = new int[100];
		
		for(int i=0;i<100;i++) {
			arreglo[i]=i+1;
			suma+=arreglo[i];
			media=(double)suma/(i+1);
		}
		
		System.out.println("la suma es: "+suma);
		System.out.println("la media es: "+media);
				

	}

}
