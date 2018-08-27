package ejercicio_3;

/**
 * Clase cliente para la integracion de los constructores y getter and setter 
 * @author Jorge
 *
 */
public class Cliente {
	private String nombre;
	private String numCliente;
	
	/**
	 * Constructor por defecto de la clase Cliente ya que al crear uno con parametros es necesario nombrar uno de esta manera si es que se lo necesita
	 * 
	 */
	public Cliente() {
		super();
	}
	
	/**
	 * Constructor con parametros de la clase CLiente con todos los argumentos 
	 * @param nombre String con el nombre del cliente
	 * @param numCliente String con el numero telefonico del numero del cliente 
	 */
	public Cliente(String nombre, String numCliente) {
		super();
		this.nombre = nombre;
		this.numCliente = numCliente;
	}
	
	/**
	 * Metodo getNombre
	 * @return String con el nombre del cliente
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
	 * Metodo getNumCliente 
	 * @return String con el numero del cliente
	 */
	public String getNumCliente() {
		return numCliente;
	}
	
	/**
	 * Metodo setNumCliente 
	 * @param numCliente String con el nnumero del cliente 
	 */
	public void setNumCliente(String numCliente) {
		this.numCliente = numCliente;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		result = prime * result + ((numCliente == null) ? 0 : numCliente.hashCode());
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
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		if (numCliente == null) {
			if (other.numCliente != null)
				return false;
		} else if (!numCliente.equals(other.numCliente))
			return false;
		return true;
	}
	
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Cliente [nombre=" + nombre + ", numCliente=" + numCliente + "]";
	}
	
}
