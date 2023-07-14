package com;

public class Bicicletas {
	
	private String marca;
	private String color;
	private String tama�o;
	private String tipo;
	
	public Bicicletas() {
		
	}
	
	
	public Bicicletas(String marca, String color, String tama�o, String tipo) {
		super();
		this.marca = marca;
		this.color = color;
		this.tama�o = tama�o;
		this.tipo = tipo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getTama�o() {
		return tama�o;
	}

	public void setTama�o(String tama�o) {
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
		return "Bicicletas [marca = " + marca + ", color = " + color + ", tama�o = " + tama�o + ", tipo = " + tipo + "]";
	}
	
	
	
		

} // Cierre Class
