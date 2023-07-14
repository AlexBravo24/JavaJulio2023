package com.ejercicios.dia1;

public class Celular {
	private String modelo, procesador;
	private double memoriaInt;
	private int ram;

	public Celular() {
		
	}

	public Celular(String modelo, String procesador, double memoriaInt, int ram) {
		this.modelo = modelo;
		this.procesador = procesador;
		this.memoriaInt = memoriaInt;
		this.ram = ram;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getProcesador() {
		return procesador;
	}

	public void setProcesador(String procesador) {
		this.procesador = procesador;
	}

	public double getMemoriaInt() {
		return memoriaInt;
	}

	public void setMemoriaInt(double memoriaInt) {
		this.memoriaInt = memoriaInt;
	}

	public int getRam() {
		return ram;
	}

	public void setRam(int ram) {
		this.ram = ram;
	}

	@Override
	public String toString() {
		return "Celular [modelo=" + modelo + ", procesador=" + procesador + ", memoriaInt=" + memoriaInt + ", ram="
				+ ram + "]";
	}
	
	
	
	
}
