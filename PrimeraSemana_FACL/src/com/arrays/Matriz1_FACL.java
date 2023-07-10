package com.arrays;

import java.util.Scanner;

public class Matriz1_FACL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner(System.in);
		
		String paises [][] = new String [4][4];
		 
		for(int i=0;i<4;i++) {

			for (int j=0;j<4;j++) {
				if(j==0) {
					System.out.println("Introduzca el nombre del país ("+(i+1)+")");
					
				}
				else {
				System.out.println("Introduzca el nombre de la ciudad ("+(j)+")");
				}
				paises[i][j]=entrada.nextLine();
			}
		}
		
		for(int i=0;i<4;i++) {

			for (int j=0;j<4;j++) {
				if(j==0) {
					System.out.print("El pais ("+(i+1)+")es: "+paises[i][j]+" ");	
				}
				else if(j>0 && j<3) {
					System.out.print("La ciudad ("+(j)+")es: "+paises[i][j]+" ");
				}
				else {
					System.out.println("La ciudad ("+(j)+")es: "+paises[i][j]+" ");
				}
				

			}
		}
		
		

	}

}
