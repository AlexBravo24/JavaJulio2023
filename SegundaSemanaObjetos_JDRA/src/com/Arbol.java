package com;

public class Arbol {
	
	//atributos
	private String tipo;
	private double altura;
	private int años_durabilidad;
	
	// metodo constructor vacio
	public Arbol() {
	}

	
	// Metodo constructor con todos los atributos o paramateros
	public Arbol(String tipo, double altura, int años_durabilidad) {
		super();
		this.tipo = tipo;
		this.altura = altura;
		this.años_durabilidad = años_durabilidad;
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


	public int getAños_durabilidad() {
		return años_durabilidad;
	}


	public void setAños_durabilidad(int años_durabilidad) {
		this.años_durabilidad = años_durabilidad;
	}

	
	//Metodo toString

	@Override
	public String toString() {
		return "Arbol [tipo=" + tipo + ", altura=" + altura + ", años_durabilidad=" + años_durabilidad + "]";
	}

}
