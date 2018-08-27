package Constructores;


/**
 * Clase usuario para ejemplo de constructores y sus diferencias  
 * @author Jorge 
 *
 */
public class Usuario {
    private String nombre;
    private int userId;
    private int edad;
    private char sexo;
    private int tipo;
    private String contrasena;
    
	/**
	 * Constructor de la clase Usuario con todos los parametras disponibles 
	 * @param nombre String del nombre del usuario 
	 * @param userId int con el id del usuario
	 * @param edad int con la edad entera del usuario
	 * @param sexo char con el sexo del usuario M o F
	 * @param tipo int con el tipo de usuario 1 normal 0 admin etc...
	 * @param contrasena contraseña del usuario
	 */
	public Usuario(String nombre, int userId, int edad, char sexo, int tipo, String contrasena) {
		super();
		this.nombre = nombre;
		this.userId = userId;
		this.edad = edad;
		this.sexo = sexo;
		this.tipo = tipo;
		this.contrasena = contrasena;
	}
	
	
	/**
	 * Construtor de la clases usuario con los parametros de mayor interes
	 * @param nombre  String con el nombre del usuario
	 * @param userId int con el id del usuario 
	 * @param contrasena String con la contraseña del ususario 
	 */
	public Usuario(String nombre, int userId, String contrasena) {
		super();
		this.nombre = nombre;
		this.userId = userId;
		this.contrasena = contrasena;
	}
	
	/**
	 * Metodo para obtener el nombre del usuario
	 * @return String con el nombre del usuario 
	 */
	public String getNombre() {
		return nombre;
	}
	
	/**
	 * Metodo para asignar el nombre del usuario 
 	 * @param nombre String con el nombre del usuario a modificar
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Metodo Get userId
	 * @return int userID
	 */
	public int getUserId() {
		return userId;
	}
	
	/**
	 * Metodo Set userId 
	 * @param userId int valor del id
	 */
	public void setUserId(int userId) {
		this.userId = userId;
	}

	/**
	 * Metodo get edad
	 * @return int valor edad
	 */
	public int getEdad() {
		return edad;
	}

	/**
	 * metodo Set edad
	 * @param edad int valor de la edad del usuario
	 */
	public void setEdad(int edad) {
		this.edad = edad;
	}

	/**
	 * metodo getSexo 
	 * @return char con el valor de sexo
	 */
	public char getSexo() {
		return sexo;
	}

	/**
	 * metodo setSexo
	 * @param sexo char con el valor de sexo 
	 */
	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	/**
	 * metodo getTipo 
	 * @return int con el tipo de usuario 
	 */
	public int getTipo() {
		return tipo;
	}

	/**
	 * metodo setTipo 
	 * @param tipo int con el tipo de usuario a modificar
	 */
	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

	/**
	 * metodo getContrasena 
	 * @return String con la contraseña del usuario 
	 */
	public String getContrasena() {
		return contrasena;
	}

	/**
	 * metodo set contrasena 
	 * @param contrasena String con la contraseña a modificar 
	 */
	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}
}
