package com;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Cientifica cientifica1 = new Cientifica();
		
		Scanner entrada = new Scanner (System.in);
		
		System.out.println("Operaci�n a realizar");
		System.out.println("1 = suma");
		System.out.println("2 = resta");
		System.out.println("3 = multiplicaci�n");
		System.out.println("4 = divisi�n");
		int e = entrada.nextInt();
		
		switch (e) {
		case 1:
			cientifica1.sumar();
			break;
		case 2:
			cientifica1.restar();
			break;
		case 3:
			cientifica1.multiplicar();
			break;
		case 4:
			cientifica1.dividr();
			break;
	
		default:
			break;
		}
			
	}

}
