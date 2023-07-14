package com;

public class Principal {

	public static void main(String[] args) {
		
		//Van a crear una calculadora
		//con sus operaciones basicas (suma, resta, multiplicacion y division)
		//Calculadora sera la clase padre
		//Cientifica la clase hija
		//Calculadora debe volverse abstracta
		//y cientifica definira como se van a realizar las operaciones

		
		Cientifica operacion = new Cientifica("Casio", "Blanca", "fl200", 10, 5); 	
		System.out.println("El resultado es ");
		System.out.println(operacion.sumar());
		System.out.println(operacion.restar());
		System.out.println(operacion.multiplicar());
		System.out.println(operacion.dividir()); 
		
		
	}

}
