package com;

import java.util.ArrayList;
import java.util.List;

public class Listas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Inventarios> lista = new ArrayList<Inventarios>();
		lista.add(new Inventarios(01, "Maiz Palomitas", 20));
		lista.add(new Inventarios(02, "Sal con Mantequilla", 5));
		lista.add(new Inventarios(03, "Canasta Grande Palomitas", 100));
		lista.add(new Inventarios(04, "Canasta Jumbo Palomitas", 200));
		lista.add(new Inventarios(05, "Aceite Palomitas", 20));
		
		for (int i=0; i<lista.size(); i++) {
			System.out.println("Producto: " + lista.get(i));
		}
		
		
		
		

	} // Cierre main

	

} // cierre class