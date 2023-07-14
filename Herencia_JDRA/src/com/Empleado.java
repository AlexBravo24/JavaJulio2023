package com;

// para realizar herencia de una clase y heredar sus atributos y comportamientos
// esta se realiza con la palabra reversada "extends" permitiendonos asi reutilizar codigo
// de una clase padre

// para implementar una interface se hace con la palabra implements

public class Empleado extends Persona implements IAvion{
	
	private int idEmpleado;
	private int nss;
	private double salario;
	private String puesto;
	
	public Empleado() {}
	
	//Generamos el constructor con todos los parametros y seleccionamos tambien el constructor de la clase padre
	// (Persona) para poder heredarlos y utilizarlos al instanciar a un nuevo empleado

	public Empleado(String nombre, String sexo, int edad, int idEmpleado, int nss, double salario, String puesto) {
		super(nombre, sexo, edad);
		this.idEmpleado = idEmpleado;
		this.nss = nss;
		this.salario = salario;
		this.puesto = puesto;
	}


	public int getIdEmpleado() {
		return idEmpleado;
	}

	public void setIdEmpleado(int idEmpleado) {
		this.idEmpleado = idEmpleado;
	}

	public int getNss() {
		return nss;
	}

	public void setNss(int nss) {
		this.nss = nss;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public String getPuesto() {
		return puesto;
	}

	public void setPuesto(String puesto) {
		this.puesto = puesto;
	}

	@Override
	public String toString() {
		return "Empleado [idEmpleado=" + idEmpleado + ", nss=" + nss + ", salario=" + salario + ", puesto=" + puesto
				+ ", toString()=" + super.toString() + "]";
	}

	@Override
	public void comer() {
		
		System.out.println("Estoy comiendo..");
		
	}

	@Override
	public void volar() {
		// TODO Auto-generated method stub
		System.out.println("Hola estoy volando..");
		
	}


}
