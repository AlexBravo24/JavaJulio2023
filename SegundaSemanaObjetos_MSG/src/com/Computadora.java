package com;

public class Computadora {

	private String marca;
	private String modelo;
	private String sistema;
	private int memoria;
	private int almacenamiento;
	private String color;
	
	public Computadora() {
		
	}
	
	public Computadora(String marca, String modelo, String sistema, int memoria, int almacenamiento, String color) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.sistema = sistema;
		this.memoria = memoria;
		this.almacenamiento = almacenamiento;
		this.color = color;
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


	public String getSistema() {
		return sistema;
	}


	public void setSistema(String sistema) {
		this.sistema = sistema;
	}


	public int getMemoria() {
		return memoria;
	}


	public void setMemoria(int memoria) {
		this.memoria = memoria;
	}


	public int getAlmacenamiento() {
		return almacenamiento;
	}


	public void setAlmacenamiento(int almacenamiento) {
		this.almacenamiento = almacenamiento;
	}


	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}


	@Override
	public String toString() {
		return "Computadora [marca = " + marca + ", modelo = " + modelo + ", sistema = " + sistema + ", memoria = " + memoria
				+ ", almacenamiento = " + almacenamiento + ", color =  " + color + "]";
	}
	
	
	
	
	
	
	
	
	
	
} // Cierre class
