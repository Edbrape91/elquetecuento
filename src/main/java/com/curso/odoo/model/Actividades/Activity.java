package com.curso.odoo.model.Actividades;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table (name="actividad")
public class Activity {

	@Id
	private int codigoactividad;
	private String nombreactividad;
	public int getcodigoactividad() {
		return codigoactividad;
	}
	public void setcodigoactividad(int codigoactividad) {
		this.codigoactividad = codigoactividad;
	}
	public String getnombreactividad() {
		return nombreactividad;
	}
	public void setnombreactividad(String nombreactividad) {
		this.nombreactividad = nombreactividad;
	}
	

}
