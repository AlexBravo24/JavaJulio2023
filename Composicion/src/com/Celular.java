package com;

public class Celular {
	
	private String marca;
	private String color;
	
	private Procesador cpu;
	private RAM ram;
	private Camara camara;
	private Bateria bateria;
	
	public Celular () {
		
	}

	public Celular(String marca, String color, Procesador cpu, RAM ram, Camara camara, Bateria bateria) {
		super();
		this.marca = marca;
		this.color = color;
		this.cpu = cpu;
		this.ram = ram;
		this.camara = camara;
		this.bateria = bateria;
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

	public Camara getCamara() {
		return camara;
	}

	public void setCamara(Camara camara) {
		this.camara = camara;
	}

	public Bateria getBateria() {
		return bateria;
	}

	public void setBateria(Bateria bateria) {
		this.bateria = bateria;
	}

	@Override
	public String toString() {
		return "Celular [\nmarca=" + marca + ", \ncolor=" + color + ", \ncpu=" + cpu + ", \nram=" + ram + ", \ncamara=" + camara
				+ ", \nbateria=" + bateria + "]";
	}
	
	

}
