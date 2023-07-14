package com;

public class Perro {
	
	//La clase sirve como plantilla de un objeto
	/*
	 * El objeto se modela gracias a la "Abstracci�n"
	 * Por lo que debe incluir atributos y comportamientos
	 * 
	 */
	
		//El encapsulamiento es la proteccion de mis variables
		//se logra gracias a los modificadores de acceso
		// default,private,protected,public.
	
	
	private String nombre; //Declaraci�n de atributos.
	private String raza;
	private String color;
	private double tama�o;
	private String sexo;
	private int numeroPatas;
	private int edad;
	
	//Metodos constructores
	//Constructor vac�o
	//Este constructor sirve para instanciar el objeto sin necesidad
	//de asignarle valor a sus atributos inmediatamente
	
	public Perro () {
		
	}
	
	//M�todo constructor con todos los parametros y atributos

	public Perro(String nombre, String raza, String color, double tama�o, String sexo, int numeroPatas, int edad) {
		super();
		this.nombre = nombre;
		this.raza = raza;
		this.color = color;
		this.tama�o = tama�o;
		this.sexo = sexo;
		this.numeroPatas = numeroPatas;
		this.edad = edad;
	}
	
	//M�todos getter y setters
	//Get devuelve el valor de un atributo
	//Set establece un nuevo valor a un atributo
	
	//Manera correcta de asignarle el valor a un objeto
	//as� como devolver el valor del mismo
	

	//Metodo to string
	//Nos permite obtener una radiograf�a del objeto
	//:O
	
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

	public double getTama�o() {
		return tama�o;
	}

	public void setTama�o(double tama�o) {
		this.tama�o = tama�o;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public int getNumeroPatas() {
		return numeroPatas;
	}

	public void setNumeroPatas(int numeroPatas) {
		this.numeroPatas = numeroPatas;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	@Override
	public String toString() {
		return "Perro [nombre=" + nombre + ", raza=" + raza + ", color=" + color + ", tama�o=" + tama�o + ", sexo="
				+ sexo + ", numeroPatas=" + numeroPatas + ", edad=" + edad + "]";
	}
	

	
	
	
	
	

}
