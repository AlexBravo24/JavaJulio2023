package com;

public interface IMetodos {
	
	//Nos permita ectuar como un repositorio de 
	//metodos que distintas clases podrian
	//utilizar
	
	//Metodo para buscar una cuenta
	public Cuenta buscarCuenta (int numCuenta);
	//Los siguientes metodos si se realizan
	//con exito devolveran el valor 
	//de nuestro objeto de respuesta (Ticket)
	public Ticket depositar (int numCuenta, double monto);
	public Ticket retirar (int numCuenta, double monto);
	public Ticket transferir (int origen, int destino, double monto);
	
	
	
	
	
}
