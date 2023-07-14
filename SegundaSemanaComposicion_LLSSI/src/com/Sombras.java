package com;

public class Sombras {
	
	private String colores;
	private String tamaño;
	private int cantidaddecolores;
	
	
	public Sombras () {
		
	}


	public Sombras(String colores, String tamaño, int cantidaddecolores) {
		super();
		this.colores = colores;
		this.tamaño = tamaño;
		this.cantidaddecolores = cantidaddecolores;
	}


	public String getColores() {
		return colores;
	}


	public void setColores(String colores) {
		this.colores = colores;
	}


	public String getTamaño() {
		return tamaño;
	}


	public void setTamaño(String tamaño) {
		this.tamaño = tamaño;
	}


	public int getCantidaddecolores() {
		return cantidaddecolores;
	}


	public void setCantidaddecolores(int cantidaddecolores) {
		this.cantidaddecolores = cantidaddecolores;
	}


	@Override
	public String toString() {
		return "Sombras [colores=" + colores + ", tamaño=" + tamaño + ", cantidaddecolores=" + cantidaddecolores + "]";
	}
	
	

}
