package com;

public class Perro {
	
	//La clase nos va a servir como la plantilla de un
	//objeto
	
	/*El objeto lo modelamos gracias a la "Abstracci�n"
	 * por lo cual debe incluir atributos y comportamientos
	 * 
	 */
	//El encapsulamiento es la protecci�n de la informaci�n de mis datos
	//o mis variables. Se logra gracias a los modificadores de acceso
	//default, private, protected, public
	private String nombre;
	private String raza;
	private String color;
	private double tama�o;
	private String sexo;
	private int numeroPatas;
	private int edad;
	
	//M�todos constructores
	
	//Constructor vac�o
	//Este constructor nos sirve para
	//instanciar a nuestro objeto sin necesidad
	//de asiganrle valor a sus atributos inmediatamente
	//Es como un "comodin"
	//Me permite instanciarlo vac�o momentaneamente 
	//y la capacidad de asignarle sus atributos posteriormente
	public Perro() {	
	}
	//M�todo constructor con todos los atributos
	//o par�metros
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
	
	//M�todos getters & setters
	//M�todo get devuelve el valor de un atributo
	//M�todo set establece un nuevo valor a un atributo
	//Manera correcta de asignarle un valor a una variable de mi objeto
	//as� como devolver el valor del mismo
	
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
	
	//M�todo toString
	//Nos permite visualizar todos los atributos de nuestros objetos
	//convertidos a valores String
	//Para darnos un preview, una "radiograf�a" de nuestro objeto
	
	@Override
	public String toString() {
		return "Perro [nombre=" + nombre + ", raza=" + raza + ", color=" + color + ", tama�o=" + tama�o + ", sexo="
				+ sexo + ", numeroPatas=" + numeroPatas + ", edad=" + edad + "]";
	}
	
	
	
	

}
