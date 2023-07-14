package com;

public class Bicicleta {

	private String marca;
	private double rodada;
	private String tipo;
	private String color;
	
	public Bicicleta () {
	}

	public Bicicleta(String marca, double rodada, String tipo, String color) {
		super();
		this.marca = marca;
		this.rodada = rodada;
		this.tipo = tipo;
		this.color = color;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public double getRodada() {
		return rodada;
	}

	public void setRodada(double rodada) {
		this.rodada = rodada;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Bicicleta [marca=" + marca + ", rodada=" + rodada + ", tipo=" + tipo + ", color=" + color + "]";
	}

	
	
	
	
}