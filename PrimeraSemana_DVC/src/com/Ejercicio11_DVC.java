package com;

import java.util.Scanner;

public class Ejercicio11_DVC {

	public static void main(String[] args) {
		// ejercicio  11
		
		int kg,zu, ck = 0, ct;
		Scanner entrada = new Scanner (System.in);
		System.out.println("Introduce el lugar de destino de tu paquete");
		System.out.println("1 = América del Norte, costo por kilo 24");
		System.out.println("2 = América Central, costo por kilo 20");
		System.out.println("3 = América del Sur, costo por kilo 21");
		System.out.println("4 = Europa, costo por kilo 10");
		System.out.println("5 = Asia, costo por kilo 18");
		zu = entrada.nextInt();
		System.out.println("Intoduce el peso de tu envio");
		kg = entrada.nextInt();
		
		switch (zu) {
		case 1:
			ck = 24;
			break;
		case 2:
			ck = 20;
			break;
		case 3:
			ck = 21;
			break;
		case 4:
			ck = 10;
			break;
		case 5:
			ck = 18;
			break;	
		default:
			break;
		}
		
		if (kg > 5) {
			System.out.println("Rechazado debido al peso no se puede enviar su paquete");
		} else {
			ct = ck * kg;
			System.out.println("El precio de su envio es de "+ ct);
		}
	}

}
