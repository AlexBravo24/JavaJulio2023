package com;

public abstract class Persona {
	
	private String nombre;
	private String sexo;
	private int edad; 
	private String curp; 
	
	public Persona () {
		
	}
	
	

	public Persona(String nombre, String curp) {
		super();
		this.nombre = nombre;
		this.curp = curp;
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
		return "Persona [nombre=" + nombre + ", sexo=" + sexo + ", edad=" + edad + ", surp=" + curp + "]";
	}
	
	
	
	//COMPORTAMIENTOS O METODOS PROPIOS 
	//ACCIONES QUE PUEDE REALIZAR NUESTRO OBJETO
	
	
	/*SI QUEREMOS QUE EL METODO RETORNE UN VALOR ESPECIFICO 
	 * DEBEMOS CECLARAR CON EL TIPO DE DATO A RETORNAR
	 * 
	 */
	
	public String pensar() {
		String pensamiento = "Estoy pensando.....";
		return pensamiento;
	}
	
	public void caminar () {
		System.out.println("Estoy Caminando .....");
	}
	
	//VAMOS A CREAR UN METODO POLIMORFICO
	/*el metodo conserva el mismo nombre pero se diferencia por solicitar 
	 * diferentes argumentos 
	 * SOBRE CARGA D ARGUMENTOS
	 */
	
	public void caminar(String kilometros) {
		System.out.println("Estoy Caminando" + kilometros);
	}
	
	public void caminar (String kilometros, int numerokm) {
		System.out.println("Estoy Caminando" + numerokm + kilometros);
	}
	
	/*LAS CLASE ABSTRANTAS SIRVEN PARA PROTEGER LA PLANTILLA DEL OBJETO 
	 * Y UNICAMENTE PODER HACER HERENCIA DE LA MISMA UNA CLASE ABSTRACTA ES AQUELLA QUE TIENE POR LO MENOS UN METODO ABSTRACTO 
	 * 
	 * 
	 * UN METODO ABSTRACTO ES AQUEL QUE DEFINE EL QUE PERO NO EL COMO
	 * 
	 * 
	 * DECLARAMOS UN METODO ABSTRACTO PARA DE QUE EL METODO LLEVE CUERPO
	 */
	
	public abstract void comer() {
		// TODO Auto-generated method stub
		
	}
	
	
	

}
