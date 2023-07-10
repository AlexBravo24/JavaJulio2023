package com;

import java.util.Scanner;

public class Problema8_OIPH {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Introduce un numero del 1 al 6: ");
		Integer n = scan.nextInt();
		switch (n) {
		case 1:
			System.out.println("seis");
			break;
		case 2:
			System.out.println("cinco");
			break;
		case 3:
			System.out.println("cuatro");
			break;
		case 4:
			System.out.println("tres");
			break;
		case 5:
			System.out.println("dos");
			break;
		case 6:
			System.out.println("uno");
			break;
		default:
			System.out.println("ERROR: número incorrecto");
		}
	}
}
