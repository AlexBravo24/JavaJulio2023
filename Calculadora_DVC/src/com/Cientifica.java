package com;

import java.util.Scanner;

public class Cientifica extends Calculadora{
	
	private int funciones;
	private String pantalla;
	private int operaciones;
	
	public Cientifica () {
		
	}

	public Cientifica(String marca, String color, double memoria, int funciones, String pantalla, int operaciones) {
		super(marca, color, memoria);
		this.funciones = funciones;
		this.pantalla = pantalla;
		this.operaciones = operaciones;
	}

	public int getFunciones() {
		return funciones;
	}

	public void setFunciones(int funciones) {
		this.funciones = funciones;
	}

	public String getPantalla() {
		return pantalla;
	}

	public void setPantalla(String pantalla) {
		this.pantalla = pantalla;
	}

	public int getOperaciones() {
		return operaciones;
	}

	public void setOperaciones(int operaciones) {
		this.operaciones = operaciones;
	}

	@Override
	public String toString() {
		return "Cientifica [funciones=" + funciones + ", pantalla=" + pantalla + ", operaciones=" + operaciones
				+ ", toString()=" + super.toString() + "]";
	}
	Scanner entrada = new Scanner(System.in);
    double a,b,r;

	@Override
	public void sumar() {
		System.out.println("Estoy sumando..");
		a = entrada.nextInt();
		b = entrada.nextInt();
		r = a+b;
		System.out.println(a + " + " + b + " = " + r);
		System.out.println();
	}

	@Override
	public void restar() {
		System.out.println("Estoy restando..");
		a = entrada.nextInt();
		b = entrada.nextInt();
		r = a-b;
		System.out.println(a + " - " + b + " = " + r);
		System.out.println();
	}

	@Override
	public void multiplicar() {
		System.out.println("Estoy multiplicando..");
		a = entrada.nextInt();
		b = entrada.nextInt();
		r = a*b;
		System.out.println(a + " * " + b + " = " + r);
		System.out.println();
	}

	@Override
	public void dividr() {
		System.out.println("Estoy dividiendo..");
		a = entrada.nextInt();
		b = entrada.nextInt();
		r = a/b;
		System.out.println(a + " / " + b + " = " + r);
		System.out.println();
	}
	
	
	
	
	
	

}
