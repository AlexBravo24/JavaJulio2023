package com;

import java.util.Date;
import java.util.HashMap;

public class Cajero implements IMetodos {
	/*Clase que implemete las acciones o lógica*/
	
	private String sucursal;
	private int folio = 1;
	/*El cajero accederá a un HashMap que será una pequeña
	 * "base de datos"*/
	private HashMap<Integer, Cuenta> baseDatos;
	
	public Cajero() {
		
	}

	

	public Cajero(String sucursal, HashMap<Integer, Cuenta> baseDatos) {
		super();
		this.sucursal = sucursal;
		this.baseDatos = baseDatos;
	}


	@Override
	public Cuenta buscarCuenta(int numCuenta) {
		
		/*instanciamos un objeto cuenta nulo, porque, en caso
		 * de que no se encuentre una cuenta, entonces el metodo 
		 * regresará el valor de esa cuenta*/
		Cuenta cuenta = null;
		/*buscamos la cuenta, si existe se guarda en el objeto
		 * instanciado como "cuenta" y procedemos a devolver ese valor*/
		cuenta = baseDatos.get(numCuenta);
		/*Si la cuenta no existe, se devuelve un valor nulo, si existe, se devuelve
		 * la cuenta que se encontró*/
		return cuenta;
	}

	@Override
	public Ticket depositar(int numCuenta, double monto) {
		//instanciamos un Ticket inicialmente vacio
		// Si la operacion no se realiza, no se emite un ticket
		Ticket comprobante = null;
		/*Procedemos a buscar primero la cuenta para realizar la operación*/
		if(buscarCuenta(numCuenta)!= null) {
			/*si hay datos, los guradamos en el objeto cuenta
			 * para poder manipular dichos datos*/
			Cuenta cuenta = buscarCuenta(numCuenta);
			/*una vez localiazmos la cuenta , realizamos validaciones
			 * como en un cajero*/
			//validacion si el monto a depositar es mayor que el saldo maximo
			if(monto>cuenta.getSaldoMax()) {
				System.out.println("El monto excede el saldo máximo permitido en la cuenta");
				return comprobante;
				/*Validacion donde si el saldo existente de la cuenta
				 * mas el saldo a depositar, rebasan el saldo maximo de la cuenta*/
			}else if(cuenta.getSaldo()+monto>cuenta.getSaldoMax()) {
				System.out.println("El saldo de la cuenta excedería el máximo permitido");
				return comprobante;
				/*Si la operacion no cae en una validacion anterior
				 * entonces realizariamos el deposito*/
			}else {
				cuenta.setSaldo(cuenta.getSaldo()+monto);
				//
				/*y entonces ahora si geramos un ticket a devolver*/
				comprobante = new Ticket(folio++, new Date(), cuenta.getNombre(), cuenta.getSaldo(), sucursal, 2001);
				
				return comprobante;
			}
			
		}else { // si no existe la cuenta mandamos el siguiente mensaje
			System.out.println("No hay una cuenta asociada a ese cliente");
		return comprobante;
		}
	}

	@Override
	public Ticket retirar(int numCuenta, double monto) {
		Ticket comprobante = null;

		if(buscarCuenta(numCuenta)!= null) {
			Cuenta cuenta = buscarCuenta(numCuenta);
			/*validamos primero si el monto a retirar
			 * lo perimite el cajero de acuerdo al valor que le asigne*/
			if(monto>9000) {
				System.out.println("Solo puedes retirar un máximo de 9000");
				return comprobante;
				/*validamos si el reitro que queremos realizar excede
				 * el saldo de la cuenta*/
			}else if(cuenta.getSaldo()<monto) {
				System.out.println("No hay fondos suficientes para realizar el retiro");
				return comprobante;
				/*validamos si el saldo de la cuenta menos el monto
				 * a retirar dejan por debajo del saldo minimo permitido a la cuenta*/
			}else if(cuenta.getSaldo()-monto<cuenta.getSaldoMin()) {
				System.out.println("El retiro dejaria por debajo del minimo a la cuenta");
				return comprobante;
				// si el retiro puede realizarse
			}else {
				cuenta.setSaldo(cuenta.getSaldo()-monto);
comprobante = new Ticket(folio++, new Date(), cuenta.getNombre(), cuenta.getSaldo(), sucursal, 2001);
				
				return comprobante;
			}
			
		}else {
			System.out.println("No hay cuenta asociada o no existe");
			return comprobante;
		}
	
	}

	@Override
	public Ticket transferir(int origen, int destino, double monto) {
		Ticket comprobante = null;

		// ahora tenemos que localizar dos cuentas
		if(buscarCuenta(origen)!= null && buscarCuenta(destino)!=null) {
			Cuenta clienteOrigen = buscarCuenta(origen);
			Cuenta clienteDestino = buscarCuenta(destino);
			/*procedemos a validar*/
			if(clienteOrigen.getSaldo()<monto) {
				System.out.println("No hay fondos suficientes para realizar la transferencia");
				return comprobante;
			}else if(clienteOrigen.getSaldo()-monto<clienteOrigen.getSaldoMin()) {
				System.out.println("La transferencia dejaria por debajo del mínimo la cuenta");
				return comprobante;
			}else if(monto>clienteDestino.getSaldoMax()) {
				System.out.println("El monto a transferir execede el maximo permitido en la cuenta de destino");
				return comprobante;
			}else if(clienteDestino.getSaldo()+monto>clienteDestino.getSaldoMax()) {
				System.out.println("El saldo de la cuenta destino execedería el maximo permitido ");
				return comprobante;
			}else {
				clienteOrigen.setSaldo(clienteOrigen.getSaldo()-monto);
				clienteDestino.setSaldo(clienteDestino.getSaldo()+monto);
				comprobante = new Ticket(folio++, new Date(), clienteOrigen.getNombre(), clienteOrigen.getSaldo(), sucursal, 2001);
				
				return comprobante;

			}
		}else {
			System.out.println("No hay una cuenta asociada a alguno de los clientes");
		
		return comprobante;
		}
	}
	
	
}
