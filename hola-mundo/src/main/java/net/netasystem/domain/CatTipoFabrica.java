package net.netasystem.domain;

import java.util.Date;

public class CatTipoFabrica {
	/**
	 * Tipo {@link Long} para el id 
	 */
	private long idTipoFabrica;
	/**
	 * Tipo {@link String} para el nombre del tipo
	 */
	private String nombre;
	/**
	 * Tipo {@link Character} para el estado de la tupla 
	 */
	private Character status;
	/**
	 * Tipo {@link Date} para la fecha de modificación de la tupla 
	 */
	private Date fechaDeModificacion;
	/**
	 * Tipo {@link Long} para el Id del usuario que realizó la modificación 
	 */
	private Long idUsuario;
	
	
	/**
	 * Constructor sin parametros o por defecto 
	 */
	public CatTipoFabrica() {
		super();
	}
	
	/**
	 * Constructor con todos los parametros 
	 * @param idTipoFabrica {@link Long} para el id de la tupla 
	 * @param nombre {@link String} para el nombre del tipo de fabrica 
	 * @param status {@link Character} para el estado del la tupla 
	 * @param fechaDeModificacion {@link Date} para la fecha de modificación de la tupla 
	 * @param idUsuario {@link Long} el id del usuario que hizo la modificación 
	 */
	public CatTipoFabrica(long idTipoFabrica, String nombre, Character status, Date fechaDeModificacion, long idUsuario) {
		super();
		this.idTipoFabrica = idTipoFabrica;
		this.nombre = nombre;
		this.status = status;
		this.fechaDeModificacion = fechaDeModificacion;
		this.idUsuario = idUsuario;
	}
	
	
	
	
	/**
	 * Devuelve el idTipoFabrica 
	 * @return el idTipoFabrica
	 */
	public long getIdTipoFabrica() {
		return idTipoFabrica;
	}

	/**
	 * Asignar el idTipoFabrica 
	 * @param idTipoFabrica el idTipoFabrica a asignar 
	 */
	public void setIdTipoFabrica(long idTipoFabrica) {
		this.idTipoFabrica = idTipoFabrica;
	}

	/**
	 * Obtener el nombre de la categoria 
	 * @return el nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Asignar el nombre de la categoria
	 * @param nombre el nombre a asignar
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Obtener el Status
	 * @return el status
	 */
	public Character getStatus() {
		return status;
	}

	/**
	 * Asignar el status 
	 * @param status el status a asignar
	 */
	public void setStatus(Character status) {
		this.status = status;
	}

	/**
	 * Obtener la fechaDeModificación 
	 * @return la fechaDeModificación 
	 */
	public Date getFechaDeModificacion() {
		return fechaDeModificacion;
	}

	/**
	 * Asignar la fechaDeModificacion 
	 * @param fechaDeModificacion la fechaDeModificacion a asignar
	 */
	public void setFechaDeModificacion(Date fechaDeModificacion) {
		this.fechaDeModificacion = fechaDeModificacion;
	}

	/**
	 * Obtener el idUsuario
	 * @return el idUsuario
	 */
	public Long getIdUsuario() {
		return idUsuario;
	}

	/**
	 * Asignar el idUsuario 
	 * @param idUsuario el idUsuario a asignar
	 */
	public void setIdUsuario(Long idUsuario) {
		this.idUsuario = idUsuario;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((fechaDeModificacion == null) ? 0 : fechaDeModificacion.hashCode());
		result = prime * result + (int) (idTipoFabrica ^ (idTipoFabrica >>> 32));
		result = prime * result + (int) (idUsuario ^ (idUsuario >>> 32));
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		result = prime * result + status;
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
		CatTipoFabrica other = (CatTipoFabrica) obj;
		if (fechaDeModificacion == null) {
			if (other.fechaDeModificacion != null)
				return false;
		} else if (!fechaDeModificacion.equals(other.fechaDeModificacion))
			return false;
		if (idTipoFabrica != other.idTipoFabrica)
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
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "CatTipoFabrica [idTipoFabrica=" + idTipoFabrica + ", nombre=" + nombre + ", status=" + status
				+ ", fechaDeModificacion=" + fechaDeModificacion + ", idUsuario=" + idUsuario + "]";
	}
}
