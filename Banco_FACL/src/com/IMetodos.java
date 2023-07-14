package com;

public interface IMetodos {
	
	//Nos permite actuar como un repositorio de m�todos que 
	//distintas clases podr�an utilizar
	
	
	//Metodo para buscar una cuenta
	public Cuenta buscarCuenta (int numCuenta);
	
	//Los siguientes m�todos al ser realizados con �xito 
	//deber�n devolver un ticket
	
	public Ticket depositar (int numCuenta, double monto);
	public Ticket retirar (int numCuenta, double monto);
	public Ticket transferir (int origen, int destino, double monto);

}
