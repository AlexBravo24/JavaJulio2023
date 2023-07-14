package com;

public class Producto {

	private String marca;
	private String nombre;
	private double precio;
	private int cnatidad;
	
	public Producto() {
		
	}



	public Producto(String marca, String nombre, double precio, int cnatidad) {
		super();
		this.marca = marca;
		this.nombre = nombre;
		this.precio = precio;
		this.cnatidad = cnatidad;
	}



	public String getMarca() {
		return marca;
	}



	public void setMarca(String marca) {
		this.marca = marca;
	}



	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public double getPrecio() {
		return precio;
	}



	public void setPrecio(double precio) {
		this.precio = precio;
	}



	public int getCnatidad() {
		return cnatidad;
	}



	public void setCnatidad(int cnatidad) {
		this.cnatidad = cnatidad;
	}



	@Override
	public String toString() {
		return "Producto [marca=" + marca + ", nombre=" + nombre + ", precio=" + precio + ", cnatidad=" + cnatidad
				+ "]";
	}




	
}
