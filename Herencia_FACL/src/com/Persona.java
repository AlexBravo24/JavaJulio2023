package com;

public abstract class Persona {
	
	private String nombre;
	private String sexo;
	private int edad;
	private String curp;
	
	
	
	public Persona() {
		
	}


	


	public Persona(String nombre, String sexo, int edad, String curp) {
		super();
		this.nombre = nombre;
		this.sexo = sexo;
		this.edad = edad;
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


	//Comportamientos o metodos propios que puede realizar 
	//El objeto
	
	//Si queremos que el metodo retorne un valor especifico
	//Se debe declarar con el tipo de dato a retornar
	
	public String pensar() {
		String pensamiento="Estoy pensando";
		
		
		return pensamiento;
		
	}
	
	//Para evitar que mis metodos me pidan un retorno 
	//Pero si ejecuten algo,se debe poner el modificador
	//void
	
	public void caminar () {
		System.out.println("Estoy caminando...");
	}
	
	//Vamos a crear un método polimorfico
	//conserva el mismo nombre, pero la diferencia es que pide más argumentos
	//Sobre carga de argumentos
	
	public void caminar(String kilometros) {
		
		System.out.println("estoy caminando "+kilometros);
	
	}

	public void caminar (String kilometros, int numeroKm ) {
		System.out.println("Estoy caminando "+numeroKm+" "+kilometros);
	}
	
	//Las clases abstractas sirven para proteger la plantilla del objeto
	//y únicamente poder hacer herencia de la misma
	//Una clase abstracta es aquella que tiene por lo menos 
	//un método
	//Un metodo abstracto es aquel que define el QUé pero no el CÓMO
	
	
	//Declaramos un método abstracto, para hacerlo en lugar
	//de que el método lleve un cuerpo ({}), se termina con un ;
	
	public abstract void comer ();
	
	
	

}
