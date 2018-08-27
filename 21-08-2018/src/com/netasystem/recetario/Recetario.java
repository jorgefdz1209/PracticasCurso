package com.netasystem.recetario;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Clase Recetario
 * @author Jorge Saul
 *
 */
public class Recetario {
	private Map<String,Receta> listado;
	
	/**
	 * Constructor por defecto de la clase
	 */
	public Recetario() {
		listado = new HashMap<String, Receta>();
	}
	
	/**
	 * Muestra todo el recetario 
	 */
	public void mostrarList() {
		Set<String> key = listado.keySet();
		for(String k : key) {
			System.out.println(k);
			Receta r = listado.get(k);
			r.mostrarIngredientes();
			r.mostrarProcedimiento(); 
		}
	} 
	/**
	 * Agrega la receta al recetario
	 * @param nombre String 
	 * @param r String 
	 */
	public void agregarReceta(String nombre,Receta r) {
		listado.put(nombre, r);
	}
	
	/**
	 * Elimina la receta apartir de su nombre 
	 * @param nombre el nombre con el que se creo la receta 
	 * @return boolean si el eliminado tuvo exito
	 */
	public boolean quitarReceta(String nombre){
		if(checkNombre(nombre)) {
			Receta r = listado.remove(nombre);
			if( r!=null) return true; return false;
		}else {
			System.out.println("El nombre de la receta no existe...");
			return false;
		}
		
	}
	
	/**
	 * regresa la lista de las lleves existentes en el mapa 
	 * @return Set String con las llaves del mapa 
	 */
	public Set<String> listaLLaves() {
		return listado.keySet();
	}
	/**
	 * Metodo para checar si existe el nombre dentro de la mapa 
	 * @param n String con el nombre de la receta
	 * @return boolean con la existencia del nombre de la receta 
	 */
	public boolean checkNombre(String n) {
		return this.listado.containsKey(n);
	}
	/**
	 * Metodo de retorno para el mapa de las recetas
	 * @return Map String, Recetas 
	 */
	public Map<String, Receta> getListado() {
		return listado;
	}

	/**
	 * Agrega el listado de recetas 
	 * @param listado Map String, Receta
	 */
	public void setListado(Map<String, Receta> listado) {
		this.listado = listado;
	}
}
