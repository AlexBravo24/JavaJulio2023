package com;

public class Pan {
	
	private String nombre;
	private String tipo;
	private String tamano;
	
	public Pan () {
		
	}
	public Pan(String nombre, String tipo, String tamano) {
		super();
		this.nombre = nombre;
		this.tipo = tipo;
		this.tamano = tamano;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getTamano() {
		return tamano;
	}
	public void setTamano(String tamano) {
		this.tamano = tamano;
	}
	
	@Override
	public String toString() {
		return "Pan [nombre=" + nombre + ", tipo=" + tipo + ", tamano=" + tamano + "]";
	}
	
	
	
	


}
