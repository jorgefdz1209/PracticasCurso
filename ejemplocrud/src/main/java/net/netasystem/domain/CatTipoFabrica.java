package net.netasystem.domain;

import java.util.Date;
/**
 * Bean of the table 
 * @author Jorge Saul 
 */
public class CatTipoFabrica {
	private long idTipoFabrica;
	private String nombre;
	private Character status;
	private Date fechaDeModificacion;
	private Long idUsuario;
	
	
	/**
	 * Constructor without params  
	 */
	public CatTipoFabrica() {
		super();
	}
	
	/**
	 * Constructor with all the parameters 
	 * @param idTipoFabrica Long id in the table 
	 * @param nombre String Description of type of factory 
	 * @param status Char status of  the row 
	 * @param fechaDeModificacion Date modification of the row 
	 * @param idUsuario Long id of who do it the last modification 
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
	 * Method of get idTipoFabrica 
	 * @return Long idTipofabrica 
	 */
	public long getIdTipoFabrica() {
		return idTipoFabrica;
	}
	
	/**
	 * Method of set idTipodfabrica 
	 * @param idTipoFabrica Long the id for set 
	 */
	public void setIdTipoFabrica(long idTipoFabrica) {
		this.idTipoFabrica = idTipoFabrica;
	}
	/**
	 * Method of get nombre 
	 * @return String contains the param nombre
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * Method of set nombre 
	 * @param nombre String for set 
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/**
	 * Method of get status 
	 * @return Character with status 
	 */
	public Character getStatus() {
		return status;
	}
	/**
	 * Method of set status 
	 * @param status for set 
	 */
	public void setStatus(Character status) {
		this.status = status;
	}
	/**
	 * Method of get fechaModificacion 
	 * @return Date with the date of last modification 
	 */
	public Date getFechaDeModificacion() {
		return fechaDeModificacion;
	}
	/**
	 * Method of set fechaModificacion 
	 * @param fechaDeModificacion for set 
	 */
	public void setFechaDeModificacion(Date fechaDeModificacion) {
		this.fechaDeModificacion = fechaDeModificacion;
	}
	/**
	 * Method of get idUsuario
	 * @return Long idUsuario the last modofication 
	 */
	public long getIdUsuario() {
		return idUsuario;
	}
	/**
	 * Method of set idUsuario 
	 * @param idUsuario for set 
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
