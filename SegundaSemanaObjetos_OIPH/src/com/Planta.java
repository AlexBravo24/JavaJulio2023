package com;

public class Planta {

	private String especie;
	private double altura;
	private String color;
	private boolean flores;
	
	public Planta() {
		
	}

	public Planta(String especie, Double altura, String color, Boolean flores) {
		super();
		this.especie = especie;
		this.altura = altura;
		this.color = color;
		this.flores = flores;
	}

	public String getEspecie() {
		return especie;
	}

	public void setEspecie(String especie) {
		this.especie = especie;
	}

	public Double getAltura() {
		return altura;
	}

	public void setAltura(Double altura) {
		this.altura = altura;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Boolean getFlores() {
		return flores;
	}

	public void setFlores(Boolean flores) {
		this.flores = flores;
	}

	@Override
	public String toString() {
		return "Planta [especie=" + especie + ", altura=" + altura + ", color=" + color + ", flores=" + flores + "]";
	}
	
	
	
	
	
}
