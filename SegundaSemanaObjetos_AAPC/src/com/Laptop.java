package com;

public class Laptop {
private String marca;
private String modelo;
private int memoria_ram;




public Laptop () {
	
}




public Laptop(String marca, String modelo, int memoria_ram) {
	super();
	this.marca = marca;
	this.modelo = modelo;
	this.memoria_ram = memoria_ram;
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




public int getMemoria_ram() {
	return memoria_ram;
}




public void setMemoria_ram(int memoria_ram) {
	this.memoria_ram = memoria_ram;
}




@Override
public String toString() {
	return "Laptop [marca=" + marca + ", modelo=" + modelo + ", memoria_ram=" + memoria_ram + "]";
}






}
