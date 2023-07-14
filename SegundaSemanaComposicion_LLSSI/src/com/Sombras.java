package com;

public class Sombras {
	
	private String colores;
	private String tama�o;
	private int cantidaddecolores;
	
	
	public Sombras () {
		
	}


	public Sombras(String colores, String tama�o, int cantidaddecolores) {
		super();
		this.colores = colores;
		this.tama�o = tama�o;
		this.cantidaddecolores = cantidaddecolores;
	}


	public String getColores() {
		return colores;
	}


	public void setColores(String colores) {
		this.colores = colores;
	}


	public String getTama�o() {
		return tama�o;
	}


	public void setTama�o(String tama�o) {
		this.tama�o = tama�o;
	}


	public int getCantidaddecolores() {
		return cantidaddecolores;
	}


	public void setCantidaddecolores(int cantidaddecolores) {
		this.cantidaddecolores = cantidaddecolores;
	}


	@Override
	public String toString() {
		return "Sombras [colores=" + colores + ", tama�o=" + tama�o + ", cantidaddecolores=" + cantidaddecolores + "]";
	}
	
	

}
