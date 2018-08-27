package Constructores;

public class Usuario {
    private String nombre;
    private int userId;
    private int edad;
    private char sexo;
    private int tipo;
    private String contrasena;
    
	public Usuario(String nombre, int userId, int edad, char sexo, int tipo, String contrasena) {
		super();
		this.nombre = nombre;
		this.userId = userId;
		this.edad = edad;
		this.sexo = sexo;
		this.tipo = tipo;
		this.contrasena = contrasena;
	}

	public Usuario(String nombre, int userId, String contrasena) {
		super();
		this.nombre = nombre;
		this.userId = userId;
		this.contrasena = contrasena;
	}
	
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

	public String getContrasena() {
		return contrasena;
	}

	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}
}
