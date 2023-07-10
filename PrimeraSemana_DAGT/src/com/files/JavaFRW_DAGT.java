package com.files;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class JavaFRW_DAGT {

	public static void main(String[] args) {
		
		//Clases File, FileReader, BufferedReader y FileWriter
		//FileNotFoundException

		//Probaremos realizar una lectura de archivos apoyandonos en una estructura try - catch
		
		String linea;
		
		
		
		
		try {
			//Primero lo representamos en memoria ubicandolo con la clase File
			File archivo = new File("C:\\Users\\da_gt\\OneDrive\\Desktop\\fichero.txt");
			//Ahora necesitamos poder leer el archivo y lo hacemos con la clase FileReader
			FileReader fr = new FileReader(archivo);
			//Ya que lo tiene la clase FileReader debemos cargarlo para poder leer el contenido
			BufferedReader buffer = new BufferedReader(fr);			
		
			while((linea = buffer.readLine()) != null) {
			System.out.println(linea);
			}
			
			String abc = "abcdefg";
			FileWriter texto = new FileWriter(archivo,true);
			
			/*Vamos a realizar un ejemplo con un ciclo
			 * para pasar cada caracter del String abc, vamos a escribir
			 * cada caracter en una linea diferente 
			 */
			
			for (int i = 0; i< abc.length(); i++) {
				texto.write(abc.charAt(i));
			}
			texto.close();
			
		}catch(Exception e){
			System.out.println(e);
			System.out.println("error");
		}
		
	}

}
