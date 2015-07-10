package org.ingenia.presentacion.beans;

import java.util.List;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;

import org.ingenia.comunes.vo.RolVO;
import org.ingenia.negocio.igestor.IGestorUsuariosLocal;
import org.ingenia.presentacion.BaseMB;
import org.springframework.context.annotation.Scope;

@ManagedBean(name = "rolMB")
@Scope("session")
public class RolMB extends BaseMB {

	private static final long serialVersionUID = -8421653049064155113L;

	@EJB
	private IGestorUsuariosLocal gestorUsuarios;

	private RolVO rolvo;
	private String rol;
	private List<RolVO> listaRoles;

	public RolMB() {

	}

	public RolVO getRolvo() {
		return rolvo;
	}

	public void setRolvo(RolVO rolvo) {
		this.rolvo = rolvo;
	}

	public String getRol() {
		return rol;
	}

	public void setRol(String rol) {
		this.rol = rol;
	}

	public List<RolVO> getListaRoles() {
		return listaRoles;
	}

	public void setListaRoles(List<RolVO> listaRoles) {
		this.listaRoles = listaRoles;
	}
}
