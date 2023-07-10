package com;

import java.util.Scanner;

public class Ejercicio8_ADMG {

	public static void main(String[] args) {
		
//		Realiza un programa que pida por teclado el resultado (dato entero) obtenido al lanzar un dado de 
//		seis caras y muestre por pantalla el número en letras (dato cadena) de la cara opuesta al resultado 
//		obtenido.
//		Nota 1: En las caras opuestas de un dado de seis caras están los números: 1-6, 2-5 y 3-4.
//		Nota 2: Si el número del dado introducido es menor que 1 o mayor que 6, se mostrará el mensaje: 
//		“ERROR: número incorrecto
		
		Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el resultado obtenido al lanzar el dado: ");
        int resultado = scanner.nextInt();

        String caraOpuesta;

        if (resultado == 1) {
            caraOpuesta = "Seis";
        } else if (resultado == 2) {
            caraOpuesta = "Cinco";
        } else if (resultado == 3) {
            caraOpuesta = "Cuatro";
        } else if (resultado == 4) {
            caraOpuesta = "Tres";
        } else if (resultado == 5) {
            caraOpuesta = "Dos";
        } else if (resultado == 6) {
            caraOpuesta = "Uno";
        } else {
            caraOpuesta = "ERROR: número incorrecto";
        }

        System.out.println("La cara opuesta al resultado obtenido es: " + caraOpuesta);
		
		
	}

}
