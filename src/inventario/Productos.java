/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inventario;

public class Productos implements Comparable<Productos>{

	protected String nombre;
	protected String contenido;
	protected int precio;
	
	
	public Productos() {
	}
	
	public Productos(String nombre, String contenido, int precio) {
		this.nombre = nombre;
		this.contenido = contenido;
		this.precio = precio;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre=nombre;
	}
	
	public String getContenido() {
		return contenido;
	}
	public void setContenido(String contenido) {
		this.contenido=contenido;
	}
	
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(int precio) {
		this.precio=precio;
	}
	
	public int compareTo(Productos producto) {          
	    return (this.getPrecio() < producto.getPrecio() ? -1 : 
	            (this.getPrecio() == producto.getPrecio() ? 0 : 1));
	}
}
