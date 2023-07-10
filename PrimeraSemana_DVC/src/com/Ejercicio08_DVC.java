package com;

import java.util.Scanner;

public class Ejercicio08_DVC {

	public static void main(String[] args) {
		// ejercicio 8
		
		int cara;
		String letra = null;
		
		Scanner entrada = new Scanner (System.in);
		System.out.println("Introduce el resultado de la tirada ( 1 - 6 )");
		cara = entrada.nextInt();
		
		switch (cara) {
		case 1:
			letra = "seis";
			
			break;
		case 2:
			letra = "cinco";
			break;
		case 3:
			letra = "cuatro";
			break;
		case 4:
			letra = "tres";
			break;
		case 5:
			letra = "dos";
			break;
		case 6:
			letra = "uno";
			break;

		default:
			letra = "NÜMERO INCORRECTO";
			break;
		}
		System.out.println("La cara opuesta al resultado del dado es " + letra);
		

	}

}