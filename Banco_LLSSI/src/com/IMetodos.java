package com;

public interface IMetodos {
	
//	Nos permite actuarcomo repositorio de metodos de distintas clases  
//	podrian utilizar
	
	//METODO PARA BUSCAR UNA CUENTA
	
	public Cuenta buscarCuenta (int numCuenta);
	
//	los siguientes metodos si se realizan 
//	con exito devolveran el valor de nuestro objeto de respuesta (Ticket)
//	
	
	public Ticket depositar (int numCuenta, double monto);
	public Ticket retirar (int numCuenta, double monto);
	
	public Ticket transferir (int origen, int destino,  double monto);

}
