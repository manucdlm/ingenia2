package org.ingenia.comunes.vo;

import java.io.Serializable;

public class JuegoVO implements Serializable {
	private static final long serialVersionUID = 1L;
	private int idJuego;

	private String nombre;

	public JuegoVO() {
	}

	public int getIdjuego() {
		return this.idJuego;
	}

	public void setIdjuego(int idJuego) {
		this.idJuego = idJuego;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}