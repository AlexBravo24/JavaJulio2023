package com;

public class Transmicion {
	
	private String tipo;
	private double marcha;
	
	private String modoConduccion;
	
	public Transmicion() {
		
	}

	public Transmicion(String tipo, double marcha, String modoConduccion) {
		super();
		this.tipo = tipo;
		this.marcha = marcha;
		this.modoConduccion = modoConduccion;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public double getMarcha() {
		return marcha;
	}

	public void setMarcha(double marcha) {
		this.marcha = marcha;
	}

	public String getModoConduccion() {
		return modoConduccion;
	}

	public void setModoConduccion(String modoConduccion) {
		this.modoConduccion = modoConduccion;
	}

	@Override
	public String toString() {
		return "Transmicion [tipo=" + tipo + ", marcha=" + marcha + ", modoConduccion=" + modoConduccion + "]";
	}
	

}
