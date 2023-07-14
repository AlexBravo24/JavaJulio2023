package com;

public class JugadorDeBasket {
	
	private String posicion;
	private double tama�o;
	private int numero;
	private String hablidad;
	
	public JugadorDeBasket()
	{
		
	}

	public JugadorDeBasket(String posicion, double tama�o, int numero, String hablidad) {
		super();
		this.posicion = posicion;
		this.tama�o = tama�o;
		this.numero = numero;
		this.hablidad = hablidad;
	}

	public String getPosicion() {
		return posicion;
	}

	public void setPosicion(String posicion) {
		this.posicion = posicion;
	}

	public double getTama�o() {
		return tama�o;
	}

	public void setTama�o(double tama�o) {
		this.tama�o = tama�o;
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
		return "JugadorDeBasket [posicion=" + posicion + ", tama�o=" + tama�o + ", numero=" + numero + ", hablidad="
				+ hablidad + "]";
	}
	
}
