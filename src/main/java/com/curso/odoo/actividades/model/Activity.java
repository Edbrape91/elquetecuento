package com.curso.odoo.actividades.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table (name="actividad")
public class Activity {

	@Id
	private Integer codigoactividad;
	private String nombreactividad;
	
	public Integer getCodigoactividad() {
		return codigoactividad;
	}
	public void setCodigoactividad(Integer codigoactividad) {
		this.codigoactividad = codigoactividad;
	}
	public String getNombreactividad() {
		return nombreactividad;
	}
	public void setNombreactividad(String nombreactividad) {
		this.nombreactividad = nombreactividad;
	}


}
