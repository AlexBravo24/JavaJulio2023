package com;

public class Perro {
	
	//La clase nos va a servir como la plantilla de un objeto
	/*El objeto los modelamos gracias a la "Abstracción"
	 * por lo cual debe incluir atributos y comportamientos
	 */
	//El encapsulamiento es la protección de la información de mis datos
	//o mis variables. Se logra gracias a los modificadores de acceso
	//default, private, protected, public
	private String nombre;
	private String raza;
	private String color;
	private double tamaño;
	private String sexo;
	private int numeropatas;
	private int edad;
	
	//Métodos constructuros
	
	//Constructor vacio
	//Este constructos nos sirve para 
	//Instaciar a nuestro onjeto sin necesidad de asignarle valor a sus atributos
	//inmediatamente es como un "Comodin"
	
	//Me permite instanciarlo vacio momentaneamente
	//y la capacidad de asiganrle sus atributos posteriormente
	public Perro () {		
	}
	
	//Médtodo costructuos con todos los atributos o parametros
	
	//clic derecho + source + Generate Constructor using Fields
	public Perro(String nombre, String raza, String color, double tamaño, String sexo, int numeropatas, int edad) {
		super();
		this.nombre = nombre;
		this.raza = raza;
		this.color = color;
		this.tamaño = tamaño;
		this.sexo = sexo;
		this.numeropatas = numeropatas;
		this.edad = edad;
	}


	//Métodos getter & setters
	//Metodo get devuelve el valor d eun atributo
	//Metodo set establece un nuevo valor a un atributo
	//Manera correcta de asiganrle un valor a una varibale de mi objeto 
	//asi como devolver el valor del mismo
	
	//clic derecho + Source + genertae Getters & Setters
	
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

	public int getNumeropatas() {
		return numeropatas;
	}

	public void setNumeropatas(int numeropatas) {
		this.numeropatas = numeropatas;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	//M;etodo toString
	//Nos permite visualizar todos los atributos de nuestros objetos
	//convertidos a valores String
	//Para darnos un preview, una "radiografia" de nuestro objeto
	
	//clic derecho + source + GeneratetoString

	@Override
	public String toString() {
		return "Perro [nombre=" + nombre + ", raza=" + raza + ", color=" + color + ", tamaño=" + tamaño + ", sexo="
				+ sexo + ", numeropatas=" + numeropatas + ", edad=" + edad + "]";
	}
	



	

}
