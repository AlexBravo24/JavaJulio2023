package com.ejercicios.dia1;

public class Articulo {
	private String nombre, proveedor;
	private int stock, precio;
	
	public Articulo() {
		super();
	}
	public Articulo(String nombre, String proveedor, int stock, int precio) {
		super();
		this.nombre = nombre;
		this.proveedor = proveedor;
		this.stock = stock;
		this.precio = precio;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getProveedor() {
		return proveedor;
	}
	public void setProveedor(String proveedor) {
		this.proveedor = proveedor;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	public int getPrecio() {
		return precio;
	}
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	@Override
	public String toString() {
		return "Articulo [nombre=" + nombre + ", proveedor=" + proveedor + ", stock=" + stock + ", precio=" + precio
				+ "]";
	}
	
	
}
