package ejercicio_4;

import java.io.Serializable;

/**
 * Clase de persona 
 * @author Jorge
 *
 */
public class Persona implements Serializable{
	private static final long serialVersionUID = 1L;
	private String nombre;
	private String correoEle;
	
	/**
	 * Constructor con todos los parametros de la clase 
	 * @param nombre String con el nombre de la persona 
	 * @param correoEle String con el correo electronico de la persona 
	 */
	public Persona(String nombre, String correoEle) {
		super();
		this.nombre = nombre;
		this.correoEle = correoEle;
	}
	
	/**
	 * Constructor con el constructor de la clase Object
	 * constructor por defecto 
	 */
	public Persona() {
		super();
	}
	
	/**
	 * Metodo getNombre 
	 * @return String con el nombre de la persona 
	 */
	public String getNombre() {
		return nombre;
	}
	
	/**
	 * Metodo SetNombre 
	 * @param nombre String con el nombre a asignar 
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/**
	 * Metodo getCorreoElectornico 
	 * @return String con el correoElectronico de la persona
	 */
	public String getCorreoEle() {
		return correoEle;
	}
	
	/**
	 * Meteodo SetCorreoElectronico 
	 * @param correoEle String con el correoElectronico de la persona 
	 */
	public void setCorreoEle(String correoEle) {
		this.correoEle = correoEle;
	}
	
	
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((correoEle == null) ? 0 : correoEle.hashCode());
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		return result;
	}
	
	/* (non-Javadoc)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Persona other = (Persona) obj;
		if (correoEle == null) {
			if (other.correoEle != null)
				return false;
		} else if (!correoEle.equals(other.correoEle))
			return false;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		return true;
	}
	
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", correoEle=" + correoEle + "]";
	}
	
}
