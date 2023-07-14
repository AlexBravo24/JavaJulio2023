package com;

public class Perro {
	
	// la clase nos va a servir como la plantilla de un objeto
	
	/*
	 El objeto lo modelamos gracias a la asbtracci�n
	 por lo cual debe incluir atributos y comportamientos 
	 */
	
	/*El encapsulamiento es la protecci�n de la informaci�n de mis datos
	 * o de mis varibales. Se logra gracias a los modificadores de acceso
	 * default, private, protected, public
	 * */
	
	private String nombre;
	private String raza;
	private String color;
	private double tama�o;
	private String sexo;
	private int numeroPatas;
	private int edad;
	
	// M�todos contructores
	
	//constructor vacio
	//este contructor nos sirve para instanciar a nuestro objeto
	//sin necesidad de asignarle valor a sus atributos inmediatamente
	//Es un comodin
	//me permite instanciarlo vacio momentaneamente
	// y la capacidad de 
	
	public Perro () {
		
	}

	
	//M�todo contructor con todos los atributos
	//o parametros
	// 
	public Perro(String nombre, String raza, String color, double tama�o, String sexo, int numeroPatas, int edad) {
		super(); // 
		this.nombre = nombre;
		this.raza = raza;
		this.color = color;
		this.tama�o = tama�o;
		this.sexo = sexo;
		this.numeroPatas = numeroPatas;
		this.edad = edad;
	}

	
	//metodos getters y setters 
		// metodo get devuelve el valor del atributo
		//metodo set establece un nuevo valor a un atributo
		//manera correcta de asignarle un vlor a una varibale de mi objeto
		//asi como devolver el valor del mismo
	
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


	//M�todo toString nos permite visualizar todos los atributos de nuestros objetos
	// converidos en valores String
	// Para darnos un preview
	@Override
	public String toString() {
		return "Perro [nombre=" + nombre + ", raza=" + raza + ", color=" + color + ", tama�o=" + tama�o + ", sexo="
				+ sexo + ", numeroPatas=" + numeroPatas + ", edad=" + edad + "]";
	}
	
	
	
}
