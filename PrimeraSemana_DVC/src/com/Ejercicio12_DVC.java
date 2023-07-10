package com;

import java.util.Scanner;

public class Ejercicio12_DVC {

	public static void main(String[] args) {
		// 
		double imc, peso, altura;
		String diag = null;
		Scanner entrada = new Scanner (System.in);
		System.out.println("introdusca su peso en Kg");
		peso = entrada.nextDouble();
		System.out.println("introdusca su estatura en metros");
		altura = entrada.nextDouble();
		
		altura = altura * altura;
		imc = peso / altura;
		System.out.println(imc);
		
		if (imc < 16) {
			diag = "Criterio de ingreso al hospital";
		}else if (imc >= 16 && imc <=16.9) {
			diag = "infrapeso";
		}else if (imc >= 17 && imc <=17.9) {
			diag = "bajo peso";
		}else if (imc >= 18 && imc <=24.9) {
			diag = "peso normal";
		}else if (imc >= 25 && imc <=29.9) {
			diag = "sobrepeso (obesidad grado 1)";
		}else if (imc >= 30 && imc <=34.9) {
			diag = "sobrepeso crónico (obesidad grado 2)";
		}else if (imc >= 35 && imc <=39.9) {
			diag = "obesidad premorbida  (obesidad grado 3)";
		}else if (imc >= 40) {
			diag = "obesidad mórbida (obesidad grado 4)";
		}
		
		System.out.println("Su IMC es de " + imc + ", diagnostico = " + diag);
	}

}
