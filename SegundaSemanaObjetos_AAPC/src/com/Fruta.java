package com;

public class Fruta {
	private String nombre;
	private String tipo;
	private double peso;
public Fruta() {

}


public Fruta(String nombre, String tipo, double peso) {
	super();
	this.nombre = nombre;
	this.tipo = tipo;
	this.peso = peso;
}


public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public String getTipo() {
	return tipo;
}
public void setTipo(String tipo) {
	this.tipo = tipo;
}
public double getPeso() {
	return peso;
}
public void setPeso(double peso) {
	this.peso = peso;
}
@Override
public String toString() {
	return "Fruta [nombre=" + nombre + ", tipo=" + tipo + ", peso=" + peso + "]";
}






}
