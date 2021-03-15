package edu.pingpong.bbdd;


public interface Inventario {


	// Metodo de consulta a la base de datos
	
	public int numeroProductos(String tienda, String producto);
	/*Esta clase se convierte en interfaz para que el inventario de la base de datos dependa de esta abstracción (DI, OCP)
	Un inventario es una entidad que tiene número de productos para una tienda y un item concreto.*/
}
