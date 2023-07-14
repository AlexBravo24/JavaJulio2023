package com;

public class Pais {
	private String nombre;
	private String capital;
	private int numerohabit;
	
	
public Pais() {
	
}


public Pais(String nombre, String capital, int numerohabit) {
	super();
	this.nombre = nombre;
	this.capital = capital;
	this.numerohabit = numerohabit;
}


public String getNombre() {
	return nombre;
}


public void setNombre(String nombre) {
	this.nombre = nombre;
}


public String getCapital() {
	return capital;
}


public void setCapital(String capital) {
	this.capital = capital;
}


public int getNumerohabit() {
	return numerohabit;
}


public void setNumerohabit(int numerohabit) {
	this.numerohabit = numerohabit;
}


@Override
public String toString() {
	return "Pais [nombre=" + nombre + ", capital=" + capital + ", numerohabit=" + numerohabit + "]";
}








}
