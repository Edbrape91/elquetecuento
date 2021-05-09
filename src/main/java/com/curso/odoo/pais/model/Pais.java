package com.curso.odoo.pais.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table (name="pais")
public class Pais {

	@Id
    private Integer codigopais;
    private String nombrepais;
    
	public Integer getCodigopais() {
		return codigopais;
	}
	public void setCodigopais(Integer codigopais) {
		this.codigopais = codigopais;
	}
	public String getNombrepais() {
		return nombrepais;
	}
	public void setNombrepais(String nombrepais) {
		this.nombrepais = nombrepais;
	}
	
}
