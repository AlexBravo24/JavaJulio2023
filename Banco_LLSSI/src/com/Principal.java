package com;
import java.util.HashMap;

public class Principal {

	public static void main(String[] args) {
		
		HashMap <Integer, Cuenta> usuarios = new HashMap <Integer, Cuenta>();
		
		
		// EXISTEN DOS MANERAS DE AGREGAR OBJETOS CUENTA A NUESTRO HASHMAP
		//PRIMERO CREAR NUESTRO OBJETO CUENTA Y PORTERIORMENTE ASIGNAR 
		//UNA CLAVE (NUMERO DE CUENTA)
		
		Cuenta sarai = new Cuenta ("sarai", 10500, "2341", "Debito",500,2000);
		//YA QUE TENEMOS EL OBJETO A GUARDAR LO AGRAGAMOS A EL HASHMAP
		
		usuarios.put(1001, sarai);
		
		/*OTRA MANERA DE GUARDAR DATOS EN EL HASHMAP 
		 * ES ASIGNANDO LOS VALORES DIRECTAMENTE EN EL 
		 */
		
		usuarios.put(1002, new Cuenta ("FELIX", 5000, "3456", "Debito",100,15000));
		usuarios.put(1003, new Cuenta ("ANGEL", 15000, "1478", "Debito",500,25000));
		usuarios.put(1004, new Cuenta ("OSBALDO", 25000, "2020", "Debito",500,50000));
		usuarios.put(1005, new Cuenta ("ALEJANDRO", 500, "3030", "Debito",100,10000));
		
		Cajero cajero1  = new Cajero ("VERACRUZ", usuarios);
		 
		//LA FUNCION DE BUSQUEDA DE CUENTAS QUEDA EN MANOS DEL CAJERO
		
		//System.out.println(cajero1.buscarCuenta(1004));
		
		
		System.out.println(cajero1.depositar(1004,5000));
		
		System.out.println(cajero1.retirar(1002,500));
		
		System.out.println(cajero1.transferir(1005,1004,200));
		
		System.out.println(cajero1.buscarCuenta(1004));
		
		
		
	}

}
