package com.curso.odoo.estadopago.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table (name="estadopago")
public class EstadoPago {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer codigoestadopago;
	
	@Column
    private String nombreestadopago;
    
	public Integer getCodigoestadopago() {
		return codigoestadopago;
	}
	public void setCodigoestadopago(Integer codigoestadopago) {
		this.codigoestadopago = codigoestadopago;
	}
	public String getNombreestadopago() {
		return nombreestadopago;
	}
	public void setNombreestadopago(String nombreestadopago) {
		this.nombreestadopago = nombreestadopago;
	}
}
