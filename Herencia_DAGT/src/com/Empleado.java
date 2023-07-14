package com;

/*Para realizar herencia de una clase y que esta 
 * herede sus atributos y comportamientos 
 * se realiza con la palabra reservada "extends"
 * permitiendonos así reutilizar codigo de una clase padre
 * 
 */
public class Empleado extends Persona {
	
	private int idEmpleado;
	private int nss;
	private double salario;
	private String puesto;
	
	public Empleado() {}
	
	public Empleado(String nombre, String sexo, int edad,String curp, int idEmpleado, int nss, double salario, String puesto) {
		super(nombre, sexo, curp ,edad);
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
		System.out.println("Estoy Comiendo...");
	}
	
	 
	
}
