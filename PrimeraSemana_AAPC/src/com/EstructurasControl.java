package com;

public class EstructurasControl {

	public static void main(String[] args) {

		
		//ESTRUCTURAS CONTROL
		//ESTRUCTURAS DE DECISIÓN IF - Valores booleanos
		
//		int x =11;
//		
//		if (x<10) {
//			System.out.println("Es menor");
//		}else {
//			System.out.println("Es mayor");
//			
//		}
		
		
		//Condiciones compuestas con operadores logicos 
		// AND, OR, NOT, DIFERENTE DE IGUALDAD
		
		//AND - && - te devuelve un valor true cuando secumplan todas las condiciones
		
//		int x = 10;
//		if(x>9 && x >11) {
//			System.out.println("Si");
//		}else { 
//			System.out.println("No");
//		}
		
		
//		OR - || (alt 124)- TE Devuelve true cuando se cumpla al menos una condicion
		
//		int x = 10;
//		if(x>9 || x >11) {
//			System.out.println("Si");
//		}else { 
//			System.out.println("No");
//		}
		
		
		
		//NOT- ! - niega una expresion / Cambia el valor de true a false y viceversa
//		int x = 10;
//		if(!(x>9 || x >11)) {
//			System.out.println("Si");
//		}else { 
//			System.out.println("No");
//		}
//		
		
		
		//IGUALDAD - == - Comparar el valor contra alguno otro, y si es igual manda true 
//		int x = 10;//un solo igual es asignacion de valor, doble igual es comparar.
//		if(x==20) {
//			System.out.println("Si");
//		}else { 
//			System.out.println("No");
//		}
		
//		//DIFERENTE DE - != - Comparar el valor y si es diferente manda true 
//		
//		int x = 10;//un solo igual es asignacion de valor, doble igual es comparar.
//		if(x!=10) {
//			System.out.println("Si");
//		}else { 
//			System.out.println("No");
//		}
//		
		
		//Estructuras de decisión 
		// Estructura if- else concatenado o if - else anidado
//		int d = 7;
//		
//		if (d==1) {
//			System.out.println("Lunes");
//		}else if (d==2) {
//			System.out.println("Martes");
//		}else if (d==3) {
//				System.out.println("Miercoles");
//			}else{
//				System.out.println("Desconocido");
//			}
				
			//Estructura de decision - switch case
		int d = 3;
		switch (d) {
		case 1:
			System.out.println("Lunes");
			break;
		case 2:
			System.out.println("martes");
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
