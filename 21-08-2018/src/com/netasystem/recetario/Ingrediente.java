package com.netasystem.recetario;


/**
 * Clase Ingrediente
 * @author Jorge Saul 
 *
 */
public class Ingrediente {
	private String nombre;
	private String cantidad;
	
	/**
	 * Constructor de la clase Ingrediente 
	 * @param nombre Nombre del ingrediente
	 * @param cantidad Cantidad utilizada en la receta 
	 */
	public Ingrediente(String nombre, String cantidad) {
		super();
		if (nombre.isEmpty()||cantidad.isEmpty()) {
			System.out.println("Nombre o/y cantidad vacios...");
		}else {
			this.nombre = nombre;
			this.cantidad = cantidad;	
		}
	}
	
	/**
	 * Metodo para obtener el nombre del ingrediente deseado
	 * @return String que corresponde al nombre del ingrediente
	 */
	public String getNombre() {
		return nombre;
	}
	
	/**
	 * Metodo para asignar nombre a un ingrediente 
	 * @param nombre 
	 * 			El nombre del ingrediente
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	/**
	 * Metodo para obtener la candidad necesaria para la receta
	 * @return String con la cantidad de la receta (no necesariamente numerica)
	 */
	public String getcantidad() {
		return cantidad;
	}
	/**
	 * Metodo para asignar la cantidad para la receta 
	 * @param cantidad 
	 * 			La cantidad a mostrar en el receta(no necesariamente numerica)
	 */
	public void setcantidad(String cantidad) {
		this.cantidad = cantidad;
	}
	
}
