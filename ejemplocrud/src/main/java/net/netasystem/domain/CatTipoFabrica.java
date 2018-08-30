package net.netasystem.domain;

import java.util.Date;

public class CatTipoFabrica {
	private long idTipoFabrica;
	private String nombre;
	private Character status;
	private Date fechaDeModificacion;
	private Long idUsuario;
	
	public CatTipoFabrica() {
		super();
	}
	
	public CatTipoFabrica(long idTipoFabrica, String nombre, char status, Date fechaDeModificacion, long idUsuario) {
		super();
		this.idTipoFabrica = idTipoFabrica;
		this.nombre = nombre;
		this.status = status;
		this.fechaDeModificacion = fechaDeModificacion;
		this.idUsuario = idUsuario;
	}
	public long getIdTipoFabrica() {
		return idTipoFabrica;
	}
	public void setIdTipoFabrica(long idTipoFabrica) {
		this.idTipoFabrica = idTipoFabrica;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Character getStatus() {
		return status;
	}
	public void setStatus(Character status) {
		this.status = status;
	}
	public Date getFechaDeModificacion() {
		return fechaDeModificacion;
	}
	public void setFechaDeModificacion(Date fechaDeModificacion) {
		this.fechaDeModificacion = fechaDeModificacion;
	}
	public long getIdUsuario() {
		return idUsuario;
	}
	public void setIdUsuario(Long idUsuario) {
		this.idUsuario = idUsuario;
	}
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
	@Override
	public String toString() {
		return "CatTipoFabrica [idTipoFabrica=" + idTipoFabrica + ", nombre=" + nombre + ", status=" + status
				+ ", fechaDeModificacion=" + fechaDeModificacion + ", idUsuario=" + idUsuario + "]";
	}
}
