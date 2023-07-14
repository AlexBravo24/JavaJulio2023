package com;

import java.util.Date;

public class Ticket {
	
	private int idCompra;
	private Date fecha;
	private double cantidadIngresada;
	private double cambio;

	public Ticket() {
		
	}
	
	

	public Ticket(int idCompra, Date fecha, double cantidadIngresada, double cambio) {
		super();
		this.idCompra = idCompra;
		this.fecha = fecha;
		this.cantidadIngresada = cantidadIngresada;
		this.cambio = cambio;
	}



	public int getIdCompra() {
		return idCompra;
	}

	public void setIdCompra(int idCompra) {
		this.idCompra = idCompra;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public double getCantidadIngresada() {
		return cantidadIngresada;
	}

	public void setCantidadIngresada(double cantidadIngresada) {
		this.cantidadIngresada = cantidadIngresada;
	}

	public double getCambio() {
		return cambio;
	}

	public void setCambio(double cambio) {	
		this.cambio = cambio;
	}

	@Override
	public String toString() {
		return "Ticket [idCompra=" + idCompra + ", fecha=" + fecha + ", cantidadIngresada=" + cantidadIngresada
				+ ", cambio=" + cambio + "]";
	}
	
	
}
