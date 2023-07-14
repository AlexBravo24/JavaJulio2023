package com;

public class Perro {
//la clase nos va a servir como la plantilla de un objeto
	/* el objeto lo modelamos gracias a la "abstraccion"
	 * por lo cual debe incluir atributos y comportamientos
	 * 
Str	 */
	private String nombre;
	String raza;
	String color;
	double tamaño;
	String sexo;
	int numeroPatas;
	int edad;
	//metodos constructores
	
//constructor vacio, este constructor nos sirve para 
	//instanciar a nuestro objeto sin necedidad de asignarle un valor a sus
	//atributos inmediamtamento, es como un "comodin".
	//me permite instanciarlo vacio momentaneamente 
	//y la capacidad de asignarle sus atributos posteriormente
	public Perro(){
		}
	//metodo constructor con todos los atributos o parametros
	
	
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
	
	//metodos getters & setters
	// metodo get devuelve el valor de un atributo 
	// el metodo set establece un nuevo valor a un atributo
	//manera correcta de asignarle un valor a una varibale de mi objeto
	//asi como devolve el valor del mismo

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

	
	
	//nos permite visualizar todos los atributos de nuuestros objetos 
	//convertidos a valores string
	//para darnos un preview, una radiografia de nuestro objeto

	@Override
	public String toString() {
		return "Perro [nombre=" + nombre + ", raza=" + raza + ", color=" + color + ", tamaño=" + tamaño + ", sexo="
				+ sexo + ", numeroPatas=" + numeroPatas + ", edad=" + edad + "]";
	}

	

	
	
	
	
	
	
	
	
	
	
}
