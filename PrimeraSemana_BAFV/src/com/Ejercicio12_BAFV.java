package com;

import java.util.Scanner;

public class Ejercicio12_BAFV {
    public static void main(String[] args) {
    	
    	/*
    	 
    	 Construir un programa en java que calcule el índice de masa corporal de una persona (IMC = peso [kg] / altura2 
		[m]) e indique el estado en el que se encuentra esa persona en función del valor de IMC:

		menor que 16 -> criterio de ingreso en hospital
		de 16 a 17 -> infrapeso
		de 17 a 18 -> bajo peso
		de 18 a 25 -> peso normal (saludable)
		de 25 a 30 -> sobrepeso (obesidad de grado I)
		de 30 a 35 -> sobrepeso crónico (obesidad de grado II)
		de 35 a 40 -> obesidad premórbida (obesidad de grado III)
		mayor que 40 -> obesidad mórbida (obesidad de grado IV)

		Nota 1: se recomienda el empleo de sentencias if–else anidadas. 
		Nota 2: Los operandos (peso y altura) deben ser introducidos por teclado por el usuario.

    	 
    	 
    	  */
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese el peso en kg: ");
        double peso = entrada.nextDouble();

        System.out.print("Ingrese la altura en metros: ");
        double altura = entrada.nextDouble();

        double imc = peso / (altura * altura);
        System.out.println("El IMC de la persona es: " + imc);

        if (imc < 16) {
            System.out.println("Estado: Criterio de ingreso en hospital");
        } else if (imc >= 16 && imc < 17) {
            System.out.println("Estado: Infrapeso");
        } else if (imc >= 17 && imc < 18) {
            System.out.println("Estado: Bajo peso");
        } else if (imc >= 18 && imc < 25) {
            System.out.println("Estado: Peso normal (saludable)");
        } else if (imc >= 25 && imc < 30) {
            System.out.println("Estado: Sobrepeso (obesidad de grado I)");
        } else if (imc >= 30 && imc < 35) {
            System.out.println("Estado: Sobrepeso crónico (obesidad de grado II)");
        } else if (imc >= 35 && imc < 40) {
            System.out.println("Estado: Obesidad premórbida (obesidad de grado III)");
        } else {
            System.out.println("Estado: Obesidad mórbida (obesidad de grado IV)");
        }
    }
}
