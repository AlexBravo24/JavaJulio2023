package com;

import java.util.*;

public class Problema4_OIPH {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		char caracter = scan.next().charAt(0);
		if(Character.isUpperCase(caracter)) {
			System.out.println("Es mayúscula");
		}else {
			System.out.println("Es minúscula");
		}
	}

}
