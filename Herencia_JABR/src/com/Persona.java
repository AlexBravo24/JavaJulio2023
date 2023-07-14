package com;

public abstract class Persona {
	
	private String nombre;
	private String sexo;
	private int edad;
	private String curp;
	
	public Persona() {}

	public Persona(String nombre, String sexo, int edad) {
		super();
		this.nombre = nombre;
		this.sexo = sexo;
		this.edad = edad;
	}

	public Persona(String nombre, String sexo, int edad, String curp) {
		super();
		this.nombre = nombre;
		this.sexo = sexo;
		this.edad = edad;
		this.curp = curp;
	}

	public Persona(String nombre, String curp) {
		super();
		this.nombre = nombre;
		this.curp = curp;
	}

	public Persona(String nombre) {
		super();
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
	

	public String getCurp() {
		return curp;
	}

	public void setCurp(String curp) {
		this.curp = curp;
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", sexo=" + sexo + ", edad=" + edad + ", curp=" + curp + "]";
	}
	
	//Comportamientos o métodos propios
	//Acciones que puede realizar nuestro objeto
	
	//Si queremos que el método retorne un valor específico
	//Debemos declararlo con el tipo de dato a retornar
	
	public String pensar() {
		String pensamiento ="Estoy pensando...";
		
		return pensamiento;
	}
	
	//Para evitar que mis metodos me pidan un retorno
	//pero si ejecuten algo
	//le pongo el modificador void
	
	public void caminar() {
		System.out.println("Estoy caminando...");
	}
	
	//Vamos a crear un método polimorfico
	//El método conserva el mismo nombre
	//Pero se diferencia por solicitar diferentes argumentos
	//(Sobrecarga de argumentos)
	public void caminar(String kilometros) {
		System.out.println("Estoy caminando " + kilometros);
	}
	
	public void caminar(String kilometros, int numeroKm) {
		System.out.println("Estoy caminando " + numeroKm + kilometros);
	}
	
	//Las clases abstractas sirven para proteger la plantilla del objeto
	//y únicamente poder hacer herencia de la misma
	//Una clase abstracta es aquella que tiene por lo menos
	//un método abstracto
	//Un método abstracto es aquel que define el QUÉ, pero no el CÓMO
	
	//Declaramos un método abstracto, para hacerlo en lugar
	//de que el metodo lleve un cuerpo ({ }), se termina con un ;
	
	public abstract void comer();

}
