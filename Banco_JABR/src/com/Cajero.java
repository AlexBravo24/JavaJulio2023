package com;

import java.util.Date;
import java.util.HashMap;

public class Cajero implements IMetodos {
	//Clase que implementa las acciones o lógica
	
	private String sucursal;
	private int folio=1;
	//El cajero accedera a un HashMap que será
	//una pequeña "base de datos"
	private HashMap<Integer, Cuenta> baseDatos;

	public Cajero() {}

	
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
		//y procedemos a devolver ese valor
		cuenta = baseDatos.get(numCuenta);
		//Si la cuenta no existe, se devuelve un valor nulo, si existe, se devuelve
		//la cuenta que se encontro
		return cuenta;
	}

	@Override
	public Ticket depositar(int numCuenta, double monto) {
		//Instanciamos un ticket incialmente vacio
		//Si la operacion no se realiza, no se emite un ticket
		Ticket comprobante = null;
		//Procedemos a buscar primero la cuenta para realizar la operacion
		if(buscarCuenta(numCuenta) !=null) {
			//Si hay datos, los guardamos en un objeto cuenta
			//para poder manipular dichos datos
			Cuenta cuenta = buscarCuenta(numCuenta);
			//Una vez localizamos la cuenta, realizamos validaciones
			//como en un cajero
			//Validacion si el monto a depositar es mayor que el saldo Maximo
			if(monto>cuenta.getSaldoMax()) {
				System.out.println("El monto excede el saldo maxímo permitido en la cta");
				return comprobante;
				//Validacion donde si el saldo existente de la cuenta
				//más el saldo a depositar, rebasan el saldo máximo de la cuenta
			}else if(cuenta.getSaldo()+monto>cuenta.getSaldoMax()) {
				System.out.println("El saldo de la cuenta excedería el máximo permitido");
				return comprobante;
				//Si la operacion no cae en alguna validación anterior, entonces
				//realizamos el deposito
			}else {
				//Actualizamos el saldo de la cuenta
				cuenta.setSaldo(cuenta.getSaldo()+monto);
				//Y entonces ahora sí generamos un ticket a devolver
				comprobante = new Ticket(folio++, new Date(),cuenta.getNombre(), cuenta.getSaldo(), sucursal, 2001);
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
		
		if(buscarCuenta(numCuenta) !=null) {
			Cuenta cuenta = buscarCuenta(numCuenta);
			//Validamos primero si el monto a retirar,
			//Lo permite el cajero de acuerdo al valor que el asigne
			if(monto>9000) {
				System.out.println("Solo puedes retirar un maximo de $ 9000.00");
				return comprobante;
				//Validamos si el retiro que queremos realizar, pues excede el saldo de la cta
			}else if(cuenta.getSaldo()<monto) {
				System.out.println("No hay fondos suficientes para realizar el retiro");
				return comprobante;
				//Validamos si el saldo de la cuenta, menos el monto a retirar
				//dejan por debajo del saldo minimo permitodo a la cuenta
			}else if (cuenta.getSaldo()-monto<cuenta.getSaldoMin()) {
				System.out.println("El retiro dejaría por debajo del minimo a la cuenta");
				return comprobante;
				//Si el retiro puede realizarse
			}else {
				cuenta.setSaldo(cuenta.getSaldo()-monto);
				comprobante = new Ticket(folio++, new Date(),cuenta.getNombre(), cuenta.getSaldo(), sucursal, 2001);
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
			Cuenta clienteOrigen = buscarCuenta(origen);
			Cuenta clienteDestino = buscarCuenta(destino);
			//Procedemos a validar
			if(clienteOrigen.getSaldo()<monto) {
				System.out.println("No hay fondos suficientes para realizar la transferencia");
				return comprobante;
			}else if(clienteOrigen.getSaldo()-monto<clienteOrigen.getSaldoMin()) {
				System.out.println("La transferencia dejaría por debajo del mínimo a la cta");
				return comprobante;
			}else if (monto>clienteDestino.getSaldoMax()) {
				System.out.println("El monto a transferir excede el máximo permitido "
						+ "en la cuenta de destino");
				return comprobante;
			}else if(clienteDestino.getSaldo()+monto>clienteDestino.getSaldoMax()) {
				System.out.println("El saldo de la cuenta destino excedería el máximo permitido");
				return comprobante;
			}else {
				clienteOrigen.setSaldo(clienteOrigen.getSaldo()-monto);
				clienteDestino.setSaldo(clienteDestino.getSaldo()+monto);
				comprobante = new Ticket(folio++, new Date(),clienteOrigen.getNombre(), clienteOrigen.getSaldo(), sucursal, 2001);
				return comprobante;
			}
		}else {
		System.out.println("No hay una cuenta asociada a alguno de los clientes");
		return comprobante;
	}
	}
	
	
}
