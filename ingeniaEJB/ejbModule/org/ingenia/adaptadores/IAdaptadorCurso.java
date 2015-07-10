package org.ingenia.adaptadores;

import org.ingenia.comunes.excepcion.AdaptadorException;
import org.ingenia.comunes.vo.CursoVO;
import org.ingenia.negocio.entidades.Curso;

public abstract class IAdaptadorCurso {
	Curso curso = null;
	CursoVO cursoVO = null;

	public abstract Curso getCurso() throws AdaptadorException;

	public abstract CursoVO getCursoVO() throws AdaptadorException;

}
