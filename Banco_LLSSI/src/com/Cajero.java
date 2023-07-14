package com;
import java.util.HashMap;
import java.util.Date;

public class Cajero implements IMetodos {
	
	//Clase que implementa las acciones o logica
	
	private String sucursal;
	private int folio = 1;
	
//	el cajero accedera a hashmap que sera una pequeña "base de datos"
//	
	
	private HashMap <Integer, Cuenta> baseDatos;
	
	public Cajero () {
		
	}

public Cajero(String sucursal, HashMap<Integer, Cuenta> baseDatos) {
	super();
	this.sucursal = sucursal;
	this.baseDatos = baseDatos;
}

@Override
public Cuenta buscarCuenta(int numCuenta) {
	Cuenta cuenta = null;
	
	cuenta = baseDatos.get(numCuenta);
	
	return cuenta;
}

@Override
public Ticket depositar(int numCuenta, double monto) {
	// TODO Auto-generated method stub
	
	Ticket comprobante = null;
	
	//PROCEDEMOS A BUSCAR PRIMERO LA CUENTA PARA REALIZAR LA OPERACION
	
	if(buscarCuenta(numCuenta) !=null) {
		/*Si hay cdatos los guardamos en un objeto cuenta para poder manipular dichas datos
		 * 
		 * 
		 */
		Cuenta cuenta = buscarCuenta(numCuenta);
		/*Una vez localizamos la cuenta realizamos validaciones 
		 * 
		 */
		
		if (monto>cuenta.getSaldoMax()) {
			System.out.println("El monto excede el saldo maximo permitido en la cuenta");
			return comprobante;
		
		}else if(cuenta.getSaldo()+monto>cuenta.getSaldoMax()) {
			System.out.println("El monto excederia el saldo maximo permitido en la cuenta");
			return comprobante;
			//SIla operacion no cae en alguna validacion
			//REALIZAMOS EL DEPOSITO
			
		}else { 
			cuenta.setSaldo(cuenta.getSaldo()+monto);
			//GENERAMOS UN TICKET
			comprobante = new Ticket (folio++, new Date(),
					cuenta.getNombre(), cuenta.getSaldo(), sucursal, 2001);
			return comprobante;
			
		}
			
		}else {//SI NO EXISTE LA CUENTA 
			System.out.println("NO HAY UNA CUENTA ASOCIADA");
			return comprobante;
		
	}
	
}

@Override
public Ticket retirar(int numCuenta, double monto) {
	// TODO Auto-generated method stub
	Ticket comprobante = null;
	
	if(buscarCuenta(numCuenta) !=null) {
		Cuenta cuenta = buscarCuenta(numCuenta);
		//VALIDAMOS PRIMERO SI EL MONTO A RETIRAR LO PERMITE DE ACUERDO AL VALOR DE ASIGNA
		
		if(monto>9000) {
			System.out.println("SOLO PUEDES RETIRAR MAXIMO 9000");
			return comprobante;
			//VALIDAMOS SI EL RETIRO QUE QUEREMOS REALIZAR PUES 
		}else if(cuenta.getSaldo()<monto){
			System.out.println(" No hay fondos suficientes para realizar el retiro");
			return comprobante;
		
		}else if(cuenta.getSaldo()-monto>cuenta.getSaldoMax()) {
			System.out.println("El retiro dejaria por debajo del minimo de la cuenta ");
			return comprobante;	
		}else { 
			
			cuenta.setSaldo(cuenta.getSaldo()-monto);
			//GENERAMOS UN TICKET
			comprobante = new Ticket (folio++, new Date(),
					cuenta.getNombre(), cuenta.getSaldo(), sucursal, 2001);
			return comprobante;
		}
		}else {
			System.out.println("NO HAY UNA CUENTA ASOCIADA");
			return comprobante;
			
			
			
		}
	
	
	
	
}

@Override
public Ticket transferir(int origen, int destino, double monto) {
	// TODO Auto-generated method stub
	Ticket comprobante = null;
	
	if(buscarCuenta(origen)!=null && buscarCuenta(destino)!=null) {
		Cuenta clienteOrigen = buscarCuenta(origen);
		Cuenta clienteDestino = buscarCuenta(destino);
		if (clienteOrigen.getSaldo()<monto) {
			System.out.println("NO HAY fondos suficientes para realizar la transferencia");
			return comprobante;
		}else if(clienteOrigen.getSaldo()-monto<clienteOrigen.getSaldoMin()){
			System.out.println("LA TRANSFERENCIA DEJARIA POR DEBAJO DEL MINIMO A LA CUENTA");
			return comprobante;
		}else if(monto >clienteDestino.getSaldoMax()) {
			System.out.println("EL MONTO A TRANSFERIR EXCEDE EL MAXIMO PERMITIDO" +"EN LA CUENTA DE DESTINO");
			return comprobante;
		}else if(clienteDestino.getSaldo()+monto>clienteDestino.getSaldoMax()) {
			System.out.println("EL SALDO DE LA CUENTA DESTINO EXCEDE EL MAXIMO PERMITIDO");
			return comprobante;
			
		}else {
			clienteOrigen.setSaldo(clienteOrigen.getSaldo()-monto);
			clienteDestino.setSaldo(clienteDestino.getSaldo()+monto);
			comprobante = new Ticket (folio++, new Date(),clienteOrigen.getNombre(),clienteOrigen.getSaldo(),sucursal, 2001) ;
            return comprobante;
		}
		
	}else {
		System.out.println("NO HAY UNA CUENTA ASOCIADA");
		return comprobante;
	}
		
	
}

	
	
	

}
