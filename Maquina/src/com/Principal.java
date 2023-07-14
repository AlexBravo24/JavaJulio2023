package com;

import java.util.HashMap;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Producto principe = new Producto("Gamesa", "Principe", 25.8, 8);
		HashMap<Integer, Producto> venta = new HashMap<Integer, Producto>();
		
		venta.put(1001,principe);
		
		Expendedora esquina = new Expendedora(10, venta);
		
		esquina.agregarProducto(1001,4);
		
		

	}

}
