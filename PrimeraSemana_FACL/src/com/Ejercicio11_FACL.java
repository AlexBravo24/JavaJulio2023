package com;

import java.util.Scanner;

public class Ejercicio11_FACL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ZD,PDE;
		double PDP, total;
		
		PDE=0;
		
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Inserte el peso del paquete");
		
		PDP = entrada.nextInt();
		System.out.println("Inserte la zona a donde va dirigido"+"\n 1 Para America del Norte"+"\n 2 Para America Central"+
		"\n 3 Para America del sur"+ "\n 4 Para Europa"+"\n 5 Para Asia");
		
		ZD = entrada.nextInt();
		
		if(PDP<=5) {
		switch (ZD) {
		
		case 1:

			PDE=24;
			total=PDE*PDP;
			System.out.println("El costo total del envío es de:  "+total);
			break;
		case 2:

			PDE=20;
			total=PDE*PDP;
			System.out.println("El costo total del envío es de:  "+total);
			break;
		case 3:
;
			PDE=21;
			total=PDE*PDP;
			System.out.println("El costo total del envío es de:  "+total);
			break;
		case 4:

			PDE=10;
			total=PDE*PDP;
			System.out.println("El costo total del envío es de:  "+total);
			break;
		case 5:

			PDE=18;
			total=PDE*PDP;
			System.out.println("El costo total del envío es de:  "+total);
			break;

		}
		
		}
		else {
			System.out.println("El peso del producto supera nuestro límite, no podemos enviarlo");
		}
	}

}
