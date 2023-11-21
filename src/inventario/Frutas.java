/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inventario;

public class Frutas extends Productos{
		
	public Frutas() {
		super();
	}
		
	public Frutas(String nombre, int precio, String contenido) {
		super(nombre,contenido,precio);
	}
	
	public String toString() {
		return "Nombre: "+nombre+" // "+"Precio: $"+precio+" // Unidad de venta: "+contenido;
	}
}
