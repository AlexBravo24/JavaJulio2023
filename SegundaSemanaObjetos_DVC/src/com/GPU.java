package com;

public class GPU {

	private String modelo;
	private int ram;
	private String marca;
	
	public GPU () {
		
	}

	public GPU(String modelo, int ram, String marca) {
		super();
		this.modelo = modelo;
		this.ram = ram;
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getRam() {
		return ram;
	}

	public void setRam(int ram) {
		this.ram = ram;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	@Override
	public String toString() {
		return "GPU [modelo=" + modelo + ", ram=" + ram + ", marca=" + marca + "]";
	}
	
	
	
}
