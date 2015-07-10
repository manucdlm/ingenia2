package org.ingenia.negocio.entidades;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the juego database table.
 * 
 */
@Entity
@NamedQuery(name="Juego.findAll", query="SELECT j FROM Juego j")
public class Juego implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int idjuego;

	@Column(name="descripcion_juego")
	private String descripcionJuego;

	private String nombre;

	//bi-directional many-to-one association to Actividad
	@OneToMany(mappedBy="juego")
	private List<Actividad> actividads;

	public Juego() {
	}

	public int getIdjuego() {
		return this.idjuego;
	}

	public void setIdjuego(int idjuego) {
		this.idjuego = idjuego;
	}

	public String getDescripcionJuego() {
		return this.descripcionJuego;
	}

	public void setDescripcionJuego(String descripcionJuego) {
		this.descripcionJuego = descripcionJuego;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<Actividad> getActividads() {
		return this.actividads;
	}

	public void setActividads(List<Actividad> actividads) {
		this.actividads = actividads;
	}

	public Actividad addActividad(Actividad actividad) {
		getActividads().add(actividad);
		actividad.setJuego(this);

		return actividad;
	}

	public Actividad removeActividad(Actividad actividad) {
		getActividads().remove(actividad);
		actividad.setJuego(null);

		return actividad;
	}

}