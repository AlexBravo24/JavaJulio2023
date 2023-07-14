package com;

public class Perro {
	
	//La clase nos va a servir como plantilla de un objeto
	
	//El Objeto lo modelamos gracias a la "Abstraccion"
	//por lo cual debe incluir atributos y comportamiento
	
	//El encapsulamiento es la proteccion de la informacion de mis datos 
	// o mis variables. Se logra gracias a las modificaciones de acceso
	//default, private, protectet, public
	
	private String nombre;
	private String raza;
	private String color;
	private double tamano;
	private String sexo;
	private int numeroPatas;
	private int edad;
	
	// Metodos constructores
	
	//Contructor vacio
	//Este constructor nos sirve para
	//instanciar a nuestro objeto sin necesidad
	//de asignarle valor a sus atributos inmediatamente
	//Es como "comodin"
	//Me permite instanciarlo vacio momentaneamente y la capacidad 
	//de asignarle sus atributos posteriores
	
	public Perro () {
	}

	public Perro(String nombre, String raza, String color, double tamano, String sexo, int numeroPatas, int edad) {
		super();
		this.nombre = nombre;
		this.raza = raza;
		this.color = color;
		this.tamano = tamano;
		this.sexo = sexo;
		this.numeroPatas = numeroPatas;
		this.edad = edad;
	}
	// Metodos getters y setters
	// Metodo get devuelve el valor a un atributo
	// Metodo set establece un nuevo valor a un atributo
	// Manera correcta de asignarle una variable de mi objeto
	// asi como devolver el valor del mismo
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

	public double getTamano() {
		return tamano;
	}

	public void setTamano(double tamano) {
		this.tamano = tamano;
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
		return "Perro [nombre=" + nombre + ", raza=" + raza + ", color=" + color + ", tamano=" + tamano + ", sexo="
				+ sexo + ", numeroPatas=" + numeroPatas + ", edad=" + edad + "]";
	}

// Metodos getters y setters
// Metodo get devuelve el valor a un atributo
// Metodo set establece un nuevo valor a un atributo
// Manera correcta de asignarle una variable de mi objeto
// asi como devolver el valor del mismo
	
	

	
	
	
	//Metodo constructor con todos los atributos o parametros
	
	
	
	

}
