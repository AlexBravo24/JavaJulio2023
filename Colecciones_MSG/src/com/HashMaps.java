package com;

import java.util.HashMap;

public class HashMaps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap <Integer, String> Inventarios2 = new HashMap<>();
		Inventarios2.put(6, "Vaso Refresco Chico");
		Inventarios2.put(7, "Vaso Refresco MEdiano");
		Inventarios2.put(8, "Vaso Refresco Grande");
		Inventarios2.put(9, "Vaso Refresco Jumbo");
		Inventarios2.put(10, "Vaso Refresco Extra");
		
		for (int i=0; i<Inventarios2.size(); i++) {
			System.out.println("Producto: " + Inventarios2);
		}
		
	}

}
