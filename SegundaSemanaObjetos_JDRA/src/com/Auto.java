package com;

public class Auto {
	
	//atributos
	private String marca;
	private String modelo;
	private int a�o;
	private int numPuertas;
	
	// metodo constructor vacio
	public Auto() {
	}

	// Metodo constructor con todos los atributos o paramateros
	public Auto(String marca, String modelo, int a�o, int numPuertas) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.a�o = a�o;
		this.numPuertas = numPuertas;
	}
	
	
	//GETTERS & SETTERS
	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getA�o() {
		return a�o;
	}

	public void setA�o(int a�o) {
		this.a�o = a�o;
	}

	public int getNumPuertas() {
		return numPuertas;
	}

	public void setNumPuertas(int numPuertas) {
		this.numPuertas = numPuertas;
	}
	
	
	//Metodo toString
	@Override
	public String toString() {
		return "Auto [marca=" + marca + ", modelo=" + modelo + ", a�o=" + a�o + ", numPuertas=" + numPuertas + "]";
	}
	

}
