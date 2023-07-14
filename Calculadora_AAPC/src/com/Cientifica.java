package com;

public class Cientifica extends Calculadora {
  
	public void suma (int n1, int n2) {
		int suma = n1 + n2;
		System.out.println("La suma de "+ n1 + " + " +  n2 + " es : " + suma);
	}
	public void resta (int n1, int n2) {
		int resta = n1 - n2;
		System.out.println("La resta de "+ n1 + " - " +  n2 + " es : " + resta);
	}
	public void multiplicacion (int n1, int n2) {
		int multiplicacion = n1 * n2;
		System.out.println("La multiplicacion de "+ n1 + " x " +  n2 + " es : " + multiplicacion);
	}
	public void division (int n1, int n2) {
		int division = n1 / n2;
		System.out.println("La division de "+ n1 + " / " +  n2 + " es : " + division);
	}
	
	
	
}