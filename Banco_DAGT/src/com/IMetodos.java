package com;

public interface IMetodos {

	//Nos permite actuar como un repositorio de metodos que distintas clases podrian utilizar
	
	
	public Cuenta pedirDatos(); 
	public boolean buscarCuenta (int numCuenta);
	public boolean verificarDatos (int numCuenta, String nip);
	public void operacion(Cuenta cuenta);
	public Ticket depositar (Cuenta cuenta, double cantidad);
	public Ticket retirar (Cuenta centa, double cantidad);
	public Ticket transferir (Cuenta cuentaOrigen, int cuenta2, double cantidad);
	public Ticket consultar (Cuenta cuenta);
	public void cambiarNip(Cuenta cuenta, String nip);
	public void print(Ticket ticket);
	
	public void init();
	 
	
}
