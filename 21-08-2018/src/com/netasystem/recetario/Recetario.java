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
	 * 
	 * @return
	 */
	public Set<String> listaLLaves() {
		return listado.keySet();
	}
	/**
	 * 
	 * @param n
	 * @return
	 */
	public boolean checkNombre(String n) {
		return this.listado.containsKey(n);
	}
	/**
	 * 
	 * @return
	 */
	public Map<String, Receta> getListado() {
		return listado;
	}

	/**
	 * 
	 * @param listado
	 */
	public void setListado(Map<String, Receta> listado) {
		this.listado = listado;
	}
}
