package com.curso.odoo.etc.modelos;

public class Venta {
	
	private int CodigoCliente;
	private int CodigoPresupuesto;
	private String FechaPresupuesto;
	private int CodigoComercial;
	private String Actividad;
	private int CodigoEstado;
	private int Total;
	
	
	
	public int getCodigoPresupuesto() {
		return CodigoPresupuesto;
	}
	
	public void setCodigoPresupuesto(int codigoPresupuesto) {
		CodigoPresupuesto = codigoPresupuesto;
	}
	
	public String getFechaPresupuesto() {
		return FechaPresupuesto;
	}
	
	public void setFechaPresupuesto(String fechaPresupuesto) {
		FechaPresupuesto = fechaPresupuesto;
	}
	
	public int getCodigoCliente() {
		return CodigoCliente;
	}
	
	public void setCodigoCliente(int codigoCliente) {
		CodigoCliente = codigoCliente;
	}
	
	public int getCodigoComercial() {
		return CodigoComercial;
	}
	
	public void setCodigoComercial(int codigoComercial) {
		CodigoComercial = codigoComercial;
	}
	
	public String getActividad() {
		return Actividad;
	}
	
	public void setActividad(String actividad) {
		Actividad = actividad;
	}
	
	public int getCodigoEstado() {
		return CodigoEstado;
	}
	
	public void setCodigoEstado(int codigoEstado) {
		CodigoEstado = codigoEstado;
	}
	
	public int getTotal() {
		return Total;
	}
	
	public void setTotal(int total) {
		Total = total;
	}
	
	
	
	

}