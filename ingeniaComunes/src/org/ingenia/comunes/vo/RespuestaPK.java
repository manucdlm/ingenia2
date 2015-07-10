package org.ingenia.comunes.vo;

import java.io.Serializable;

public class RespuestaPK implements Serializable {

	private static final long serialVersionUID = -2949455713006107702L;

	private int idrespuesta;

	private int idactividad;

	public RespuestaPK() {
	}

	public int getIdrespuesta() {
		return this.idrespuesta;
	}

	public void setIdrespuesta(int idrespuesta) {
		this.idrespuesta = idrespuesta;
	}

	public int getIdactividad() {
		return this.idactividad;
	}

	public void setIdactividad(int idactividad) {
		this.idactividad = idactividad;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof RespuestaPK)) {
			return false;
		}
		RespuestaPK castOther = (RespuestaPK) other;
		return (this.idrespuesta == castOther.idrespuesta)
				&& (this.idactividad == castOther.idactividad);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.idrespuesta;
		hash = hash * prime + this.idactividad;

		return hash;
	}
}