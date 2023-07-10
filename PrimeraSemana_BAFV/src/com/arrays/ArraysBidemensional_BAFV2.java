package com.arrays;

import java.util.Scanner;

public class ArraysBidemensional_BAFV2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner(System.in);
		
		String matrizA [][] = new String [3][5];
		String matrizB [][] = new String [3][5];
		int matrizC [][] = new int [3][5];
		
		// first check in matrix a
		System.out.println("Ingrese matriz A: ");
		for(int i=0;i<3;i++) {
			for(int j=0;j<5;j++) {
				matrizA [i][j] = entrada.nextLine();
			}
		}
		
		// right away check in matrix b
		System.out.println("Ingrese matriz B: ");
		for(int i=0;i<3;i++) {
			for(int j=0;j<5;j++) {
				matrizB [i][j] = entrada.nextLine();
			}
		}
		
		for(int i=0;i<3;i++) {
			for(int j=0;j<5;j++) {
			 String nu1 = matrizA[i][j];
			 String nu2 = matrizB[i][j];
			 char be1 = nu1.charAt(0);
			 char be2 = nu2.charAt(0);
			 if((be1 >= '0' && be1 <='9') && (be2>='0' && be2<='9')) {
				int uno  = Character.getNumericValue(be1);
				int dos  = Character.getNumericValue(be2);
				int suma = uno +dos;
				
				matrizC [i][j] = suma;
			 }else {
				 matrizC [i][j] = 0;
			 }
			 
			}
		}
		
		for(int i=0;i<3;i++) {
			for(int j=0;j<5;j++) {
				System.out.print(matrizC[i][j]+" ");
			}
			System.out.println();
		}
		
		
	}

}
