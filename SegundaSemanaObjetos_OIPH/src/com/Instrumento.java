package com;

public class Instrumento {
	
	private String tipo;
	private String material;
	private double precio;
	
	public Instrumento() {
		
	}

	public Instrumento(String tipo, String material, double precio) {
		super();
		this.tipo = tipo;
		this.material = material;
		this.precio = precio;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Instrumento [tipo=" + tipo + ", material=" + material + ", precio=" + precio + "]";
	}
	
	
	
}
