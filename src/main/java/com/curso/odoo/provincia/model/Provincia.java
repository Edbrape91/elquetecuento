package com.curso.odoo.provincia.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table (name="provincia")
public class Provincia {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer codigoprovincia;
		
	@Column
    private Integer codigopais;
			
	@Column
    private String nombreprovincia;
    
	public Integer getCodigopais() {
		return codigopais;
	}
	public void setCodigopais(Integer codigopais) {
		this.codigopais = codigopais;
	}
	public Integer getCodigoprovincia() {
		return codigoprovincia;
	}
	public void setCodigoprovincia(Integer codigoprovincia) {
		this.codigoprovincia = codigoprovincia;
	}
	public String getNombreprovincia() {
		return nombreprovincia;
	}
	public void setNombreprovincia(String nombreprovincia) {
		this.nombreprovincia = nombreprovincia;
	}
	
}
