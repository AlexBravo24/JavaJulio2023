package com;

public class Almacenamiento {
	
	private String marca;
	private double tamaño;
	private String tipo;
	
	public Almacenamiento () {
		
	}

	public Almacenamiento(String marca, double tamaño, String tipo) {
		super();
		this.marca = marca;
		this.tamaño = tamaño;
		this.tipo = tipo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public double getTamaño() {
		return tamaño;
	}

	public void setTamaño(double tamaño) {
		this.tamaño = tamaño;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return "Almacenamiento [marca=" + marca + ", tamaño=" + tamaño + ", tipo=" + tipo + "]";
	}
	
	

}
