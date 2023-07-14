package com;

import java.util.HashMap;

public class Principal {

	public static void main(String[] args) {
		
		//Vamos a crear un HashMap para simular una pequeña BD
		
		HashMap <Integer, Cuenta> usuarios = new HashMap<Integer, Cuenta>();
		
		
		//Existen dos manera de agregar objeto Cuenta a nuestro HashMap
		//Primero crear nuestro objeto cuenta y posteriormente asignarle
		//una clave (numero de Cuenta)

		Cuenta sarai = new Cuenta("Sarai", 10500, "1234", "Debito", 500, 20000);
		//Ya que tenemos el objeto a guardar agregamos en el HashMap
		
		usuarios.put(1001, sarai);
		//Otra manera de guardar datos en el HashMap
		//Es asigando los valores directamente en el
		
		usuarios.put(1002, new Cuenta("Felix", 5000, "4567", "Debito", 100, 15000));
		usuarios.put(1003, new Cuenta("Angel", 15000, "9632", "Debito", 500, 25000));
		usuarios.put(1004, new Cuenta("Oswaldo", 25000, "8745", "Debito", 500, 50000));
		usuarios.put(1005, new Cuenta("Alejandro", 500, "1235", "Debito", 100, 10000));
		
		//Instanciar un cajero y darle el acceso a la base de dato HashMap
		Cajero cajero1 = new Cajero("Veracruz", usuarios);
		
		//La función de busqueda de cuentas queda en manos del cajero
//		System.out.println(cajero1.buscarCuenta(1009));
		
		//Probando el metodo de depositar
//		System.out.println(cajero1.depositar(1002, 5000));
//		System.out.println(cajero1.depositar(1002, 1000));
		
		//Probando el metodo retirar
//		System.out.println(cajero1.retirar(1005, 400));
		
		//Probando el metodo transferir
		//System.out.println(cajero1.transferir(1002, 1003, 4900));
//		System.out.println(cajero1.transferir(1009, 1002, 1000));
//		System.out.println(cajero1.transferir(1004, 1003, 10000));
		System.out.println(cajero1.transferir(1004, 1003, 10000));
		
		
		
		
		
	}

}
