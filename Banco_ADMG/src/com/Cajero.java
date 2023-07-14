package com;

import java.util.Date;
import java.util.HashMap;

public class Cajero implements IMetodos {
	//Clase que implementa las acciones o logica
	
	private String sucursal;
	private int folio=1;
	//El cajero accedera a un HashMap que sera 
	//una pequena "base de datos" 
	private HashMap<Integer, Cuenta> baseDatos;
	
	public Cajero () {}

	

	public Cajero(String sucursal, HashMap<Integer, Cuenta> baseDatos) {
		super();
		this.sucursal = sucursal;
		this.baseDatos = baseDatos;
	}



	@Override
	public Cuenta buscarCuenta(int numCuenta) {
		//Instanciamos un objeto cuenta en nulo, porque, en caso de que no se encuentre
		//una cuenta, entonces el metodo regresara el valor de esa cuenta
		Cuenta cuenta = null;
		//Buscamos la cuenta, si existe se guarda en el objeto instanciado como "cuenta"
		//y procedemos a devolver el ese valor
		cuenta = baseDatos.get(numCuenta);
		//Si la cuenta no existe, se devuelve un valor nulo, si existe, se devuelve 
		//la cuenta que se encontro
		return cuenta;
	}

	@Override
	public Ticket depositar(int numCuenta, double monto) {
		//Instanciamos un ticket inicialmente vacio
		//Si la operacion no se realiza, no se emite un ticket
		Ticket comprobante = null;
		
		//Procedemos a buscar primero la cuenta para realizar la operacion
		if(buscarCuenta (numCuenta) !=null) {
			//Si hay datos, los guardamos en un objeto cuenta
			//para poder manipular dichos datos
			Cuenta cuenta =buscarCuenta(numCuenta);
			//una vez localizamos la cuenta, realizamos validaciones
			//como en un cajero
			//Validacion si el monto a depositar es mayor que el saldo maximo
			if(monto>cuenta.getSaldomax()) {
				System.out.println("El monto excede el saldo maximo permitido en la cuenta");
				return comprobante;
				//Validacion donde si el saldo existente de la cuenta
				//mas el saldo a depositar, rebasan el saldo maximo de la cuenta
			}else if (cuenta.getSaldo()+monto>cuenta.getSaldomax()) {
				System.out.println("El saldo de la cuenta excederia el maximo permitido");
				return comprobante;
				//Si la operacion no cae en alguna validacion anterior, entonces
				//realizamos el deposito
			}else {
				//Actualizamos el saldo de la cuenta
				cuenta.setSaldo(cuenta.getSaldo()+monto);
				//Y entonces ahora si generamos un ticket 
				comprobante = new Ticket(folio++, new Date(), cuenta.getNombre(), cuenta.getSaldo(), sucursal, "2001");
				return comprobante;
			}
		}else {//Si no existe la cuenta, mandamos el siguiente mensaje
			System.out.println("No hay una cuenta asociada a ese cliente");
		return comprobante;
	}
		
	}

	@Override
	public Ticket retirar(int numCuenta, double monto) {
		Ticket comprobante = null;
		
		if (buscarCuenta (numCuenta) !=null) {
			Cuenta cuenta = buscarCuenta(numCuenta);
			//Validamos primero si el monto a retirar
			//lo permite el cajero de acuerdo al valor que el asigne
			if(monto>9000) {
				System.out.println("Solo puedes retirar un maximo de $9000");
				return comprobante;
				//Validamos si el retiro que queremos realizar, pues excede el saldo de la cta
				
			}else if (cuenta.getSaldo()<monto) {
				System.out.println("No hay fondos suficientes para realizar el retiro");
				return comprobante;
				//validamos si el saldo de la cuenta, menos el monto a retirar
				//dejan por debajo del saldo minimo permitido a la cuenta
			}else if (cuenta.getSaldo()-monto<cuenta.getSaldomin()) {
				System.out.println("El retiro dejaria por debajo del minimo a la cuenta");
				return comprobante;
				//Si el retiro puede realizarse
			}else {
				cuenta.setSaldo(cuenta.getSaldo()-monto);
				comprobante = new Ticket(folio++, new Date(), cuenta.getNombre(), cuenta.getSaldo(), sucursal, "2001");
				return comprobante;
			}
				
		}else {
			System.out.println("No hay una cuenta asociada o no existe");
			return comprobante;
		}
	
	}

	@Override
	public Ticket transferir(int origen, int destino, double monto) {
		Ticket comprobante = null;
		
		//Ahora tenemos que localizar 2 cuentas
		if(buscarCuenta(origen)!=null && buscarCuenta(destino)!=null) {
			Cuenta clienteorigen = buscarCuenta(origen);
			Cuenta clientedestino = buscarCuenta(destino);
			//Procedemos a validar 
			if (clienteorigen.getSaldo()<monto) {
				System.out.println("No hay fondos suficientes para realizar la transferencia");
				return comprobante;
			}else if (clienteorigen.getSaldo()-monto<clienteorigen.getSaldomin()) {
				System.out.println("La transferencia dejaria por debajo del minimo a la cuenta");
				return comprobante;
			}else if (monto>clientedestino.getSaldomax()) {
				System.out.println("El monto a transferir excede el maximo permitido "+ "en la cuenta destino");
				return comprobante;
			}else if (clientedestino.getSaldo()+monto>clientedestino.getSaldomax()) {
				System.out.println("El saldo de la cuenta destino excederia el maximo permitido en ella");
				return comprobante;
			}else {
				clienteorigen.setSaldo(clienteorigen.getSaldo()-monto);
				clientedestino.setSaldo(clientedestino.getSaldo()+monto);
				comprobante = new Ticket(folio++, new Date(), clienteorigen.getNombre(), clienteorigen.getSaldo(), sucursal, "2001");
				return comprobante;
			}
			
		}else {
			System.out.println("No hay una cuenta asociada a alguno de los clientes");
			return comprobante;
		}
		
		
	}
	
	

}
