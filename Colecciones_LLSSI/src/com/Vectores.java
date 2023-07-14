package com;

import java.util.Vector;
import java.util.List;

public class Vectores {
	
	 public static void main(String[] args) {
	
	Vector <String> v = new Vector <String>();
	v.addElement("uno");
	v.addElement("dos");
	v.addElement("Tres");
	v.addElement("Cuatro");
	v.addElement("Cinco");
	
	List subList = v.subList(0,5);
	 
    System.out.println("LISTA:");
    for(int i=0; i < subList.size() ; i++){
       System.out.println(subList.get(i));
    }
  }
}

