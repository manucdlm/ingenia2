package org.ingenia.comunes.vo;

import java.io.Serializable;
import java.util.List;

public class EstudianteVO implements Serializable {

	private static final long serialVersionUID = -1788169485656747855L;

	private int idestudiante;

	private List<CursoVO> cursos;

	public EstudianteVO() {
	}

	public int getIdestudiante() {
		return this.idestudiante;
	}

	public void setIdestudiante(int idestudiante) {
		this.idestudiante = idestudiante;
	}

	public List<CursoVO> getCursos() {
		return this.cursos;
	}

	public void setCursos(List<CursoVO> cursos) {
		this.cursos = cursos;
	}

}