package com.ciclos;

public class Ciclos5_MSG {

	public static void main(String[] args) throws InterruptedException {

		int hrs, min, seg;
		
		for (hrs = 0; hrs <= 24; hrs ++) {
			for (min = 0; min <= 60; min ++) {
				for (seg = 0; seg <= 60; seg ++) {
					String horas = hrs > 9 ? hrs+"" : "0" +hrs;
					String minS = min > 9 ? min+"" : "0" +min;
					String segS = seg > 9 ? seg+"" : "0" +seg;
					
					Thread.sleep(1000);
					System.out.println(horas + ":" + minS + ":" + segS);
				}
			}
		}
		
		
		

	} // cierre main

} // Cierre class
