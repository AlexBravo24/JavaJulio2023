package com;

public interface IMetodos {
	
	public Producto buscarProducto(int id);
	public Impresora agregarProducto(int id, int cantidad);
	public Impresora comprarProducto(int id, int pesos);
	public Impresora depositar(int pesos);
	public Impresora retirar(int pesos);
	
	

}
