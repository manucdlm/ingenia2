package org.ingenia.adaptadores;

import java.util.ArrayList;
import java.util.List;

import org.ingenia.comunes.excepcion.AdaptadorException;
import org.ingenia.comunes.vo.OpcionVO;
import org.ingenia.comunes.vo.RolVO;
import org.ingenia.negocio.entidades.Opcion;
import org.ingenia.negocio.entidades.Rol;

public class AdaptadorRol extends IAdaptadorRol {

	public AdaptadorRol(Rol rol) {
		this.rol = rol;
	}

	public AdaptadorRol(RolVO rolVO) {
		this.rolVO = rolVO;
	}

	@Override
	public Rol getRol() throws AdaptadorException {
		Rol rol = null;
		if (rolVO == null)
			return null;
		rol = new Rol();
		rol.setNombre(rolVO.getNombre());
		rol.setDescripcion(rolVO.getDescripcion());
		rol.setIdRol(rolVO.getIdRol());
		rol.setEstado(rolVO.isEstado() ? "S" : "N");
		return rol;
	}

	@Override
	public RolVO getRolVO() throws AdaptadorException {
		RolVO rolVO = null;
		List<OpcionVO> listaOpciones;
		AdaptadorOpcion adaptadorOpcion = null;

		if (rol == null)
			return null;

		rolVO = new RolVO();
		rolVO.setNombre(rol.getNombre());
		rolVO.setDescripcion(rol.getDescripcion());
		rolVO.setIdRol(rol.getIdRol());
		if (rol.getEstado() != null)
			rolVO.setEstado(rol.getEstado().equals("S") ? Boolean.TRUE
					: Boolean.FALSE);
		else
			rolVO.setEstado(Boolean.FALSE);
		if (rol.getOpcions() != null) {
			listaOpciones = new ArrayList<OpcionVO>();
			for (Opcion opcion : rol.getOpcions()) {
				adaptadorOpcion = new AdaptadorOpcion(opcion);
				listaOpciones.add(adaptadorOpcion.getOpcionVO());
			}
			rolVO.setOpcions(listaOpciones);
		}
		return rolVO;
	}

}
