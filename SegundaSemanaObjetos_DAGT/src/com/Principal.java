package com;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		//Instanciando los objetos
		Scanner scanner = new Scanner(System.in);
		Casa departamento = new Casa();
		Casa residencia = new Casa(3, 4, "casa", "verde", "centro", true, true);
		Alumno diego = new Alumno();
		Alumno raul = new Alumno(23, "Raul", "Gonzalez", "Moreno", "Hombre");
		Celular iphone = new Celular();
		Celular semsung = new Celular("Samsung", "a320", 4, 128);
		
		
		
		
		//Asignación manual de atributos a objeto departamento
		departamento.setNumBanos(1);
		departamento.setNumHabitaciones(2);
		departamento.setTipo("departamento");
		departamento.setColor("roja");
		departamento.setZona("Norte");
		departamento.setPatio(false);
		departamento.setCochera(false);
		System.out.println(residencia);
		System.out.println(departamento);
		
		
		//Asignando por consola los atributos del objeto alumno
		System.out.print("Introduce el nombre del alumno: ");
		diego.setNombre(scanner.nextLine());
		System.out.print("Introduce el primer apellido del alumno: ");
		diego.setApellidoPaterno(scanner.nextLine());
		System.out.print("Introduce el segundo apellido del alumno: ");
		diego.setApellidoMaterno(scanner.nextLine());
		System.out.print("Introduce el genero del alumno: ");
		diego.setSexo(scanner.nextLine());
		System.out.print("Introduce la edad del alumno: ");
		diego.setEdad(scanner.nextInt());
		System.out.println(diego);
		System.out.println(raul);
		
		//Asignando valores a los atributos del objeto celular
		iphone.setMarca("iphone");
		iphone.setModelo("12 pro max");
		iphone.setMemoria(8);
		iphone.setRam(8);
		System.out.println(iphone);
		
		
	}

}
