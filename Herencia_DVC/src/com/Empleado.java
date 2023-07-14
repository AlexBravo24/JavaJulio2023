package com;
//Para realizar herencia de una clase y heredar sus atributos
//y comportamientos esta se realiza con la palabra reservada
//"extends" permitiendonos asi reutilizar código de una clase padre

//Para implementar una interface se hace con la paabra 
//reservada "implements"
public class Empleado extends Persona implements IAvion{
	
	private int idempleado;
	private int nss;
	private double nomina;
	private String cargo;
	
	public Empleado () {
		
	}
//Generamos el constructor con todos los parametros y seleccionamos tambien
	//el constructor de la clase (Persona) para poder heredarlos
	//y utilizarlos al instanciar un nuevo empleado
	public Empleado(String nombre, String sexo, int edad, String curp, int idempleado, int nss, double nomina,
			String cargo) {
		super(nombre, sexo, edad, curp);
		this.idempleado = idempleado;
		this.nss = nss;
		this.nomina = nomina;
		this.cargo = cargo;
	}
	
	public int getIdempleado() {
		return idempleado;
	}
	public void setIdempleado(int idempleado) {
		this.idempleado = idempleado;
	}
	public int getNss() {
		return nss;
	}
	public void setNss(int nss) {
		this.nss = nss;
	}
	public double getNomina() {
		return nomina;
	}
	public void setNomina(double nomina) {
		this.nomina = nomina;
	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	
	@Override
	public String toString() {
		return "Empleado [idempleado=" + idempleado + ", nss=" + nss + ", nomina=" + nomina + ", cargo=" + cargo
				+ ", toString()=" + super.toString() + "]";
	}
	
	@Override
	public void comer() {
		System.out.println("Estoy comiendo... ");
		
	}
	@Override
	public void volar() {
		System.out.println("Estoy volando...");
		
	}
	
	
}
