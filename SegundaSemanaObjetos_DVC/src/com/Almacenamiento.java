package com;

public class Almacenamiento {
	
	private String tipo;
	private int capacidad;
	private String marca;
	
	public Almacenamiento () {
		
	}

	public Almacenamiento(String tipo, int capacidad, String marca) {
		super();
		this.tipo = tipo;
		this.capacidad = capacidad;
		this.marca = marca;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public int getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	@Override
	public String toString() {
		return "Almacenamiento [tipo=" + tipo + ", capacidad=" + capacidad + ", marca=" + marca + "]";
	}
	
	
	

}
