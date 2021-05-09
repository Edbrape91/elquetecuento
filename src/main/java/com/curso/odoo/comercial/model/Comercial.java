package com.curso.odoo.comercial.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table (name="comercial")
public class Comercial {

	@Id
    private Integer codigocomercial;     
    private String nombrecomercial;  
    private String apellidoscomercial;
    
	public Integer getCodigocomercial() {
		return codigocomercial;
	}
	public void setCodigocomercial(Integer codigocomercial) {
		this.codigocomercial = codigocomercial;
	}
	public String getNombrecomercial() {
		return nombrecomercial;
	}
	public void setNombrecomercial(String nombrecomercial) {
		this.nombrecomercial = nombrecomercial;
	}
	public String getApellidoscomercial() {
		return apellidoscomercial;
	}
	public void setApellidoscomercial(String apellidoscomercial) {
		this.apellidoscomercial = apellidoscomercial;
	} 
    
    
}
