package com;

import java.util.Date;
import java.util.HashMap;

public class Cajero implements IMetodos {
//clase que implementa las acciones o lógica
	private String sucursal ;
	private int folio=1;
	//el cajero accedera a uin hashmap que sera una pequeña base de datos
	private HashMap <Integer, Cuenta> baseDatos ;
	
	public Cajero () {
			}

	public Cajero(String sucursal, HashMap<Integer, Cuenta> cuentas) {
		super();
		this.sucursal = sucursal;
		this.baseDatos = cuentas;
	}

	@Override
	public Cuenta buscarCuenta(int numCuenta) {
		//instanciamos un objeto cuenta en nulo, porque en caso de que no se 
		//encuentre una cuenta, entonces regresara el valor de esa cuenta
		Cuenta cuenta = null;
	//buscamos la cuenta, si existe se guarda en el objeto instanciado como "cuenta"
	//y procedemos a devolver ese valor 	
		cuenta=baseDatos.get(numCuenta);
		//si la cuenta no erxiste, se devuelve un valor nulo, si existe,
		//se devuelve la cuenta que se encontro
		
		return cuenta;
	}

	@Override
	public Ticket depositar(int numCuenta, double monto) {
		//Instanciamos un ticket inicialmente vacio
		//si la operacion no se realiza, no se emite un ticket.
		Ticket comprobante = null;
		//procedmos a buscar primero la cuenta para relizar la operacion
		if(buscarCuenta(numCuenta) != null) {
		//si hay datos, los guardamos en un objeto cuenta
			// para poder manipular dichos datos
			
			Cuenta cuenta =buscarCuenta(numCuenta);
		//una vez localizamos la cuenta, realizamos validaciones 
			//como un cajero.
			//validacion si el monto a depositar es mayor que el saldo maximo 
			if (monto>cuenta.getSaldoMax()) {
				System.out.println("El monto excede el saldo maximo permitido en la cta");
				return comprobante;
				//validacion donde si el saldo existente de la cuenta
				//mas el saldo a depositar, rebasen el saldo maximo de la cuenta
			}else if (cuenta.getSaldo()+monto >cuenta.getSaldoMax()) {
			System.out.println("El saldo de la cuenta excederia el maximo permitido ");	
			return comprobante;
			//si la operacion no cae en alguna validacion anterior, entonces realizmos el 
			//deposito
			}else {
				
	cuenta.setSaldo(cuenta.getSaldo()+monto);
	comprobante = new Ticket (folio++,new Date(),cuenta.getNombre(),cuenta.getSaldo(), sucursal, 1054) ;
			
		return comprobante;
			}} else {
				System.out.println("No hay una cuenta asociada a ese cliente");
				return comprobante;
			}
			
	}
		

	@Override
	public Ticket retirar(int numCuenta, double monto) {
		Ticket comprobante = null;
		if(buscarCuenta(numCuenta)!=null){
			Cuenta cuenta = buscarCuenta(numCuenta);
			//validamos primero si el monto a retirar,
			//lo permite el cajero de acuerdo al valor que el asigne
			
			if (monto>9000) {
				System.out.println("Solo puedes retirar un maximo de $ 9000.00 mxn ");
				return comprobante;
				//validamos si el retiro que queremos realizar, excede el saldo de la cuenta
			}else if (cuenta.getSaldo()< monto) {
				System.out.println("No hay fondos suficientes para realizar el retiro");
				return comprobante;
				//validamos si el saldo de la cuenta, menos el monto a retirar 
				//dejan por debajo del saldo minimo permitido a la cuenta 
			}else if (cuenta.getSaldo()-monto< cuenta.getSaldoMin()) {
				System.out.println("El retiro dejaria por debajo del minimo a la cuenta ");
				return comprobante;
				//si el retiro puede realizarse
			}else {
			cuenta.setSaldo(cuenta.getSaldo()-monto);
			comprobante = new Ticket (folio++,new Date(),cuenta.getNombre(),cuenta.getSaldo(), sucursal, 1054) ;
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
//ahora tenemos que buscar 2 cuentas
if (buscarCuenta(origen)!=null && buscarCuenta(destino)!=null) {
	Cuenta clienteOrigen = buscarCuenta (origen);
	Cuenta clienteDestino = buscarCuenta(destino);
		//validar que las cuentas tengan saldo para la transferencia
	if(clienteOrigen.getSaldo()<monto) {
		System.out.println("No hay fondos suficientes para realizar la transferencia");
		return comprobante;
	}else if (clienteOrigen.getSaldo()-monto<clienteOrigen.getSaldoMin()) {
		System.out.println("La transferencia deja por debajo del minimo la cuenta");
		return comprobante;
			}else if (monto>clienteDestino.getSaldoMax()) {
				System.out.println("El monto a transferir excede el maximo permitido " + " en la cuenata de destino");
				return comprobante;
			}else if (clienteDestino.getSaldo()+monto>clienteDestino.getSaldoMax()) {
				System.out.println("El monto a transferir excede el maximo permitido en la cuela de destino");
				return comprobante;
							}else {
								clienteOrigen.setSaldo(clienteOrigen.getSaldo()-monto);
								clienteDestino.setSaldo(clienteDestino.getSaldo()+monto);
								comprobante = new Ticket (folio++,new Date(),clienteOrigen.getNombre(),clienteOrigen.getSaldo(), sucursal, 1054) ;
								return comprobante;
							}
}else {
	System.out.println("No hay una cuenta asociada a alguno de los clientes");
	return comprobante;
}

	}
	
	
	
	
	
}
