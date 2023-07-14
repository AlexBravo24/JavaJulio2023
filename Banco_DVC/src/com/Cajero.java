package com;

import java.util.Date;
import java.util.HashMap;

public class Cajero implements IMetodos{
	//Clase que implementa las acciones o lógica
	
	private String sucursal;
	private int folio = 1;
	//El cajero accederá a un HashMap que será una pequeña
	//"base de datos"
	private HashMap<Integer, Cuenta> baseDatos;
	
	public Cajero () {
		
	}

    

	public Cajero(String sucursal, HashMap<Integer, Cuenta> baseDatos) {
		super();
		this.sucursal = sucursal;
		this.baseDatos = baseDatos;
	}



	@Override
	public Cuenta buscarCuenta(int numCuenta) {
		//Instanciamos un objeto cuenta en nulo, porque en caso de que no
		//encuentre una cuenta, entonces el metodo regresará el valor
		// de esa cuenta
		Cuenta cuenta = null;
		//Buscamos la cuenta, si existe en el objeto instanciado como "cuenta"
		//y procedemos a devolver ese valor
		cuenta = baseDatos.get(numCuenta);
		//Si la cuenta no existe, se devulve un valor nulo, si existe
		//se devuelve la cuenta que se encontró
		return cuenta;
	}

	@Override
	public Ticket depositar(int numCuenta, double monto) {
		// Instanciamos un ticket inicalmente vacio
		//Si la operación no se realiza, no se emite un ticket
		Ticket comprobante = null;
		
		//Procedemos a buscar primero la cuenta para realizar la operación
		if (buscarCuenta(numCuenta) != null) {
			//si hay datos los guardamos en un objeto cuenta
			//para poder manipular dichos datos
			Cuenta cuenta = buscarCuenta(numCuenta);
			//Una vez localizamos la cuenta, realizamos validaciones
			//como en un cajero
			//validación si el monto a depositar es mayor el saldo max
			if (monto>cuenta.getSalmax()) {
				System.out.println("El monto excede el Saldo Maximo Permitido en la cuenta");
				return comprobante;
				//Validación donde si el saldo existen más el saldo a depositar
				//rebasa el saldo maximo
			}else if (cuenta.getSaldo()+monto>cuenta.getSalmax()) {
				System.out.println("El saldo de la cuenta excederia el salario maximo permitido ");
				return comprobante;
				//si la operación no cae en alguna validación anterior, entonces
				//realizamos el deposito
			}else {
				//Actualizamos el saldo de la cuenta
				cuenta.setSaldo(cuenta.getSaldo()+ monto);
				//Ahora Y entonces ahora si generamos un ticket a devovler
				comprobante = new Ticket(folio++, new Date(), cuenta.getNombre(),
						cuenta.getSaldo(), sucursal, 2001);
				return comprobante;
			}
		}else {//Si no existe una cuenta mandamos el siguiente mensaje
			System.out.println("No hay una cuenta asociada a ese cliente");
			return comprobante;
		}
		
	}

	@Override
	public Ticket retirar(int numCuenta, double monto) {
		Ticket comprobante = null;
		
		if (buscarCuenta(numCuenta) != null) {
			Cuenta cuenta = buscarCuenta(numCuenta);
			//Validamos primero si el monto a retirar lo permite el cajero
			//de acuerdo al valor que el asigne
			if (monto>9000) {
				System.out.println("Solo puedes retirar un maximo de $9000");
				return comprobante;
				//Validamos si el retiro que queremos realizar, pues excede
				//el saldo de la cuenta
			}else if(cuenta.getSaldo()<monto) {
				System.out.println("No hay fondos suficientes para realizar el retiro");
				return comprobante;
				//Validamos si el saldo de la cuenta menos el monto a retirar
				//dejan por debajo del saldo min permitido mandamos un mensaje
				
			}else if (cuenta.getSaldo()-monto<cuenta.getSalmin()) {
				System.out.println("El retiro deja a la cuenta por debajo del saldo minimo permitido");
				return comprobante;
			//Validamos si el retiro puede realizarse
			}else {
				cuenta.setSaldo(cuenta.getSaldo()-monto);
				comprobante = new Ticket(folio++, new Date(), cuenta.getNombre(),
						cuenta.getSaldo(), sucursal, 2001);
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
			//Procesdemos a validar 
			if (clienteOrigen.getSaldo()<monto) {
				System.out.println("No hay fondos suficientes para realzair la transferencia");
				return comprobante;
			}else if (clienteOrigen.getSaldo()-monto < clienteOrigen.getSalmin()) {
				System.out.println("La transferencia deja por debajo del salo minimo permitido");
				return comprobante;
			}else if (monto>clienteDestino.getSalmax()) {
				System.out.println("La tranferencia supera el Saldo Maximo permitido en la cuenta destino");
			    return comprobante;
			}else if (clienteDestino.getSaldo()+ monto > clienteDestino.getSalmax()) {
				System.out.println("El saldo de la cuenta destino excede el maximo permitido");
			    return comprobante;
			}else {
				clienteOrigen.setSaldo(clienteOrigen.getSaldo()- monto);
				clienteDestino.setSaldo(clienteDestino.getSaldo()+ monto);
				comprobante = new Ticket(folio++, new Date(), clienteOrigen.getNombre(), clienteOrigen.getSaldo(),sucursal, 2001);
						
				return comprobante;
			}
			
		}else {
			System.out.println("No hay un cuenta asociado a alguno de los cliente");
			return comprobante;
		}

	}
	
	

}
