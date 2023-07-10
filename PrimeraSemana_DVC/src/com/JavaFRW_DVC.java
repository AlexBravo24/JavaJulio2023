package com;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class JavaFRW_DVC {

	public static void main(String[] args) {
		//Clases File, FileReader, BufferReader
		//FileWriter
		
		//Probamos realizar una lectura de archivos
		//apoyandonos en una estructura try and catch
		//para que al programa intente comunircar
		//y si hay un  error o excepción  pueda atraparse
		String linea; 
		try {//Intentar realizar una lectura de un archivo
		//primero lo representamos en memoria
		//ubicado con las clases file
//		File archivo = new File("C:\\Users\\Daniel\\Desktop\\CursoCTQ\\Fichero.txt");
//		//Ahora necesitamos poder ller el archivo
//		//y lo hacemos con la clase FileReader
//		FileReader lector = new FileReader(archivo);
//		//Ya qu lo tiene la calse FileReader
//		//debemos cargarlo para poder leer su contenido
//		BufferedReader buffer = new BufferedReader(lector);
//		//Mediante un ciclo mostramos cada linea que tenga
//		//nuestro arechivo
//		while((linea = buffer.readLine()) !=null) {
//			System.out.println(linea);
//		}
		
		//Escritura de archivos 
		String abc = "\nabcefg";
		File archivo = new File("C:\\Users\\Daniel\\Desktop\\CursoCTQ\\Fichero.txt");
		FileWriter line = new FileWriter (archivo, true);
		//Si queremos respetar el contenido del archivo debemos indicar
		//con un valor booleano "true" en la creación del objeto 
		//FileWriter
		
		//Vamos a realizar un ejemploc on un clico para pasar cada
		//caracter del String "abc" vamos a escribirlos
		//en nuestro archivo en una linea diferente
		
		for (int i = 0; i < abc.length(); i++) {
			
			line.write(abc.charAt(i)+ "\n"); //Alt +92 Diagonal invertida
		}
		line.close();
		 
		
		
		} catch (Exception e) {
			System.out.println("No encontre el archivo");
			e.printStackTrace();//para ver que paso con nuestro archivo si no se encontro y
			//el porque no se encontro 
		}
		
		
		
		

	}

}
