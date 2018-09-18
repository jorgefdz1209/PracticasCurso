package net.netasystems.domain;

import java.util.Date;

/**
 * variables de las tablas 
 * @author Jesus Leyton
 *
 */
public class CatTipoFabrica {
	
	/**
	 * constructore con argumentos
	 * 
	 * @param idCatTipoFabrica asigna id de CatTipoFabrica
	 * @param nombre asigna nombre de CatTipoFabrica
	 * @param status asigna status de CatTipoFabrica
	 * @param fechaModificacion asigna fecha de CatTipoFabrica
	 * @param idUsuario asigna idusuario de CatTipoFabrica
	 */
	public CatTipoFabrica(long idCatTipoFabrica, String nombre, Character status, Date fechaModificacion, long idUsuario) {
		super();
		this.idCatTipoFabrica = idCatTipoFabrica;
		this.nombre = nombre;
		this.status = status;
		this.fechaModificacion = fechaModificacion;
		this.idUsuario = idUsuario;
	}
	
	/**
	 * Constructor vacio
	 */
	public CatTipoFabrica() {
	}
	
	private long idCatTipoFabrica;
	private String nombre;
	private Character status;
	private Date fechaModificacion;
	private Long idUsuario;
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((fechaModificacion == null) ? 0 : fechaModificacion.hashCode());
		result = prime * result + (int) (idCatTipoFabrica ^ (idCatTipoFabrica >>> 32));
		result = prime * result + (int) (idUsuario ^ (idUsuario >>> 32));
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		result = prime * result + status;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CatTipoFabrica other = (CatTipoFabrica) obj;
		if (fechaModificacion == null) {
			if (other.fechaModificacion != null)
				return false;
		} else if (!fechaModificacion.equals(other.fechaModificacion))
			return false;
		if (idCatTipoFabrica != other.idCatTipoFabrica)
			return false;
		if (idUsuario != other.idUsuario)
			return false;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		if (status != other.status)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "CatTipoFabrica [idCatTipoFabrica=" + idCatTipoFabrica + ", nombre=" + nombre + ", status=" + status
				+ ", fechaModificacion=" + fechaModificacion + ", idUsuario=" + idUsuario + "]";
	}

	/**
	 * asigna el valos idCatTipoFabrica
	 * @return regresa el valor idCatTipoFabrica
	 */
	public long getIdCatTipoFabrica() {
		return idCatTipoFabrica;
	}

	/**
	 *obtiene el valor idCatTipoFabrica
	 * @param idCatTipoFabrica Asigna el valor a idCatTipoFabrica to set
	 */
	public void setIdCatTipoFabrica(long idCatTipoFabrica) {
		this.idCatTipoFabrica = idCatTipoFabrica;
	}

	/**
	 * asigna el valos nombre
	 * @return regresa el valor nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 *obtiene el valor nombre
	 * @param nombre Asigna el valor a nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * asigna el valos status
	 * @return regresa el valor status
	 */
	public Character getStatus() {
		return status;
	}

	/**
	 *obtiene el valor status
	 * @param status Asigna el valor a status to set
	 */
	public void setStatus(Character status) {
		this.status = status;
	}

	/**
	 * asigna el valos fechaModificacion
	 * @return regresa el valor fechaModificacion
	 */
	public Date getFechaModificacion() {
		return fechaModificacion;
	}

	/**
	 *obtiene el valor fechaModificacion
	 * @param fechaModificacion Asigna el valor a fechaModificacion to set
	 */
	public void setFechaModificacion(Date fechaModificacion) {
		this.fechaModificacion = fechaModificacion;
	}

	/**
	 * asigna el valos idUsuario
	 * @return regresa el valor idUsuario
	 */
	public Long getIdUsuario() {
		return idUsuario;
	}

	/**
	 *obtiene el valor idUsuario
	 * @param idUsuario Asigna el valor a idUsuario to set
	 */
	public void setIdUsuario(Long idUsuario) {
		this.idUsuario = idUsuario;
	}

	
}
