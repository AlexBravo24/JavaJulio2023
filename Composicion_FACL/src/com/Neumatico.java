package com;

public class Neumatico {
	
	private String marca;
	private String color;
	private int rin;
	private String tipoDeUso;
	
	public Neumatico() {
		
	}

	public Neumatico(String marca, String color, int rin, String tipoDeUso) {
		super();
		this.marca = marca;
		this.color = color;
		this.rin = rin;
		this.tipoDeUso = tipoDeUso;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getRin() {
		return rin;
	}

	public void setRin(int rin) {
		this.rin = rin;
	}

	public String getTipoDeUso() {
		return tipoDeUso;
	}

	public void setTipoDeUso(String tipoDeUso) {
		this.tipoDeUso = tipoDeUso;
	}

	@Override
	public String toString() {
		return "Neumatico [marca=" + marca + ", color=" + color + ", rin=" + rin + ", tipoDeUso=" + tipoDeUso + "]";
	}
	
	
	

}
