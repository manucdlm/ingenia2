package org.ingenia.adaptadores;

import org.ingenia.comunes.excepcion.AdaptadorException;
import org.ingenia.comunes.vo.RolVO;
import org.ingenia.negocio.entidades.Rol;

public abstract class IAdaptadorRol {
	Rol rol = null;
	RolVO rolVO = null;

	public abstract Rol getRol() throws AdaptadorException;

	public abstract RolVO getRolVO() throws AdaptadorException;

}
