package org.ingenia.negocio.entidades;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the estructura database table.
 * 
 */
@Entity
@NamedQuery(name="Estructura.findAll", query="SELECT e FROM Estructura e")
public class Estructura implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int idestructura;

	@Column(name="nombre_estrucutra")
	private String nombreEstrucutra;

	//bi-directional many-to-many association to Actividad
	@ManyToMany
	@JoinTable(
		name="estructurabloqueada_actividad"
		, joinColumns={
			@JoinColumn(name="idestructura")
			}
		, inverseJoinColumns={
			@JoinColumn(name="idactividad")
			}
		)
	private List<Actividad> actividads;

	//bi-directional many-to-many association to Raton
	@ManyToMany(mappedBy="estructuras")
	private List<Raton> ratons;

	public Estructura() {
	}

	public int getIdestructura() {
		return this.idestructura;
	}

	public void setIdestructura(int idestructura) {
		this.idestructura = idestructura;
	}

	public String getNombreEstrucutra() {
		return this.nombreEstrucutra;
	}

	public void setNombreEstrucutra(String nombreEstrucutra) {
		this.nombreEstrucutra = nombreEstrucutra;
	}

	public List<Actividad> getActividads() {
		return this.actividads;
	}

	public void setActividads(List<Actividad> actividads) {
		this.actividads = actividads;
	}

	public List<Raton> getRatons() {
		return this.ratons;
	}

	public void setRatons(List<Raton> ratons) {
		this.ratons = ratons;
	}

}