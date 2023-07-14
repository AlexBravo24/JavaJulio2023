package com;

import java.util.HashMap;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap <String, Producto> baseDatos = new HashMap<String,Producto>();
		
		Producto coca = new Producto( 18, 3);		
		
		baseDatos.put("cocacola",coca);
		
		Maquina ma = new Maquina(1003, baseDatos);
		
		//System.out.println(ma.seleccionarProducto("coca"));
		System.out.println(ma.comprar("cocacola", 20));
		System.out.println(ma.comprar("coca", 4));


	}

}
