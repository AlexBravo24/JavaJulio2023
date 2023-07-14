package com;

public abstract class Persona {
	
	private String nombre;
	private String sexo;
	private int edad;
	
	public Persona() {}

	public Persona(String nombre, String sexo, int edad) {
		super();
		this.nombre = nombre;
		this.sexo = sexo;
		this.edad = edad;
	}
	
	public Persona(String nombre, int edad) {
		super();
		this.nombre= nombre;
		this.edad= edad;
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

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", sexo=" + sexo + ", edad=" + edad + "]";
	}
	
	
	
	//Comportamientos o metodos propios
	// Acciones que puede realizar nuestro objeto
	
	// si queremos que el metodo retorne un valor especifico debemos declararlo con el tipo de dato a retornar
	
	public String pensar() {
		String pensamiento = "Estoy pensando..";
		
		return pensamiento;
	}
	
	
	// para evitar que mis metodos me pidan un retorno
	// pero si ejecuten algo
	// le pongo el modificador void
	
	public void caminar() {
		
		System.out.println("Estoy caminando..");
	}
	
	
	
	// Crear un metodo poliformico
	// el metodo conserva el mismo nombre pero se diferencia por solicitar diferentes argumentos
	// (Sobrecarga de argumentos)
	
	public void caminar(String kilometros) {
		
		System.out.println("Estoy caminando " + kilometros);
	}
	
	public void caminar(String kilometros, int numerokm) {
		
		System.out.println("Estoy caminando " + numerokm + kilometros);
		
	}
	
	
	// Las clases abstractas sirven para proteger la plantilla del objeto
	// y unicamente poder hacer herencia de la misma
	// una clase abstracta es aquella que tiene por lo menos un metodo abstracto
	
	// Un metodo abstracto es aquel que define el QUE, pero no el COMO
	
	// Declaramos un metodo abstracto, para hacerlo en lugar de que el metodo lleve un cuerpo ({ })
	// se termina con un ;
	
	public abstract void comer() ;
	

}
