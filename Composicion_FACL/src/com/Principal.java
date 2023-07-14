package com;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Modelo rline = new Modelo("R line", true, true, "Audio Bose");
		
		Motor v8 = new Motor(false, false, 8);
		
		Neumatico llantas = new Neumatico("Bridgestone", "Negro", 18, "Pista");
		
		Auto golf = new Auto("VW", rline, v8, llantas, "Manual");
		
		System.out.println(golf);

	}

}
