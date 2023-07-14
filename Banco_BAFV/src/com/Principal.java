package com;

import java.util.HashMap;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Vamos a crear un HashMap para simular la pequeña base
		 * de datos */
		
		HashMap <Integer, Cuenta> baseDatos = new HashMap<Integer,Cuenta>();
		
		/*Existen dos maneras de agregar objetos Cuenta a nuestro HashMap
		 * Primero crear nuestro objeto cuenta y posteriormenre asignarle
		 * una clave (numero de cuenta )*/
		
		Cuenta sarai= new Cuenta("Sarai",10500,"1234","Debito",500,20000);
		
		/*ya que tenemos el objeto a guardar agregamos en el HasMap*/
		baseDatos.put(1001, sarai);
		/*otra manersa de guardar datos en el HashMap es asignado los
		 * valores directamente en el */
		baseDatos.put(1002, new Cuenta("Felix",5000,"3456","Debito",100,15000));
		baseDatos.put(1003, new Cuenta("Angel",15000,"1478","Debito",500,25000));
		baseDatos.put(1004, new Cuenta("Osbaldo",25000,"2020","Debito",500,50000));
		baseDatos.put(1005, new Cuenta("Alejandro",500,"3030","Debito",100,10000));
		/*Instanciar un cajero y darle acceso a la base de datos (HashMap)*/
		Cajero cajero1 = new Cajero("Veracruz", baseDatos);
		
		/*La funcion de busqueda de cuentas queda en manos del cajero*/
		//System.out.println(cajero1.buscarCuenta(1009));
		//System.out.println(baseDatos.get(1009));
		
		//probando el metodo de depositar
//		System.out.println(cajero1.depositar(1002, 5000));
//		System.out.println(cajero1.depositar(1002, 1000));
		
		//probando el metodoo de retirar
		//System.out.println(cajero1.retirar(1004, 11000));
		
		//probando el metodo de transferir
		System.out.println(cajero1.transferir(1005, 1004, 200));
		System.out.println(cajero1.buscarCuenta(1004));
		
		/*Desarrollar una maquina expendedora */
		
		//Uso de expresiones lamda
		//API Stream
		
		
	}

}
