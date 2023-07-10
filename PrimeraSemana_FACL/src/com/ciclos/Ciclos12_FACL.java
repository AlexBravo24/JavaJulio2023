package com.ciclos;

import java.util.Scanner;

public class Ciclos12_FACL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int edad,i=0,EA=0;
		double promedio;
		Scanner entrada = new Scanner(System.in);
		
		
		do {
			System.out.println("Ingrese la edad para calcular el promedio");
			
			edad=entrada.nextInt();
			EA+=edad;
			i++;
			promedio=EA/i;
			
			
		}while(promedio<=25);
		System.out.println("El promedio de edad es de: "+promedio+" y se ingresaron: "+i+ " personas");

	}

}
