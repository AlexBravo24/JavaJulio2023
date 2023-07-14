package com;

public class Bateria {
	
	private String modelo;
	private double capacidad;
	private String tipo;
	
	public Bateria() {}

	public Bateria(String modelo, double capacidad, String tipo) {
		super();
		this.modelo = modelo;
		this.capacidad = capacidad;
		this.tipo = tipo;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public double getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(double capacidad) {
		this.capacidad = capacidad;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return "Bateria [modelo=" + modelo + ", capacidad=" + capacidad + ", tipo=" + tipo + "]";
	}
	
	

}
