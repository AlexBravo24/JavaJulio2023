package com;

public class Osos {
	
	private String raza;
	private String tama�o;
	private String alimentacion;
	private String vivienda;
	private int peso;
	
	
	public Osos () {
		
	}


	public Osos(String raza, String tama�o, String alimentacion, String vivienda, int peso) {
		super();
		this.raza = raza;
		this.tama�o = tama�o;
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


	public String getTama�o() {
		return tama�o;
	}


	public void setTama�o(String tama�o) {
		this.tama�o = tama�o;
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
		return "Osos [raza=" + raza + ", tama�o=" + tama�o + ", alimentacion=" + alimentacion + ", vivienda=" + vivienda
				+ ", peso=" + peso + "]";
	}
	
	
	
	

}
