package com;

import java.util.Scanner;

public class Ejercicio8_AAPC {

	public static void main(String[] args) {
		//  Realiza un programa que pida por teclado el resultado (dato entero) 
		//obtenido al lanzar un dado de seis caras y muestre por pantalla el n�mero
		//en letras (dato cadena) de la cara opuesta al resultado obtenido. 
		//Nota 1: En las caras opuestas de un dado de seis caras est�n los n�meros:
		//1-6, 2-5 y 3-4. Nota 2: Si el n�mero del dado introducido es menor que 1 o mayor
		//que 6, se mostrar� el mensaje: �ERROR: n�mero incorrecto�. 
		
		        Scanner scanner = new Scanner(System.in);

		        // Obtener el resultado del dado desde el teclado
		        System.out.println("Ingrese el resultado del dado (1-6): ");
		        int resultadoDado = scanner.nextInt();

		        // Realizar la conversi�n y mostrar el n�mero en letras de la cara opuesta
		        String numeroEnLetras;

		        switch (resultadoDado) {
		            case 1:
		                numeroEnLetras = "Seis";
		                break;
		            case 2:
		                numeroEnLetras = "Cinco";
		                break;
		            case 3:
		                numeroEnLetras = "Cuatro";
		                break;
		            case 4:
		                numeroEnLetras = "Tres";
		                break;
		            case 5:
		                numeroEnLetras = "Dos";
		                break;
		            case 6:
		                numeroEnLetras = "Uno";
		                break;
		            default:
		                numeroEnLetras = "ERROR: n�mero incorrecto";
		                break;
		        }

		        // Imprimir el resultado
		        System.out.println("N�mero en letras de la cara opuesta: " + numeroEnLetras);
		    }
		

		
		
	}


