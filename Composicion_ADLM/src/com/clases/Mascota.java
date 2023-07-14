package com.clases;

public class Mascota {
	private String nombre, raza;
	private double tamaño;
	
	public Mascota(String nombre, String raza, double tamaño) {
		super();
		this.nombre = nombre;
		this.raza = raza;
		this.tamaño = tamaño;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}

	public double getTamaño() {
		return tamaño;
	}

	public void setTamaño(double tamaño) {
		this.tamaño = tamaño;
	}
	
	
}
