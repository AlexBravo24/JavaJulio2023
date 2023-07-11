package com;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class JavaFRW_JABR {

	public static void main(String[] args) {
		
		
		// Clases File, FileReader, BufferedReader
		//FileWriter
		
		//Probamos realizar una lectura de archivos
		//apoyandonos en una estructura try and catch
		//para que el programa intente comunicarse
		//y si hay un error o excepci�n pueda atraparse
		String linea;
		try {// intentar realizar una lectura de un archivo
			//Primero lo representamos en memoria
			//ubicandolo con la clase File
//			File archivo = new File("C:\\Users\\Jorge Alejandro\\Desktop\\fichero.txt");
//			//Ahora necesitamos poder leer el archivo
//			//y lo hacemos con la clase FileReader
//			FileReader lector = new FileReader(archivo);
//			//Ya que lo tiene la clase FileReader
//			//debemos cargarlo para poder leer su contenido
//			BufferedReader buffer = new BufferedReader(lector);
//			//Mediante un ciclo mostramos cada linea que tenga
//			//nuestro archivo
//			while ((linea = buffer.readLine()) !=null) {
//				System.out.println(linea);
//			}
			
			//Escritura de archivos
			String abc = "\nabcdefg";
			File archivo = new File("C:\\Users\\Jorge Alejandro\\Desktop\\holla.txt");
			FileWriter line = new FileWriter(archivo, true);
			//Si queremos respetar el contenido del archivo, debemos
			//indicarlo con un valor booleano true en la creaci�n
			//del objeto FileWriter
			
			//Vamos a realizar un ejemplo con un ciclo
			//para pasar cada caracter del String abc vamos a escribirlos
			//en nuestro archivo en una linea diferentes
			
			for (int i = 0; i < abc.length(); i++) {
				line.write(abc.charAt(i)+ "\n");
			}
			line.close();
		} catch (Exception e) {
			System.out.println("No encontre el archivo");
			//Para poder ver la excepci�n que se creo
			//y el motivo por el cual se genero
			e.printStackTrace(); //Se imprime en consola lo que
			//ocurri� o porqu� no se ejecuto el bloque del try
		}
		

	}

}