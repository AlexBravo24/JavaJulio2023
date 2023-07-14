package com;

import java.util.Date;
import java.util.HashMap;

public class Maquina implements IMetodos{

	private int  id =1;
	
	private HashMap<String,Producto> baseDatos;
	
	
	public Maquina() {
		
	}


	public Maquina(int  id, HashMap<String, Producto> baseDatos) {
		super();
		this.id = id;
		this.baseDatos = baseDatos;
	}


	@Override
	public Producto seleccionarProducto(String nombre) {
		Producto producto = null;
		
		producto = baseDatos.get(nombre);
		
		return producto;
	}



	@Override
	public Ticket comprar(String nombre,  double ingresado) {
		
		Ticket comprobante = null;
		
		if(seleccionarProducto(nombre)!=null) {
			Producto producto = seleccionarProducto(nombre) ;
			
			if(producto.getPrecio()>ingresado ) {
				System.out.println("cantidad insuficiente");
				return comprobante;
			}else if(producto.getPrecio()<1) {
					System.out.println("No admite cantidades negativas");
					return comprobante;
			}else {
			
				System.out.println("Gracias por su compra\n");
				//comprobante.setCambio(ingresado-producto.getPrecio());
				producto.setExistencia(producto.getExistencia()-1);
				comprobante = new Ticket(id++,new Date(),ingresado,(ingresado-producto.getPrecio()));
				
				return comprobante;
				
			}
		}else {
			System.out.println("no existe producto");
		return comprobante;
		}
	}
	
	
}
