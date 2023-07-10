package com.ciclos;

public class Ciclos5_BAFV {
    public static void main(String[] args) {
    	
    	/*
    	 
    	  5. Simular el comportamiento de un reloj digital, imprimiendo la hora, minutos y segundos 
			de un día desde las 00:00:00 horas hasta las 23:59:59 hora
    	  
    	 */
        for (int horas = 0; horas < 24; horas++) { // dor para horas
            for (int minutos = 0; minutos < 60; minutos++) { // for para minutos
                for (int segundos = 0; segundos < 60; segundos++) { // for para segundos
                	
                    System.out.printf("%02d:%02d:%02d\n", horas, minutos, segundos); // %02d es para que siempre nos muestre dos digitos
                  //metodo se utiliza para la suspeciónn del programa durante 1 segundo
                    // es importante introducir el thread.sleep() en un try catch para que no lance un error de interrupcion
                    // de esta manera el programa pueda darse cuenta de que es necesario la espera de 1 segundo por cada ejecucuón
                    try {
                        Thread.sleep(1000); // Esperar 1 segundo entre cada iteración 
                    } catch (InterruptedException e) { // excepcion si es que por algun motivo el hilo es interrumpido
                        e.printStackTrace();
                    }
                }
            }
        }
        
        
    }
}
