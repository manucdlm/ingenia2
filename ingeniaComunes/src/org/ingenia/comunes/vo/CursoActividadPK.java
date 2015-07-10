package org.ingenia.comunes.vo;

import java.io.Serializable;

public class CursoActividadPK implements Serializable {

	private static final long serialVersionUID = 9078778602405637533L;

	private int idcurso;

	private int idactividad;

	public CursoActividadPK() {
	}

	public int getIdcurso() {
		return this.idcurso;
	}

	public void setIdcurso(int idcurso) {
		this.idcurso = idcurso;
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
		if (!(other instanceof CursoActividadPK)) {
			return false;
		}
		CursoActividadPK castOther = (CursoActividadPK) other;
		return (this.idcurso == castOther.idcurso)
				&& (this.idactividad == castOther.idactividad);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.idcurso;
		hash = hash * prime + this.idactividad;

		return hash;
	}
}