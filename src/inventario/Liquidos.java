/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inventario;

public class Liquidos extends Productos {

	public Liquidos() {
		super();
	}
	
	public Liquidos(String nombre, String contenido, int precio) {
		super(nombre,contenido,precio);		
	}
	
	public String toString() {
		return "Nombre: "+nombre+" // "+contenido+" // "+"Precio: $"+precio;
	}
}