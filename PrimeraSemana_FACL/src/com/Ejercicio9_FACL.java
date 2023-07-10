package com;

import java.util.Scanner;

public class Ejercicio9_FACL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int D;
		String Dia;
		
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Inserte el numero obtenido en el dado");
		
		D = entrada.nextInt();
		if(D>0 && D<=7) {
			
		switch (D) {
		
		case 1:
			Dia="Lunes";
			System.out.println("ES: "+Dia);
			break;
		case 2:
			Dia="Martes";
			System.out.println("ES: "+Dia);
			break;
		case 3:
			Dia="Miercoles";
			System.out.println("ES: "+Dia);
			break;
		case 4:
			Dia="Jueves";
			System.out.println("ES: "+Dia);
			break;
		case 5:
			Dia="Viernes";
			System.out.println("ES: "+Dia);
			break;
		case 6:
			Dia="Sabado";
			System.out.println("ES: "+Dia);
			break;
		case 7:
			Dia="Domingo";
			System.out.println("ES: "+Dia);
			break;
		}
		
		}
		else {
			System.out.println("La semana tiene 7 dias, prueba con un numero entre el 1 y el 7");
		}
	}

}
