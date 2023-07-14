package com;

public class Canicas {
	
	private String color;
	private String patron;
	private String texturas;
	private String tamaño;
	private int linea;
	
	
	//CONSTRUCTOR VACIO
	
	
public Canicas () {
		
	}


public Canicas(String color, String patron, String texturas, String tamaño, int linea) {
	super();
	this.color = color;
	this.patron = patron;
	this.texturas = texturas;
	this.tamaño = tamaño;
	this.linea = linea;
}

//METODOS GETERS Y SETERS

public String getColor() {
	return color;
}


public void setColor(String color) {
	this.color = color;
}


public String getPatron() {
	return patron;
}


public void setPatron(String patron) {
	this.patron = patron;
}


public String getTexturas() {
	return texturas;
}


public void setTexturas(String texturas) {
	this.texturas = texturas;
}


public String getTamaño() {
	return tamaño;
}


public void setTamaño(String tamaño) {
	this.tamaño = tamaño;
}


public int getLinea() {
	return linea;
}


public void setLinea(int linea) {
	this.linea = linea;
}

//METODO toString 

@Override
public String toString() {
	return "Canicas [color=" + color + ", patron=" + patron + ", texturas=" + texturas + ", tamaño=" + tamaño
			+ ", linea=" + linea + "]";
}





}
