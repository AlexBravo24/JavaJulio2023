package com;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Motor motor = new Motor("gasolina",2.0,80);
		Rendimiento re = new Rendimiento("350 caballos de fuerza (hp)","Aceleraci�n de 0 a 100 km/h: 4.5 segundos\r\n","Velocidad m�xima: 280 km/h");
		Transmicion tr = new Transmicion("Autom�tica",8," Deportivo");
		
		Coche co  = new Coche("Ford","nwgro",re,motor,tr);
		System.out.println(co);
	}

}
