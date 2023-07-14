package com;

import java.util.Scanner;

public class Cientifica extends Calculadora {
	
	//Declaracion de variables
	private double input1;
	private double input2;
	private String operacion;
	

	Scanner scanner = new Scanner(System.in);
	
	
	//Constructor vacio
	public Cientifica() {}
	
	//Constructor con valores
	public Cientifica (String marca, String color, double input1, double input2) {
		super(marca,color);
		this.input1 = input1;
		this.input2 = input2;
		
		
	}

	//Get y Set de variable input 1
	public double getInput1() {
		return input1;
	}
	public void setInput1(double input1) {
		this.input1 = input1;
	}

	//Get y Set de variable input2
	public double getInput2() {
		return input2;
	}
	public void setInput2(double input2) {
		this.input2 = input2;
	}

	
	@Override
	public double suma() {
		return input1 + input2;
	}

	@Override
	public double resta() {
		return input1-input2;
	}

	@Override
	public double multiplicacion() {
		return input1 * input2;
	}

	@Override
	public double division() {
		try {
			return input1 / input2;
			
		} catch (Exception e) {
			System.out.println(e);
			return 0;
		}
	}
	
	@Override
	public void operacion(){
		while (true) {
			System.out.print("Que operacion deseas realizar (suma, resta, multiplicacion, division)? ");
			operacion = scanner.nextLine();
			operacion.toLowerCase();
			
			switch (operacion) {
			case "suma":
				System.out.print("Introduce el primer valor a sumar: ");
				setInput1(scanner.nextDouble());
				System.out.print("Introduce el segundo valor a sumar: ");
				setInput2(scanner.nextDouble());
				System.out.println("El resultado es: " + suma());
				break;
			case "resta":
				System.out.print("Introduce el primer valor a resta: ");
				setInput1(scanner.nextDouble());
				System.out.print("Introduce el segundo valor a resta: ");
				setInput2(scanner.nextDouble());
				System.out.println("El resultado es: " + resta());
				break;
			case "multiplicacion":
				System.out.print("Introduce el primer valor a multiplicar: ");
				setInput1(scanner.nextDouble());
				System.out.print("Introduce el segundo valor a multiplicar: ");
				setInput2(scanner.nextDouble());
				System.out.print("El resultado es: " + multiplicacion());
				break;
				
			case "division":
				System.out.print("Introduce el primer valor a dividir: ");
				setInput1(scanner.nextDouble());
				System.out.print("Introduce el segundo valor a dividir: ");
				setInput2(scanner.nextDouble());
				System.out.println("El resultado es: " + division());
				break;
				
			default:
				System.out.println("La opcion introducida no esta disponible");
				break;
			}
			scanner.nextLine();
		}
	}

	


	
	
	
}
