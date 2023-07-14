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
	
	// comportamientos o metodos propios
	// son acciones que puede realizar nuestro objeto
	
	// si queremos que el metodo retoene un valor especifico
	// debemos declararlo con el tipo de dato a retornar
	
	public String pensar() {
		String pensamiento ="Estoy pensando ...";
		
		return pensamiento;
		
	}
	
	// para evitae que mis metodos me pudan un retorno
	// pero si ejecutan algo
	// le pongo modificar void
	
	public void caminar() {
		System.out.println("estoy caminando ...");
	}
	
	//vamos a crear un numero polimorfico
	// el metodo conserva el mismo nombre pero se diferncia
	// por solicitar diferentes argumentos
	//(sobrecaarga de argumentos)
	public void caminar(String kilometros) {
		System.out.println("Estoy caminando "+kilometros);
	}
	

	public void caminar(String kilometros, int numerosKm) {
		System.out.println("Estoy caminando "+numerosKm+" "+kilometros);
	}
	
	// las clases abstractas sirven para proteger la plantilla del objeto
	// y unicamente poder hacer herencia de la misma
	//una clase abstracta es aquella que tiene por lo menos
	//un metodo abstracto
	// un metodo asbtracto es aquel que define el que pero no el como
	
	public abstract void comer();
	
}
