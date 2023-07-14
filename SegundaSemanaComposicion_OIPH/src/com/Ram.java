package com;

public class Ram {

	private String marca;
	private double capcidad;
	private double frecuencia;
	
	public Ram() {
		
	}

	public Ram(String marca, double capcidad, double frecuencia) {
		super();
		this.marca = marca;
		this.capcidad = capcidad;
		this.frecuencia = frecuencia;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public double getCapcidad() {
		return capcidad;
	}

	public void setCapcidad(double capcidad) {
		this.capcidad = capcidad;
	}

	public double getFrecuencia() {
		return frecuencia;
	}

	public void setFrecuencia(double frecuencia) {
		this.frecuencia = frecuencia;
	}

	@Override
	public String toString() {
		return "Ram [marca=" + marca + ", capcidad=" + capcidad + ", frecuencia=" + frecuencia + "]";
	}
	
	
	
}
