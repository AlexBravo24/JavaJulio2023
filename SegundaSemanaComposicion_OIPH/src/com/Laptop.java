package com;

public class Laptop {//Es un objeto, que puede tener de atributos
	// a otros objetos
	
	private String marca;
	private String color;
	
	private Almacenamiento disco; // Este es un objeto con atributos propios
	private Procesador cpu;
	private Ram memoriaRam;
	
	
	public Laptop(String marca, String color, Almacenamiento disco, Procesador cpu, Ram memoriaRam) {
		super();
		this.marca = marca;
		this.color = color;
		this.disco = disco;
		this.cpu = cpu;
		this.memoriaRam = memoriaRam;
	}
	
	//getters & setters
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
	
	//toString
	@Override
	public String toString() {
		return "Laptop [marca=" + marca + ", color=" + color + ", disco=" + disco + ", cpu=" + cpu + ", memoriaRam="
				+ memoriaRam + "]";
	}
	
	
}
