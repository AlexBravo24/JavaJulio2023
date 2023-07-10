package com.ciclos;

public class Ciclos6_FACL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double PI,IT,SI;
		int II=1000;//II=Inversion inicia, IT= inversion al finalizar el año,PI=POrcentaje de interes

		PI=(0.02);
		SI=PI*II;
		IT=II;
		for(int i=1;i<=12;i++) {
			SI=IT*PI;
			IT+=SI;
			System.out.println("Usted en el mes "+i+" tendrá: "+IT);
		}
		
	}

}
