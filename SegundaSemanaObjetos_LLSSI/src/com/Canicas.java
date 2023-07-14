package com;

public class Canicas {
	
	private String color;
	private String patron;
	private String texturas;
	private String tama�o;
	private int linea;
	
	
	//CONSTRUCTOR VACIO
	
	
public Canicas () {
		
	}


public Canicas(String color, String patron, String texturas, String tama�o, int linea) {
	super();
	this.color = color;
	this.patron = patron;
	this.texturas = texturas;
	this.tama�o = tama�o;
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


public String getTama�o() {
	return tama�o;
}


public void setTama�o(String tama�o) {
	this.tama�o = tama�o;
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
	return "Canicas [color=" + color + ", patron=" + patron + ", texturas=" + texturas + ", tama�o=" + tama�o
			+ ", linea=" + linea + "]";
}





}
