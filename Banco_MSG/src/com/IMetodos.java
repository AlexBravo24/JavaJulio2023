package com;

public interface IMetodos {
	
	// Nos permite actuar como un repositorio de metodos que distintas clases podrian utilizar
	
	//Metodo para buscar una cuenta y lo vamos a buscar por argumento de tipo entero
	public Cuenta buscarCuenta (int numCuenta);
	
	// Los siguientes metodos si se relian con exito devolveran el valor de nuestro objeto de respuesta ticket
	public Ticket depositar (int numCuenta, double monto);
	public Ticket retirar (int numCuenta, double monto);
	public Ticket transferir (int origen, int destino, double monto);
	
	
	
} // Cierre class
