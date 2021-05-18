package com.curso.odoo.factura.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.curso.odoo.actividades.model.Activity;
import com.curso.odoo.cliente.model.Cliente;
import com.curso.odoo.estado.model.Estado;
import com.curso.odoo.estadopago.model.EstadoPago;

@Entity
@Table (name="factura")
public class Factura {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer codigofactura;
	
	
	@OneToOne
	@JoinColumn(name="codigocliente")
	private Cliente cliente;
	
	
	@OneToOne
	@JoinColumn(name="codigoactividad")
	private Activity actividad;
	
	
	@OneToOne
	@JoinColumn(name="codigoestado")
	private Estado estado;
	
	@Column
	private	Date fechafactura;
	
	@Column
	private Date fechavencimiento;
	
	@Column
	private	Double impuestos;
	
	@Column
	private Double total;
	
	
	@OneToOne
	@JoinColumn(name="codigoestadopago")
	private EstadoPago estadopago;
	
	public Integer getCodigofactura() {
		return codigofactura;
	}
	public void setCodigofactura(Integer codigofactura) {
		this.codigofactura = codigofactura;
	}
	
	
	
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
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
	public Activity getActividad() {
		return actividad;
	}
	public void setActividad(Activity actividad) {
		this.actividad = actividad;
	}
	public Estado getEstado() {
		return estado;
	}
	public void setEstado(Estado estado) {
		this.estado = estado;
	}
	public EstadoPago getEstadopago() {
		return estadopago;
	}
	public void setEstadopago(EstadoPago estadopago) {
		this.estadopago = estadopago;
	}
	
	
	
	
	
}
