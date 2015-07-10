package org.ingenia.presentacion.beans;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;

import org.ingenia.comunes.vo.UsuarioVO;
import org.ingenia.presentacion.BaseMB;
import org.primefaces.context.RequestContext;
import org.springframework.context.annotation.Scope;

@ManagedBean(name = "usuarioMB")
@Scope("session")
public class UsuarioMB extends BaseMB{
 
	private static final long serialVersionUID = -284219328181576347L;

	private String usuario;

	private String clave;
	
	private UsuarioVO usuariovo;

	public String autenticar(){
		return "valido";
	}
	
	public void login(ActionEvent event) {
		RequestContext context = RequestContext.getCurrentInstance();
		FacesMessage message = null;
		boolean loggedIn = false;

		if (usuario != null && usuario.equals("admin") && clave != null
				&& clave.equals("admin")) {
			loggedIn = true;
			message = new FacesMessage(FacesMessage.SEVERITY_INFO,
					"Bienvenido", usuario);
		} else {
			loggedIn = false;
			message = new FacesMessage(FacesMessage.SEVERITY_WARN,
					"Loggin Error", "Invalid credentials");
		}

		FacesContext.getCurrentInstance().addMessage(null, message);
		context.addCallbackParam("loggedIn", loggedIn);
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getClave() {
		return clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}

	public UsuarioVO getUsuariovo() {
		return usuariovo;
	}

	public void setUsuariovo(UsuarioVO usuariovo) {
		this.usuariovo = usuariovo;
	}
}