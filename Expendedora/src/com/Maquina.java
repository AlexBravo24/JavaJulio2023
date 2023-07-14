package com;

import java.util.Date;
import java.util.HashMap;

public class Maquina implements IMetodos{
	
	private String ubicacion;
	private int folio = 1;
	
	private HashMap<Integer, Panel> baseDatos;
	
    public Maquina() {
		 
	 }
    
    

	public Maquina(String ubicacion, HashMap<Integer, Panel> baseDatos) {
		super();
		this.ubicacion = ubicacion;
		this.baseDatos = baseDatos;
	}



	@Override
	public Panel buscarProducto(int idProd) {
		Panel productos = null;
		productos = baseDatos.get(idProd);
		return productos;
	}





	
	@Override
	public Ticket comprar(int idProd, int dinero, int cantidad) {
           Ticket comprobante = null;
		
		if (buscarProducto(idProd)!= null) {
			Panel productos = buscarProducto(idProd);
			
			if (productos.getCantpro() < cantidad) {
				System.out.println("No hay la cantidad solicitada ");
				return comprobante;	
			}else if (dinero < (productos.getPrecio()*cantidad)) {
				System.out.println("No es la cantidad correcta ");
				return comprobante;
			}else {
				productos.setCantpro(productos.getCantpro()- cantidad);
				comprobante = new Ticket(folio++,  new Date(), productos.getMarca(), dinero-( productos.getPrecio()*cantidad), 
						ubicacion, 1001);
				return comprobante;
		}
		}else {
			
			System.out.println("No existe el producto seleccionado");
			return comprobante;
		}
		
	}



	

}
