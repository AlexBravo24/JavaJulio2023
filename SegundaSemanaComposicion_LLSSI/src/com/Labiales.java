package com;

public class Labiales {
	
	private String color;
	private String tipo;
	private int cantidad;
	
	public Labiales () {
		
	}

	public Labiales(String color, String tipo, int cantidad) {
		super();
		this.color = color;
		this.tipo = tipo;
		this.cantidad = cantidad;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	@Override
	public String toString() {
		return "Labiales [color=" + color + ", tipo=" + tipo + ", cantidad=" + cantidad + "]";
	}
	
	

}
