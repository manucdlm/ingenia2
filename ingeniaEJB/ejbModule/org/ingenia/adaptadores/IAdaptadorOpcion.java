package org.ingenia.adaptadores;

import org.ingenia.comunes.excepcion.AdaptadorException;
import org.ingenia.comunes.vo.OpcionVO;
import org.ingenia.negocio.entidades.Opcion;
 
public abstract class IAdaptadorOpcion {
	Opcion opcion = null;
	OpcionVO opcionVO = null;

	public abstract Opcion getOpcion() throws AdaptadorException;

	public abstract OpcionVO getOpcionVO() throws AdaptadorException;

}
