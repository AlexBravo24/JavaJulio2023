package com;

public class EstructurasControl { // Apertura de Class

	public static void main(String[] args) { // Apertura de Main
		
		//ESTRUCTURAS DE CONTROL
		
		// ESTRUCTURAS DE DECISION IF - Valores Booleanos
		
//		int x = 11;
//		
//		if (x<10) { // Apertura if
//			System.out.println("Es menor");
//		}else {
//			System.out.println("Es mayor");
//		}
		
		// CONDICIONES COMPUESTAS CON OPERADORES LOGICOS AND , OR , NOT , DIFERENTE DE O IGUALDAD
		
		// AND - && - TE DEVUELVE VALOR TRUE CUANDO SE CUMPLAN TODAS LAS CONDICIONES
		
//		int x = 10;
//		
//		if (x>9 && x<11) {
//			System.out.println("Si");
//		} else {
//			System.out.println("No");
//		}
		
		
		// OR - || - TE DEVUELVE TRUE CUANDO SE CUMPLA AL MENOS UNA CONDICION
		
//		int x = 10;
//		
//		if (x<9 || x<11) {
//			System.out.println("Si");
//		} else {
//			System.out.println("No");
//		}
		
		// NOT  - ! - Niega una expresion /cambia el valor de true a false
		
//		int x = 10;
//		
//		if (!(x>9) || x>11) {
//			System.out.println("Si");
//		} else {
//			System.out.println("No");
//		}
		
		// IGUALDAD - == - Comparar el valor con algun otro y si es igual manda true 
		
//		int x = 10; //un solo igual se asigna un valor
//		
//		if (x == 9) { // doble igual es comparacion
//			System.out.println("Si");
//		} else {
//			System.out.println("No");
//		}
//		
		
		// DIFERENTE DE - != - Compara el valor y si es diferente manda true
		
		
//		int x = 10; 
//		
//		if (x != 10) { 
//			System.out.println("Si");
//		} else {
//			System.out.println("No");
//		}
		
		
		// ESTRUCTURAS DE DECISION 
		
//		int d = 6;
//		
//		if (d==1) {
//			System.out.println("Lunes");
//		} else if (d ==2) {
//			System.out.println("Martes");
//		} else if (d==3) {
//			System.out.println("Miercoles");
//		} else {
//			System.out.println("Desconocido");
//		}
		
		
		// ESTRUCTURA DE DECISION SWITCH CASE
		
		int d =5;
		
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
		

	} // cierre de Main

} // Cierre de Class
