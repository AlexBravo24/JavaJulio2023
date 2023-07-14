package com;

public class Quesos {
	
	private String tipo;
	private double peso;
	private boolean EsArtesanal;
	private int antiguedad;
	
	
	public Quesos() {
		
	}


	public Quesos(String tipo, double peso, boolean esArtesanal, int antiguedad) {
		super();
		this.tipo = tipo;
		this.peso = peso;
		EsArtesanal = esArtesanal;
		this.antiguedad = antiguedad;
	}


	public String getTipo() {
		return tipo;
	}


	public void setTipo(String tipo) {
		this.tipo = tipo;
	}


	public double getPeso() {
		return peso;
	}


	public void setPeso(double peso) {
		this.peso = peso;
	}


	public boolean isEsArtesanal() {
		return EsArtesanal;
	}


	public void setEsArtesanal(boolean esArtesanal) {
		EsArtesanal = esArtesanal;
	}


	public int getAntiguedad() {
		return antiguedad;
	}


	public void setAntiguedad(int antiguedad) {
		this.antiguedad = antiguedad;
	}


	@Override
	public String toString() {
		return "Quesos [tipo=" + tipo + ", peso=" + peso + ", EsArtesanal=" + EsArtesanal + ", antiguedad=" + antiguedad
				+ "]";
	}
	
	

}
