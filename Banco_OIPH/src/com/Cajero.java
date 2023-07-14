package com;

import java.util.*;

public class Cajero  implements IMetodos{
	
	//Clase que implementa las acciones o l�gica
	
	private String sucursal;
	private int folio = 1;
	//El cajero acceder� a un HashMap que ser� una peque�a "base de datos"
	private HashMap<Integer, Cuenta> baseDatos;
	
	public Cajero() {}

	

	public Cajero(String sucursal, HashMap<Integer, Cuenta> baseDatos) {
		super();
		this.sucursal = sucursal;
		this.baseDatos = baseDatos;
	}



	@Override
	public Cuenta buscarCuenta(int numCuenta) {
		//Instanciamos un objeto cuenta en nulo, porque en caso de que no se encuentre
		// una cuenta, entonces el metodo regresara el valor de esa cuenta
		Cuenta cuenta = null;
		//Buscamos la cuenta, si existe se gurad en el objeto instanciado como "cuenta"
		// y procedemos a devolver ese valor
		cuenta = baseDatos.get(numCuenta);
		// Si la cuenta no existe, se devuelve un valor nulo, si existe se devuelve
		// la cuenta que se encontr�
		return cuenta;
	}

	@Override
	public Ticket depositar(int numCuenta, double monto) {
		// Instanciamos un Ticket inicialmente vac�o
				// Si la operaci�n no se realiza, no se emite un ticket
				Ticket comprobante = null;
				//Procedemos a buscar la cuenta para realizar la operaci�n
				if(buscarCuenta(numCuenta)!=null) {
					// Si hay datos, los guardamos en un objeto cuenta para poder manipular dichos datos.
					Cuenta cuenta = buscarCuenta(numCuenta);
					// Una vez localizamos la cuenta, realizamos validaciones como en un cajero
					//Validaci�n si el monto a depositar es mayor qu el saldo m�ximo
					if(monto>cuenta.getSaldoMax()) {
						System.out.println("El monto excede el saldo m�ximo permitido en la cuenta");
						return comprobante;
						//validaci�n donde si el saldo existente de la cuenta
						//mas el saldo a depositar rebasan el saldo maximo de la cuenta
					}else if((cuenta.getSaldo()+monto) > cuenta.getSaldoMax()) {
						System.out.println("El saldo de la cuenta excder� el m�ximo permitido");
						return comprobante;
						//Si la operacion nop cae en alguna validacion anterior, entonces realizamos el deporito
					}else {
						//Actualizamos el saldo de la cuenta
						cuenta.setSaldo(cuenta.getSaldo()+monto);
						//Y entonces ahora si generamos un ticket a devolver
						comprobante = new Ticket(folio++,new Date(), cuenta.getNombre(), cuenta.getSaldo(),sucursal, 2001 );
						return comprobante;
					}
				}else {//Si no existe la cuenta, mandamos el siguinete mensaje
					System.out.println("No hay una cuenta asociada a ese cliente");
					return comprobante;
				}
	}

	@Override
	public Ticket retirar(int numCuenta, double monto) {
		Ticket comprobante = null;
		if(buscarCuenta(numCuenta)!=null) {
			Cuenta cuenta = buscarCuenta(numCuenta);
			//Validaciones
			//Primero validamos si el cajero permite el monto a retirar
			if(monto>9000) {
				System.out.println("Solo puedes retirar un m�ximo de 9000");
				return comprobante;
				//Validamos si el retiro que queremos realizar excede el saldo de la cuenta
			}else if(cuenta.getSaldo()<monto) {
				System.out.println("No hay fondos suficientes para realizar esta operaci�n");
				return comprobante;
				//Validamos si el saldo de la cuenta menos el monto a retirar dejan por debajo del
				// saldo minimo permitido a la cuenta
			}else if(cuenta.getSaldo()-monto< cuenta.getSaldoMin()) {
				System.out.println("El retiro deja por debajo del saldo minimo a la cuenta");
				return comprobante;
				// Si el retiro puede realizarse
			}else {
				cuenta.setSaldo(cuenta.getSaldo()-monto);
				comprobante = new Ticket(folio++,new Date(), cuenta.getNombre(), cuenta.getSaldo(),sucursal, 2001 );
				return comprobante;

				}
			}else {
				System.out.println("No existe una cuenta asociada");
				return comprobante;
		}
		
	}

	@Override
	public Ticket transferir(int origen, int destino, double monto) {
		// TODO Auto-generated method stub
		Ticket comprobante = null;
		
		//Ahora tenemos que localizar 2 cuentas
		if(buscarCuenta(origen)!=null && buscarCuenta(destino)!=null) {
			Cuenta clienteOrigen = buscarCuenta(origen);
			Cuenta clienteDestino = buscarCuenta(destino);
			//Validaciones
			if(clienteOrigen.getSaldo()<monto) {
				System.out.println("No hay fondos suficientes para realizar la transferencia");
				return comprobante;
			}
		}else {
			System.out.println("No existe una cuenta asociada a alguno de los clientes");
			return comprobante;
		}
	}

	
	
	
}
