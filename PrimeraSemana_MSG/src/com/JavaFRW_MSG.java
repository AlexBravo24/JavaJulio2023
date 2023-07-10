package com;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class JavaFRW_MSG {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		// Clases file , FileReader, BufferedReader, FileWriter
		
		// Probamos realizar uan lectura de archivos apoyandonos con una estructura try and catch para que el programa intente
		// comunicarse y si hay un error o execpcion pueda repararse
		
		String linea; // aqui guardamos las lineas de achivo a leer
		
		try { // intentar realizar una lectura de un archivo
			// primero lo represntamos en memeoria ubicandolo con la clase file
			
//			File archivo = new File("C:\\Users\\ingsy\\Desktop\\fichero.txt");
//			
//			//Ahora necesitamos poder leer el archivo y lo hacemos con la clase fileReader
//			
//			FileReader lector = new FileReader(archivo);
//			
//			//Ya que lo tiene  la clase Filereader debemos cargarlo para poder leer su contenido
//			
//			BufferedReader buffer = new BufferedReader(lector);
//			
//			// MEdiante un ciclo mostramos cada lienea que tenga nuestro archivo
//			
//			while ((linea = buffer.readLine()) !=null) {
//				System.out.println(linea);
//			}
			
			
			//ESCRITURA DE ARCHIVOS
			
			String abc = "\nabcdefg";
			
			File archivo = new File("C:\\Users\\ingsy\\Desktop\\fichero.txt");
			
			FileWriter line = new FileWriter(archivo, true); // si queremos respetar el contenido de archivo, debemos indicarlo con un valor boleano true 
			// en la creaciom del objeto file writer
			
			// vamos a realizar un ejempo con un ciclo para pasar cada caracter del String abc vamos a escribitlods en nuestro archi en una linea diferente
			
			for (int i = 0; i < abc.length(); i++) {
				line.write(abc.charAt(i) + "\n");
				
				
			}
			
			line.close();
			
			
			
		} catch (Exception e) {
			// TODO: handle exception
			
			System.out.println("No encontre el archivo");
			
			
			// para poder ver que la excepcion que se creo y el motivo por el cual se genero la excepcion
			
			e.printStackTrace();
		}
		
		
		
	} //cierre main

} // Cierre class
