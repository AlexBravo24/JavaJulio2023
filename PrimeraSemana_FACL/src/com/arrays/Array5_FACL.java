package com.arrays;

import java.util.Scanner;

public class Array5_FACL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
		int productos;
		
		System.out.println("Ingrese la cantidad de productos que va a ingresar");
		
		productos=entrada.nextInt();
		entrada.nextLine();
				
		int precio[]= new int [productos];
		
		String articulos[]=new String [productos];
		
		for(int i=0;i<productos;i++) {
			System.out.println("Ingrese el nombre del articulo("+(i+1)+")");
			articulos[i]=entrada.nextLine();

			
			System.out.println("Ingrese el precio del articulo("+(i+1)+")");
			precio[i]=entrada.nextInt();
			entrada.nextLine();

		}
		
		for(int i=0;i<productos;i++) {
			
			System.out.println("El producto: "+articulos[i]+" cuesta: "+precio[i]+" pesos");
		}
		

	}

}
