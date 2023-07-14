package com;

public class Rimen {
	
	private String grosor;
	private String color;
	private String material;
	
	public Rimen () {
		
	}

	public Rimen(String grosor, String color, String material) {
		super();
		this.grosor = grosor;
		this.color = color;
		this.material = material;
	}

	public String getGrosor() {
		return grosor;
	}

	public void setGrosor(String grosor) {
		this.grosor = grosor;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	@Override
	public String toString() {
		return "Rimen [grosor=" + grosor + ", color=" + color + ", material=" + material + "]";
	}
	
	

}
