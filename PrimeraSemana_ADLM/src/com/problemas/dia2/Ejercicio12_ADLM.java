package com.problemas.dia2;

import java.util.Scanner;

public class Ejercicio12_ADLM {

	public static void main(String[] args) {
		/* 12.Construir un programa que calcule el índice de masa corporal de una persona 
		  (IMC = peso [kg] / altura2 
			[m]) e indique el estado en el que se encuentra esa persona en función del valor de IMC:
			Nota 1: se recomienda el empleo de sentencias if–else anidadas. 
			Nota 2: Los operandos (peso y altura) deben ser introducidos por teclado por el usuario.
		 */
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Ingresa tu peso");
		double peso = entrada.nextDouble();
		System.out.println("Ingresa tu altura");
		double altura = entrada.nextDouble();
		double imc = peso / (Math.pow(altura, 2));
		System.out.println("Tu IMC es: " + imc);
		if(imc > 40) {
			System.out.println("Obesidad mórbida (obesidad de grado VI)");
		}else if(imc >= 35.1) {
			System.out.println("Obesidad premórbida (obesidad de grado III)");
		}else if(imc >= 30.1) {
			System.out.println("Sobrepeso crónico (obesidad de grado II)");
		}else if(imc >= 25.1) {
			System.out.println("Sobrepeso (obesidad de grado I)");
		}else if(imc >= 18.1) {
			System.out.println("Peso normal (saludable)");
		}else if(imc >= 17.1) {
			System.out.println("Bajo peso");
		}else if(imc >= 16.1) {
			System.out.println("Infrapeso");
		}else {
			System.out.println("Criterio de ingreso en hospital");
		}
	}

}
