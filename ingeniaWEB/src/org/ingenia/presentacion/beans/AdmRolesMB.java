package org.ingenia.presentacion.beans;

import java.util.List;
import java.util.Map;

import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import org.ingenia.comunes.excepcion.AdaptadorException;
import org.ingenia.comunes.vo.RolVO;
import org.ingenia.negocio.igestor.IGestorUsuariosLocal;
import org.ingenia.presentacion.BaseMB;

@ManagedBean(name = "AdmRolMB")
@SessionScoped
public class AdmRolesMB extends BaseMB {

	private static final long serialVersionUID = 5198983008576748399L;
	
	private String rol;
	private List<RolVO> listaRoles;
	private RolVO rolVO;

	private final static String NAV_IRROL = "irrol";
	private final static String NAV_IRADMROL = "iradminrol";

	@EJB
	IGestorUsuariosLocal gestorUsuarios;

	public String buscar() {

		RolVO rolVO = new RolVO();
		rolVO.setNombre(rol);
		listaRoles = gestorUsuarios.consultarRoles(rolVO);
		return NAV_IRADMROL;
	}

	public void crear() {
		RolVO rolVO = new RolVO();
		rolVO.setNombre(this.rol);
		try {
			gestorUsuarios.CrearRol(rolVO);

		} catch (AdaptadorException e) {
			FacesContext.getCurrentInstance().addMessage(
					null,
					new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error",
							"Error de concersion de tipos!"));
			e.printStackTrace();
		} catch (Exception e) {
			FacesContext.getCurrentInstance().addMessage(
					null,
					new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error", e
							.getMessage()));
			e.printStackTrace();
		}
		FacesContext.getCurrentInstance().addMessage(
				null,
				new FacesMessage(FacesMessage.SEVERITY_INFO, "Info",
						"La operacion fue realizada satisfactoriamente !"));
	}

	public String irRol() {
		FacesContext fc = FacesContext.getCurrentInstance();
		Map<String, String> params = fc.getExternalContext()
				.getRequestParameterMap();

		String id = params.get("id");
		RolVO rolVOt = new RolVO();
		rolVOt.setIdRol(Integer.parseInt(id));
		this.rolVO = gestorUsuarios.consultarRol(rolVOt);

		return NAV_IRROL;
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

	public RolVO getRolVO() {
		return rolVO;
	}

	public void setRolVO(RolVO rolVO) {
		this.rolVO = rolVO;
	}
}
