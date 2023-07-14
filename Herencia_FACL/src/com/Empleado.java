package com;

//Para realizar herencia de una clase y heredar sus atributos
//esta se realiza con la palabra "extends" permitiendonos así reutilizar 
//línead de código.

//Para implementar una interface se hace con la palabra 
//reservada "IMPLEMENTS", se puede implementar n numero de
//interfaces
public class Empleado extends Persona implements IAvion {
	
	private int idEmpleado;
	private int nss;
	private double salario;
	private String puesto;
	
	public Empleado() {
		
	}

	public Empleado(String nombre, String sexo, int edad, String curp, int idEmpleado, int nss, double salario,
			String puesto) {
		super(nombre, sexo, edad, curp);
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
		// TODO Auto-generated method stub
		
		System.out.println("Estoy comiendo Pizzaaaaa");
		
	}

	@Override
	public void volar() {
		// TODO Auto-generated method stub
		
		System.out.println("Soy Clark Kent y puedo volar SIUUU");
		
	}
	
	
	

}
