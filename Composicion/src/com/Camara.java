package com;

public class Camara {
	
	private String marca;
	private double megapixeles;
	private double aperturafocal;
	
	public Camara () {
		
	}

	public Camara(String marca, double megapixeles, double aperturafocal) {
		super();
		this.marca = marca;
		this.megapixeles = megapixeles;
		this.aperturafocal = aperturafocal;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public double getMegapixeles() {
		return megapixeles;
	}

	public void setMegapixeles(double megapixeles) {
		this.megapixeles = megapixeles;
	}

	public double getAperturafocal() {
		return aperturafocal;
	}

	public void setAperturafocal(double aperturafocal) {
		this.aperturafocal = aperturafocal;
	}

	@Override
	public String toString() {
		return "Camara [marca=" + marca + ", megapixeles=" + megapixeles + ", aperturafocal=" + aperturafocal + "]";
	}
	
	

}
