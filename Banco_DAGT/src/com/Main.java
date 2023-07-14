package com;

import java.util.HashMap;

public class Main {

	public static void main(String[] args) {

		HashMap <Integer,Cuenta> bd = new HashMap<>();
		Cuenta diego = new Cuenta("Diego Guajardo", 10000, "1234", "Debito", 100, 20000);
		
		bd.put(1, diego);	
		bd.put(2, new Cuenta("Pedro Landeros", 20, "1234", "Debito", 200, 20000));
		bd.put(3, new Cuenta("Benito Camelo", 1023, "1234", "Debito", 200, 20000));
		bd.put(4, new Cuenta("Andrea Ledesma", 10000, "1234", "Debito", 200, 20000));
		bd.put(5, new Cuenta("Miranda Landeros", 20000, "1234", "Debito", 200, 20000));
		bd.put(6, new Cuenta("Juan Manuel Hernandez", 100000, "1234", "Debito", 200, 20000));
		
		
		Cajero cajero = new Cajero("Zacatecas", bd, 492111);
		
		cajero.init();
		
	}

}
