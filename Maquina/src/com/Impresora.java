package com;

import java.util.Date;

public class Impresora {
	
	private int folio;
	private Date fechaYhora;
	private double saldo;
	private String nombre;
	private int cantidad;
	private double precio;
	
	public Impresora() {
		
	}

	public Impresora(int folio, Date fechaYhora, double saldo, String nombre, int cantidad, double precio) {
		super();
		this.folio = folio;
		this.fechaYhora = fechaYhora;
		this.saldo = saldo;
		this.nombre = nombre;
		this.cantidad = cantidad;
		this.precio = precio;
	}

	public Impresora(int folio, Date fechaYhora, String nombre, int cantidad, double precio) {
		super();
		this.folio = folio;
		this.fechaYhora = fechaYhora;
		this.nombre = nombre;
		this.cantidad = cantidad;
		this.precio = precio;
	}

	public int getFolio() {
		return folio;
	}

	public void setFolio(int folio) {
		this.folio = folio;
	}

	public Date getFechaYhora() {
		return fechaYhora;
	}

	public void setFechaYhora(Date fechaYhora) {
		this.fechaYhora = fechaYhora;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Impresora [folio=" + folio + ", fechaYhora=" + fechaYhora + ", saldo=" + saldo + ", nombre=" + nombre
				+ ", cantidad=" + cantidad + ", precio=" + precio + "]";
	}



}
