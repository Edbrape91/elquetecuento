package com.curso.odoo.actividades.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table (name="actividad")
public class Activity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer codigoactividad;
	
	@Column
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
