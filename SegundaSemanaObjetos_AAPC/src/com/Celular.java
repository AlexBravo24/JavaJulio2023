package com;

public class Celular {
private String marca;
private String modelo;
private int a�o;
private String memoria;


public Celular () {
	
}


public Celular(String marca, String modelo, int a�o, String memoria) {
	super();
	this.marca = marca;
	this.modelo = modelo;
	this.a�o = a�o;
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


public int getA�o() {
	return a�o;
}


public void setA�o(int a�o) {
	this.a�o = a�o;
}


public String getMemoria() {
	return memoria;
}


public void setMemoria(String memoria) {
	this.memoria = memoria;
}


@Override
public String toString() {
	return "Celular [marca=" + marca + ", modelo=" + modelo + ", a�o=" + a�o + ", memoria=" + memoria + "]";
}


}







