package com;

public abstract class Calculadora {

	//Definicion de los atributos y variables
	private String marca;
	private String color;

	
	//Constructor vacio
	public Calculadora () {}

	//Constructor con valores
	public Calculadora(String marca, String color) {
		super();
		this.marca = marca;
		this.color = color;
	}

	//Get y set de variable marca
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}

	//get y set de variable color
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	
	//Definicion de metodos abstractos
	public abstract double suma();
	public abstract double resta();
	public abstract double multiplicacion();
	public abstract double division();
	public abstract void operacion();

	@Override
	public String toString() {
		return "Calculadora [marca=" + marca + ", color=" + color + "]";
	}
	
	
	
	
	
}
