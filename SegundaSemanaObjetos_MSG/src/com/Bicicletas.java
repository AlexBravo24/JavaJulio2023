package com;

public class Bicicletas {
	
	private String marca;
	private String color;
	private String tamaño;
	private String tipo;
	
	public Bicicletas() {
		
	}
	
	
	public Bicicletas(String marca, String color, String tamaño, String tipo) {
		super();
		this.marca = marca;
		this.color = color;
		this.tamaño = tamaño;
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

	public String getTamaño() {
		return tamaño;
	}

	public void setTamaño(String tamaño) {
		this.tamaño = tamaño;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return "Bicicletas [marca = " + marca + ", color = " + color + ", tamaño = " + tamaño + ", tipo = " + tipo + "]";
	}
	
	
	
		

} // Cierre Class
