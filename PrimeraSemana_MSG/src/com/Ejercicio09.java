package com;

import java.util.Scanner;

public class Ejercicio09 { // Apertura Class

	public static void main(String[] args) { // Apertura Main
		
		int numero;
		
		Scanner entrada1 = new Scanner(System.in);
			System.out.println("Introduce el numero correspondiente al dia:");
			numero = entrada1.nextInt();
		
		
			if (numero == 1) {
				System.out.println("Es Lunes");
			} else if (numero == 2){
				System.out.println("Es Martes");
			} else if (numero == 3) {
				System.out.println("Es Miercoles");
			} else if (numero == 4){
				System.out.println("Es Jueves");
			} else if (numero == 5){
				System.out.println("Es Viernes");
			} else if (numero == 6){
				System.out.println("Es Sabado");
			} else if (numero == 7){
				System.out.println("Es Domingo");
			} else {
				System.out.println("ERROR: Numero incorrecto");
			}
		

	} // Cierre Main

} // Cierre Class
