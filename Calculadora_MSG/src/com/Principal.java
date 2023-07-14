package com;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Crear una calculadora con sus operaciones basicas, suma, resta, multiplicacion y division
		// Claculadora sera la clase padre
		//Cientifica la clase hija
		// calculadora  debe volverse abstracta
		//Cinetifica definira las operaciones

//		Scanner entrada1 = new Scanner (System.in);
//		String opcion = entrada1.toString();
		
		Cientifica numero = new Cientifica();
		
		numero.setMarca("Casio");
		numero.setTipo("Cientifica");
		
		
		
		
		
		numero.suma();
		numero.resta();
		numero.division();
		numero.multiplicacion();
		
	}

	

}
