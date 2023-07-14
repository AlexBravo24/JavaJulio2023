package com;

public class Gorras {
	
	private String color;
	private String formas;
	private String tamaño;
	private String marca;
	private String sexo;
	
	
	public Gorras () {
		
	}


	public Gorras(String color, String formas, String tamaño, String marca, String sexo) {
		super();
		this.color = color;
		this.formas = formas;
		this.tamaño = tamaño;
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


	public String getTamaño() {
		return tamaño;
	}


	public void setTamaño(String tamaño) {
		this.tamaño = tamaño;
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
		return "Gorras [color=" + color + ", formas=" + formas + ", tamaño=" + tamaño + ", marca=" + marca + ", sexo="
				+ sexo + "]";
	}
	
	
	

}
