package com.files;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("Cuantos nombres registraras?");

		int nombres = scanner.nextInt();
		scanner.nextLine();
		String linea;
		
		try{
			File archivo = new File("C:\\Users\\da_gt\\OneDrive\\Desktop\\fichero.txt");		
			FileWriter texto = new FileWriter(archivo);
			FileReader fr = new FileReader(archivo);
			BufferedReader br = new BufferedReader(fr);
			
			for(int i = 0; i< nombres; i ++) {
				System.out.print("Introduce el nuevo nombre a agregar: ");
				texto.write(scanner.nextLine()+ "\n");
			}
			
			texto.close();
			
			
			while ((linea = br.readLine()) != null) {
				System.out.println(linea);
				
			}
			
			
		}catch(Exception e){
			System.out.println(e);
		}
		
	}

}
