package com;

public class Llanta {
	
	private String marca;
	private int rin;
	private String medida;
	
	public Llanta () {}

	public Llanta(String marca, int rin, String medida) {
		super();
		this.marca = marca;
		this.rin = rin;
		this.medida = medida;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getRin() {
		return rin;
	}

	public void setRin(int rin) {
		this.rin = rin;
	}

	public String getMedida() {
		return medida;
	}

	public void setMedida(String medida) {
		this.medida = medida;
	}

	@Override
	public String toString() {
		return "Llanta [marca=" + marca + ", rin=" + rin + ", medida=" + medida + "]";
	}
	
	

}
