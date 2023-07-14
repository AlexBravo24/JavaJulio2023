package com;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int coches,personajes,jugadores;
		Scanner entrada =new Scanner(System.in);
		
		
		
		
		System.out.println("Creemos personajes de OP");
		Map<Integer,OnePiece> luffy = new HashMap<Integer,OnePiece>();
		
		System.out.println("Inserte el numero de personajes que va a guardar");
		personajes=entrada.nextInt();
		
		for(int i=0;i<personajes;i++) {
			OnePiece op =new OnePiece();
			String k,t,f,h;
		
			System.out.println("Inserte el nombre del personaje ("+(i+1)+")");
			//boolean eu,th;
			entrada.nextLine();
			k=entrada.nextLine();
			op.setNombre(k);
			
			
			System.out.println("Inserte la tripulacion del personaje ("+(i+1)+")");
			t=entrada.nextLine();
			op.setTripulacion(t);
			System.out.println("Inserte la fruta del personaje ("+(i+1)+")"); 
			f=entrada.nextLine();
			op.setFruta(f);;
			System.out.println("Inserte el haki del personaje ("+(i+1)+")");
			h=entrada.nextLine();
			op.setTipoDeHaki(h);
			luffy.put(i, op);
			

		}

		
		for (int i=0;i<personajes;i++) {
			System.out.println(luffy.get(i));
		}
		
		System.out.println();
		
		System.out.println("Creemos nuestro quinteto");
		List <Basketbolista> nba = new ArrayList<Basketbolista>();
		nba.add(new Basketbolista("Jokic", 2.11,16 , "Pivot", false));
		nba.add(new Basketbolista("Giannis", 2.13, 34, "Ala-Pivot", false));
		nba.add(new Basketbolista("Kawhi", 2.01, 2, "Ala", false));
		nba.add(new Basketbolista("Mitchel", 1.85, 45, "Escolta", true));
		nba.add(new Basketbolista("Curry", 1.88, 30, "Base", true));
		
		for(Basketbolista titulares:nba) {
			System.out.println(titulares);
		}
		
		System.out.println();
		System.out.println("Inserte la cantidad de autos:");
		coches=entrada.nextInt();
		
		Auto[] cochecitos = new Auto[coches];
		
		System.out.println();
		
		System.out.println("Guardemos los coches");
		
		for (int i=0;i<coches;i++) {
			String m,mo,v;
			int a;
			boolean n;
			System.out.println("Inserte la marca del auto ("+(i+1)+")");
			m=entrada.nextLine();
			entrada.nextLine();
			System.out.println("Inserte el modelo del auto ("+(i+1)+")");
			mo=entrada.nextLine();
			System.out.println("Inserte la versión del auto )"+(i+1)+")");
			v=entrada.nextLine();
			System.out.println("Inserte el año del auto ("+(i+1)+")");
			a=entrada.nextInt();
			System.out.println("Determine si l auto es hibrido(true o false)");
			n=entrada.nextBoolean();
			cochecitos[i]=new Auto(m, mo, v, a, n);
		}
		
		for(Auto ibiza:cochecitos) {
			System.out.println(ibiza);
		}
		
		
		
		
		
	}

}
