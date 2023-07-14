package com;

public class Camara {
	
	private String modelo;
	private int mpx;
	private int numLentes;
	
	public Camara() {}

	public Camara(String modelo, int mpx, int numLentes) {
		super();
		this.modelo = modelo;
		this.mpx = mpx;
		this.numLentes = numLentes;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getMpx() {
		return mpx;
	}

	public void setMpx(int mpx) {
		this.mpx = mpx;
	}

	public int getNumLentes() {
		return numLentes;
	}

	public void setNumLentes(int numLentes) {
		this.numLentes = numLentes;
	}

	@Override
	public String toString() {
		return "Camara [modelo=" + modelo + ", mpx=" + mpx + ", numLentes=" + numLentes + "]";
	}
	
	

}
