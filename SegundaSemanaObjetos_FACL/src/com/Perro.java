package com;

public class Perro {
	
	//La clase sirve como plantilla de un objeto
	/*
	 * El objeto se modela gracias a la "Abstracción"
	 * Por lo que debe incluir atributos y comportamientos
	 * 
	 */
	
		//El encapsulamiento es la proteccion de mis variables
		//se logra gracias a los modificadores de acceso
		// default,private,protected,public.
	
	
	private String nombre; //Declaración de atributos.
	private String raza;
	private String color;
	private double tamaño;
	private String sexo;
	private int numeroPatas;
	private int edad;
	
	//Metodos constructores
	//Constructor vacío
	//Este constructor sirve para instanciar el objeto sin necesidad
	//de asignarle valor a sus atributos inmediatamente
	
	public Perro () {
		
	}
	
	//Método constructor con todos los parametros y atributos

	public Perro(String nombre, String raza, String color, double tamaño, String sexo, int numeroPatas, int edad) {
		super();
		this.nombre = nombre;
		this.raza = raza;
		this.color = color;
		this.tamaño = tamaño;
		this.sexo = sexo;
		this.numeroPatas = numeroPatas;
		this.edad = edad;
	}
	
	//Métodos getter y setters
	//Get devuelve el valor de un atributo
	//Set establece un nuevo valor a un atributo
	
	//Manera correcta de asignarle el valor a un objeto
	//así como devolver el valor del mismo
	

	//Metodo to string
	//Nos permite obtener una radiografía del objeto
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
		return "Perro [nombre=" + nombre + ", raza=" + raza + ", color=" + color + ", tamaño=" + tamaño + ", sexo="
				+ sexo + ", numeroPatas=" + numeroPatas + ", edad=" + edad + "]";
	}
	

	
	
	
	
	

}
