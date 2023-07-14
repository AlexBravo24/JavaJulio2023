package com;

public class Computadora {
	
	//atributos
	private String marca;
	private int año;
	private int ram;
	private int dd;
	
	// metodo constructor vacio
	public Computadora() {
	}
	
	// Metodo constructor con todos los atributos o paramateros

	public Computadora(String marca, int año, int ram, int dd) {
		super();
		this.marca = marca;
		this.año = año;
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

	public int getAño() {
		return año;
	}

	public void setAño(int año) {
		this.año = año;
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
		return "Computadora [marca=" + marca + ", año=" + año + ", ram=" + ram + ", dd=" + dd + "]";
	}	

}
