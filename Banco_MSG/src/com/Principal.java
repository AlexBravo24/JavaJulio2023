package com;

import java.util.HashMap;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Vamos a crear un hashmap para simular la peuqeña base de datos
		
		HashMap <Integer, Cuenta> usuarios = new HashMap<Integer, Cuenta>();
		
		// Existen 2 maneras de agregar objetos cuenta a nuestro HAshMap
		/*
		 * Primero sria crear nuestro objeto cuenta y posteriormente asignarle una clave 
		 * (numero de cuenta)
		 */
		
		
		Cuenta sarai = new Cuenta ("Sarai", 10500, "1234", "Debito", 500, 2000);
		
		// ya que tenemos a guardar agragamos en el hashmap
		
		usuarios.put(1001, sarai);
		
		// Otra menra de guardar datos en el hashmap, es asuignarle las cuentas directamente en el
		
		usuarios.put(1002, new Cuenta("Felix", 5000, "3456", "Debito", 100, 15000));
		usuarios.put(1003, new Cuenta("Angel", 15000, "7934", "Debito", 200, 25000));
		usuarios.put(1004, new Cuenta("Osbaldo", 32000, "3648", "Debito", 500, 150000));
		usuarios.put(1005, new Cuenta("Jose", 48000, "9642", "Debito", 3000, 25000));
		usuarios.put(1006, new Cuenta("Chucho", 6000, "3831", "Debito", 500, 30000));
		
		// System.out.println(baseDatos.get(1005));
		
		Cajero cajero1 = new Cajero("CDMX", usuarios);
		
		//System.out.println(cajero1.buscarCuenta(1004));
		
		// probando el metodo depositar
		System.out.println(cajero1.depositar(1003, 1000));
		
		// probando el metodo retirar
		System.out.println(cajero1.retirar(1003, 1000));
		
		// Probando el metodo de transferir
		System.out.println(cajero1.transferir(1005, 1004, 5000));
		System.out.println(cajero1.buscarCuenta(1005));
		
		//DESARROLLAR UNA MAQUINA EXPENDEDORA
		// INVESTIGAR USO DE EXPRESIONES LAMBDA Y API STREAM
		
	}

}
