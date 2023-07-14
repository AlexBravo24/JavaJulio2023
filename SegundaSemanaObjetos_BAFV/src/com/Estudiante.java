package com;

public class Estudiante {
	
	private String nombre;
    private int edad;
    private int numeroEstudiante;
    private String especialidad;
    private double promedioAcademico;
	
	public Estudiante() {
		
	}

	public Estudiante(String nombre, int edad, int numeroEstudiante, String especialidad, double promedioAcademico) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.numeroEstudiante = numeroEstudiante;
		this.especialidad = especialidad;
		this.promedioAcademico = promedioAcademico;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public int getNumeroEstudiante() {
		return numeroEstudiante;
	}

	public void setNumeroEstudiante(int numeroEstudiante) {
		this.numeroEstudiante = numeroEstudiante;
	}

	public String getEspecialidad() {
		return especialidad;
	}

	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}

	public double getPromedioAcademico() {
		return promedioAcademico;
	}

	public void setPromedioAcademico(double promedioAcademico) {
		this.promedioAcademico = promedioAcademico;
	}

	@Override
	public String toString() {
		return "Estudiante [nombre=" + nombre + ", edad=" + edad + ", numeroEstudiante=" + numeroEstudiante
				+ ", especialidad=" + especialidad + ", promedioAcademico=" + promedioAcademico + "]";
	}
	
	
	
	

}
