package com.ciclos;

public class Ciclos7_FACL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double PI,IT,SI;
		int II=700,j=0;//II=Inversion inicia, IT= inversion al finalizar el año,PI=POrcentaje de interes

		PI=(0.02);
		SI=PI*II;
		IT=II;
		while(IT<1500) {
			SI=IT*PI;
			IT+=SI;
			j++;

			}
		System.out.println("Usted necesita: "+j+" meses para obtener los 1500");
	}
}
