package com;

public class Celular {
private String marca;
private String modelo;
private int año;
private String memoria;


public Celular () {
	
}


public Celular(String marca, String modelo, int año, String memoria) {
	super();
	this.marca = marca;
	this.modelo = modelo;
	this.año = año;
	this.memoria = memoria;
}


public String getMarca() {
	return marca;
}


public void setMarca(String marca) {
	this.marca = marca;
}


public String getModelo() {
	return modelo;
}


public void setModelo(String modelo) {
	this.modelo = modelo;
}


public int getAño() {
	return año;
}


public void setAño(int año) {
	this.año = año;
}


public String getMemoria() {
	return memoria;
}


public void setMemoria(String memoria) {
	this.memoria = memoria;
}


@Override
public String toString() {
	return "Celular [marca=" + marca + ", modelo=" + modelo + ", año=" + año + ", memoria=" + memoria + "]";
}


}







