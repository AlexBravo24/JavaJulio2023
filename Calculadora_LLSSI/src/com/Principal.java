package com;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calculadora basica = new Calculadora (6,2);
		
		System.out.println("La suma es:" + basica.sumar());
		System.out.println("La resta es:" + basica.restar());
		System.out.println("La multiplicacion es:" + basica.multiplicar());
		System.out.println("La division es  es:" + basica.dividir());

	}

}
