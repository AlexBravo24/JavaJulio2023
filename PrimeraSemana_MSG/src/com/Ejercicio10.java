package com;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {


int numero;
		
		Scanner entrada1 = new Scanner(System.in);
			System.out.println("Introduce el numero correspondiente al Mes:");
			numero = entrada1.nextInt();
		
		
			if (numero == 1) {
				System.out.println("Enero tiene 31 dias");
			} else if (numero == 2){
				System.out.println("Febrero tiene 28 dias y 29 cada 4 años");
			} else if (numero == 3) {
				System.out.println("Marzo tiene 31 dias");
			} else if (numero == 4){
				System.out.println("Abril tiene 30 dias");
			} else if (numero == 5){
				System.out.println("Mayo tiene 31 dias");
			} else if (numero == 6){
				System.out.println("Junio tiene 30 dias");
			} else if (numero == 7){
				System.out.println("Julio tiene 31 dias");
			} else if (numero == 8){
				System.out.println("Agosto tiene 31 dias");
			} else if (numero == 9){
				System.out.println("Septiembre tiene 30 dias");
			} else if (numero == 10){
				System.out.println("Octubre tiene 31 dias");
			} else if (numero == 11){
				System.out.println("Noviembre 30 tiene dias");
			} else if (numero == 12){
				System.out.println("Diciembre 31 tiene dias");
			} else {
				System.out.println("ERROR: Numero incorrecto");
			}
		

	}

}
