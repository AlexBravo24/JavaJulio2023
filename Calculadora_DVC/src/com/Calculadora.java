package com;

public abstract  class Calculadora {
	
	private String marca;
	private String color;
	private double memoria;
	
	public Calculadora () {
		
	}

	public Calculadora(String marca, String color, double memoria) {
		super();
		this.marca = marca;
		this.color = color;
		this.memoria = memoria;
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

	public double getMemoria() {
		return memoria;
	}

	public void setMemoria(double memoria) {
		this.memoria = memoria;
	}

	@Override
	public String toString() {
		return "Calculadora [marca=" + marca + ", color=" + color + ", memoria=" + memoria + "]";
	}
	
	public abstract void sumar();
	public abstract void restar();
	public abstract void multiplicar();
	public abstract void dividr();
	
	

}
