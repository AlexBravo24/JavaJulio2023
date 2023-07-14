package com;

public class Arbol {
	
	//atributos
	private String tipo;
	private double altura;
	private int a�os_durabilidad;
	
	// metodo constructor vacio
	public Arbol() {
	}

	
	// Metodo constructor con todos los atributos o paramateros
	public Arbol(String tipo, double altura, int a�os_durabilidad) {
		super();
		this.tipo = tipo;
		this.altura = altura;
		this.a�os_durabilidad = a�os_durabilidad;
	}

	
	//GETTERS & SETTERS

	public String getTipo() {
		return tipo;
	}


	public void setTipo(String tipo) {
		this.tipo = tipo;
	}


	public double getAltura() {
		return altura;
	}


	public void setAltura(double altura) {
		this.altura = altura;
	}


	public int getA�os_durabilidad() {
		return a�os_durabilidad;
	}


	public void setA�os_durabilidad(int a�os_durabilidad) {
		this.a�os_durabilidad = a�os_durabilidad;
	}

	
	//Metodo toString

	@Override
	public String toString() {
		return "Arbol [tipo=" + tipo + ", altura=" + altura + ", a�os_durabilidad=" + a�os_durabilidad + "]";
	}

}
