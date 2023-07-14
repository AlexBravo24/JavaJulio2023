package com;

public interface IMetodos {
	
	//Nos permite actuar como un repositorio de m�todos que disntintas
	//clases podr�an utilizar
	
	/*M�todo para buscar una cuenta*/
	public Cuenta buscarCuenta(int numCuenta);
	/*Los siguiente m�todos si se realizan con �xito devolver�n
	 * el valor de nuestro objeto de respuesta (Ticket)*/
	public Ticket depositar(int numCuenta, double monto);
	public Ticket retirar(int numCuenta, double monto);
	public Ticket transferir(int origen, int destino, double monto);
	

}
