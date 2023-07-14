package com;

public class JugadorDeBasket {
	
	private String posicion;
	private double tamaño;
	private int numero;
	private String hablidad;
	
	public JugadorDeBasket()
	{
		
	}

	public JugadorDeBasket(String posicion, double tamaño, int numero, String hablidad) {
		super();
		this.posicion = posicion;
		this.tamaño = tamaño;
		this.numero = numero;
		this.hablidad = hablidad;
	}

	public String getPosicion() {
		return posicion;
	}

	public void setPosicion(String posicion) {
		this.posicion = posicion;
	}

	public double getTamaño() {
		return tamaño;
	}

	public void setTamaño(double tamaño) {
		this.tamaño = tamaño;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getHablidad() {
		return hablidad;
	}

	public void setHablidad(String hablidad) {
		this.hablidad = hablidad;
	}

	@Override
	public String toString() {
		return "JugadorDeBasket [posicion=" + posicion + ", tamaño=" + tamaño + ", numero=" + numero + ", hablidad="
				+ hablidad + "]";
	}
	
}
