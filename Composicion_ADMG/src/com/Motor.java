package com;

public class Motor {
	
	private String marca;
	private double cilindrada;
	private int modelo;
	
	public Motor () {}

	public Motor(String marca, double cilindrada, int modelo) {
		super();
		this.marca = marca;
		this.cilindrada = cilindrada;
		this.modelo = modelo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public double getCilindrada() {
		return cilindrada;
	}

	public void setCilindrada(double cilindrada) {
		this.cilindrada = cilindrada;
	}

	public int getModelo() {
		return modelo;
	}

	public void setModelo(int modelo) {
		this.modelo = modelo;
	}

	@Override
	public String toString() {
		return "Motor [marca=" + marca + ", cilindrada=" + cilindrada + ", modelo=" + modelo + "]";
	}
	
	

}
