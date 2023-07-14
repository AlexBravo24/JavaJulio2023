package com.ejercicios.dia1;

public class Figura {
	private String nombre;
	private int noLados;
	private double area, perimetro;
	
	public Figura() {
		super();
	}
	
	public Figura(String nombre, int noLados) {
		this.nombre = nombre;
		this.noLados = noLados;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getNoLados() {
		return noLados;
	}
	public void setNoLados(int noLados) {
		this.noLados = noLados;
	}

	@Override
	public String toString() {
		return "Figura [nombre=" + nombre + ", noLados=" + noLados + ", area=" + area + ", perimetro=" + perimetro
				+ "]";
	}
	
	
}
