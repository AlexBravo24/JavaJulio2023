package com;

public class Casa {

	/*Declaración de los atributos de las casas
	 * los valores booleanos indicaran si la casa cuenta con patio y cochera
	 */
	private int numBanos;
	private int numHabitaciones;
	private String tipo;
	private String color;
	private String zona;
	private Boolean patio;
	private Boolean cochera;
	
	
	//Constructor vacio
	public Casa () {
		
	}

	//Constructor con todos los argumentos
	public Casa(int numBanos, int numHabitaciones, String tipo, String color, String zona, Boolean patio,Boolean cochera) {
		super();
		this.numBanos = numBanos;
		this.numHabitaciones = numHabitaciones;
		this.tipo = tipo;
		this.color = color;
		this.zona = zona;
		this.patio = patio;
		this.cochera = cochera;
	}
	
	//Metodo para establecer numero de baños
	public void setNumBanos(int numBanos) {
		this.numBanos= numBanos;
	}
	public int getNumBanos() {
		return numBanos;
	}
	//Set y Get para variable numHabitaciones
	public int getNumHabitaciones() {
		return numHabitaciones;
	}
	public void setNumHabitaciones(int numHabitaciones) {
		this.numHabitaciones = numHabitaciones;
	}

	//Get y Set para variable tipo
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	//Get y Set para variable color
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}

	//Get y Set para variable zona
	public String getZona() {
		return zona;
	}
	public void setZona(String zona) {
		this.zona = zona;
	}

	//Get y set para variable patio
	public Boolean getPatio() {
		return patio;
	}
	public void setPatio(Boolean patio) {
		this.patio = patio;
	}

	//Get y Set para variable cochera
	public Boolean getCochera() {
		return cochera;
	}
	public void setCochera(Boolean cochera) {
		this.cochera = cochera;
	}

	@Override
	public String toString() {
		return "Casa [numBanos=" + numBanos + ", numHabitaciones=" + numHabitaciones + ", tipo=" + tipo + ", color="
				+ color + ", zona=" + zona + ", patio=" + patio + ", cochera=" + cochera + "]";
	}
	
	
	
	
	
}
