package com;

public class Reloj {
	
	//atributos
	private String marca;
	private String movimiento;
	private int a�o;
	
	// metodo constructor vacio
	public Reloj() {
	}

	
	// Metodo constructor con todos los atributos o paramateros
	public Reloj(String marca, String movimiento, int a�o) {
		super();
		this.marca = marca;
		this.movimiento = movimiento;
		this.a�o = a�o;
	}


	
	//GETTERS & SETTERS
	public String getMarca() {
		return marca;
	}


	public void setMarca(String marca) {
		this.marca = marca;
	}


	public String getMovimiento() {
		return movimiento;
	}


	public void setMovimiento(String movimiento) {
		this.movimiento = movimiento;
	}


	public int getA�o() {
		return a�o;
	}


	public void setA�o(int a�o) {
		this.a�o = a�o;
	}


	
	//Metodo toString
	@Override
	public String toString() {
		return "Reloj [marca=" + marca + ", movimiento=" + movimiento + ", a�o=" + a�o + "]";
	}

}
