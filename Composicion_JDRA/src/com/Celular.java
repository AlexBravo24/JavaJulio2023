package com;

public class Celular {
	
	private String marca;
	private String modelo;
	
	private Pantalla pantalla;
	private Bateria bateria;
	private Camara camara;
	
	public Celular() {}

	public Celular(String marca, String modelo, Pantalla pantalla, Bateria bateria, Camara camara) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.pantalla = pantalla;
		this.bateria = bateria;
		this.camara = camara;
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

	public Pantalla getPantalla() {
		return pantalla;
	}

	public void setPantalla(Pantalla pantalla) {
		this.pantalla = pantalla;
	}

	public Bateria getBateria() {
		return bateria;
	}

	public void setBateria(Bateria bateria) {
		this.bateria = bateria;
	}

	public Camara getCamara() {
		return camara;
	}

	public void setCamara(Camara camara) {
		this.camara = camara;
	}

	@Override
	public String toString() {
		return "Celular [\nmarca=" + marca + ", \nmodelo=" + modelo + ", \npantalla=" + pantalla + ", \nbateria=" + bateria
				+ ", \ncamara=" + camara + "]";
	}

	

	
	

}
