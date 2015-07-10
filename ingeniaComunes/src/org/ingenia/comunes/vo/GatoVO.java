package org.ingenia.comunes.vo;

import java.io.Serializable;
import java.util.List;

public class GatoVO implements Serializable {

	private static final long serialVersionUID = -949796013955276126L;

	private int idgato;

	private int idtipogato;

	private String enunciado;
	
	private int idcolor;

	private int orden;
	
	private int defensa;
	
	private int idarma;

	public GatoVO() {
	}

	public int getIdgato() {
		return idgato;
	}

	public void setIdgato(int idgato) {
		this.idgato = idgato;
	}

	public int getIdtipogato() {
		return idtipogato;
	}

	public void setIdtipogato(int idtipogato) {
		this.idtipogato = idtipogato;
	}

	public String getEnunciado() {
		return enunciado;
	}

	public void setEnunciado(String enunciado) {
		this.enunciado = enunciado;
	}

	public int getIdcolor() {
		return idcolor;
	}

	public void setIdcolor(int idcolor) {
		this.idcolor = idcolor;
	}

	public int getOrden() {
		return orden;
	}

	public void setOrden(int orden) {
		this.orden = orden;
	}

	public int getDefensa() {
		return defensa;
	}

	public void setDefensa(int defensa) {
		this.defensa = defensa;
	}

	public int getIdarma() {
		return idarma;
	}

	public void setIdarma(int idarma) {
		this.idarma = idarma;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}




}