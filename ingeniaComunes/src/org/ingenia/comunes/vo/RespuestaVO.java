package org.ingenia.comunes.vo;

import java.io.Serializable;

public class RespuestaVO implements Serializable {

	private static final long serialVersionUID = -277869011529459703L;

	private RespuestaPK id;

	private int orden;

	private String valor;

	private byte verdadero;
	private ActividadVO actividad;

	public RespuestaVO() {
	}

	public RespuestaPK getId() {
		return this.id;
	}

	public void setId(RespuestaPK id) {
		this.id = id;
	}

	public int getOrden() {
		return this.orden;
	}

	public void setOrden(int orden) {
		this.orden = orden;
	}

	public String getValor() {
		return this.valor;
	}

	public void setValor(String valor) {
		this.valor = valor;
	}

	public byte getVerdadero() {
		return this.verdadero;
	}

	public void setVerdadero(byte verdadero) {
		this.verdadero = verdadero;
	}

	public ActividadVO getActividad() {
		return this.actividad;
	}

	public void setActividad(ActividadVO actividad) {
		this.actividad = actividad;
	}

}