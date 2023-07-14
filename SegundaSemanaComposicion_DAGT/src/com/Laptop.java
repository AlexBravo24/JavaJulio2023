package com;

public class Laptop {

	private String marca;
	private String color;
	private Almacenamiento disco; //Estos atributos pueden tener sus propios atributos por lo que se pueden definir como objetos tambien
	private Procesador cpu; //Estos atributos pueden tener sus propios atributos por lo que se pueden definir como objetos tambien
	private Ram memoriaRam; //Estos atributos pueden tener sus propios atributos por lo que se pueden definir como objetos tambien
	

	public Laptop () {
		
	}


	public Laptop(String marca, String color, Almacenamiento disco, Procesador cpu, Ram memoriaRam) {
		super();
		this.marca = marca;
		this.color = color;
		this.disco = disco;
		this.cpu = cpu;
		this.memoriaRam = memoriaRam;
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


	public Ram getMemoriaRam() {
		return memoriaRam;
	}


	public void setMemoriaRam(Ram memoriaRam) {
		this.memoriaRam = memoriaRam;
	}


	@Override
	public String toString() {
		return "Laptop [marca=" + marca + ", color=" + color + ", disco=" + disco + ", cpu=" + cpu + ", memoriaRam="
				+ memoriaRam + "]";
	}

	

}
