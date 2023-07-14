package com;

import java.util.HashMap;

public class Map {
	
	public static void main(String[] args) {
        HashMap<Integer, String> Producto = new HashMap<>();
 
        Producto.put(1, "Zapatillas Blancas"); 
        Producto.put(2, "Tenis Color Rosa"); 
        Producto.put(3, "Sandalias");
        
        System.out.println(Producto.get(2));
        
    }

}
