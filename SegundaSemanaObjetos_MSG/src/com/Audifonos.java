package com;

public class Audifonos {

	private String marca;
	private String color;
	private String potencia;
	private String modelo;
	
	public Audifonos() {
		
	}
	
	public Audifonos(String marca, String color, String potencia, String modelo) {
		super();
		this.marca = marca;
		this.color = color;
		this.potencia = potencia;
		this.modelo = modelo;
	}


	public String getMarca() {
		return marca;
	}


	public void setMarca(String marca) {
		this.marca = marca;
	}


	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}


	public String getPotencia() {
		return potencia;
	}


	public void setPotencia(String potencia) {
		this.potencia = potencia;
	}


	public String getModelo() {
		return modelo;
	}


	public void setModelo(String modelo) {
		this.modelo = modelo;
	}


	@Override
	public String toString() {
		return "Audifonos [marca = " + marca + ", color = " + color + ", potencia = " + potencia + ", modelo = " + modelo + "]";
	}
	
	
	
	
}// Cierre Class
