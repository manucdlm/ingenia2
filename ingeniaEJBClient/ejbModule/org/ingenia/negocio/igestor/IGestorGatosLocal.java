package org.ingenia.negocio.igestor;

import java.util.List;

import javax.ejb.Local;

import org.ingenia.comunes.excepcion.AdaptadorException;
import org.ingenia.comunes.vo.ActividadVO;
import org.ingenia.comunes.vo.ArmaVO;
import org.ingenia.comunes.vo.ColorVO;
import org.ingenia.comunes.vo.GatoVO;
import org.ingenia.comunes.vo.TipoGatoVO;



@Local
public interface IGestorGatosLocal {

	List<TipoGatoVO> consultarTiposGato() throws AdaptadorException;

	List<ColorVO> consultarColores() throws AdaptadorException;

	List<ArmaVO> consultarArmas() throws AdaptadorException;

	void modificarGato(GatoVO gatoVO) throws AdaptadorException;

	void crearGato(GatoVO gatoVO,ActividadVO actividadVO) throws AdaptadorException;

	GatoVO consultarGatoVO(GatoVO gatoVO) throws AdaptadorException;

	List<GatoVO> consultarGatos(ActividadVO actividadVO) throws AdaptadorException;
	
	
}
