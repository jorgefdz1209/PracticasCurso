package ejercicio_4;

/**
 * Clase administrador con herencia de la clase Persona 
 * @author Jorge
 *
 */
public class Administrador extends Persona {
	private static final long serialVersionUID = 1L;

	/**
	 *Constructor por defecto de administrador  
	 */
	public Administrador() {
		super();
	}
	/**
	 * Constructor con los parametros de nombre y correo electronico 
	 * @param nombre String nombre del administrador
	 * @param correoEle Strign con el correo electronico 
	 */
	public Administrador(String nombre, String correoEle) {
		super(nombre, correoEle);
	}
	
}
