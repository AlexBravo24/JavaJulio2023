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
		return "Persona [\nnombre = " + nombre + ", \nsexo = " + sexo + ", \nedad = " + edad + ", \ncurp = " + curp + "]";
	}
	
	
	// Comportamientos o metodos propios
	//Acciones que pueden realizar nuestro objeto
	// Debemos declararlo con el tipo de dato a retornar
	
	public String pensar () {
		String pensamiento = "Estoy pensando...";
		
		return pensamiento;
	}
	
	// para evitar que mis metodos me pidan un retorno pero si ejecutan algo le pongo un void
	
	public void caminar() {
		System.out.println("Estoy caminando...");
	}
	
	//vamos a crear un metodo polimorfico
	// el motodo conserva el mismo nombre pero se diferencia por solicitar diferentes argumentos
	//(Sobrecarga de argumentos)
	
	public void caminar (String kilometros) {
		System.out.println("Estoy caminando " + kilometros);
		
	
	}
	
	public void caminar (String kilometros, int numKm) {
		System.out.println("Estoy caminando " + numKm + kilometros);
	}
	
	
	// Las clases abstractas sirven para proteger la plantilla del objeto y unicamente poder hacer herencia de la misma
	// y una clases abstracta es aquella que tiene por lo menos un metodo abstracto

	// un metodo abstracto es aquel que define el QUE, pero no el COMO
	// Declamaramos un metodo abstracto, para ahcerlo en lugar de que el metodo lleve un cuerpo {}, se termina con un ;
	
	public abstract void comer();
	
}
