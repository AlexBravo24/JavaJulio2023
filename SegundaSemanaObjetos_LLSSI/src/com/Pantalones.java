package com;

public class Pantalones {
	
	
	private int talla;
	private String tipo;
	private String color;
	private String largo;
	private String marca;
	
	public  Pantalones () {
			
	}

	public Pantalones(int talla, String tipo, String color, String largo, String marca) {
		super();
		this.talla = talla;
		this.tipo = tipo;
		this.color = color;
		this.largo = largo;
		this.marca = marca;
			
	}

	public int getTalla() {
		return talla;
	}

	public void setTalla(int talla) {
		this.talla = talla;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getLargo() {
		return largo;
	}

	public void setLargo(String largo) {
		this.largo = largo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	@Override
	public String toString() {
		return "Pantalones [talla=" + talla + ", tipo=" + tipo + ", color=" + color + ", largo=" + largo + ", marca="
				+ marca + "]";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
