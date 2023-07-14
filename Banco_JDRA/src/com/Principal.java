package com;

import java.util.HashMap;

public class Principal {
	public static void main(String[] args) {
		
		// Vamos a crear un HashMap para simular la pequeña BD
		
		HashMap<Integer, Cuenta> usuarios = new HashMap<Integer, Cuenta>();
		
		
		
		// Existen 2 maneras de agregar objetos cuenta a nuestro HashMap
		
		// Primero crear nuestro objeto cuenta y posteriormente asignarle una clave (NumCuenta)
		Cuenta diego = new Cuenta("Diego", 1000, "1005", "Debito", 100, 22000);
		
		// ya que tenemos el objeto a guardar, lo agregamos en el HaspMap
		
		usuarios.put(1001, diego);
		
		
		//Otra manera de guardar datos en el HashMap es asignando los valores direcamente en el
		usuarios.put(1002, new Cuenta("Juan", 5000, "1234", "Debito", 500, 10000));
		usuarios.put(1003, new Cuenta("Mariano", 10000, "1222", "Debito", 250, 10000));
		usuarios.put(1004, new Cuenta("Jesus", 230, "5432", "Debito", 100, 22000));
		usuarios.put(1005, new Cuenta("Juan", 100, "9323", "Debito", 100, 22000));
		
		//System.out.println(usuarios.get(1005));
		
		//Instanciar un cajero y darle el acceso a la BD (HashMap)
		Cajero cajero1 = new Cajero("Cuernavaca", usuarios);
		
		//La funcion de busqueda de cuentas queda en manos del cajero
		//System.out.println(cajero1.buscarCuenta(1002));
		
		
		// probando el metodo de depositar
		//System.out.println(cajero1.depositar(1005, 2500));
		//System.out.println(cajero1.depositar(1005, 2500));
		
		
		
		//probando el metodo de retirar
		//System.out.println(cajero1.retirar(1003, 9100));
		
		
		
		//probamos el metodo transferir
		System.out.println(cajero1.transferir(1005, 1002, 3100));
		
		System.out.println(cajero1.buscarCuenta(1005));
		

	}

}
