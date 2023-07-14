package com;

public class Principal {

	public static void main(String[] args) {
		
		//Actividad. Un objeto que se componga de otros 3. Como el ejemplo de la computadora 
		
		Motor motor = new Motor("Audi", 2.0, 2022);
		Llanta llanta = new Llanta("Michelin", 18, "225 / 40");
		Audio eqaudio = new Audio("Bose", "Surround", 12);
		
		Auto audi = new Auto("Audi", "2023", "Blanco", motor, llanta, eqaudio);
		System.out.println(audi);
		
		

	}

}
