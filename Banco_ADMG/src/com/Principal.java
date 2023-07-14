package com;

import java.util.HashMap;

public class Principal {

	public static void main(String[] args) {
		
		//Vamos a crear un HashMap para simular la pequena base de datos
		
		HashMap <Integer, Cuenta> usuarios= new HashMap <Integer, Cuenta>();
		
		//Existen dos maneras de agregar objetos Cuenta a nuestro HashMap
		//Primero crear nuestro objeto cuenta y posteriormente asignarle
		//una clave (numero de Cuenta)
		Cuenta sarai = new Cuenta("Sarai", 10500, "1234", "Debito", 500, 20000);
		
		//Ya que tenemos el objeto a guardar, lo agregamos en el HashMap
		usuarios.put(1001, sarai);
		//Otra manera de guardar datos en el HashMap
		//Es asignando los valoresdirectamente en el 
		usuarios.put(1002, new Cuenta("Felix", 5000, "3456", "Debito", 100, 15000));
		usuarios.put(1003, new Cuenta("Angel", 15000, "5678", "Debito", 500, 25000));
		usuarios.put(1004, new Cuenta("Osbaldo", 25000, "8989", "Debito", 500, 5000));
		usuarios.put(1005, new Cuenta("Alejandro", 500, "1221", "Debito", 100, 10000));
		
		//Instanciar un cajero y darle el acceso a la base de datos HashMap
		Cajero cajero1 = new Cajero("Veracruz", usuarios);
		
		//La funcion de busqueda de cuentas queda en manos del cajero
		System.out.println(cajero1.buscarCuenta(1004));
		
		//Probando el metodo de depositar
		System.out.println(cajero1.depositar(1003, 9000));
		System.out.println(cajero1.depositar(1002, 254));
		
		//Probando el metodo de retirar
		System.out.println(cajero1.retirar(1005, 400));
		
		//Probando el metodo de transferir
		System.out.println(cajero1.transferir(1002, 1003, 3));
		
		
		
		
		
		
		
		
	}

}
