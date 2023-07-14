package com;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// Calculadora con operaciones basicas
		//suma, resta, multiplicacion y division.
// calculadora sera la clase padre
		// cientifica la clase hija
		// calculadora debe volverse abstracta 
		// cientifica definira como se van a realizar las operaciones
		
		Cientifica cal = new Cientifica();
		
		cal.setColor("blanco");
		cal.setModelo("cassio");
		cal.setTipo("cientifica");
		System.out.println(cal);
		
		cal.suma(1200, 100);
		cal.resta(1200, 100);
		cal.multiplicacion(1200, 100);
		cal.division(1200,100);
		
    }
}