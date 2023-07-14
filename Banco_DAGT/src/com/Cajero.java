package com;

import java.util.Date;
//import java.lang.Thread;
import java.util.HashMap;
import java.util.Scanner;

public class Cajero implements IMetodos{

	//Clase que implementa las acciones o la logica
	
	private String sucursal;
	private int folio =1;
	private int idCajero;
	private HashMap<Integer,Cuenta> bd;
	Scanner scanner = new Scanner (System.in);
	
	public Cajero() {}

	public Cajero(String sucursal, HashMap<Integer, Cuenta> bd, int idCajero) {
		super();
		this.sucursal = sucursal;
		this.bd = bd;
		this.idCajero = idCajero;
	}

	@Override
	public Cuenta pedirDatos() {	
		boolean flag = false;
		int numCuenta;
		String nip;
		Cuenta cuenta;
		
		while (flag != true) {
			System.out.print("Introduce tu numero de Cuenta: ");
			numCuenta = scanner.nextInt();
			scanner.nextLine();
			System.out.print("Introduce tu numero de nip: ");
			nip = scanner.nextLine();
			if(buscarCuenta(numCuenta)) {
				if (verificarDatos(numCuenta, nip)) {
					cuenta = bd.get(numCuenta);
					flag = true;
					System.out.print("Bienvenido " + cuenta.getNombre() + " ");
					return cuenta;
				}
				
			}else {System.out.println("La cuenta no existe");}
			
			
		}
		return null;
	}

	@Override
	public boolean buscarCuenta(int numCuenta) {
		return bd.containsKey(numCuenta);		
	}

	@Override
	public boolean verificarDatos(int numCuenta, String nip) {
		Cuenta cuenta = bd.get(numCuenta);
		if (cuenta.getNip().equals(nip)) {
			return true;
		}else {System.out.println("El nip es incorrecto");}
		return false;
	}
	
	@Override
	public void operacion(Cuenta cuenta) {
		int operacion;
		System.out.println("que operacion deea realizar? \n 1)Consultar \n 2)Depositar \n 3)Retirar \n 4)Transferir \n 5)Cambiar nip \n 6)Salir");
		operacion = scanner.nextInt();
		double cantidad;
		
		switch (operacion) {
		case 1:
			consultar(cuenta);		
			break;
		case 2:
			System.out.print("Que cantidad se va a depositar? ");
			cantidad = scanner.nextDouble();
			depositar(cuenta, cantidad);
			break;
		case 3:
			System.out.print("Que cantidad se va a retirar? ");
			cantidad = scanner.nextDouble();
			retirar(cuenta, cantidad);
			break;
		case 4:
			System.out.print("Captura la cuenta destino: ");
			int cuentaDestino=  scanner.nextInt();
			System.out.print("Que cantidad se va a transferir? ");
			cantidad = scanner.nextDouble();
			transferir(cuenta,cuentaDestino,cantidad);
			break;
		case 5:
			System.out.print("Introduce el nuevo nip: ");
			scanner.nextLine();
			String nip = scanner.nextLine();
			cambiarNip(cuenta ,nip);
			break;
			
		default:
			break;
		}
	}

	@Override
	public Ticket depositar(Cuenta cuenta, double cantidad) {
		Date fecha = new Date();
		cuenta.setSaldo(cuenta.getSaldo()+ cantidad);
		Ticket ticket = new Ticket(folio++, fecha, cuenta.getNombre(), cuenta.getSaldo(), sucursal, idCajero);
		print(ticket);
		
		
		return null;
	}

	@Override
	public Ticket retirar(Cuenta cuenta, double cantidad) {
		Date fecha = new Date();
		cuenta.setSaldo(cuenta.getSaldo()- cantidad);
		Ticket ticket = new Ticket(folio++, fecha, cuenta.getNombre(), cuenta.getSaldo(), sucursal, idCajero);
		print(ticket);
		return null;
	}

	@Override
	public Ticket transferir(Cuenta cuentaOrigen, int cuenta2, double cantidad) {
		Date fecha = new Date();
		if (buscarCuenta(cuenta2)) {
			Cuenta cuentaDestino = bd.get(cuenta2);
			cuentaOrigen.setSaldo(cuentaOrigen.getSaldo()- cantidad);
			cuentaDestino.setSaldo(cuentaDestino.getSaldo()+ cantidad);
			Ticket ticket = new Ticket(folio++, fecha, cuentaOrigen.getNombre(), cuentaOrigen.getSaldo(), sucursal, idCajero);
			System.out.println(cuentaDestino.getNombre() + " recibio $" + cantidad);
			print(ticket);
			
		}else {
			System.out.println("La cuenta destino no existe"); 
			
			}
		return null;
	}

	@Override
	public Ticket consultar(Cuenta cuenta) {
		Date fecha = new Date();
		Ticket ticket = new Ticket(folio++, fecha, cuenta.getNombre(), cuenta.getSaldo(), sucursal, idCajero);
		print(ticket);
		return ticket;
	}

	@Override
	public void cambiarNip(Cuenta cuenta, String nip) {
		Date fecha = new Date();
		cuenta.setNip(nip);
		Ticket ticket = new Ticket(folio++, fecha, cuenta.getNombre(), cuenta.getSaldo(), sucursal, idCajero);
		print(ticket);
		
	}

	@Override
	public void init() {

		
		while (true) {
			Cuenta cuenta = pedirDatos();
			operacion(cuenta);
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public void print(Ticket ticket) {
		System.out.println("Operacion existosa");
		System.out.println(ticket);
	}
	
	
	
	@Override
	public String toString() {
		return "Cajero [sucursal=" + sucursal + ", folio=" + folio + ", bd=" + bd + ", scanner=" + scanner
				+ ", toString()=" + super.toString() + "]";
	}




	
	
	
	
}
