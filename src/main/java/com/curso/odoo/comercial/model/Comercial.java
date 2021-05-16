package com.curso.odoo.comercial.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table (name="comercial")
public class Comercial {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer codigocomercial;  
	
	@Column
    private String nombrecomercial;  
	
	@Column
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
