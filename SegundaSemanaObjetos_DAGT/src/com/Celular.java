package com;

public class Celular {
	
	//Declaracion de variables
	String marca;
	String modelo;
	int ram;
	int memoria;
	
	
	//constructor vacio
	public Celular(){		
	}
	
	
	//Constructor con parametros
	public Celular(String marca, String modelo, int ram, int memoria) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.ram = ram;
		this.memoria = memoria;
	}

	//Get and Set para variable marca
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}

	//Get and Set para variable modelo
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	//Get and Set para variable ram
	public int getRam() {
		return ram;
	}
	public void setRam(int ram) {
		this.ram = ram;
	}

	//Get and Set para variable memoria
	public int getMemoria() {
		return memoria;
	}
	public void setMemoria(int memoria) {
		this.memoria = memoria;
	}


	@Override
	public String toString() {
		return "Celular [marca=" + marca + ", modelo=" + modelo + ", ram=" + ram + ", memoria=" + memoria + "]";
	}

	
	


}
