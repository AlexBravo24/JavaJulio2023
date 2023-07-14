package com;

public class Basketbolista {
	
	public String nombre;
	public double estatura;
	public int numero;
	public String posicion;
	public boolean esTirador;
	
	public Basketbolista() {
		
	}

	public Basketbolista(String nombre, double estatura, int numero, String posicion, boolean esTirador) {
		super();
		this.nombre = nombre;
		this.estatura = estatura;
		this.numero = numero;
		this.posicion = posicion;
		this.esTirador = esTirador;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getEstatura() {
		return estatura;
	}

	public void setEstatura(double estatura) {
		this.estatura = estatura;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getPosicion() {
		return posicion;
	}

	public void setPosicion(String posicion) {
		this.posicion = posicion;
	}

	public boolean isEsTirador() {
		return esTirador;
	}

	public void setEsTirador(boolean esTirador) {
		this.esTirador = esTirador;
	}

	@Override
	public String toString() {
		return "Basketbolista [nombre=" + nombre + ", estatura=" + estatura + ", numero=" + numero + ", posicion="
				+ posicion + ", esTirador=" + esTirador + "]";
	}
	
	

}
