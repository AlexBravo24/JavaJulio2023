package com;

public class Modelo {
	private String nombreModelo;
	private int a�o;
	private String color;
	
	public Modelo() {}

	public Modelo(String nombreModelo, int a�o, String color) {
		super();
		this.nombreModelo = nombreModelo;
		this.a�o = a�o;
		this.color = color;
	}

	public String getNombreModelo() {
		return nombreModelo;
	}

	public void setNombreModelo(String nombreModelo) {
		this.nombreModelo = nombreModelo;
	}

	public int getA�o() {
		return a�o;
	}

	public void setA�o(int a�o) {
		this.a�o = a�o;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Modelo [nombreModelo=" + nombreModelo + ", a�o=" + a�o + ", color=" + color + "]";
	}
	
	

}
