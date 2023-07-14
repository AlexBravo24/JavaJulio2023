package com;

public class Principal2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Sombras nude = new Sombras ("Rosas","Grande",10);
		Rimen mascara = new Rimen ("Delgado", "Negro","Silicon");
		Labiales matte = new Labiales ("Rojo","Matte",13);

		Maquillaje prosa = new Maquillaje ("Bissu",nude,mascara,matte);
		System.out.println(prosa);
		
		
	}

}
