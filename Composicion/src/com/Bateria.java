package com;

public class Bateria {
	
	private String marca;
	private double mah;
	private int ciclos;
	
	public Bateria () {
		
	}

	public Bateria(String marca, double mah, int ciclos) {
		super();
		this.marca = marca;
		this.mah = mah;
		this.ciclos = ciclos;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public double getMah() {
		return mah;
	}

	public void setMah(double mah) {
		this.mah = mah;
	}

	public int getCiclos() {
		return ciclos;
	}

	public void setCiclos(int ciclos) {
		this.ciclos = ciclos;
	}

	@Override
	public String toString() {
		return "Bateria [marca=" + marca + ", mah=" + mah + ", ciclos=" + ciclos + "]";
	}
	
	
	

}
