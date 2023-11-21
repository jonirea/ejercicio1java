/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inventario;

import java.util.ArrayList;
import java.util.Collections;

public class OrdenarInventario {

	ArrayList<Productos> productos = new ArrayList<>();
	
	public OrdenarInventario(ArrayList<Productos> productos) {
		this.productos = productos;
	}
	
	 public ArrayList<Productos> getProductosPorPrecio() {         
		    Collections.sort(productos);         
		    return productos;     
		  } 
}
