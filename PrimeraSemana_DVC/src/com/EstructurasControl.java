package com;

public class EstructurasControl {

	public static void main(String[] args) {
		
		//ESTRUCTURAS CONTROL
		//ESTRUCTURAS DE DECISIÖN IFF -  Valores Booleanos
		
//		int x = 1;
		
//		if (x<10) {
//		    System.out.println("Es menor");
//		}else {
//			System.out.println("Es mayor");
//		}
		
		//Condiciones compuestas con operadores logicos
		//AND; OR; NOT; DIFERENTE DE e IGUALDAD
		
		//AND - && - Te devuelve el valor true cuando se 
		//cumplen todas las condicones
		
//		int x = 10;
//		
//		if(x>9 && x> 11) {
//			System.out.println("Si");
//		}else {
//			System.out.println("No");
//		}
//		
		
		//OR - || - Te va devolver true cuando se cumpla al menos una condición 
        
//		int x = 10;
//		
//		if(x>9 || x> 11) {
//			System.out.println("Si");
//		}else {
//			System.out.println("No");
//		}
		
		//Mayor que se saca con alt + 62  >
		//Menor que con Alt + 60 <
		
		//NOT - ! - Nieha una expresión / Cambia el valor de True a false
		// y viceversa
		
//		int x = 10;
//		
//		if(!(x>9) || x> 11) {
//			System.out.println("Si");
//		}else {
//			System.out.println("No");
//		}
		
		//IGUALDAD - == - comparar el valor contra algun otro, y si es igual manda TRUE
		
//	int x = 10; //Un solo igual es asignación de valoe
//		
//		if(x == 20) {
//			System.out.println("Si");
//		}else {
//			System.out.println("No");
//		}
		
		//DIFERENTE DE - != - Compara el valor si es diferente manda TRUE 
		
		
//       int x = 10; 
//		if(x != 20) {
//			System.out.println("Si");
//		}else {
//			System.out.println("No");
//		}
//		
		//ESTRUCTURA DE DECISIÖN
		//Estructura if-else concatenando o if-else anidado
		
//		int d = 1;
//		
//		if(d==1) {
//			System.out.println("LUNES");
//		}else if (d==2 ) {
//			System.out.println("MARTES");
//		}else if (d==3) {
//			System.out.println("MIERCOLES");
//		}else {
//			System.out.println("DESCONOCIDO");
//		}
		
		
		//ESTRUCTURA DE DECISIÖN - SWTICH CASE
		
		int d = 3;
		
		switch (d) {
		
		case 1:
			System.out.println("LUNES");
			break;
		case 2:
			System.out.println("MARTES");
			break;
		case 3:
			System.out.println("MIERCOLES");
			break;
		default:
			System.out.println("DESCONOCIDO");
			break;
		}
		
	}

}
