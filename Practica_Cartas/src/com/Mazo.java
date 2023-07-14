package com;

import java.util.Arrays;

public class Mazo extends Carta{
	private String [] palosDisponibles = {"Picas", "Diamantes","Treboles","Corazones"};
	private Carta [] mazo = new Carta [52];


	
	public Mazo() {		
		int index = 0;
		for(String palo:palosDisponibles){
			for (int j = 1; j<=13;j++) {
				mazo[index]= new Carta(j,palo);
				index ++;
			}
			 
		}
		
	}



	@Override
	public String toString() {
		return "Mazo [palosDisponibles=" + Arrays.toString(palosDisponibles) + ", mazo=" + Arrays.toString(mazo)
				+ ", toString()=" + super.toString() + "]";
	}




		
}
