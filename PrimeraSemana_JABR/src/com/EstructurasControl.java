package com;

public class EstructurasControl {

	public static void main(String[] args) {
	
		//ESTRUCTURAS CONTROL
		//ESTRUCTURAS DE DECISIÓN IF - Valores Booleanos
		
//		int x = 11;
//		
//		if(x<10) {
//			System.out.println("Es menor");
//		}else {
//			System.out.println("Es mayor");
//		}
		
		//Condiciones compuestas con operadores lógicos
		//AND, OR, NOT, DIFERENTE DE e IGUALDAD
		
		//AND - && - Te devuelve un valor true cuando se cumplan
		//todas las condiciones
		
//		int x = 10;
//		
//		if(x>9 && x>11) {
//			System.out.println("Si");
//		}else {
//			System.out.println("No");
//		}
		
		//OR - || - Te devuelve true cuando se cumpla al menos una condicion
		
//		int x = 10;
//		
//		if(x>9 || x>11) {
//			System.out.println("Si");
//		}else {
//			System.out.println("No");
//		}
		
		//NOT - ! - Niega una expresion/Cambia el valor de TRUE a FALSE y viceversa
//		int x = 10;
//		
//		if(!(x>9) || x>11) {
//			System.out.println("Si");
//		}else {
//			System.out.println("No");
//		}
		
		//IGUALDAD - == - Comparar el valor contra alguno otro, 
		//y si es igual manda TRUE
		
		
//		int x = 10; //Un solo igual es asignacion de valor
//		
//		if(x == 20) {
//			System.out.println("Si");
//		}else {
//			System.out.println("No");
//		}
		
		//DIFERENTE DE - != - Compara el valor y si es diferente manda TRUE
	
//		int x = 10; //Un solo igual es asignacion de valor
//		
//		if(x != 20) {
//			System.out.println("Si");
//		}else {
//			System.out.println("No");
//		}
		
		//ESTRUCTURAS DE DECISIÓN
		
		//Estructura if-else concatenado o if-else anidado
		
//		int d = 7;
//		
//		if(d==1) {
//			System.out.println("Lunes");
//		}else if (d==2) {
//			System.out.println("Martes");
//		}else if(d==3) {
//			System.out.println("Miércoles");
//		}else {
//			System.out.println("Desconocido");
//		}
		
		//ESTRUCTURA DE DECISIÓN - SWITCH CASE
		int d = 3;	
		switch (d) {
		case 1:
			System.out.println("Lunes");
			break;
		case 2:
			System.out.println("Martes");
			break;
		case 3:
			System.out.println("Miércoles");
			break;	
		default:
			System.out.println("Desconocido");
			break;
		}
		

	}

}
