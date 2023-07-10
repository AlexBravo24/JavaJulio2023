package com.arrays;

public class Problema2_OIPH {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = new int[100];
		int suma = 0;
		Double promedio;
		for(int i=0; i<100; i++) {
			array[i]=i+1;
		}
		for(int i=0; i<100; i++) {
			suma = suma + array[i];
		}
		promedio = suma/100.0;
		System.out.println("La suma es: "+suma);
		System.out.println("El promedio es: "+promedio);
	}

}
