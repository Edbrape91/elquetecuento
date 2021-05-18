package com.curso.odoo.provincia.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.curso.odoo.pais.model.Pais;



@Entity
@Table (name="provincia")
public class Provincia {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer codigoprovincia;
		
	
	@OneToOne
	@JoinColumn(name = "codigopais")
    private Pais pais;
			
	@Column
    private String nombreprovincia;
    
	
	public Pais getPais() {
		return pais;
	}
	public void setPais(Pais pais) {
		this.pais = pais;
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
