package com.curso.odoo.cliente.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table (name="clientes")
public class Cliente {

	@Id
    private Integer id;
	
	@Column
    private String individual;
	
	@Column
    private String compañia;
    
	@Column
	private String nombre;          
    
	@Column
	private char direccion1;            
    
	@Column
	private Integer direccion2; 
    
	@Column
	private String ciudad;                
    
	@Column
	private String provincia;                
    
	@Column
	private String CP;             
    
	@Column
	private Integer pais;             
    
	@Column
	private String NIF;             
    
	@Column
	private String telefono;            
    
	@Column
	private String movil;             
    
	@Column
	private String correo_electronico;             
    
	@Column
	private String enlace_Web;          
    
	@Column
	private String categorias;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getIndividual() {
		return individual;
	}

	public void setIndividual(String individual) {
		this.individual = individual;
	}

	public String getCompañia() {
		return compañia;
	}

	public void setCompañia(String compañia) {
		this.compañia = compañia;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public char getDireccion1() {
		return direccion1;
	}

	public void setDireccion1(char direccion1) {
		this.direccion1 = direccion1;
	}

	public Integer getDireccion2() {
		return direccion2;
	}

	public void setDireccion2(Integer direccion2) {
		this.direccion2 = direccion2;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public String getProvincia() {
		return provincia;
	}

	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}

	public String getCP() {
		return CP;
	}

	public void setCP(String cP) {
		CP = cP;
	}

	public Integer getPais() {
		return pais;
	}

	public void setPais(Integer pais) {
		this.pais = pais;
	}

	public String getNIF() {
		return NIF;
	}

	public void setNIF(String nIF) {
		NIF = nIF;
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

	public String getCorreo_electronico() {
		return correo_electronico;
	}

	public void setCorreo_electronico(String correo_electronico) {
		this.correo_electronico = correo_electronico;
	}

	public String getEnlace_Web() {
		return enlace_Web;
	}

	public void setEnlace_Web(String enlace_Web) {
		this.enlace_Web = enlace_Web;
	}

	public String getCategorias() {
		return categorias;
	}

	public void setCategorias(String categorias) {
		this.categorias = categorias;
	}
    
	
}
