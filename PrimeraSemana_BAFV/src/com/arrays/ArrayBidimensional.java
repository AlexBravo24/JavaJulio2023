package com.arrays;

import java.util.Scanner;

public class ArrayBidimensional {

	@SuppressWarnings("null")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Array Bidimensional - Colección de datos de un mismo
		//tipo
		//en lugar de tener un solo espacio "lineal" para
		//almacenar a un concepto de "tabla"
		
		/*
		 [1][2][3]
		 [2][][]
		 [3][][]
		 */
		Scanner entrada  = new Scanner(System.in);
		String [][] paises = new String[1][4];
		String [][] ciudades=new String [4][4];
		
		System.out.println("Ingrese paises con respectivas ciudades: ");
		
		for(int i=0;i<4;i++) {
			System.out.println("pais "+i+1+" : " );
			paises [0][i] = entrada.nextLine();
			
			for(int j=0;j<4;j++) {
				System.out.println("Ingrese las cuatro ciudades del pais: ");
				ciudades[i][j] = entrada.nextLine();
			}
		
			
		}
		
		System.out.println();
		System.out.println("imprimiendo paisese- ciudades: ");
		for(int i=0;i<4;i++) {
			System.out.print(paises[0][i]+" ");
			for(int j=0;j<4;j++) {
				System.out.print(ciudades[i][j]+ " ");
			}
			System.out.println();
		}

	}

}
