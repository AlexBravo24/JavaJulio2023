package com;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class JavaFRW_FACL {

	public static void main(String[] args) {
		
		
		// Clases de File,FileReader, BufferReader
		//FileWriter
		
		//Pobamos realizar una lectura de archivos
		//Apoyandonos de estructura try and catch
		//para que el programa intente comunicarse
		//y si hay algún error o excepcion pueda atraparse
		String linea;
		
		try {//intentar realizar una lectura de un archivo
				//Primero hay que representarlo en memoria
				//ubicandolo con la clase File
//			File archivo = new File("C:\\Users\\felix\\Desktop\\fichero.txt");//ubicacion del archivo
//			
//
//			
//			//Ahora necesitamos poder leer el archivo
//			FileReader lector = new FileReader(archivo);
//			//Ya que lo tiene la clase FileReader
//			//debemos cargarlo para poder leer su contenido
//			
//			BufferedReader buffer =new BufferedReader(lector);
//			
//			//mediante un ciclo mostrmos cada línea que tenga
//			//Nuestro archivo
//			
//			while((linea = buffer.readLine())!=null) {
//				System.out.println(linea);
//			}
			
			
			//Escritura de archivos.
			String abc = "abcdefg";
			File archivo = new File("C:\\Users\\felix\\Desktop\\fichero.txt");
			FileWriter line = new FileWriter(archivo,true);//respeta el contenido
			
			//Vamos a realizar un ejemplo con un ciclo
			//Para pasar cada caracter del String abc
			//al archivo seleccionado
			
			for(int i=0; i<abc.length();i++) {
				line.write(abc.charAt(i)+"\n");
			}
			
			line.close();
			
			
			

		} catch (Exception e) {
			System.out.println("no encontré el archivo");
			//Para poder ver la excepción que se creo
			//y entender qué hizo mal el usuario.
			e.printStackTrace();
			
		}
		

	}

}
