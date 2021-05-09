package com.curso.odoo.estado.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table (name="estado")
public class Estado {

	@Id
    private Integer codigoestado;
    private String nombreestado;
    
	public Integer getCodigoestado() {
		return codigoestado;
	}
	public void setCodigoestado(Integer codigoestado) {
		this.codigoestado = codigoestado;
	}
	public String getNombreestado() {
		return nombreestado;
	}
	public void setNombreestado(String nombreestado) {
		this.nombreestado = nombreestado;
	}
	
}
