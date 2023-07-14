package com;

public class Perro {
	/*La clase nnos va a servir como plantilla de un objeto 
	 * 
	 * 
	 * El objeto lo modelamos gracias a la "abstraccion 
	 * por lo cual debe incluir atibutos y comportamientos "
	 * 
	 */
	
	private String nombre;
	private String raza;
	private String color;
	private double tamaño;
	private String sexo;
	private int numerodepatas;
	private int edad;
	
	//METODOS CONSTRUCTORES
	
	/*Constructor vacio 
	 * Este constructor nos sirve para instanciar a nuestro objeto sin necesidad de asignarle 
	 * valor 
	 * 
	 */
	
	public Perro () {
		
	}
	
	//EL ENCAPSULAMIENTOES LAPROTECCION DE LA INFORMACION DE MIS DATOS
	//O VARIALES. SE LOGRA GRACIAS A LOS NODIFICADORES DE ACCESO 
	// default , private, protected, public

	public Perro(String nombre, String raza, String color, double tamaño, String sexo, int numerodepatas, int edad) {
		super();
		this.nombre = nombre;
		this.raza = raza;
		this.color = color;
		this.tamaño = tamaño;
		this.sexo = sexo;
		this.numerodepatas = numerodepatas;
		this.edad = edad;
	}
	
	// metodo getters y setters 
		/*
		 * Metodo get devuelve el valor de un atributo 
		 * 
		 */

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getTamaño() {
		return tamaño;
	}

	public void setTamaño(double tamaño) {
		this.tamaño = tamaño;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public int getNumerodepatas() {
		return numerodepatas;
	}

	public void setNumerodepatas(int numerodepatas) {
		this.numerodepatas = numerodepatas;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	//METODO toString 
		/*Nos permite visualizar todos los atributos de nuestros objetos 
		 * 
		 */

	@Override
	public String toString() {
		return "Perro [nombre=" + nombre + ", raza=" + raza + ", color=" + color + ", tamaño=" + tamaño + ", sexo="
				+ sexo + ", numerodepatas=" + numerodepatas + ", edad=" + edad + "]";
	}
	
	
	
	
	
	
	
	
	

}
