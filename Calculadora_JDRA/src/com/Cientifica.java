package com;

import java.util.Scanner;

public class Cientifica extends Calculadora {
	
	// herencia clase calculadora
	
	// definir las operaciones para poder ejecutarlos en la clase principal
	
	private int modos;
	
	public Cientifica() {}

	public Cientifica(String marca, String color, int precio, int modos) {
		super(marca, color, precio);
		this.modos = modos;
	}

	public int getModos() {
		return modos;
	}

	public void setModos(int modos) {
		this.modos = modos;
	}

	@Override
	public String toString() {
		return "Cientifica [modos=" + modos + ", toString()=" + super.toString() + "]";
	}
	
	Scanner entrada = new Scanner(System.in);

	//@Override
	public void suma(int num1, int num2) {
		System.out.print("Ingrese numero 1: ");
		num1 = entrada.nextInt();
		System.out.print("Ingrese numero 2: ");
		num2 = entrada.nextInt();
		int total = num1 + num2;
		System.out.println("La suma es:"+total);
		
	}

	//@Override
	public void resta(int num1, int num2) {
		int total = num1 - num2;
		System.out.println("La resta es:"+total);
		
	}

	//@Override
	public void multiplicacion(int num1, int num2) {
		int total = num1 * num2;
		System.out.println("La multiplicacion es:"+total);
		
	}

	//@Override
	public void division(int num1, int num2) {
		int total = num1 / num2;
		System.out.println("La division es:"+total);
		
	}
	
	


}
