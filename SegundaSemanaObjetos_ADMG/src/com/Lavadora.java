package com;

public class Lavadora {
	
	private String marca;
	private String funcionamiento;
	private double capacidadkg;
	
	public Lavadora () {
	}

	public Lavadora(String marca, String funcionamiento, double capacidadkg) {
		super();
		this.marca = marca;
		this.funcionamiento = funcionamiento;
		this.capacidadkg = capacidadkg;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getFuncionamiento() {
		return funcionamiento;
	}

	public void setFuncionamiento(String funcionamiento) {
		this.funcionamiento = funcionamiento;
	}

	public double getCapacidadkg() {
		return capacidadkg;
	}

	public void setCapacidadkg(double capacidadkg) {
		this.capacidadkg = capacidadkg;
	}

	@Override
	public String toString() {
		return "Lavadora [marca=" + marca + ", funcionamiento=" + funcionamiento + ", capacidadkg=" + capacidadkg + "]";
	}
	
	

	
	
}
