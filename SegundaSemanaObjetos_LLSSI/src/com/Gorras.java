package com;

public class Gorras {
	
	private String color;
	private String formas;
	private String tama�o;
	private String marca;
	private String sexo;
	
	
	public Gorras () {
		
	}


	public Gorras(String color, String formas, String tama�o, String marca, String sexo) {
		super();
		this.color = color;
		this.formas = formas;
		this.tama�o = tama�o;
		this.marca = marca;
		this.sexo = sexo;
	}


	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}


	public String getFormas() {
		return formas;
	}


	public void setFormas(String formas) {
		this.formas = formas;
	}


	public String getTama�o() {
		return tama�o;
	}


	public void setTama�o(String tama�o) {
		this.tama�o = tama�o;
	}


	public String getMarca() {
		return marca;
	}


	public void setMarca(String marca) {
		this.marca = marca;
	}


	public String getSexo() {
		return sexo;
	}


	public void setSexo(String sexo) {
		this.sexo = sexo;
	}


	@Override
	public String toString() {
		return "Gorras [color=" + color + ", formas=" + formas + ", tama�o=" + tama�o + ", marca=" + marca + ", sexo="
				+ sexo + "]";
	}
	
	
	

}
