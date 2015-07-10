package org.ingenia.negocio.igestor;

import java.util.List;

import javax.ejb.Remote;

import org.ingenia.comunes.excepcion.AdaptadorException;
import org.ingenia.comunes.vo.RolVO;
import org.ingenia.comunes.vo.UsuarioVO;

@Remote
public interface IGestorUsuariosRemote {

	public List<UsuarioVO> consultarUsuarios(UsuarioVO usuario);

	public UsuarioVO consultarUsuario(UsuarioVO usuario);

	public UsuarioVO modificarUsuario(UsuarioVO usuario)
			throws AdaptadorException;

	public void crearUsuario(UsuarioVO usuario) throws AdaptadorException;

	public List<RolVO> consultarRoles(RolVO rol);

	public RolVO consultarRol(RolVO rol);

	public RolVO modificarRol(RolVO rol) throws AdaptadorException;

	public void CrearRol(RolVO rol) throws AdaptadorException;

}
