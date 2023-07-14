package com;


/*PARAIMPLEMENTAR UNA INTERFACE SE HACE CON LA PALABRA RESERVADA "implements "
 * 
 */


public class Empleado extends Persona {
	
	/*PARA REALIZAR HERENCIA Y HEREDAR SUS ATRIBUTOS ESTA SE REALIZA CON LA PALABRA 
	 * RESERVATDA "extends" PERMITIENDONOS ASI REUTILIZAR CADIGO DE UNA CLAS PADRE
	 */
	
	private int idEmpleado;
	private int nss;
	private double salario;
	private String puesto;
	
	
	public Empleado () {
		
	}
	
	
	/*GENERAMOS EL CONSTRUCTOR CON TODOS LOS PARAMETROS Y SELECCIONAMOS TAMBIEN EL CONSTRUCTOR DE LA CLASE 
	 * PADRE (PERSONA)
	 * PARA PODER HEREDARLO Y UTILIZARLO AL INSTANCIAR A UN NUEVO EMPLEADO
	 */


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
		
	}
	
	
	
	
	

}
