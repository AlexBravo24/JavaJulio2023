package com;

import java.util.Date;

public class Ticket {

	//pantilla para crear un objeto de respuesta
	//a las operaciones que realizar� nuestro cajero
	// es deicr, si la operacion se realiza exitosamente
	// se devolver� el valor de un ticket de 
	//operaci�n
	
	//atributos de un ticket
	
	private int folioOperacion;
	private Date fechaHora;
	private String usuario;
	private double saldo;
	private String sucursal;
	private int idCajero;
	
	public Ticket() {
		
	}

	public Ticket(int folioOperacion, Date fechaHora, String usuario, double saldo, String sucursal, int idCajero) {
		super();
		this.folioOperacion = folioOperacion;
		this.fechaHora = fechaHora;
		this.usuario = usuario;
		this.saldo = saldo;
		this.sucursal = sucursal;
		this.idCajero = idCajero;
	}

	public int getFolioOperacion() {
		return folioOperacion;
	}

	public void setFolioOperacion(int folioOperacion) {
		this.folioOperacion = folioOperacion;
	}

	public Date getFechaHora() {
		return fechaHora;
	}

	public void setFechaHora(Date fechaHora) {
		this.fechaHora = fechaHora;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public String getSucursal() {
		return sucursal;
	}

	public void setSucursal(String sucursal) {
		this.sucursal = sucursal;
	}

	public int getIdCajero() {
		return idCajero;
	}

	public void setIdCajero(int idCajero) {
		this.idCajero = idCajero;
	}

	@Override
	public String toString() {
		return "Ticket [folioOperacion=" + folioOperacion + ", fechaHora=" + fechaHora + ", usuario=" + usuario
				+ ", saldo=" + saldo + ", sucursal=" + sucursal + ", idCajero=" + idCajero + "]";
	}
	
	
}
