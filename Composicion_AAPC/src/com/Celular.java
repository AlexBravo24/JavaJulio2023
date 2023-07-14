package com;

public class Celular {
private String marca;
private String color;
private String modelo;
private Memoria interna;
private Ram memoriaram;
private Camara pixelescam;


public Celular () {
	}


public Celular(String marca, String color, String modelo, Memoria interna, Ram memoriaram, Camara pixelescam) {
	super();
	this.marca = marca;
	this.color = color;
	this.modelo = modelo;
	this.interna = interna;
	this.memoriaram = memoriaram;
	this.pixelescam = pixelescam;
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


public String getModelo() {
	return modelo;
}


public void setModelo(String modelo) {
	this.modelo = modelo;
}


public Memoria getInterna() {
	return interna;
}


public void setInterna(Memoria interna) {
	this.interna = interna;
}


public Ram getMemoriaram() {
	return memoriaram;
}


public void setMemoriaram(Ram memoriaram) {
	this.memoriaram = memoriaram;
}


public Camara getPixelescam() {
	return pixelescam;
}


public void setPixelescam(Camara pixelescam) {
	this.pixelescam = pixelescam;
}


@Override
public String toString() {
	return "Celular [marca=" + marca + ", color=" + color + ", modelo=" + modelo + ", interna=" + interna
			+ ", memoriaram=" + memoriaram + ", pixelescam=" + pixelescam + "]";
}




}
