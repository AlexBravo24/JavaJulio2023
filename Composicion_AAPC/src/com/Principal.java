package com;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Memoria capacidad = new Memoria("Samsung", 128 , 66);
		Ram memoriaram= new Ram("corsair",6 , 2133);
		Camara pixel=new Camara("sony", 16, 3);
		
		
		Celular cel = new Celular("Sony","Negro","Xperia 10", capacidad, memoriaram, pixel)	;
		System.out.println(cel);
		
		
		
		
	}

}
