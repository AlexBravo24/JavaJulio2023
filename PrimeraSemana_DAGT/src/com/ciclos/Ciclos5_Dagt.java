package com.ciclos;

public class Ciclos5_Dagt {

	public static void main(String[] args) throws InterruptedException {

		for (int hora = 0; hora < 24; hora++) {
            for (int minuto = 0; minuto < 60; minuto++) {
                for (int segundo = 0; segundo < 60; segundo++) {
                	Thread.sleep(1000);
                    System.out.printf("%02d:%02d:%02d\n", hora, minuto, segundo);
                }
            }
        }
	}

}
