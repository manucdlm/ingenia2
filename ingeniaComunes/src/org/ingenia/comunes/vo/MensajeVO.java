package org.ingenia.comunes.vo;

import java.io.Serializable;

import org.ingenia.comunes.vo.UsuarioVO;

public class MensajeVO implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 8266977523611594466L;

	private int idmensaje;

	private UsuarioVO usuario1;

	private UsuarioVO usuario2;

	public MensajeVO() {
	}

	public int getIdmensaje() {
		return this.idmensaje;
	}

	public void setIdmensaje(int idmensaje) {
		this.idmensaje = idmensaje;
	}

	public UsuarioVO getUsuario1() {
		return this.usuario1;
	}

	public void setUsuario1(UsuarioVO usuario1) {
		this.usuario1 = usuario1;
	}

	public UsuarioVO getUsuario2() {
		return this.usuario2;
	}

	public void setUsuario2(UsuarioVO usuario2) {
		this.usuario2 = usuario2;
	}

}