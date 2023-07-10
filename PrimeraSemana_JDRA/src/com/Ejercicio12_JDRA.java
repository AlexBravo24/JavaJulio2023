package com;

import java.util.Scanner;

public class Ejercicio12_JDRA {

	public static void main(String[] args) {
		/* 12.Construir un programa que calcule el índice de masa corporal de una persona 
		 * (IMC = peso [kg] / altura2 
		 [m]) e indique el estado en el que se encuentra esa persona en función del valor de IMC:
		 */
		
		double peso, altura;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introduzca su peso en KG : ");
		peso = entrada.nextDouble();
		
		System.out.println("Introduzca su altura en M : ");
		altura = entrada.nextDouble();
		
		double imc = peso/(altura*altura); 
		System.out.println("Su IMC es: " + imc );

		if ( imc < 16 ) {
            System.out.println("Diagnostico : Criterio de ingreso en hospital");
            
        } else if ( imc >= 16 && imc <= 17) {
            System.out.println("Diagnostico : Infrapeso");
            
        } else if ( imc > 17 && imc <= 18 ) {
            System.out.println("Diagnostico : Bajo peso");
        
        } else if ( imc > 18 && imc <= 25 ) {
            System.out.println("Diagnostico : Peso normal(Saludable)");
            
        } else if ( imc > 25 && imc <= 30 ) {
            System.out.println("Diagnostico : Sobrepeso (Obesidad grado 1)");
            
        } else if ( imc > 30 && imc <= 35 ) {
            System.out.println("Diagnostico : Sobrepeso cronico (Obesidad grado 2)");
            
        } else if ( imc > 35 && imc <= 40 ) {
            System.out.println("Diagnostico : obesidad premorbida (Obesidad grado 3)");
            
        } else if ( imc > 40 ) {
            System.out.println("Diagnostico : obesidad morbida (Obesidad grado 4");
            
        } else {
            System.out.println("OBESIDAD");
        }

	}

}
