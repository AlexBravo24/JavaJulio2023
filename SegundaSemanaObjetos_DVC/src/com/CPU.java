package com;

public class CPU {
	
	private String marca;
	private int nucleos;
	private String modelo;
	
	public CPU() {
		
	}

	public CPU(String marca, int nucleos, String modelo) {
		super();
		this.marca = marca;
		this.nucleos = nucleos;
		this.modelo = modelo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getNucleos() {
		return nucleos;
	}

	public void setNucleos(int nucleos) {
		this.nucleos = nucleos;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	@Override
	public String toString() {
		return "CPU [marca=" + marca + ", nucleos=" + nucleos + ", modelo=" + modelo + "]";
	}
	
	

}
