package com;

import java.util.Scanner;

public class Ejercicio6_FACL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int tama�o, precioI;
		float precioF;
		char tipo;
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Inserte el precio inicial");
		
		precioI = entrada.nextInt();
		
		System.out.println("Inserte el tipo de uva (A o B)");
		
		tipo=entrada.next().charAt(0);
		
		System.out.println("Inserte el tama�o de uva");
		tama�o=entrada.nextInt();
		
		
		
		if(Character.isUpperCase(tipo)) {
			if(tipo=='A' && tama�o==1) {
				precioF=(float) (precioI+.2);
				System.out.println("El precio final es: "+precioF);
			}
			else if(tipo=='A' && tama�o==2) {
				precioF=(float) (precioI+.3);
				System.out.println("El precio final es: "+precioF);
			}
			else if(tipo=='B' && tama�o==1) {
				precioF=(float) (precioI-.3);
				System.out.println("El precio final es: "+precioF);
			}
			else if(tipo=='B' && tama�o==2) {
				precioF=(float) (precioI-.5);
				System.out.println("El precio final es: "+precioF);
			}
			
		}
		else {
			System.out.println("El tipo debe ser escrito en mayusculas");
		}
		
		
		
	}

}
