package com.clases;

public class Mascota {
	private String nombre, raza;
	private double tama�o;
	
	public Mascota(String nombre, String raza, double tama�o) {
		super();
		this.nombre = nombre;
		this.raza = raza;
		this.tama�o = tama�o;
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

	public double getTama�o() {
		return tama�o;
	}

	public void setTama�o(double tama�o) {
		this.tama�o = tama�o;
	}
	
	
}
