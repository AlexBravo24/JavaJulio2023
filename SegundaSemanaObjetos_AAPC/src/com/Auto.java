package com;

public class Auto {
private String marca;
private String modelo;
private String tipo;
private String estado;
private int año;


public Auto () {
	
}


public Auto(String marca, String modelo, String tipo, String estado, int año) {
	super();
	this.marca = marca;
	this.modelo = modelo;
	this.tipo = tipo;
	this.estado = estado;
	this.año = año;
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


public String getTipo() {
	return tipo;
}


public void setTipo(String tipo) {
	this.tipo = tipo;
}


public String getEstado() {
	return estado;
}


public void setEstado(String estado) {
	this.estado = estado;
}


public int getAño() {
	return año;
}


public void setAño(int año) {
	this.año = año;
}


@Override
public String toString() {
	return "Auto [marca=" + marca + ", modelo=" + modelo + ", tipo=" + tipo + ", estado=" + estado + ", año=" + año
			+ "]";
}









}