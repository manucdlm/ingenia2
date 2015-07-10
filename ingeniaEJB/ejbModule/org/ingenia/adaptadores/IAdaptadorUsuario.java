package org.ingenia.adaptadores;

import org.ingenia.comunes.excepcion.AdaptadorException;
import org.ingenia.comunes.vo.UsuarioVO;
import org.ingenia.negocio.entidades.Usuario;

public abstract class IAdaptadorUsuario {
	Usuario usuario = null;
	UsuarioVO usuarioVO = null;

	public abstract Usuario getUsuario() throws AdaptadorException;

	public abstract UsuarioVO getUsuarioVO() throws AdaptadorException;

}
