package com;

import java.util.Scanner;

public class Ejercicio12_ADMG {

	public static void main(String[] args) {
		
//		Construir un programa que calcule el índice de masa corporal 
//		de una persona (IMC = peso [kg] / altura2 
//		[m]) e indique el estado en el que se encuentra esa persona 
//		en función del valor de IMC:
//		VALOR DE IMC	DIAGNOSTICO
//		<16	Criterio de ingreso en hospital
//		de 17 a 17	Infrapeso
//		de 17 a 18	Bajo peso
//		de 18 a 25	Peso normal (saludable)
//		de 25 a 30	sobrepeso (obesidad grado I)
//		de 30 a 35 	sobrepeso cronico (obesidad grado II)
//		de 35 a 40 	obesidad premorbida (obesidad grado III)
//		>40	obesidad morbida (obesidad grado IV)
		
		Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el peso en kg: ");
        double peso = scanner.nextDouble();

        System.out.print("Ingrese la altura en metros: ");
        double altura = scanner.nextDouble();

        double imc = peso / (altura * altura);

        String diagnostico;

        if (imc < 16) {
            diagnostico = "Criterio de ingreso en hospital";
        } else if (imc >= 16 && imc < 17) {
            diagnostico = "Infrapeso";
        } else if (imc >= 17 && imc < 18.5) {
            diagnostico = "Bajo peso";
        } else if (imc >= 18.5 && imc < 25) {
            diagnostico = "Peso normal (saludable)";
        } else if (imc >= 25 && imc < 30) {
            diagnostico = "Sobrepeso (obesidad grado I)";
        } else if (imc >= 30 && imc < 35) {
            diagnostico = "Sobrepeso crónico (obesidad grado II)";
        } else if (imc >= 35 && imc < 40) {
            diagnostico = "Obesidad premórbida (obesidad grado III)";
        } else {
            diagnostico = "Obesidad mórbida (obesidad grado IV)";
        }

        System.out.println("El índice de masa corporal (IMC) es: " + imc);
        System.out.println("Diagnóstico: " + diagnostico);




		
		
		

	}

}
