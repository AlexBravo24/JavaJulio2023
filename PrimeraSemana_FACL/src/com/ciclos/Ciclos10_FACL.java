package com.ciclos;

import java.util.Scanner;

public class Ciclos10_FACL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int pos=0,nega=0,SP=0,SN=0,numero,P=0, I=0;


		
		Scanner entrada = new Scanner(System.in);

		for (int i=0;i<20;i++) {
			System.out.println("Inserte el numero: "+i);
			numero=entrada.nextInt();
				if(numero>0 && numero%2==0) {
					System.out.println("Es positivo y par");
					pos++;
					SP+=numero;
					P++;
				}
				else if(numero>0 && numero%2!=0){
					System.out.println("Es positivo e impar");
					pos++;
					SP+=numero;
					I++;
				}
				else if(numero < 0 && numero%2==0) {
					System.out.println("Es negativo y es par");
					nega++;
					SN-=numero;
					P++;					
				}
				else if(numero<0 && numero%2!=0) {
					System.out.println("Es negativo y es impar");
					nega++;
					SN-=numero;
					I++;
				}
			
		}
		System.out.println("La sumatoria de positivos es: "+SP);
		System.out.println("La sumatoria de negativos es: "+SN);
		System.out.println("La sumatoria de impares es: "+I);
		System.out.println("La sumatoria de pares es: "+P);

	}

}
