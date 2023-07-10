package com;

import java.util.Scanner;

public class Ejercicio11_JDRA {

	public static void main(String[] args) {
		
		/* 11. Una compañía de transporte internacional tiene servicio en algunos países de América del Norte, 
		 * América Central, América del Sur, Europa y Asia. El costo por servicio de transporte se basa 
		 * en el peso del paquete y la zona a la que va dirigida. Lo anterior se muestra en la siguiente tabla:
		 * 
		 */
		
		int pesopaq, zona;
		int costozona, total;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introduzca los KG del paquete a enviar : ");
		pesopaq = entrada.nextInt();
		
		System.out.println("Introduzca la zona a la que va el paquete : \n"  + "1. America del Norte \n" +
		"2. America Central \n3. America del Sur \n4. Europa \n5. Asia");
		zona = entrada.nextInt();
		

		if ( pesopaq > 0 && pesopaq <= 5  ) {
			
			switch (zona) {
			case 1:
				costozona = 24;
				total = pesopaq * costozona;
				System.out.println("El costo por enviar su paquete es de $ " + total + " euros");			
				break;
			case 2:
				costozona = 20;
				total = pesopaq * costozona;
				System.out.println("El costo por enviar su paquete es de $ " + total + " euros");
				break;
			case 3:
				costozona = 21;
				total = pesopaq * costozona;
				System.out.println("El costo por enviar su paquete es de $ " + total + " euros");
				break;
			case 4:
				costozona = 10;
				total = pesopaq * costozona;
				System.out.println("El costo por enviar su paquete es de $ " + total + " euros");
				break;
			case 5:
				costozona = 18;
				total = pesopaq * costozona;
				System.out.println("El costo por enviar su paquete es de $ " + total + " euros");
				break;
				
			default:
				System.out.println("INTRODUZCA UNA ZONA VALIDA (1-5)");
				break;
			}
			
		} else {
			System.out.println("PAQUETE RECHAZADO, PESA MAS DE 5KG!!!");
		}
		
	}
}
