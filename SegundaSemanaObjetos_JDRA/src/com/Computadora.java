package com;

public class Computadora {
	
	//atributos
	private String marca;
	private int a�o;
	private int ram;
	private int dd;
	
	// metodo constructor vacio
	public Computadora() {
	}
	
	// Metodo constructor con todos los atributos o paramateros

	public Computadora(String marca, int a�o, int ram, int dd) {
		super();
		this.marca = marca;
		this.a�o = a�o;
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

	public int getA�o() {
		return a�o;
	}

	public void setA�o(int a�o) {
		this.a�o = a�o;
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
		return "Computadora [marca=" + marca + ", a�o=" + a�o + ", ram=" + ram + ", dd=" + dd + "]";
	}	

}
