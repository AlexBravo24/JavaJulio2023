package com.problemas.dia2;

import java.util.Scanner;

public class Ejercicio13_ADLM {

	public static void main(String[] args) {
		/* 13. Una instituci�n ben�fica recibe anualmente una donaci�n proveniente de Europa y lo reparte 
		 entre un centro de salud, un comedor de ni�os y una parte lo invierte en la bolsa de acuerdo a 
		 lo siguiente:
		Si el monto de la donaci�n es de $10000 o m�s: 30% se destina al centro de salud, 50% al comedor 
		de ni�os y el resto se invierte en la bolsa.
		Si el monto de la donaci�n es menor que $10000: 25% se destina al centro de salud, 60% al comedor de 
		ni�os y el resto se invierte en la bolsa.
		La instituci�n desea saber cu�nto de dinero destinar� a cada rubro anualmente.*/
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Ingresa la donaci�n");
		double donacion = entrada.nextDouble();
		if(donacion >= 10000) {
			System.out.println("Centro de salud: "  + (donacion * 0.30));
			System.out.println("Comerdor de ni�os: " + (donacion * 0.50));
			System.out.println("Bolsa: " + (donacion * 0.20));
		}else {
			System.out.println("Centro de salud: "  + (donacion * 0.25));
			System.out.println("Comerdor de ni�os: " + (donacion * 0.60));
			System.out.println("Bolsa: " + (donacion * 0.15));
		}
	}

}
