package com;

import java.util.Scanner;

public class Ejercicio13_JDRA {

	public static void main(String[] args) {
		
		/* 13. Una instituci�n ben�fica recibe anualmente una donaci�n proveniente de Europa y lo reparte entre 
		un centro de salud, un comedor de ni�os y una parte lo invierte en la bolsa de acuerdo a lo siguiente:
		
		Si el monto de la donaci�n es de $10000 o m�s: 30% se destina al centro de salud, 50% al comedor de ni�os 
		y el resto se invierte en la bolsa.
		
		Si el monto de la donaci�n es menor que $10000: 25% se destina al centro de salud, 60% al comedor de 
		ni�os y el resto se invierte en la bolsa.
		
		La instituci�n desea saber cu�nto de dinero destinar� a cada rubro anualmente.
		*/
		
		double donacion;
		
		Scanner entrada= new Scanner(System.in);
		
		System.out.println("Introduzca el monto de la donacion: $");
		donacion = entrada.nextDouble();
		
		
		if (donacion >= 10000 ) {
			double csalud = donacion * .30;
			double comedorn = donacion * .50;
			double bolsa = donacion * .20;
			
			System.out.println("La donacion se repartio de tal manera, Monto total Donacion: $"+donacion+" pesos"
			+"\n"+"Centro de salud: $"+csalud+" pesos" +"\nComedor Ninos: $"+comedorn+" pesos" 
					+"\nInversion Bolsa $"+bolsa+" pesos");
			
		} else if (donacion < 10000 ) {
			double csalud = donacion * .25;
			double comedorn = donacion * .60;
			double bolsa = donacion * .15;
			
			System.out.println("La donacion se repartio de tal manera, Monto total Donacion: $"+donacion+" pesos"
					+"\n"+"Centro de salud: $"+csalud+" pesos" +"\nComedor Ninos: $"+comedorn+" pesos" 
							+"\nInversion Bolsa $"+bolsa+" pesos");	
		}

	}

}
