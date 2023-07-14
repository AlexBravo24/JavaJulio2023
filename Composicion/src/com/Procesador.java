package com;

public class Procesador {
	
	private String marca;
	private double frecuencia;
	private int nucleos;
	
	public Procesador () {
		
	}

	public Procesador(String marca, double frecuencia, int nucleos) {
		super();
		this.marca = marca;
		this.frecuencia = frecuencia;
		this.nucleos = nucleos;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public double getFrecuencia() {
		return frecuencia;
	}

	public void setFrecuencia(double frecuencia) {
		this.frecuencia = frecuencia;
	}

	public int getNucleos() {
		return nucleos;
	}

	public void setNucleos(int nucleos) {
		this.nucleos = nucleos;
	}

	@Override
	public String toString() {
		return "Procesador [marca=" + marca + ", frecuencia=" + frecuencia + ", nucleos=" + nucleos + "]";
	}
	
	

}
