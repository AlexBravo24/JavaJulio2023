package com;

public class Palomitas {

	private String sabor;
	private String tamaño;
	private String marca;
	
	public Palomitas() {
		
	}
	
	
	public Palomitas(String sabor, String tamaño, String marca) {
		super();
		this.sabor = sabor;
		this.tamaño = tamaño;
		this.marca = marca;
	}
	
	
	public String getSabor() {
		return sabor;
	}
	public void setSabor(String sabor) {
		this.sabor = sabor;
	}
	public String getTamaño() {
		return tamaño;
	}
	public void setTamaño(String tamaño) {
		this.tamaño = tamaño;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}


	@Override
	public String toString() {
		return "Palomitas [sabor = " + sabor + ", tamaño = " + tamaño + ", marca = " + marca + "]";
	}
	
	
	
	
 } // Cierre Class
