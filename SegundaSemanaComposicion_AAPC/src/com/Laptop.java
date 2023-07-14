package com;

public class Laptop {//es un obejto que puede tener de atributos a otros objetos
	private String marca;
	private String color;
	
	private Almacenamiento disco;//este es un objeto en la realidad con atribitos 
	//propios
	private Procesador cpu;
	private Ram memoriaram;
	
public Laptop () {
	}

public Laptop(String marca, String color, Almacenamiento disco, Procesador cpu, Ram memoriaram) {
	super();
	this.marca = marca;
	this.color = color;
	this.disco = disco;
	this.cpu = cpu;
	this.memoriaram = memoriaram;
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

public Almacenamiento getDisco() {
	return disco;
}

public void setDisco(Almacenamiento disco) {
	this.disco = disco;
}

public Procesador getCpu() {
	return cpu;
}

public void setCpu(Procesador cpu) {
	this.cpu = cpu;
}

public Ram getMemoriaram() {
	return memoriaram;
}

public void setMemoriaram(Ram memoriaram) {
	this.memoriaram = memoriaram;
}

@Override
public String toString() {
	return "Laptop [\nmarca=" + marca + ", \ncolor=" + color + ", \ndisco=" + disco + ", \ncpu=" + cpu + ", \nmemoriaram="
			+ memoriaram + "]";
}
	













	
	
	
}
