package com;

import java.util.Date;

public class Ticket  {
	
	private int foliooperación;
	private Date fechahora;
	private String maquina;
	private double cambio;
	private String ubicacion;
	private int idmaquina;
	
	public Ticket () {
		
	}

	public Ticket(int foliooperación, Date fechahora, String maquina, double cambio, String ubicacion, int idmaquina) {
		super();
		this.foliooperación = foliooperación;
		this.fechahora = fechahora;
		this.maquina = maquina;
		this.cambio = cambio;
		this.ubicacion = ubicacion;
		this.idmaquina = idmaquina;
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

	public String getMaquina() {
		return maquina;
	}

	public void setMaquina(String maquina) {
		this.maquina = maquina;
	}

	public double getCambio() {
		return cambio;
	}

	public void setCambio(double cambio) {
		this.cambio = cambio;
	}

	public String getUbicacion() {
		return ubicacion;
	}

	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}

	public int getIdmaquina() {
		return idmaquina;
	}

	public void setIdmaquina(int idmaquina) {
		this.idmaquina = idmaquina;
	}

	@Override
	public String toString() {
		return "Ticket [foliooperación=" + foliooperación + ", fechahora=" + fechahora + ", maquina=" + maquina
				+ ", cambio=" + cambio + ", ubicacion=" + ubicacion + ", idmaquina=" + idmaquina + "]";
	}
	
	

}
