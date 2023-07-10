package com;

import java.util.Scanner;

public class Problema11_OIPH {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Introduce el peso del paquete en kg: ");
		Double peso = scan.nextDouble();
		System.out.println("Introduce el codigo de la zona la que va dirigido: ");
		Integer codigo = scan.nextInt();
		Double costoTransporte;

		if(peso<=5.0) {
			switch (codigo) {
			case 1:
				costoTransporte = 24.00*peso;
				System.out.println("El costo es: $"+costoTransporte);
				break;
			case 2:
				costoTransporte = 20.00*peso;
				System.out.println("El costo es: $"+costoTransporte);				break;
			case 3:
				costoTransporte = 21.00*peso;
				System.out.println("El costo es: $"+costoTransporte);				break;
			case 4:
				costoTransporte = 10.00*peso;
				System.out.println("El costo es: $"+costoTransporte);				break;
			case 5:
				costoTransporte = 18.00*peso;
				System.out.println("El costo es: $"+costoTransporte);				break;
			}
		}else {
			System.out.println("El peso excede los 5kg, se rechaza la entrega");
		}
	}

}
