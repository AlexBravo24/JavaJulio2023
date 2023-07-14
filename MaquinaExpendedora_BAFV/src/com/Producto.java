package com;

public class Producto {

	
	private double precio;
	private int existencia;
	
	public Producto() {
		
	}

	public Producto( double precio, int existencia) {
		super();
		this.precio = precio;
		this.existencia = existencia;
	}


	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public int getExistencia() {
		return existencia;
	}

	public void setExistencia(int existencia) {
		this.existencia = existencia;
	}

	@Override
	public String toString() {
		return "Producto [precio=" + precio + ", existencia=" + existencia + "]";
	}
	
	
	
}
