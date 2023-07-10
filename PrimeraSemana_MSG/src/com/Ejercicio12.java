package com;

import java.util.Scanner;

public class Ejercicio12 { // Apertura Class

	public static void main(String[] args) { // Apertura MAin
		
		float altura;
		float peso;
		float imc;
	
		
		Scanner entrada1 = new Scanner(System.in);
			System.out.println("Introduce tu peso en Kgs: ");
			peso = entrada1.nextFloat();
			
		Scanner entrada2 = new Scanner(System.in);
			System.out.println("Introduce tu altura en Metros:");
			altura = entrada2.nextFloat();
			
			imc = peso / (altura * altura);
			
		
		if (imc < 16) {
			System.out.println("Tu IMC es de: " + imc +" Criterio de ingreso al hospital");
		} else if (imc >= 16 && imc < 17) {
			System.out.println("Tu IMC es de: " + imc +" Infrapeso");
		} else if (imc >= 17 && imc < 18) {
			System.out.println("Tu IMC es de: " + imc +" Bajo peso");
		} else if (imc >= 18 && imc < 25) {
			System.out.println("Tu IMC es de: " + imc +" Peso Normal (Saludable)");
		} else if (imc >= 25 && imc < 30) {
			System.out.println("Tu IMC es de: " + imc +" Sobrepeso (Obesidad de Grado I)");
		} else if (imc >= 30 && imc < 35) {
			System.out.println("Tu IMC es de: " + imc +" Sobrepeso Cronico (Obesidad de Grado II)");
		} else if (imc >= 35 && imc < 40) {
			System.out.println("Tu IMC es de: " + imc +" Obesidad Premorbida (Obesidad de Grado III)");
		}  else if (imc >= 40) {
			System.out.println("Tu IMC es de: " + imc +" Obesidad Morbida (Obesidad de Grado IV)");
		} else {
			System.out.println("Favor de introducir datos correctos");
		}
		

	} // Cierre Main

} // Cierre Class
