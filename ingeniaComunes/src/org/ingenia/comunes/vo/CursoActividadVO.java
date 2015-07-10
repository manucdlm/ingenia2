package org.ingenia.comunes.vo;

import java.io.Serializable;

public class CursoActividadVO implements Serializable {
	private static final long serialVersionUID = 1L;

	private CursoActividadPK id;

	private int posicion;

	private ActividadVO actividad;

	private CursoVO curso;

	public CursoActividadVO() {
	}

	public CursoActividadPK getId() {
		return this.id;
	}

	public void setId(CursoActividadPK id) {
		this.id = id;
	}

	public int getPosicion() {
		return this.posicion;
	}

	public void setPosicion(int posicion) {
		this.posicion = posicion;
	}

	public ActividadVO getActividad() {
		return this.actividad;
	}

	public void setActividad(ActividadVO actividad) {
		this.actividad = actividad;
	}

	public CursoVO getCurso() {
		return this.curso;
	}

	public void setCurso(CursoVO curso) {
		this.curso = curso;
	}

}