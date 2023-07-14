package com;

public class Palomitas {

	private String sabor;
	private String tama�o;
	private String marca;
	
	public Palomitas() {
		
	}
	
	
	public Palomitas(String sabor, String tama�o, String marca) {
		super();
		this.sabor = sabor;
		this.tama�o = tama�o;
		this.marca = marca;
	}
	
	
	public String getSabor() {
		return sabor;
	}
	public void setSabor(String sabor) {
		this.sabor = sabor;
	}
	public String getTama�o() {
		return tama�o;
	}
	public void setTama�o(String tama�o) {
		this.tama�o = tama�o;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}


	@Override
	public String toString() {
		return "Palomitas [sabor = " + sabor + ", tama�o = " + tama�o + ", marca = " + marca + "]";
	}
	
	
	
	
 } // Cierre Class
