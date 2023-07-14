package com;

public abstract class Persona {
private String nombre;
private String sexo;
private int edad;
private String curp;


public Persona() {

}


public Persona(String nombre, String sexo, int edad, String curp) {
	super();
	this.nombre = nombre;
	this.sexo = sexo;
	this.edad = edad;
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


public String getCurp() {
	return curp;
}


public void setCurp(String curp) {
	this.curp = curp;
}


@Override
public String toString() {
	return "Persona [nombre=" + nombre + ", sexo=" + sexo + ", edad=" + edad + ", curp=" + curp + "]";
}


public Persona(String nombre, String curp) {
	super();
	this.nombre = nombre;
	this.curp = curp;
}



//COMPORTAMIENTOS o metodos propios
//acciones que puede realizar nuestro objeto

//si queremos que el metodo retorne un valor especifico 
//debemos declararlo con el tipo de dato a retornar

public String pensar() {
	String pensamiento = "Estoy pensando...";
	return pensamiento;
	}
//para evitar que mis metodos me pidan un retorno pero si ejecuten algo
//le pongo el modificador void


public void caminar () {
System.out.println("Estoy caminando...");	
}
//vamos a crear un metodo polimorfico 
public void caminar(String kilometros) {
	System.out.println("Estoy caminando..." + kilometros);
}
public void caminar (String kilometros, int numeroKm) {
System.out.println("Estoy caminando " + numeroKm + kilometros );
}


////las clases abstractas sirven para proteger la plantilla del objeto
//y unicamente poder hacer herencia de la misma
//una clase abstracta es aquella que tiene por lo menos
//un metodo abstracto
//un metodo abstracto es aquel que define el QUÉ, pero no el CÓMO

//declaramos un metodo abstracto, para hacerlo en lugar
//de que el metodo lleve un cuerpo ({}) se termina con un ;
public abstract void comer ();










}
