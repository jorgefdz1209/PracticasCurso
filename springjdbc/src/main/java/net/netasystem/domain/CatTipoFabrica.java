package net.netasystem.domain;

import java.math.BigDecimal;
import java.util.Date;
/**
 * Bean de la tabla 
 * @author Netasystems/Jorge Saul 
 */
public class CatTipoFabrica {
	/**
	 * Tipo {@link Long} para el id 
	 */
	private BigDecimal idTipoFabrica;
	/**
	 * Tipo {@link String} para el nombre del tipo
	 */
	private String nombre;
	/**
	 * Tipo {@link String} para el estado de la tupla 
	 */
	private String status;
	/**
	 * Tipo {@link Date} para la fecha de modificación de la tupla 
	 */
	private Date fechaDeModificacion;
	/**
	 * Tipo {@link Long} para el Id del usuario que realizó la modificación 
	 */
	private BigDecimal idUsuario;
	
	
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
	 * @param l {@link Character} para el estado del la tupla 
	 * @param fechaDeModificacion {@link Date} para la fecha de modificación de la tupla 
	 * @param idUsuario {@link Long} el id del usuario que hizo la modificación 
	 */
	public CatTipoFabrica(BigDecimal idTipoFabrica, String nombre, String estado, Date fechaDeModificacion, BigDecimal idUsuario) {
		super();
		this.idTipoFabrica = idTipoFabrica;
		this.nombre = nombre;
		this.status = estado;
		this.fechaDeModificacion = fechaDeModificacion;
		this.idUsuario = idUsuario;
	}
	
	/**
	 * Devuelve el idTipoFabrica 
	 * @return el idTipoFabrica
	 */
	public BigDecimal getIdTipoFabrica() {
		return idTipoFabrica;
	}

	/**
	 * Asignar el idTipoFabrica 
	 * @param idTipoFabrica el idTipoFabrica a asignar 
	 */
	public void setIdTipoFabrica(BigDecimal idTipoFabrica) {
		this.idTipoFabrica = idTipoFabrica;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * @param status the status to set
	 */
	public void setStatus(String status) {
		this.status = status;
	}

	/**
	 * @return the fechaDeModificacion
	 */
	public Date getFechaDeModificacion() {
		return fechaDeModificacion;
	}

	/**
	 * @param fechaDeModificacion the fechaDeModificacion to set
	 */
	public void setFechaDeModificacion(Date fechaDeModificacion) {
		this.fechaDeModificacion = fechaDeModificacion;
	}

	/**
	 * @return the idUsuario
	 */
	public BigDecimal getIdUsuario() {
		return idUsuario;
	}

	/**
	 * @param idUsuario the idUsuario to set
	 */
	public void setIdUsuario(BigDecimal idUsuario) {
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
		result = prime * result + ((idTipoFabrica == null) ? 0 : idTipoFabrica.hashCode());
		result = prime * result + ((idUsuario == null) ? 0 : idUsuario.hashCode());
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		result = prime * result + ((status == null) ? 0 : status.hashCode());
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
		if (idTipoFabrica == null) {
			if (other.idTipoFabrica != null)
				return false;
		} else if (!idTipoFabrica.equals(other.idTipoFabrica))
			return false;
		if (idUsuario == null) {
			if (other.idUsuario != null)
				return false;
		} else if (!idUsuario.equals(other.idUsuario))
			return false;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		if (status == null) {
			if (other.status != null)
				return false;
		} else if (!status.equals(other.status))
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
