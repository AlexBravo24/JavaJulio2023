package com;

public interface IMetodos {
	
	//Nos permite actuar como un repositorio de métodos que disntintas
	//clases podrían utilizar
	
	/*Método para buscar una cuenta*/
	public Cuenta buscarCuenta(int numCuenta);
	/*Los siguiente métodos si se realizan con éxito devolverán
	 * el valor de nuestro objeto de respuesta (Ticket)*/
	public Ticket depositar(int numCuenta, double monto);
	public Ticket retirar(int numCuenta, double monto);
	public Ticket transferir(int origen, int destino, double monto);
	

}
