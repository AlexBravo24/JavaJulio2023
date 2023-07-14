package com;

public class Laptop {
	
	// Es un objeto, que puede tener de atributos a otros objetos
	
	private String marca;
	private String color;
	
	private Almacenamiento dd; // este es un objeto en la realidad con atributos propios
	private Procesador procesador;
	private Ram memoriaRam;
	
	public Laptop() {
	}

	public Laptop(String marca, String color, Almacenamiento dd, Procesador procesador, Ram memoriaRam) {
		super();
		this.marca = marca;
		this.color = color;
		this.dd = dd;
		this.procesador = procesador;
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

	public Almacenamiento getDd() {
		return dd;
	}

	public void setDd(Almacenamiento dd) {
		this.dd = dd;
	}

	public Procesador getProcesador() {
		return procesador;
	}

	public void setProcesador(Procesador procesador) {
		this.procesador = procesador;
	}

	public Ram getMemoriaRam() {
		return memoriaRam;
	}

	public void setMemoriaRam(Ram memoriaRam) {
		this.memoriaRam = memoriaRam;
	}

	@Override
	public String toString() {
		return "Laptop [\nmarca=" + marca + ", \ncolor=" + color + ", \ndd=" + dd + ", \nprocesador=" + procesador
				+ ", \nmemoriaRam=" + memoriaRam + "]";
	}
	
	
	

}
