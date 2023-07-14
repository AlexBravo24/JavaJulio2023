package com;

import java.util.HashMap;

public class Principal {

	public static void main(String[] args) {
		
		//Vamos a crear un HashMap para simular la pequeña base de datos
		
		HashMap<Integer, Cuenta> usuarios = new HashMap<Integer, Cuenta>();
		
		//Existen dos maneras de agregar objetos Cuenta a nuestro HashMap
		// Primero crear nuestro objeto cuenta y posteriormwnte asignarle
		// una clave (numero de Cuenta)
		
		Cuenta sarai = new Cuenta("Sarai", 10500, "1234", "Debito", 500, 20000);
		
		// Ya que tenemos el objeto a guardar, lo agregamos en el HashMap
		
		usuarios.put(1001, sarai);
		
		//Otra manera de guardar datos en el HashMap es asigando los valores directamente en él
		
		usuarios.put(1002, new Cuenta("Felix", 5000, "3456", "Debito", 100, 15000));
		usuarios.put(1003, new Cuenta("Angel", 15000, "1478", "Debito", 500, 150000));
		usuarios.put(1004, new Cuenta("Osbaldo", 25000, "2020", "Debito", 500, 50000));
		usuarios.put(1005, new Cuenta("Alejandro", 500, "3030", "Debito", 100, 10000));
		
		//System.out.println(usuarios.get(1005));
		
		// Instanciar un cajero y darle el acceso a la base de datos (HashMap)
		Cajero cajero1 = new Cajero("Veracruz", usuarios);
		
		//La función de búsqueda de cuentas queda en manos del cajero
		
		//System.out.println(cajero1.buscarCuenta(1004));
		
		System.out.println(cajero1.depositar(1002, 5000));
		System.out.println(cajero1.retirar(1002, 1000));
		

	}

}
