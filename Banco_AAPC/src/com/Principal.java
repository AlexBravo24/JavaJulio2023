package com;

import java.util.HashMap;

public class Principal {

	public static void main(String[] args) {
		// Crear un HashMap para simular la pequeña base de datos
		HashMap <Integer,Cuenta> baseDatos =new HashMap<Integer,Cuenta>();
		
		//Existen dos maneras de agregar objetos Cuenta a nuestro
		//HashMap
		//1. Crear nuestro objeto cuenta y posteriormente asignarle una clave
		
		Cuenta sarai = new Cuenta ("Sarai",10500,"1234","debito",500,20000);
		//ya que tenemos el objeto a guardar, lo agregamos en el hashMap
baseDatos.put(1001,sarai);
		//otra manera de guardar datos en el hashmap es asignando los valores
		//directamente en el
		                    
baseDatos.put(1002,new Cuenta("felix",5000,"3456","debito",100,15000));
baseDatos.put(1003,new Cuenta("Angel",18000,"5678","debito",500,25000));
baseDatos.put(1004,new Cuenta("oswal",7000,"1011","debito",800,35000));
baseDatos.put(1005,new Cuenta("alex",9000,"1111","debito",600,45000));
		
//instanciar un cajero y darle el acceso a la base de datos HashMap

		Cajero cajero1 = new  Cajero("Veracruz",baseDatos);
	//la funcion de busqueda de cuentas queda en manos del cajero
	
		
//		System.out.println(cajero1.buscarCuenta(1004));
//		//funcion depositar en prueba
//		System.out.println(cajero1.depositar(1003,1000));
//		System.out.println(cajero1.depositar(1003, 5000));
//		
		//probando el metodo de retirar
//		System.out.println(cajero1.retirar(1005,9000));
		//probando transferir
		System.out.println(cajero1.transferir(1002, 1003,2500));
		System.out.println(cajero1.buscarCuenta(1003));
	
		
		
		//Desarrollar una maquina expendedora
		//Uso de expresiones lambda
		//api Stream ¿que es?
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}
	}
