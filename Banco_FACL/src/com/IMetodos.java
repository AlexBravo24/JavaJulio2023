package com;

public interface IMetodos {
	
	//Nos permite actuar como un repositorio de métodos que 
	//distintas clases podrían utilizar
	
	
	//Metodo para buscar una cuenta
	public Cuenta buscarCuenta (int numCuenta);
	
	//Los siguientes métodos al ser realizados con éxito 
	//deberán devolver un ticket
	
	public Ticket depositar (int numCuenta, double monto);
	public Ticket retirar (int numCuenta, double monto);
	public Ticket transferir (int origen, int destino, double monto);

}
