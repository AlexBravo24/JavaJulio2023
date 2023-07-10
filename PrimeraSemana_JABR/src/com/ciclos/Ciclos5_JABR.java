package com.ciclos;

public class Ciclos5_JABR {

	public static void main(String[] args) throws InterruptedException {
		
		for (int hora = 0; hora <= 23; hora++) {
			for (int minutos = 0; minutos < 60; minutos++) {
				for (int segundos = 0; segundos < 60; segundos++) {
					System.out.println(hora + " : " + minutos + " : " + segundos);
					Thread.sleep(1000);
				}
				
			}	
		}

	}

}
