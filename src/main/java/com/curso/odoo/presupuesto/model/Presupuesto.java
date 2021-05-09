package com.curso.odoo.presupuesto.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table (name="presupuesto")
public class Presupuesto {

	@Id
    private Integer codigopresupuesto;
	private Date fechapresupuesto;
	private Double total;
	private Integer codigocliente;
	private Integer codigocomercial;
	private Integer codigoactividad;
	private Integer codigoestado;
	
	
	public Integer getCodigopresupuesto() {
		return codigopresupuesto;
	}
	public void setCodigopresupuesto(Integer codigopresupuesto) {
		this.codigopresupuesto = codigopresupuesto;
	}
	public Date getFechapresupuesto() {
		return fechapresupuesto;
	}
	public void setFechapresupuesto(Date fechapresupuesto) {
		this.fechapresupuesto = fechapresupuesto;
	}
	public Double getTotal() {
		return total;
	}
	public void setTotal(Double total) {
		this.total = total;
	}
	public Integer getCodigocliente() {
		return codigocliente;
	}
	public void setCodigocliente(Integer codigocliente) {
		this.codigocliente = codigocliente;
	}
	public Integer getCodigocomercial() {
		return codigocomercial;
	}
	public void setCodigocomercial(Integer codigocomercial) {
		this.codigocomercial = codigocomercial;
	}
	public Integer getCodigoactividad() {
		return codigoactividad;
	}
	public void setCodigoactividad(Integer codigoactividad) {
		this.codigoactividad = codigoactividad;
	}
	public Integer getCodigoestado() {
		return codigoestado;
	}
	public void setCodigoestado(Integer codigoestado) {
		this.codigoestado = codigoestado;
	}
	
}
