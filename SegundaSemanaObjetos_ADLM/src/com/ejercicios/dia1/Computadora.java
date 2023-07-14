package com.ejercicios.dia1;

public class Computadora {
	private String nombre, marca;
	private int discoDuro, ram;
	
	public Computadora() {
		super();
	}
	
	public Computadora(String nombre, String marca, int discoDuro, int ram) {
		super();
		this.nombre = nombre;
		this.marca = marca;
		this.discoDuro = discoDuro;
		this.ram = ram;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getDiscoDuro() {
		return discoDuro;
	}

	public void setDiscoDuro(int discoDuro) {
		this.discoDuro = discoDuro;
	}

	public int getRam() {
		return ram;
	}

	public void setRam(int ram) {
		this.ram = ram;
	}

	@Override
	public String toString() {
		return "Computadora [nombre=" + nombre + ", marca=" + marca + ", discoDuro=" + discoDuro + ", ram=" + ram + "]";
	}
	
	
}
