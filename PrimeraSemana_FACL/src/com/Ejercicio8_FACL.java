package com;

import java.util.Scanner;

public class Ejercicio8_FACL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int NC;
		String NombreDeCara;
		
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Inserte el numero obtenido en el dado");
		
		NC = entrada.nextInt();
		if(NC>1 && NC<6) {
		switch (NC) {
		
		case 1:
			NombreDeCara="Seis";
			System.out.println("la cara contraria es: "+NombreDeCara);
			break;
		case 2:
			NombreDeCara="Cinco";
			System.out.println("la cara contraria es: "+NombreDeCara);
			break;
		case 3:
			NombreDeCara="Cuatro";
			System.out.println("la cara contraria es: "+NombreDeCara);
			break;
		case 4:
			NombreDeCara="Tres";
			System.out.println("la cara contraria es: "+NombreDeCara);
			break;
		case 5:
			NombreDeCara="Dos";
			System.out.println("la cara contraria es: "+NombreDeCara);
			break;
		case 6:
			NombreDeCara="Uno";
			System.out.println("la cara contraria es: "+NombreDeCara);
			break;
		}
		
		}
		else {
			System.out.println("El numero es erroneo, debe estar entre el 1 y el 6");
		}
	}

}
