package com;

public class Pantalla {
	
	private String modelo;
	private String resolucion;
	private double ppi;
	
	public Pantalla() {}

	public Pantalla(String modelo, String resolucion, double ppi) {
		super();
		this.modelo = modelo;
		this.resolucion = resolucion;
		this.ppi = ppi;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getResolucion() {
		return resolucion;
	}

	public void setResolucion(String resolucion) {
		this.resolucion = resolucion;
	}

	public double getPpi() {
		return ppi;
	}

	public void setPpi(double ppi) {
		this.ppi = ppi;
	}

	@Override
	public String toString() {
		return "Pantalla [modelo=" + modelo + ", resolucion=" + resolucion + ", ppi=" + ppi + "]";
	}
	
	

}
