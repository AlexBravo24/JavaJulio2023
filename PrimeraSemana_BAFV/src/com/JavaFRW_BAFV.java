package com;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class JavaFRW_BAFV {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Clases File, FileReader, BufferReader
		//FileWriter
		
		//Probamos realizar una lectura de archivos 
		//apoyandonos de una estructura try and catch 
		//para que el programa intente comunicarse 
		//y su hay un error o excepción pueda atraparse
		
		String linea;
		try { // intentar realizat una lectura de un archivo 
				//primero lo representamos en memoria 
				//ubicandolo con la clase File 
			
//			File archivo = new File("C:\\Users\\fabia\\OneDrive\\Desktop\\fichero.txt");
//			//necesitamos leer el archivo 
//			// y lo hacmeo con la clase FileReader
//			 FileReader lector = new FileReader(archivo);
//			 // ya lo tiene la clase FileReader, debemos cargarlo para poder leer su contenido
//			 BufferedReader buffer = new BufferedReader(lector);
//			//mediante un ciclo mostramos cada linea que tengamos en nustro archivo
//			 while((linea = buffer.readLine()) != null) {
//				 System.out.println(linea);
//			 }
			
			
			// escritura de archivos 
			String abc = "abcdefg";
			File archivo = new File("C:\\Users\\fabia\\OneDrive\\Desktop\\fichero.txt");
			// con la siguiente linea el valor que le pasamos se va a sobreescribir
			FileWriter line = new FileWriter(archivo,true);
			// para que no se sobreescriba podemos utilizar la siguiente linea de codigo
			//FileWriter line = new FileWri	ter(archivo,true);
			
			// un ejemplo con un ciclo para pasar cada caracter abc vamos a escribirlo en nuestro archivo
			// en una linea diferente
			
			for (int i = 0; i < abc.length(); i++) {
				line.write(abc.charAt(i) + "\n");
			}
			// para indicar que los caracter de la String han terminado.
			line.close();
			 
		} catch (Exception e) {
			// para poder ver la excepcion y el motivo por lo cual se generó 
			e.printStackTrace(); // impirme en consola lo que ocurrió o porque no se ejecutó el bloque de try
			System.out.println("no encontre el archivo");
		}
	}

}
