package com;

public class EstructurasControl {

	public static void main(String[] args) {
		
		//ESTRUCTURAS CONTROL
		//ESTRUCTURAS DE DECISION IF - Valores Booleanos
		
//		int x = 11;
//		
//		if (x<10) {
//			System.out.println("Es menor");
//		}else {
//			System.out.println("Es mayor");
//		}

		//Condiciones Compuestas con operadores logicos 
		//AND, OR, NOT, DIFERENTE DE IGUALDAD
		
		//AND - && - Te devuelve un valor true cuando se cumplan todas las condiciones
		
//		int x = 10;
//
//		if (x>9 && x>11) {
//		    System.out.println("S�");
//		} else {
//		    System.out.println("No");
//		}	
		
		
		//OR - || - Te duelve true cuando se cumple una condicion 
		// || se obtienen con la tecla debajo de "esc" en teclado en espanol lat.
		// o con Alt + 124 
		
//		int x = 12;
//
//		if (x > 9 || x > 11) {
//		    System.out.println("S�");
//		} else {
//		    System.out.println("No");
//		}
		
		//NOT - ! - Niega una expresion/cambia el valor de True a False  y viceversa
		
//		int x = 9;
//		
//		if (!(x>9) || x>11) {
//			System.out.println("S�");
//		} else {			    
//			System.out.println("No");
//			}
		
		
		//IGUALDAD - == - Comparar el valor con algun otro y si es igual manda True
		
//		int x = 12;
//		
//		if (x == 10) {
//			System.out.println("S�");
//		} else {			    
//			System.out.println("No");
//			}
		
		
		//DIFERENTE DE - != - Compara el valor y si es diferente manda TRUE
		
//		int x = 12;//Un solo igual es asignacion de valor
//		
//		if (x != 10) {
//			System.out.println("S�");
//		} else {			    
//			System.out.println("No");
//			}	
		
		//ESTRUCTURA DE DECISION
		
		//Estructura if-else concatenado o if-else anidado
		
//		int d = 7;
//		
//		if (d==1) {
//			System.out.println("Lunes");
//		}else if (d==2) {
//			System.out.println("Martes");
//		}else if (d==3) {
//			System.out.println("Miercoles");
//		}else {
//			System.out.println("Desconocido");
//		}
		
		
		//ESTRUCTURA DE DECISION - SWITCH CASE 
		
		int d = 3;
		
		switch (d) {
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
