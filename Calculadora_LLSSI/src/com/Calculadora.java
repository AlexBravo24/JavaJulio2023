package com;

public class Calculadora {
	
	private int op1;
	private int op2;
	
	public Calculadora (){
		
	}

	public Calculadora(int op1, int op2) {
		super();
		this.op1 = op1;
		this.op2 = op2;
	}
	
	public int sumar() {
		int suma = op1 + op2;
		return suma;
	}
	
	public int restar() {
		int resta = op1 - op2;
		return resta;
	}
	
	public int multiplicar() {
		int multiplicacion = op1 * op2;
		return multiplicacion;
	}
	
	public double dividir() {
		double division = (double)op1 / (double)op2;
		return division;
	}

	public int getOp1() {
		return op1;
	}

	public void setOp1(int op1) {
		this.op1 = op1;
	}

	public int getOp2() {
		return op2;
	}

	public void setOp2(int op2) {
		this.op2 = op2;
	}
	
	
	
	
	
	

}
