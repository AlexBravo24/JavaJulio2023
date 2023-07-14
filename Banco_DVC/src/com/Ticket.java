package com;

import java.util.Date;

public class Ticket {
	//Plantilla para crear un objeto respuesta
	//a las operaciones que realizará nuestro cajero
	//Es decir, si la operación se realiza exitosamente se nos devolverá
	//el valor de un ticket de operación
	
	//Atributos de un ticke
	
	private int foliooperación;
	private Date fechahora;
	private String usuario;
	private double saldo;
	private String sucursal;
	private int idcajero;
	
	public Ticket () {
		
	}

	public Ticket(int foliooperación, Date fechahora, String usuario, double saldo, String sucursal, int idcajero) {
		super();
		this.foliooperación = foliooperación;
		this.fechahora = fechahora;
		this.usuario = usuario;
		this.saldo = saldo;
		this.sucursal = sucursal;
		this.idcajero = idcajero;
	}

	public int getFoliooperación() {
		return foliooperación;
	}

	public void setFoliooperación(int foliooperación) {
		this.foliooperación = foliooperación;
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
		return "Ticket [foliooperación=" + foliooperación + ", fechahora=" + fechahora + ", usuario=" + usuario
				+ ", saldo=" + saldo + ", sucursal=" + sucursal + ", idcajero=" + idcajero + "]";
	}
	
	

}
