package com;

public class EstructurasControl {

	public static void main(String[] args) {
		
		//ESTRUCTURAS CONTROL
		
		//ESTRUCTURAS DE DECISION IF - VALORES BOOLEANOS
		
		int x = 11;
		
		if( x < 10 ) {
			System.out.println("Es Menor");
		} else {
			System.out.println("Es Mayor");
		}
		
		
		
		//Condiciones compuestas con operadores logicos
		//AND, OR , NOT, DIFERRENTE DE e IGUALDAD
		
		//AND - && - Te devuelve un valor true cuando se cumplan todas las condiciones
		
		int x1 = 10;
		
		if ( x1 > 9 && x1 > 11 ) {
			System.out.println("Si");
		}else {
			System.out.println("No");
		}
		
		
		//OR - || - Te devuelve true cuando se cumpla al menos una de las condiciones
		
		int x2 = 10;
		
		if ( x2 > 9 || x2 > 11 ) {
			System.out.println("Si");
		}else {
			System.out.println("No");
		}
		
		// NOT - ! - Niega una expresion/cambia el valor de TRUE a FALSE y viceversa
		
		int x3 = 10;
		
		if( !(x3>9) || x > 11 ) {
			System.out.println("Si");
		} else {
			System.out.println("No");
		}
		
		//IGUALDAD - == - Compara el valor contra alguno otro, y si es igual manda TRUE
		
		int x4 = 10; //un solo igual es asignacion de valor
		
		if( x4 == 20 ) {
			System.out.println("Si");
		} else {
			System.out.println("No");
		}
		
		
		//DIFERENTE DE - != - Compara el valor y si es diferente manda TRUE
		
		int x5 = 10; //un solo igual es asignacion de valor
		
		if( x5 != 20 ) {
			System.out.println("Si");
		} else {
			System.out.println("No");
		}
		
		
		//ESTRUCTURAS DE DECISION
		
		//Estructura if-else contatenado o if-else anidado
		
		int d = 7;
		
		if( d == 1 ) {
			System.out.println("Lunes");
		}else if ( d == 2 ) {
			System.out.println("Martes");
		}else if ( d == 3 ) {
			System.out.println("Miercoles");
		}else {
			System.out.println("Desconocido");
		}
		
		//ESTRUCTURA DE DECISION - SWITCH CASE
		
		int d1 = 3;
		
		switch (d1) {
		case 1:
			System.out.println("Lunes");
			break;
		case 2:
			System.out.println("Martes");
			break;
		case 3:
			System.out.println("Miercoles");
			break;
		default:
			System.out.println("Desconocido");
			break;
		}
		
		
	}

}
