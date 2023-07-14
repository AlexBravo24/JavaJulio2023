package com;

public class Osos {
	
	private String raza;
	private String tamaño;
	private String alimentacion;
	private String vivienda;
	private int peso;
	
	
	public Osos () {
		
	}


	public Osos(String raza, String tamaño, String alimentacion, String vivienda, int peso) {
		super();
		this.raza = raza;
		this.tamaño = tamaño;
		this.alimentacion = alimentacion;
		this.vivienda = vivienda;
		this.peso = peso;
	}


	public String getRaza() {
		return raza;
	}


	public void setRaza(String raza) {
		this.raza = raza;
	}


	public String getTamaño() {
		return tamaño;
	}


	public void setTamaño(String tamaño) {
		this.tamaño = tamaño;
	}


	public String getAlimentacion() {
		return alimentacion;
	}


	public void setAlimentacion(String alimentacion) {
		this.alimentacion = alimentacion;
	}


	public String getVivienda() {
		return vivienda;
	}


	public void setVivienda(String vivienda) {
		this.vivienda = vivienda;
	}


	public int getPeso() {
		return peso;
	}


	public void setPeso(int peso) {
		this.peso = peso;
	}


	@Override
	public String toString() {
		return "Osos [raza=" + raza + ", tamaño=" + tamaño + ", alimentacion=" + alimentacion + ", vivienda=" + vivienda
				+ ", peso=" + peso + "]";
	}
	
	
	
	

}
