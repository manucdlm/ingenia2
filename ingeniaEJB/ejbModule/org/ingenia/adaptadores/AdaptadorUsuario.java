package org.ingenia.adaptadores;
 
import org.ingenia.comunes.excepcion.AdaptadorException;
import org.ingenia.comunes.vo.UsuarioVO;
import org.ingenia.negocio.entidades.Usuario;

public class AdaptadorUsuario extends IAdaptadorUsuario {

	public AdaptadorUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public AdaptadorUsuario(UsuarioVO usuarioVO) {
		this.usuarioVO = usuarioVO;
	}

	@Override
	public Usuario getUsuario() throws AdaptadorException {
		Usuario usuario = null;
		if (usuarioVO == null)
			return null;
		usuario = new Usuario();
		usuario.setApellido(usuarioVO.getApellido());
		usuario.setCorreo(usuarioVO.getCorreo());
		usuario.setFechaCreacion(usuarioVO.getFechaCreacion());
		usuario.setFechaUltimoIngreso(usuarioVO.getFechaUltimoIngreso());
		usuario.setGenero(null);
		usuario.setIdusuario(usuarioVO.getId());
		usuario.setNombre(usuarioVO.getNombre());
		usuario.setClave(usuarioVO.getClave());
		usuario.setAlias(usuarioVO.getAlias());
		return usuario;
	}

	@Override
	public UsuarioVO getUsuarioVO() throws AdaptadorException {
		UsuarioVO usuarioVO = null;
		if (usuario == null)
			return null;

		usuarioVO = new UsuarioVO();
		usuarioVO.setApellido(usuario.getApellido());
		usuarioVO.setCorreo(usuario.getCorreo());
		usuarioVO.setFechaCreacion(usuario.getFechaCreacion());
		usuarioVO.setFechaUltimoIngreso(usuario.getFechaUltimoIngreso());
		usuarioVO.setGenero(null);
		usuarioVO.setId(usuario.getIdusuario());
		usuarioVO.setNombre(usuario.getNombre());
		usuarioVO.setClave(usuario.getClave());
		usuarioVO.setAlias(usuario.getAlias());
		return usuarioVO;
	}

}
