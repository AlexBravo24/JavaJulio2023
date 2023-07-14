package com;

public class Alumno {
	
	//Declaracion de los atributos del alumno
	private int edad;
	private String nombre;
	private String apellidoPaterno;
	private String apellidoMaterno;
	private String sexo;
	
	
	//Constructor vacio
	public Alumno() {
		
	}
	
	//Constructor con atributos establecidos
	public Alumno(int edad, String nombre, String apellidoPaterno, String apellidoMaterno, String sexo) {
		super();
		this.edad = edad;
		this.nombre = nombre;
		this.apellidoPaterno = apellidoPaterno;
		this.apellidoMaterno = apellidoMaterno;
		this.sexo = sexo;
	}
	
	
	//Get y Set para variable edad
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public int getEdad() {
		return edad;
	}
	
	//Get y Set para variable nombre
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getNombre () {
		return nombre;
	}
	
	//Get y Set para variable apellidoPaterno
	public void setApellidoPaterno(String apellidoPaterno) {
		this.apellidoPaterno = apellidoPaterno;
	}
	public String getApellidoPaterno() {
		return apellidoPaterno;
	}
	
	//Get y Set para variable apellidoMaterno
	public void setApellidoMaterno(String apellidoMaterno) {
		this.apellidoMaterno =  apellidoMaterno;
	}
	public String getApellidoMaterno() {
		return apellidoMaterno;
	}
	
	//Get y Set para variable sexo
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public String getSexo() {
		return sexo;
	}

	@Override
	public String toString() {
		return "Alumno [edad=" + edad + ", nombre=" + nombre + ", apellidoPaterno=" + apellidoPaterno
				+ ", apellidoMaterno=" + apellidoMaterno + ", sexo=" + sexo + "]";
	}

	
	
	
}
