package com;

import java.util.Date;

public class Ticket {
	//Plantilla para crear un objeto respuesta
	//a las operaciones que realizar� nuestro cajero
	//Es decir, si la operaci�n se realiza exitosamente se nos devolver�
	//el valor de un ticket de operaci�n
	
	//Atributos de un ticke
	
	private int foliooperaci�n;
	private Date fechahora;
	private String usuario;
	private double saldo;
	private String sucursal;
	private int idcajero;
	
	public Ticket () {
		
	}

	public Ticket(int foliooperaci�n, Date fechahora, String usuario, double saldo, String sucursal, int idcajero) {
		super();
		this.foliooperaci�n = foliooperaci�n;
		this.fechahora = fechahora;
		this.usuario = usuario;
		this.saldo = saldo;
		this.sucursal = sucursal;
		this.idcajero = idcajero;
	}

	public int getFoliooperaci�n() {
		return foliooperaci�n;
	}

	public void setFoliooperaci�n(int foliooperaci�n) {
		this.foliooperaci�n = foliooperaci�n;
	}

	public Date getFechahora() {
		return fechahora;
	}

	public void setFechahora(Date fechahora) {
		this.fechahora = fechahora;
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

	public int getIdcajero() {
		return idcajero;
	}

	public void setIdcajero(int idcajero) {
		this.idcajero = idcajero;
	}

	@Override
	public String toString() {
		return "Ticket [foliooperaci�n=" + foliooperaci�n + ", fechahora=" + fechahora + ", usuario=" + usuario
				+ ", saldo=" + saldo + ", sucursal=" + sucursal + ", idcajero=" + idcajero + "]";
	}
	
	

}
