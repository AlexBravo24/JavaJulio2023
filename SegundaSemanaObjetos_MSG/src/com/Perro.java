package com;

public class Perro {
	
	// El encapsulamiento es la proteccion de  informacion de mis datos o mi svariables. Se logra gracias a los modificadores
	//de acceso default, private, protected, public
	
	private String nombre;
	private String raza;
	private String color;
	private Double tamaño;
	private String Sexo;
	private int numeroPatas;
	private int edad;
	
	// 	METODOS CONSTRUCTORES
	
	//Constructor vacio
	// nos sirve para instanciar a nuestro objeto sin necesidad de asignarle un valor a sus atribustos inmediatamnete, es como un comodin
	
	public Perro() {
		
	}
	
	//Metodo cnstructor con todos los atributos o parametros
	// esto se hace dando clic derecho en espacion en blanco, Source --> Generate constructor using fields --> Seleccionas todos los atributos
	// y rectificas el nombre de la clase

	public Perro(String nombre, String raza, String color, Double tamaño, String sexo, int numeroPatas, int edad) {
		super();
		this.nombre = nombre;
		this.raza = raza;
		this.color = color;
		this.tamaño = tamaño;
		Sexo = sexo;
		this.numeroPatas = numeroPatas;
		this.edad = edad;
	}

	
	// Metodos getters y setters
	
		//Metodo GET devuelve el valor de un atributo
		// MEtodo SET establece un nuevo valor a un atributo
	// Manera correcta de asignarle un valor aun avariable de mi objeto asi como devolver el valor del mismo 
	
	
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

	public Double getTamaño() {
		return tamaño;
	}

	public void setTamaño(Double tamaño) {
		this.tamaño = tamaño;
	}

	public String getSexo() {
		return Sexo;
	}

	public void setSexo(String sexo) {
		Sexo = sexo;
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
	
	// Metodo toString nospermite visualizar todos los atributos de nustro objeeto convertidos a valores string para darnos un preview
	// una radiografia de nustro objeto

	@Override
	public String toString() {
		return "Perro [nombre = " + nombre + ", raza = " + raza + ", color = " + color + ", tamaño = " + tamaño + ", Sexo = "
				+ Sexo + ", numeroPatas = " + numeroPatas + ", edad = " + edad + "]";
	}
	
	
	
	
	
	
	
	
	

}
