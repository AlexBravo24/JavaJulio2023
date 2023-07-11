package com;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class JavaFRW_AAPC {

	public static void main(String[] args) {
		// Clases file, FileReader, BufferedReader, FileWriter
		
		
	//probamos realizar una lectura de archivos apoyandonos
//		en una estructura try and catch para que el programa intente comunicarse 
//		y si hay un error o excepcion pueda atraparse
		String linea;
		try {//intentar realizar una lectura de un archivo
			//primero lo representamos en memoria 
			//ubicandolo con la clase file
			File archivo = new File ("C:\\Users\\yj866\\Desktop\\holla.txt");
			//ahora neceistamos poder leer el archivo 
			//y lo haces con la clase FileReader 
			FileReader lector = new FileReader (archivo);
			//ya que lo tiene la clase FileReader debenmos cargarlo para poder leer su contenido
			BufferedReader buffer= new BufferedReader (lector);
			//mediante un ciclo mostramos cada linea que tenga nuestro archivo
			while ((linea = buffer.readLine()) !=null) {
				System.out.println(linea);
			}
			} catch (Exception e) {
				System.out.println("No se encontro el archivo");
			// para poder ver la ecvepcion que se creo y el motivo por el cual se genero
				e.printStackTrace();
		}
	//escritura de archivos
		String abc= "abcdefg";
		File archivo = new File ("C:\\Users\\yj866\\Desktop\\holla.txt");
		FileWriter line= new FileWriter(archivo);
		//vamos a realizar un ejemplocon un ciclo
	// para pasar cadacaracter del string abc a escribirlos en nuestro archivo en una linea diferente
		for (int i = 0; i < abc.length; i++) {
			line.write(abc.charAt(i)+"\n");
						}
			line.close();
			
		}
		

	}

}
