package com;

import java.util.Date;
import java.util.HashMap;

public class Cajero implements IMetodos{
	
	// Clase que implementa las acciones o logica
	
	private String sucursal;
	private int folio=1;
	
	// El cajero accedera a un hashmap que sera una pequeña base de datos 
	private HashMap<Integer, Cuenta> baseDatos;
	
	public Cajero () {}

	

	public Cajero(String sucursal, HashMap<Integer, Cuenta> baseDatos) {
		super();
		this.sucursal = sucursal;
		this.baseDatos = baseDatos;
	}



	@Override
	public Cuenta buscarCuenta(int numCuenta) {
		
		// instanciamos un objeto cuenta en nullo por que en caso de que no se encuentre una cuenta 
		// entonces el metodo regresara el valor de esa cuenta
		Cuenta cuenta = null;
		
		//Buscamos la cuenta, si esxiste se guarda en el objeto instanciado como "cuenta"
		//y procedemos a devolver ese valor
		cuenta = baseDatos.get(numCuenta);
		
		// Si la cuenta no existe, se devuelve un valor nulo, si existe, se devulve la cuenta
		// que se encontro
		return cuenta;
	}

	@Override
	public Ticket depositar(int numCuenta, double monto) {

		// Instanciamos inicialmente un ticket vacio
		// Si la operacion no se realiza , no se emite un ticket
		
		Ticket comprobante = null;
		
		// procedemos a buscra primero a buscar la cuenta para realizar la operacion
		
		if (buscarCuenta(numCuenta) !=null) {
			
			// si hay datos los guardamos en un objeto cuenta para poder manipular dichos datos
			Cuenta cuenta = buscarCuenta(numCuenta);
			
			// Una vez que localizamos la cuenta realizamos validaciones como un cajero
			// Validacion si el monto a depositar es mayor que el saldo maximo
			if (monto>cuenta.getSaldoMax()) {
				System.out.println("El monto Excede el saldo maximo permitido en la cuenta");
				return comprobante;
				
				// Validacion donde si el saldo existente de la cuenta mas el saldo a depositar, rebasan el saldo maximo
				// de la cuenta
				
			} else if ( cuenta.getSaldo() + monto > cuenta.getSaldoMax()) {
				System.out.println("El saldo de la cuenta excediria el maximo permitido");
				return comprobante;
				// si la operacion no cae en alguna validacion anterior entonces realizamos el deposito
			} else {
				// acrtualizamos el saldo de la cuenta
				cuenta.setSaldo(cuenta.getSaldo()+ monto);
				// y entonces ahora si generamos un ticket a devolver
				comprobante = new Ticket(folio++, new Date(), cuenta.getNombre(), cuenta.getSaldo(), sucursal, 2001);
				return comprobante;
			}
			
			
		} else { // si no existe la cuenta mandamos el siguiente mensaje 
			System.out.println("No hay una cuenta asociada a ese cliente");
		}
		
		
		return null;
	}

	@Override
	public Ticket retirar(int numCuenta, double monto) {
		// 
		Ticket comprobante = null;
		
		if (buscarCuenta(numCuenta) !=null) {
			Cuenta cuenta = buscarCuenta(numCuenta);
			
			// Validamos primero si el monto a retirar lo permite le cajero de acuerdo al valor que le asigne
			if (monto>9000) {
				System.out.println("Solo puedes retirar un maximo de $9,000");
				return comprobante;
				
				// validamos si el retiro que queremos relaizar, excede el saldo de la vuenta
			} else if (cuenta.getSaldo()< monto) {
				System.out.println("No hay fondos suficientes para realizar el retiro");
				return comprobante;
				
				// Validamos si el saldo de la cuenta , menos el monto a retirar dejan por debajo del saldo minimo permitido
				// a la cuenta
			} else if (cuenta.getSaldo() - monto < cuenta.getSaldoMin()) {
				System.out.println("El retiro esta por debajo del minimo a la cuenta");
				return comprobante;
				
				//Si el retiro pude realizarse
			} else {
				cuenta.setSaldo(cuenta.getSaldo() - monto);
				comprobante = new Ticket(folio++, new Date(), cuenta.getNombre(), cuenta.getSaldo(), sucursal, 2001);
				return comprobante;
			}
		} else {
			System.out.println("No hay una cuenta asociada o no existe");
			return comprobante;
		}
	}

	@Override
	public Ticket transferir(int origen, int destino, double monto) {
		// TODO Auto-generated method stub
		
		Ticket comprobante = null;
		
		//Ahora tenemos que buscar 2 cuentas
		
		if (buscarCuenta(origen) !=null && buscarCuenta(destino) !=null) {
			Cuenta clienteOrigen = buscarCuenta(origen);
			Cuenta clienteDestino = buscarCuenta(destino);
			
			//procededmos a validar
			if (clienteOrigen.getSaldo()< monto) {
				System.out.println("No hay fondos sufiecientes para realizar la transferencia");
				return comprobante;
								
			} else if (clienteOrigen.getSaldo()-monto < clienteOrigen.getSaldoMin()) {
				System.out.println("La transferencia dejaria por debajo del minimo de la cuenta");
				return comprobante;
			} else if (monto> clienteDestino.getSaldoMax()) {
				System.out.println("El monto a tranferir excede el maximo permitido"
						+ " en la cuenta destino");
				return comprobante;
			} else if (clienteDestino.getSaldo()+monto>clienteDestino.getSaldoMax()) {
				System.out.println("El saldo de la cuenta destino excediria su maximo permitido");
				return comprobante;
			} else {
				clienteOrigen.setSaldo(clienteOrigen.getSaldo()-monto);
				clienteDestino.setSaldo(clienteDestino.getSaldo()+ monto);
				comprobante = new Ticket(folio++, new Date(), clienteOrigen.getNombre(), clienteOrigen.getSaldo(), sucursal, 2001);
				return comprobante;
			}
			
			
		}else {
			System.out.println("No hay una cuenta a alguno de los clientes");
			return comprobante;
		}
		
	}

	
	

} // Cierre class
