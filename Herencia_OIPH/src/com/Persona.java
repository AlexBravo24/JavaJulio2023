package com;

public class Persona {
	
	private String nombre;
	private String sexo;
	private int edad;
	private String curp;
	
	
	public Persona() {}

	

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


	// Comportamientos o métodos propios
	// Acciones que puede realizar nuestro objeto
	
	// Si queremos que el método retorne un valor específico
	// Debemos declararlo con el tipo de dato a retornar
	
	public String pensar() {
		String pensamiento = "Estoy pensando...";
		return pensamiento;
	}

	// Para evitar que mis métodos me pidan un retorno
	// pero si ejecuten algo, le pongo el modificador void
	
	public void caminar() {
		System.out.println("Estoy caminando...");
	}
	
	
	
}
