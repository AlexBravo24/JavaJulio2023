package com;

import java.util.HashMap;

public class Principal {

	public static void main(String[] args) {
		
		//Vamos a crear un HashMap para simular la pequeña
		//BD
		
		HashMap<Integer, Cuenta> usuarios = new HashMap<Integer, Cuenta>();
		
		//Existen 2 manera de agregar objetos en el HashMap
		
		
		//Crear el objeto cuenta y asignarle una clave
		Cuenta sarai = new Cuenta("Sarai",10500,"1234","Debito",500,20000);
		//Ya creado el objeto, se agrega al HashMap
		usuarios.put(1001, sarai);
		
		//Otra forma sería:
		//Asignando directamente en él HashMap
		usuarios.put(1002, new Cuenta("Felix", 5000, "3456", "Debito", 100, 15000) );
		usuarios.put(1003, new Cuenta("Angel", 15000, "1478", "Debito", 500, 25000) );
		usuarios.put(1004, new Cuenta("Osbaldo", 25000, "2020", "Debito", 500, 50000) );
		usuarios.put(1005, new Cuenta("Alejandro", 500, "3030", "Debito", 100, 10000) );
	
		//Instanciar un cajero y darle el acceso a la BD (HashMap)
		
		Cajero cajero1 = new Cajero("Veracruz",usuarios);
		
		//System.out.println(cajero1.buscarCuenta(1004));
		
		//Probando el metodo.depositar
		
		//System.out.println(cajero1.depositar(1003, 1000));
		
		//System.out.println(cajero1.retirar(1002, 4900));
		
		System.out.println(cajero1.transferir(1005,1004 , 200));
		System.out.println(cajero1.buscarCuenta(1004));
	 
		
	}

}
