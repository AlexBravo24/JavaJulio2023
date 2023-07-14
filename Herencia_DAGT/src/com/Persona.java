package com;

public abstract class Persona {

		private String nombre;
		private String sexo;
		private int edad;
		private String curp;
		
		public Persona() {
		}

		public Persona(String nombre, String sexo,String curp, int edad) {
			super();
			this.nombre = nombre;
			this.sexo = sexo;
			this.edad = edad;
			this.curp = curp;
		}

		
		
		public String getCurp() {
			return curp;
		}

		public void setCurp(String curp) {
			this.curp = curp;
		}

		public String getNombre() {
			return nombre;
		}

		public void setNombre(String nombre) {
			this.nombre = nombre;
		}

		public String getSexo() {
			return sexo;
		}

		public void setSexo(String sexo) {
			this.sexo = sexo;
		}

		public int getEdad() {
			return edad;
		}

		public void setEdad(int edad) {
			this.edad = edad;
		}

		@Override
		public String toString() {
			return "Persona [nombre=" + nombre + ", sexo=" + sexo + ", edad=" + edad + ", curp=" + curp + "]";
		}


		//Comportamientos o metodos propios
		//Acciones que puede realizar nuestro objeto
		public String pensar() {
			String pensamiento = "Estoy pensando...";
			return pensamiento;
		}
		
		
		
		//Las clases abstractas sirven para proteger la plantilla del objeto
		//y unicamente poder hacer herencia de la misma
		//Una clase abstracta es aquella que tiene por lo menos un metodo abstracto
		//Un metodo abstracto es aquel que define el QUE pero no el COMO
		
		//Declarando un metodo abstracto, para hacerlo en lugar de que el metodo lleve un cuerpo {}, se termina con un ;
		
		
		
		public abstract void comer();
		
		
		
}
