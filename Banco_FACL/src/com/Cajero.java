package com;

import java.util.Date;
import java.util.HashMap;

public class Cajero implements IMetodos {
	
	//Clase que implementa las acciones o lógica
	
	private String sucursal;
	private int folio=1;
	
	//El cajero accederá a un HashMap que simulará ser
	//una pequeña base de datos.
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
		Cuenta cuenta =null;
		//Si existe el valor de la cuenta se guarda el objeto instanciado
		//Como cuenta y procedemos a devolver ese valor
		cuenta = baseDatos.get(numCuenta);
		
		
		//Si no existe devuelve un valor nulo
		return cuenta;
	}

	@Override
	public Ticket depositar(int numCuenta, double monto) {
		//Instanciamos un ticket inicialmente vacío
		Ticket comprobante = null;
		//procedemos a buscar la cuenta para realizar la operación
		if (buscarCuenta(numCuenta)!=null) {
			//Si hay datos los guardamos en un objeto
			//tipo cuenta para poder manipular los datos
			Cuenta cuenta = buscarCuenta(numCuenta);
				//Una vez localizada la cuenta realizamos validaciones
				//Validacion si el monto a depositar es mayor que el saldo máximo
				if (monto>cuenta.getSaldoMax()) {
					System.out.println("El monto excede el saldo máximo permitido");
				return comprobante;
				//Validacion para ver si el monto a depositar mas el
				//saldo inicial sobrepasa el saldo maximo
				}else if((cuenta.getSaldo()+monto)>cuenta.getSaldoMax()) {
					System.out.println("El saldo de la cuienta excedería el saldo permitido");
					return comprobante;
				}
			//Si la operación no cae en un if anterior realizamos el deposito
				else {
					cuenta.setSaldo(cuenta.getSaldo()+monto);
					//Al final generamos el ticket a devolver
					comprobante = new Ticket(folio++, new Date(), cuenta.getUsuario(), cuenta.getSaldo(), sucursal, 2001);
					return comprobante;
				}

				
		}
		else {
			System.out.println("No hay cuenta asociada a ese cliente");
			return comprobante;
			
		}

	}

	@Override
	public Ticket retirar(int numCuenta, double monto) {
		Ticket comprobante = null;
		
		//buscamos la cuenta de dónde se hará el retiro
		
		if(buscarCuenta(numCuenta)!=null) {
			Cuenta cuenta = buscarCuenta(numCuenta);
			if(monto>9000) {
				System.out.println("Solo puedes retirar un máximo de 9000");
				return comprobante;
				
			}else if(cuenta.getSaldo()<monto) {
				System.out.println("No hay saldo suficiente");
				return comprobante;
				//Validamos si el saldo de la cuenta menos el monto a retirar queda
				//por del saldo minimo permitido
			} else if((cuenta.getSaldo()-monto)<cuenta.getSaldoMin()) {
				System.out.println("La cuenta queda debajo del saldo minimo");
				return comprobante;
			}else {
				System.out.println("Realizando el retiro...");
				System.out.println();
				cuenta.setSaldo(cuenta.getSaldo()-monto);
				comprobante = new Ticket(folio++, new Date(), cuenta.getUsuario(), cuenta.getSaldo(), sucursal, 2001);
				return comprobante;
			}
			
			
			
			
		}else {
			System.out.println("No se encuentra cuenta ligada a este usuario");
			return comprobante;
		}
		
	}

	@Override
	public Ticket transferir(int origen, int destino, double monto) {
		Ticket comprobante = null;
		
		//buscamos la cuenta de dónde se hará el retiro
		
		if(buscarCuenta(origen)!=null && buscarCuenta(destino)!=null) {
			Cuenta clienteOrigen = buscarCuenta(origen);
			Cuenta clienteDestino=buscarCuenta(destino);
			if(clienteOrigen.getSaldo()<monto) {
				System.out.println("La cuenta origen no tiene saldo suficiente");
				return comprobante;
			}else if((clienteOrigen.getSaldo()-monto)<clienteOrigen.getSaldoMin()) {
				System.out.println("El saldo origen quedaría por debajo del minimo");
				return comprobante;
				
			}else if((+monto)>clienteDestino.getSaldoMax()){
				System.out.println("La cuenta destino excede el saldo maximo");
				return comprobante;
			}
			else if((clienteDestino.getSaldo()+monto)>clienteDestino.getSaldoMax()){
				System.out.println("La cuenta destino excedería el monto máximo");
				return comprobante;
			}else {
				clienteOrigen.setSaldo(clienteOrigen.getSaldo()-monto);
				clienteDestino.setSaldo(clienteDestino.getSaldo()+monto);
				comprobante = new Ticket(folio++, new Date(), clienteOrigen.getUsuario(), clienteOrigen.getSaldo(), sucursal, 2001);
				return comprobante;
			}
			
			
	}
		else {
			System.out.println("No hay cuenta asociada a este id");
			return comprobante;
		}
		
	
	}
}
