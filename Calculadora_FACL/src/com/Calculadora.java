package com;

public abstract class Calculadora {
	
	//Crear métodos abstractos
	//Suma,resta,multiplicacion y division
	
	private String color;
	private String marca;
	private boolean tapa;
	
	public Calculadora() {
		
	}

	public Calculadora(String color, String marca, boolean tapa) {
		super();
		this.color = color;
		this.marca = marca;
		this.tapa = tapa;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public boolean isTapa() {
		return tapa;
	}

	public void setTapa(boolean tapa) {
		this.tapa = tapa;
	}

	@Override
	public String toString() {
		return "Calculadora [color=" + color + ", marca=" + marca + ", tapa=" + tapa + "]";
	}

	public abstract void suma();
	public abstract void resta();
	public abstract void division();
	public abstract void multiplicacion();
	
	
}
