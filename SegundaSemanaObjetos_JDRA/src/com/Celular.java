package com;

public class Celular {
	
	//atributos
	private String marca;
	private String so;
	private int ram;
	private int dd;
	
	// metodo constructor vacio
	public Celular() {
	}

	// Metodo constructor con todos los atributos o paramateros
	public Celular(String marca, String so, int ram, int dd) {
		super();
		this.marca = marca;
		this.so = so;
		this.ram = ram;
		this.dd = dd;
	}
	
	//GETTERS & SETTERS

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getSo() {
		return so;
	}

	public void setSo(String so) {
		this.so = so;
	}

	public int getRam() {
		return ram;
	}

	public void setRam(int ram) {
		this.ram = ram;
	}

	public int getDd() {
		return dd;
	}

	public void setDd(int dd) {
		this.dd = dd;
	}
	
	
	//Metodo toString

	@Override
	public String toString() {
		return "Celular [marca=" + marca + ", so=" + so + ", ram=" + ram + ", dd=" + dd + "]";
	}

}
