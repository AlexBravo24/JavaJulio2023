package com;

import java.util.Scanner;

public class Ejercicio12_AAPC {

	public static void main(String[] args) {
		// Construir un programa que calcule el índice de masa corporal 
		//de una persona (IMC = peso [kg] / altura2 [m]) e indique el 
		//estado en el que se encuentra esa persona en función del valor de IMC: 
		//Nota 1: se recomienda el empleo de sentencias if–else anidadas. 
		//Nota 2: Los operandos (peso y altura) deben ser introducidos por teclado por el usuario
		//VALOR DE IMC	DIAGNOSTICO
		//<16	criterio de ingreso en hospital
		//DE 16 A 17	infrapeso
		//17 A 18	bajo peso
		//18 A 25	peso normal (saludable)
		//25 A 30	sobrepeso (obesidad de grado 1)
		//30 A 35	sopreso cronico (obesidad de grado 2)
		//35 A 40	obesidad premorbida(obesidad de grado 3)
		//>40	obesidad morbida(obesidad de grado 4)
		
		
		        Scanner scanner = new Scanner(System.in);

		        // Obtener el peso en kilogramos desde el teclado
		        System.out.println("Ingrese el peso en kilogramos: ");
		        double peso = scanner.nextDouble();

		        // Obtener la altura en metros desde el teclado
		        System.out.println("Ingrese la altura en metros: ");
		        double altura = scanner.nextDouble();

		        // Calcular el IMC
		        double imc = peso / (altura * altura);

		        // Determinar el estado en función del valor de IMC
		        String estado;

		        if (imc < 16) {
		            estado = "Criterio de ingreso en hospital";
		        } else if (imc < 17) {
		            estado = "Infrapeso";
		        } else if (imc < 18) {
		            estado = "Bajo peso";
		        } else if (imc < 25) {
		            estado = "Peso normal (saludable)";
		        } else if (imc < 30) {
		            estado = "Sobrepeso (obesidad de grado 1)";
		        } else if (imc < 35) {
		            estado = "Sobrepeso crónico (obesidad de grado 2)";
		        } else if (imc < 40) {
		            estado = "Obesidad premórbida (obesidad de grado 3)";
		        } else {
		            estado = "Obesidad mórbida (obesidad de grado 4)";
		        }

		        // Imprimir el resultado
		        System.out.println("IMC: " + imc);
		        System.out.println("Estado: " + estado);
		    }
		


		 
		 

	}


