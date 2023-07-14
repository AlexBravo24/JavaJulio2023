package com;

public class Almacenamiento {
	
	private String marca;
	private double tama�o;
	private String tipo;
	
	public Almacenamiento () {
		
	}

	public Almacenamiento(String marca, double tama�o, String tipo) {
		super();
		this.marca = marca;
		this.tama�o = tama�o;
		this.tipo = tipo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public double getTama�o() {
		return tama�o;
	}

	public void setTama�o(double tama�o) {
		this.tama�o = tama�o;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return "Almacenamiento [marca=" + marca + ", tama�o=" + tama�o + ", tipo=" + tipo + "]";
	}
	
	

}
