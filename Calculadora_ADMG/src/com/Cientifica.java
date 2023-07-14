package com;

public class Cientifica extends Calculadora {
	//herencia de calculadora
	
	private double num1;
	private double num2;
	private double resultado;
	
	public Cientifica(String marca, String color, String modelo, double num1, double num2) {
		super(marca, color, modelo);
		this.num1 = num1;
		this.num2 = num2;
	}

	public double getNum1() {
		return num1;
	}

	public void setNum1(double num1) {
		this.num1 = num1;
	}

	public double getNum2() {
		return num2;
	}

	public void setNum2(double num2) {
		this.num2 = num2;
	}

	@Override
	public double sumar() {
		resultado = num1 + num2;
		return resultado;
	}

	@Override
	public double restar() {
		resultado = num1 - num2;
		return resultado;
	}

	@Override
	public double multiplicar() {
		resultado = num1 * num2;
		return resultado;
	}

	@Override
	public double dividir() {
		resultado = num1 / num2;
		return resultado;
	}
	
	
	
	

}
