package com.JavaFRW_ADLM;

import java.io.*;

public class JavaFile_ADLM {

	public static void main(String[] args) {
		
		String linea;
		try {
			File archivo = new File("../../../OneDrive/Escritorio/texto.txt");
			FileReader lector = new FileReader(archivo);
			BufferedReader buffer = new BufferedReader(lector);
			
			while((linea = buffer.readLine()) != null) {
				System.out.println(linea);
			}
		}catch (Exception e){
			System.out.println(e);
		}
		
	}

}
