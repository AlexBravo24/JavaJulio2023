package com;

public class Ciudades {

	private String nombre;
	private String pais;
	private int numHabitantes;
	
	public Ciudades() {
		
	}
	
	
	public Ciudades(String nombre, String pais, int numHabitantes) {
		super();
		this.nombre = nombre;
		this.pais = pais;
		this.numHabitantes = numHabitantes;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getPais() {
		return pais;
	}
	public void setPais(String pais) {
		this.pais = pais;
	}
	public int getNumHabitantes() {
		return numHabitantes;
	}
	public void setNumHabitantes(int numHabitantes) {
		this.numHabitantes = numHabitantes;
	}
	@Override
	public String toString() {
		return "Ciudades [nombre = " + nombre + ", pais = " + pais + ", numHabitantes = " + numHabitantes + "]";
	}
	
	
	
	
	
	
	
} // Cierre Class
