package com.curso.odoo.factura.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="factura")
public class Factura {

	@Id
	private Integer codigofactura;
	private Integer codigocliente;
	private Integer codigoactividad;
	private Integer codigoestado;
	private	Date fechafactura;
	private Date fechavencimiento;
	private	Double impuestos;
	private Double total;
	private Integer codigoestadopago;
	
	public Integer getCodigofactura() {
		return codigofactura;
	}
	public void setCodigofactura(Integer codigofactura) {
		this.codigofactura = codigofactura;
	}
	public Integer getCodigocliente() {
		return codigocliente;
	}
	public void setCodigocliente(Integer codigocliente) {
		this.codigocliente = codigocliente;
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
	public Date getFechafactura() {
		return fechafactura;
	}
	public void setFechafactura(Date fechafactura) {
		this.fechafactura = fechafactura;
	}
	public Date getFechavencimiento() {
		return fechavencimiento;
	}
	public void setFechavencimiento(Date fechavencimiento) {
		this.fechavencimiento = fechavencimiento;
	}
	public Double getImpuestos() {
		return impuestos;
	}
	public void setImpuestos(Double impuestos) {
		this.impuestos = impuestos;
	}
	public Double getTotal() {
		return total;
	}
	public void setTotal(Double total) {
		this.total = total;
	}
	public Integer getCodigoestadopago() {
		return codigoestadopago;
	}
	public void setCodigoestadopago(Integer codigoestadopago) {
		this.codigoestadopago = codigoestadopago;
	}
	
	
	
	
}
