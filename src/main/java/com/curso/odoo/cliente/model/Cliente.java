package com.curso.odoo.cliente.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table (name="cliente")
public class Cliente {

	@Id
    private Integer codigocliente;
    private String nombrecliente;              
    private String apellidoscliente;          
    private char tipocliente;            
    private Integer codigoprovincia; 
    private String calle;                
    private String calle1;                
    private String ciudad;             
    private Integer codigopostal;             
    private String nif;             
    private String telefono;            
    private String movil;             
    private String email;             
    private String paginaweb;          
    private String categorias;
    
	public Integer getCodigocliente() {
		return codigocliente;
	}
	public void setCodigocliente(Integer codigocliente) {
		this.codigocliente = codigocliente;
	}
	public String getNombrecliente() {
		return nombrecliente;
	}
	public void setNombrecliente(String nombrecliente) {
		this.nombrecliente = nombrecliente;
	}
	public String getApellidoscliente() {
		return apellidoscliente;
	}
	public void setApellidoscliente(String apellidoscliente) {
		this.apellidoscliente = apellidoscliente;
	}
	public char getTipocliente() {
		return tipocliente;
	}
	public void setTipocliente(char tipocliente) {
		this.tipocliente = tipocliente;
	}
	public Integer getCodigoprovincia() {
		return codigoprovincia;
	}
	public void setCodigoprovincia(Integer codigoprovincia) {
		this.codigoprovincia = codigoprovincia;
	}
	public String getCalle() {
		return calle;
	}
	public void setCalle(String calle) {
		this.calle = calle;
	}
	public String getCalle1() {
		return calle1;
	}
	public void setCalle1(String calle1) {
		this.calle1 = calle1;
	}
	public String getCiudad() {
		return ciudad;
	}
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	public Integer getCodigopostal() {
		return codigopostal;
	}
	public void setCodigopostal(Integer codigopostal) {
		this.codigopostal = codigopostal;
	}
	public String getNif() {
		return nif;
	}
	public void setNif(String nif) {
		this.nif = nif;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getMovil() {
		return movil;
	}
	public void setMovil(String movil) {
		this.movil = movil;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPaginaweb() {
		return paginaweb;
	}
	public void setPaginaweb(String paginaweb) {
		this.paginaweb = paginaweb;
	}
	public String getCategorias() {
		return categorias;
	}
	public void setCategorias(String categorias) {
		this.categorias = categorias;
	}          
	
}
