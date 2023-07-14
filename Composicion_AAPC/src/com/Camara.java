package com;

public class Camara {
private String marca;
private double megapixeles;
private double numcamaras;

public Camara () {
	
}

public Camara(String marca, double megapixeles, double numcamaras) {
	super();
	this.marca = marca;
	this.megapixeles = megapixeles;
	this.numcamaras = numcamaras;
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

public double getNumcamaras() {
	return numcamaras;
}

public void setNumcamaras(double numcamaras) {
	this.numcamaras = numcamaras;
}

@Override
public String toString() {
	return "Camara [marca=" + marca + ", megapixeles=" + megapixeles + ", numcamaras=" + numcamaras + "]";
}

}
