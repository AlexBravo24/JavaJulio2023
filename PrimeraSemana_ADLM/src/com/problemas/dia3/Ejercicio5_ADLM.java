package com.problemas.dia3;

public class Ejercicio5_ADLM {

	public static void main(String[] args) throws InterruptedException {
		/* 5. Simular el comportamiento de un reloj digital, imprimiendo la hora, minutos y segundos 
			de un día desde las 00:00:00 horas hasta las 23:59:59 horas */
		
		int horas, min, seg;
		
		for(horas = 0; horas <= 24; horas ++) {
			for(min = 0; min <= 60; min ++) {
				for(seg = 0; seg <= 60; seg ++) {
					String horasS = horas>9 ? horas+"" : "0"+horas;
					String minS = min>9 ? min+"" : "0"+min;
					String segS = seg>9 ? seg+"" : "0"+seg;
					Thread.sleep(1000);
					System.out.println(horasS + ":" + minS + ":" + segS);
				}
			}
		}

	}

}
