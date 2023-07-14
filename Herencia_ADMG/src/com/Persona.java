package com;

public abstract class Persona {
	
	private String nombre;
	private String sexo;
	private int edad;
	private String curp;
	
	public Persona () {}

	

	



	public Persona(String nombre, String curp) {
		super();
		this.nombre = nombre;
		this.curp = curp;
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
	
	
	//Comportamientos o metodos propios
	//Acciones que puede realizar nuestro objeto
	
	//si queremos que el metodo retorne un valor especifico
	//Debemos declararlo con el tipo de dato a retornar
	
	public String pensar() {
		String pensamiento = "Estoy pensando...";
		
		return pensamiento;
	}
	
	//Para evitar que mis metodos me pidan un retorno 
	//pero si ejecuten algo
	//le pongo el modificador void
	
	public void caminar() {
		System.out.println("Estoy caminando...");
	}
	
	//Vamos a crear un metodo polimorfico
	//El metodo conserva el mismo nombre
	//pero se diferencia por solicitar diferentes argumentos
	//(Sobrecarga de argumentos)
	public void caminar(String kilometros) {
		System.out.println("Estoy caminando" + kilometros);
	}
	
	public void caminar (String kilometros, int numeroKm) {
		System.out.println("Estoy caminando " + numeroKm + kilometros);
	}
	
	//Las clases abstractas sirven para proteger la plantilla del objeto
	//y unicamente poder hacer herencia de la misma
	//una clase abstracta es aquella que tiene por lo menos
	//un metodo abstracto
	//Un metodo abstracto es aquel que define el QUE, pero no el COMO
	
	//Declaramos un metodo abstracto, para hacerlo en lugar
	//de que el metodo lleve un cuerpo ({ }). se termina con un ;
	
	public abstract void comer ();



	
	
	

}
