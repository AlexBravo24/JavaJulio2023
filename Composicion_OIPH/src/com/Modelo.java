package com;

public class Modelo {
	private String nombreModelo;
	private int año;
	private String color;
	
	public Modelo() {}

	public Modelo(String nombreModelo, int año, String color) {
		super();
		this.nombreModelo = nombreModelo;
		this.año = año;
		this.color = color;
	}

	public String getNombreModelo() {
		return nombreModelo;
	}

	public void setNombreModelo(String nombreModelo) {
		this.nombreModelo = nombreModelo;
	}

	public int getAño() {
		return año;
	}

	public void setAño(int año) {
		this.año = año;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Modelo [nombreModelo=" + nombreModelo + ", año=" + año + ", color=" + color + "]";
	}
	
	

}
