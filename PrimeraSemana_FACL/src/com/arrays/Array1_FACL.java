package com.arrays;

import java.util.Scanner;

public class Array1_FACL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada =new Scanner (System.in);
		
		int [] arreglo = new int[10];
		
		for(int i=0;i<10;i++) {
			System.out.println("Inserte el numero en la posicion: "+(i+1));
			arreglo[i]=entrada.nextInt();
			
		}
		System.out.println("El arreglo quedo de la siguiente forma");
		for(int i=0;i<10;i++) {
			
			System.out.println("En la posicion: "+(i+1)+" queda el numero: "+arreglo[i]);
		}
		
		
		
		

	}

}
