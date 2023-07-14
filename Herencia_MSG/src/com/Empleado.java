package com;
	//Para realizar herencia de una clase y heredar sus atributos y comportamientos esta se realiza
// con la palabra reservada "extends" permitiendonos asi reutilizar codigo de una clase padre

// Para implementar una interface se hace con la palabra reservada implements

public class Empleado extends Persona implements IAvion {

	private int idEmpelado;
	private int nss;
	private double salario;
	private String puesto;
	
	
	public Empleado () {
		
	}

	// Generamos el constructor con todos los parametros y seleccionamos tambien el constructor de la clase padre
	// (Persona) para poder heredarlos y utilizarlos al instanciar a un nuevo empleado
	
	public Empleado(String nombre, String sexo, int edad, String curp, int idEmpelado, int nss, double salario,
			String puesto) {
		super(nombre, sexo, edad, curp);
		this.idEmpelado = idEmpelado;
		this.nss = nss;
		this.salario = salario;
		this.puesto = puesto;
	}

	public int getIdEmpelado() {
		return idEmpelado;
	}

	public void setIdEmpelado(int idEmpelado) {
		this.idEmpelado = idEmpelado;
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

	@Override //Significa Sobreescritura
	public String toString() {
		return "Empleado [idEmpelado=" + idEmpelado + ", nss=" + nss + ", salario=" + salario + ", puesto=" + puesto
				+ ", toString()=" + super.toString() + "]";
	}

	@Override
	public void comer() {
		// TODO Auto-generated method stub
		
		System.out.println("Estoy comiendo....");
		
	}

	@Override
	public void volar() {
		// TODO Auto-generated method stub
		System.out.println("Ahora estoy volando...");
	}
	
	
	
	
}
