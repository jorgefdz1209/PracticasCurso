package estruccturasDatos;

/**
 * Clase Cliente para el manejo de hashMap, set ....
 * @author Jorge
 *
 */
public class Cliente {
	private String nombre;
	private String email;
	
	/**
	 * Constructor por defecto sin parametro de la clase cliente 
	 */
	public Cliente() {
		super();
	}
	
	/**
	 * Constructor con los parametros de la clase cliente 
	 * @param nombre String nombre del cliente 
	 * @param email String correo del Cliente
	 */
	public Cliente(String nombre, String email) {
		super();
		this.nombre = nombre;
		this.email = email;
	}
	
	/**
	 * Metodo get getNombre 
	 * @return String nombre del cliente 
	 */
	public String getNombre() {
		return nombre;
	}
	
	/**
	 * Metodo setNombre 
	 * @param nombre String con el nombre del cliente 
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Metodo getEmail 
	 * @return String con el correo del cliente
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * Metodo para asignar el correo del cliente
	 * @param email String Correo electronico
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		return result;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cliente other = (Cliente) obj;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		return true;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Cliente [nombre=" + nombre + ", email=" + email + "]";
	}
	
}
