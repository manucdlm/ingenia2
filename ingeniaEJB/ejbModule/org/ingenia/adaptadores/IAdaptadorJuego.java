package org.ingenia.adaptadores;

import org.ingenia.comunes.excepcion.AdaptadorException;
import org.ingenia.comunes.vo.JuegoVO;
import org.ingenia.negocio.entidades.Juego;


public abstract class IAdaptadorJuego {

	Juego juego = null;
	JuegoVO juegoVO = null;

	public abstract Juego getJuego() throws AdaptadorException;

	public abstract JuegoVO getJuegoVO() throws AdaptadorException;
	
}
