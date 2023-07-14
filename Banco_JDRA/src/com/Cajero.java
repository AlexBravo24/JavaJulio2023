package com;

import java.util.Date;
import java.util.HashMap;

public class Cajero implements IMetodos{
	
	// Clase que implementa las acciones o logica
	
	private String sucursal;
	private int folio = 1;
	
	// El cajero accedera a un HashMap que sera una pequeña BD
	private HashMap<Integer, Cuenta> baseDatos;
	
	public Cajero () { }


	public Cajero(String sucursal, HashMap<Integer, Cuenta> baseDatos) {
		super();
		this.sucursal = sucursal;
		this.baseDatos = baseDatos;
	}
	
	
	public String getSucursal() {
		return sucursal;
	}


	public void setSucursal(String sucursal) {
		this.sucursal = sucursal;
	}


	public int getFolio() {
		return folio;
	}


	public void setFolio(int folio) {
		this.folio = folio;
	}


	public HashMap<Integer, Cuenta> getBaseDatos() {
		return baseDatos;
	}


	public void setBaseDatos(HashMap<Integer, Cuenta> baseDatos) {
		this.baseDatos = baseDatos;
	}


	
	@Override
	public String toString() {
		return "Cajero [sucursal=" + sucursal + ", folio=" + folio + ", baseDatos=" + baseDatos + "]";
	}


	@Override
	public Cuenta buscarCuenta(int numCuenta) {
		
		//Instanciamos un objeto cuenta en nulo, porque, en caso de que no se encuentre una cuenta
		// entonces el metodo regresara el valor de esa cuenta
		
		Cuenta cuenta = null;
		
		cuenta = baseDatos.get(numCuenta);
		
		return cuenta;
	}


	@Override
	public Ticket depositar(int numCuenta, double monto) {
		
		//Instanciamos un ticket inicialmente vacio
		
		//si la operacion no se realiza no se emite un ticket
		Ticket comprobante = null;
	
		
		//Procedemos a buscar la cuenta para realizar la operacion
		if(buscarCuenta(numCuenta) !=null) {
			//si hay datos, lo guardamos en un objeto cuenta
			//para poder manipular dichos datos
			Cuenta cuenta = buscarCuenta(numCuenta);
			
			// una vez localizamos la cuenta, realizamos validaciones
			// como un cajero
			
			// validacion si el monto a depositar es mayor que el saldo maximo
			if(monto>cuenta.getSaldoMax()) {
				System.out.println("El monto exede el saldo maximo permitido en la cuenta");
				return comprobante;
				
				//validacion donde si el saldo existente de la cuenta
				// mas el saldo a depositar, rebasan el saldo maxico de la cuenta
			}else if(cuenta.getSaldo()+monto>cuenta.getSaldoMax()) {
				System.out.println("El saldo de la cuenta exederia el maximo permitido");
				return comprobante;
				
				//si la operacion no cae en alguna validacion anterior, entonces realizamos el depostio
			}else {
				//Actualizamos el saldo de la cuenta
				cuenta.setSaldo(cuenta.getSaldo()+monto);
				
				//y entonces ahora si generamos un ticket a devolver
		comprobante = new Ticket(folio++, new Date(), cuenta.getNombre(), cuenta.getSaldo(), sucursal, 2001);
		return comprobante;
			}
		}else {
			// Si no existe la cuenta, mandamos el sig mensaje
			System.out.println("No hayn una cuenta soaciada a ese cliente");
			return comprobante;
		}
	}



	@Override
	public Ticket retirar(int numCuenta, double monto) {
		
		Ticket comprobante = null;
		
		if(buscarCuenta(numCuenta ) !=null) {
			Cuenta cuenta = buscarCuenta(numCuenta);
			
			//validamos primero si el monto a retirar, lo permite el cajero de acuerdo al valor
			// que el signe
			
			if(monto>9000) {
				System.out.println("Solo puedes retirar un maximo de $ 9000.00");
				return comprobante;
				
				//validamos si el retiro que queremos realizar, excede el saldo de la cuenta
			}else if(cuenta.getSaldo()<monto) {
				System.out.println("No hay fondos suficientes para realizar el retiro");
				return comprobante;
				
				//validamos si el saldo de la cuenta, menos el monto a retirar dejan por debajo del saldo
				// minimo permitido a la cuenta
				
			}else if(cuenta.getSaldo()- monto<cuenta.getSaldoMin()) {
				System.out.println("El retiro dejaria por debajo del saldo minimo a la cuenta");
				return comprobante;
				
				//si el retiro puede realizarse
			}else {
				cuenta.setSaldo(cuenta.getSaldo()-monto);
				comprobante = new Ticket(folio++, new Date(), cuenta.getNombre(), cuenta.getSaldo(), sucursal, 2001);
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
		if(buscarCuenta(origen) !=null && buscarCuenta(destino) !=null) {
			Cuenta clienteOrigen = buscarCuenta(origen);
			Cuenta clienteDestino = buscarCuenta(destino);
			
			//procedemos a validar
			if(clienteOrigen.getSaldo()<monto) {
				System.out.println("No hay fondos suficientes para realizar la transferencia");
				return comprobante;
			}else if(clienteOrigen.getSaldo()-monto<clienteOrigen.getSaldoMin()) {
				System.out.println("La transferencia dejaria por debajo del saldo minimo la cuenta");
				return comprobante;
			}else if(monto>clienteDestino.getSaldoMax()) {
				System.out.println("El monto a transferir excede el maximo permitido en la cuenta de destino");
				return comprobante;
			}else if(clienteDestino.getSaldo()+monto>clienteDestino.getSaldoMax()) {
				System.out.println("El saldo de la cuenta destino excede el maximo permitido");
				return comprobante;
			} else {
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
