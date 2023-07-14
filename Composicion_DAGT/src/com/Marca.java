package com;

public class Marca {
	
	private String marca;
	private String modelo;
	private String color;
	private int a�o;

	public Marca() {
	}

	public Marca(String marca, String modelo, String color, int a�o) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.color = color;
		this.a�o = a�o;
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

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getA�o() {
		return a�o;
	}

	public void setA�o(int a�o) {
		this.a�o = a�o;
	}

	@Override
	public String toString() {
		return "Marca [marca=" + marca + ", modelo=" + modelo + ", color=" + color + ", a�o=" + a�o + "]";
	}
	
	
	
}
