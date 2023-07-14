package com;

public class Auto {
	
	public String marca;
	public String modelo;
	public String version;
	public int año;
	public boolean hibrido;
	
	public Auto () {
		
	}

	public Auto(String marca, String modelo, String version, int año, boolean hibrido) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.version = version;
		this.año = año;
		this.hibrido = hibrido;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public int getAño() {
		return año;
	}

	public void setAño(int año) {
		this.año = año;
	}

	public boolean isHibrido() {
		return hibrido;
	}

	public void setHibrido(boolean hibrido) {
		this.hibrido = hibrido;
	}

	@Override
	public String toString() {
		return "Auto [marca=" + marca + ", modelo=" + modelo + ", version=" + version + ", año=" + año + ", hibrido="
				+ hibrido + "]";
	}
	
	

}
