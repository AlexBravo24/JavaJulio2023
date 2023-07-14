package com;

public class Perro {
	
	// La clase nos a servir como plantilla de un objeto
	
	/*El objeto lo modelamos gracias a la "Abstraccion" por lo cual debe incluir atributos y comportamientos
	 * 
	 * El encapsulamiento es la proteccion de la informacion de mis datos o variables. Se logra gracias a los 
	 * modificadores de acceso default, private, protected, public
	 */
	private String nombre;
	private String raza;
	private String color;
	private double tamaño;
	private String sexo;
	private int numeroPatas;
	private int edad;
	
	
	// Metodos Constructores
	
	// Este constructor nos sirve para instanciar a nuestro objeto sin necesidad de asignarle valor a sus 
	// atributos inmediatamente
	// Es como un "comodin"
	// Me permite instanciarlo vacio momentaneamente y la capacidad de asignarle sus atributos posteriormente
	public Perro () {
	}
	
	// Metodo constructor con todos los atributos o paramateros

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
	
	// Metodos getters & setters
		// Metodo get devuelve el valor de un atributo
		// Metodo set establece un nuevo valor a un atributo
	
	// Manera correcta de asignarle un valor a una variable de mi objeto asi como devolver el valor del mismo
	

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
	
	// Metodo toString
	// Nos permite visualizar todos los atributos de nuestros objetos convertidos a valores String
	// para darnos un preview, una "radiografia" de nuestro objeto

	@Override
	public String toString() {
		return "Perro [nombre=" + nombre + ", raza=" + raza + ", color=" + color + ", tamaño=" + tamaño + ", sexo="
				+ sexo + ", numeroPatas=" + numeroPatas + ", edad=" + edad + "]";
	}
	

	
	
	

}
