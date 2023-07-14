package com;

public class Auto {
	
	//atributos
	private String marca;
	private String modelo;
	private int año;
	private int numPuertas;
	
	// metodo constructor vacio
	public Auto() {
	}

	// Metodo constructor con todos los atributos o paramateros
	public Auto(String marca, String modelo, int año, int numPuertas) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.año = año;
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

	public int getAño() {
		return año;
	}

	public void setAño(int año) {
		this.año = año;
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
		return "Auto [marca=" + marca + ", modelo=" + modelo + ", año=" + año + ", numPuertas=" + numPuertas + "]";
	}
	

}
