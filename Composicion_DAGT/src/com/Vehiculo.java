package com;

public class Vehiculo {

	
	private Tipo tipo;
	private Marca marca;
		
	
	public Vehiculo () {
		
	}



	public Vehiculo(Tipo tipo, Marca marca) {
		super();
		this.tipo = tipo;
		this.marca = marca;
	}



	public Tipo getTipo() {
		return tipo;
	}



	public void setTipo(Tipo tipo) {
		this.tipo = tipo;
	}



	public Marca getMarca() {
		return marca;
	}



	public void setMarca(Marca marca) {
		this.marca = marca;
	}



	@Override
	public String toString() {
		return "Vehiculo [tipo=" + tipo + ", marca=" + marca + "]";
	}
	
	
	
	
	
	
}
