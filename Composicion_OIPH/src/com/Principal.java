package com;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Neumatico neumatico = new Neumatico("Goodyear", "N-125", 2.56);
		Motor motor = new Motor("Ga500", 2.0, "Gasolina");
		Modelo modelo = new Modelo("Jetta", 2017, "rojo");
		
		Auto jetta = new Auto("VW", modelo, motor, neumatico);
		
		System.out.println(jetta);
	}

}
