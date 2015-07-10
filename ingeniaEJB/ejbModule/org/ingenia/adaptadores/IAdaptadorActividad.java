package org.ingenia.adaptadores;

import org.ingenia.comunes.excepcion.AdaptadorException;
import org.ingenia.comunes.vo.ActividadVO;
import org.ingenia.negocio.entidades.Actividad;


public abstract class IAdaptadorActividad {
	
	Actividad actividad;
	ActividadVO actividadVO;
	
	public abstract Actividad getActividad() throws AdaptadorException;

	public abstract ActividadVO getActividadVO() throws AdaptadorException;

}
