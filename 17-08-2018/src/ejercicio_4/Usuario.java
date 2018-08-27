package ejercicio_4;

/**
 * Clase Usuario que extiende de persona 
 * @author Jorge
 *
 */
public class Usuario extends Persona{

	private static final long serialVersionUID = 1L;

	/**
	 * Constructor por defecto de la clase Usuario 
	 */
	public Usuario() {
		super();
	}

	/**
	 * Constructor con los parametros de la clase padre 
	 * @param nombre String Nombre del usuario 
	 * @param correoEle String Correo electronico del usuario 
	 */
	public Usuario(String nombre, String correoEle) {
		super(nombre, correoEle);
	}
	
}
