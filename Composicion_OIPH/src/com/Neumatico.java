package com;

public class Neumatico {
	private String marca;
	private String modelo;
	private double peso;
	
	public Neumatico() {}

	public Neumatico(String marca, String modelo, double peso) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.peso = peso;
	}

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

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	@Override
	public String toString() {
		return "Neumatico [marca=" + marca + ", modelo=" + modelo + ", peso=" + peso + "]";
	}
	
	
}
