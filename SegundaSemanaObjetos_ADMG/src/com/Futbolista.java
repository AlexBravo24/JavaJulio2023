package com;

public class Futbolista {
	
	private String nombre;
	private String Posicion;
	private int numero;
	
	public Futbolista () {}

	public Futbolista(String nombre, String posicion, int numero) {
		super();
		this.nombre = nombre;
		Posicion = posicion;
		this.numero = numero;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPosicion() {
		return Posicion;
	}

	public void setPosicion(String posicion) {
		Posicion = posicion;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	@Override
	public String toString() {
		return "Futbolista [nombre=" + nombre + ", Posicion=" + Posicion + ", numero=" + numero + "]";
	}

	

	
}
