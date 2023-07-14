package com;

import java.util.Date;
import java.util.HashMap;

public class Expendedora implements IMetodos {
	
	private int dni;
	
	private HashMap<Integer, Producto> baseDatos;
	
	public Expendedora () {
		
	}

	public Expendedora(int dni, HashMap<Integer, Producto> baseDatos) {
		super();
		this.dni = dni;
		this.baseDatos = baseDatos;
	}

	@Override
	public Producto buscarProducto(int id) {
		Producto objeto = null;
		objeto=baseDatos.get(id);
		return objeto;
	}

	@Override
	public Impresora agregarProducto(int id, int cantidad) {
		Impresora ticket = null;
		if (buscarProducto(id)!=null) {
			Producto objeto = buscarProducto(id);
			if(cantidad>20) {
				System.out.println("No podemos agregar esa cantidad en este producto");
				return ticket;			
			}
			else if((ticket.getCantidad()+cantidad)>10) {
				System.out.println("No podemos agregar esta canditad en este producto");
				return ticket;
			}else {
				objeto.setCnatidad(objeto.getCnatidad()+cantidad);
				ticket =new Impresora(1002, new Date(), objeto.getNombre(), objeto.getCnatidad(), objeto.getPrecio());
				return ticket;
			}
		}
		else {
			System.out.println("No hay un producto con ese nombre");
			return ticket;
		}
	}

	@Override
	public Impresora comprarProducto(int id, int pesos) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Impresora depositar(int pesos) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Impresora retirar(int pesos) {
		// TODO Auto-generated method stub
		return null;
	}


	
	

}
