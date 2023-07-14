package com;

public class Laptop {//Es un objeto , que puede tener
	//de atributos a otro objetos
	
	private String marca;
	private String color;
	private Almacenamiento disco;//Este es un objeto con atributos propios
	private Procesador cpu;
	private RAM ram;
	
	public Laptop () {
		
	}

	public Laptop(String marca, String color, Almacenamiento disco, Procesador cpu, RAM ram) {
		super();
		this.marca = marca;
		this.color = color;
		this.disco = disco;
		this.cpu = cpu;
		this.ram = ram;
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

	public RAM getRam() {
		return ram;
	}

	public void setRam(RAM ram) {
		this.ram = ram;
	}

	@Override
	public String toString() {
		return "Laptop [\nmarca=" + marca + ", \ncolor=" + color + ", \ndisco=" + disco + ", \ncpu=" + cpu + ", \nram=" + ram
				+ "]";
	}
	
	
	

}
