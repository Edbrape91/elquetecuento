package com.curso.odoo.presupuesto.model;

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
import com.curso.odoo.comercial.model.Comercial;
import com.curso.odoo.estado.model.Estado;



@Entity
@Table (name="presupuesto")
public class Presupuesto {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer codigopresupuesto;
	
	@Column
	private Date fechapresupuesto;
	
	@Column
	private Double total;
	
	
	@OneToOne
	@JoinColumn(name = "codigocliente")
	private Cliente cliente;
	
	
	@OneToOne
	@JoinColumn(name = "codigocomercial")
	private Comercial comercial;
	
	
	@OneToOne
	@JoinColumn(name = "codigoactividad")
	private Activity actividad;
	
	
	@OneToOne
	@JoinColumn(name = "codigoestado")
	private Estado estado;
	
	
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
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public Comercial getComercial() {
		return comercial;
	}
	public void setComercial(Comercial comercial) {
		this.comercial = comercial;
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
	
	
}
