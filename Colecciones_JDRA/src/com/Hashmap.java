package com;

import java.util.HashMap;

public class Hashmap {
	/*
	 * En Java se usa HashMap para almacenar elementos en pares clave/valor y puedes acceder a 
	 * estos elementos almacenados en un HashMap utilizando la clave del elemento, 
	 * que es única para cada elemento.
	 */
	
	 
    public static void main(String[] args) {
        
    	HashMap<Integer, String> ProductoInfo = new HashMap<>();
    	 
        ProductoInfo.put(1, "Zapatos de Cuero"); 
        ProductoInfo.put(2, "Casacas Cortaviento"); 
        ProductoInfo.put(3, "Zapatillas Running");
        
        // Actualizar key 1
        ProductoInfo.replace(1, "Zandalias Moradas");
        
        /* Salida */
        System.out.println(ProductoInfo);
        // {1=Zandalias Moradas, 2=Casacas Cortaviento, 3=Zapatillas Running} 
        
        ProductoInfo.remove(1);
        System.out.println(ProductoInfo);
    }
	
}
