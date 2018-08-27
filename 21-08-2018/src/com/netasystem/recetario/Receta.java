package com.netasystem.recetario;

import java.util.List;


/**
 * Clase Receta
 * @author Jorge Saul
 *
 */
public class Receta {
	
	private String nombre;
	private String autor;
	private List<Ingrediente> ingredientes;
	private List<String> procedimiento;
	
	/**
	 * Contructor con los parametros necesarios para el funcionamiento correcto de la clase
	 * 
	 * @param autor   Nombre del autor
	 * @param ingredientes Lista de ingrediente para la receta List<Ingredientes>
	 * @param procedimiento Lista de procedimentos para la receta List<String>
	 * 
	 */
	public Receta(String autor, List<Ingrediente> ingredientes, List<String> procedimiento) {
		super();
		if(autor.isEmpty()) {
			System.out.println("Nombre de la receta y/o nombre del autor vacio");
		}else {
		this.autor = autor;
		this.ingredientes = ingredientes;
		this.procedimiento = procedimiento;
		}
	}	
	
	/**
	 * Muestra el procedimiento para la receta 
	 * @return 
	 */
	public void mostrarProcedimiento() {
		for(String s : procedimiento) {
			System.out.println(s);
		}
	}
	/**
	 *Muestra los ingredientes necesarios para la receta  
	 */
	public void mostrarIngredientes() {
		for(Ingrediente i : ingredientes) {
			System.out.println(i.getNombre()+"  "+i.getcantidad());
		}
	}

	/**
	 * Regresa el valor del autor 
	 * @return String con el nombre del autor de la receta
	 */
	public String getAutor() {
		return autor;
	}
	
	/**
	 * Asigna el nombre del autor a la receta
	 * @param autor String con el nombre del autor
	 */
	public void setAutor(String autor) {
		this.autor = autor;
	}
	/**
	 * Regresa la lista de ingredientes de un receta 
	 * @return List<Ingredientes> Lista de ingredientes de la receta
	 */
	public List<Ingrediente> getIngredientes() {
		return ingredientes;
	}
	/**
	 * Asigna la lista de ingredientes a una receta
	 * @param ingredientes List<Ingrediente>
	 */
	public void setIngredientes(List<Ingrediente> ingredientes) {
		this.ingredientes = ingredientes;
	}
	/**
	 *Regresa la lista del procedimiento a seguir en la receta  
	 * @return List<String>
	 */
	public List<String> getProcedimiento() {
		return procedimiento;
	}
	/**
	 * Asigna la lista de procedimientos a seguir en la receta 
	 * @param procedimiento List<String>
	 */
	public void setProcedimiento(List<String> procedimiento) {
		this.procedimiento = procedimiento;
	}
	
}